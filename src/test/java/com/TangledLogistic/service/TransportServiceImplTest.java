package com.TangledLogistic.service;

import com.TangledLogistic.domain.Box;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TransportServiceImplTest {


    @Test
    void will_there_be_discounted_Users() {
        final TransportServiceImpl transportService = new TransportServiceImpl();

        Box box1 = new Box();
        box1.setInnerString("ABDACDBED");
        box1.setIdentifyingString("B");

        Box box2 = new Box();
        box2.setInnerString("HANNAH");
        box2.setIdentifyingString("A");

        List<Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);


        List<String> expectedDiscountedUser = Arrays.asList("A");
        Boolean expectedSuccess = true;

        assertAll(
                () -> assertThat(transportService.transportBoxes(boxes).getDiscountedUserIndex()).isEqualTo(expectedDiscountedUser),
                () -> assertEquals(transportService.transportBoxes(boxes).getSuccess(),expectedSuccess)
        );
    }
}