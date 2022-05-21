package com.TangledLogistic.service;

import com.TangledLogistic.domain.Box;
import com.TangledLogistic.domain.response.TransportResponse;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class TransportServiceImpl implements TransportService {


    @Override
    public TransportResponse transportBoxes(List<Box> boxes) {

        TransportResponse transportResponse = new TransportResponse();
        List<String> discountedUsers;

        if (boxes.size() == 0) {
            transportResponse.setSuccess(false);
            transportResponse.setDiscountedUserIndex(null);
            return transportResponse;
        }

        discountedUsers = getDiscountedUsers(boxes);

        transportResponse.setSuccess(true);
        transportResponse.setDiscountedUserIndex(discountedUsers);
        return transportResponse;
    }


    private List<String> getDiscountedUsers(List<Box> boxes) {
        List<String> discountedUsers;
        discountedUsers = boxes.stream()
                .sorted(Comparator.comparing(Box::getIdentifyingString))
                .filter(box -> isPalindrome(box.getInnerString()))
                .map(Box::getIdentifyingString)
                .collect(Collectors.toList());
        return discountedUsers;
    }

    private Boolean isPalindrome(String string) {

        char[] charArray = string.toCharArray();
        int size = charArray.length;
        char[] charGiven = Arrays.copyOf(charArray, charArray.length);

        int a = 0;
        while (a < size / 2) {
            char temp = charArray[a];
            charArray[a] = charArray[size - a - 1];
            charArray[size - a - 1] = temp;
            a++;
        }

        return Arrays.equals(charArray, charGiven);
    }
}
