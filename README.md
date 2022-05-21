
1) What is the time / space complexity of your solution ?
    - O(nlogn)
2) What is the bottleneck of your approach? Which part runs the
   slowest ? Explain why.
    - The slowest part is the method that distinguishes discount users because it goes through multiple processes such as sorting and filtering.
```java
private List<String> getDiscountedUsers(List<Box> boxes) {
        List<String> discountedUsers;
        discountedUsers = boxes.stream()
        .sorted(Comparator.comparing(Box::getIdentifyingString))
        .filter(box -> isPalindrome(box.getInnerString()))
        .map(Box::getIdentifyingString)
        .collect(Collectors.toList());
        return discountedUsers;
        }
```



### try to test
```java
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
    }```
