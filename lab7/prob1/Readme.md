# Lab 7 Problem 1

1. The current implementation of equals method accepts `Employee` object as parameter. It should accept `Object` as parameter. Therefore, it does not override the `equals` method of `Object` class correctly and it is more of an overloaded method. Also, it is better to use getClass() method to check the class type of the object in the equals method. The recommended implementation is to override the `equals` method and `hashCode` method of the `Object` class, if one method returns true, the other should also return true. So, when the list.contains() method is called, contains method uses the equals method to check if the object is in the list. If the equals method is not overriden correctly, the contains method will not work as expected.
2. In this implementation of listsAreEqual method, it uses HasMap to check the duplicated elements in the list. HashMap uses hashcode to check if the key is contained in the map. If the hashcode is not overriden correctly, the containsKey method will not work correctly. Therefore, it is return false. The recommended implementation is to override the `equals` method and `hashCode` method. If one returns true, the other should also return true.
3. In this implementation, equals method and hashCode includes `visited` field in the comparison. In the listsAreEqual method, HashMap is used to check the duplicated elements in the list. The `visited` field value is changed if the element is in the hashmap. Therefore, the `visited` field value is mutated in the equals method and hashCode method. If `visited` field is not required to check the equality of two employees, then it should be removed from the equals method and hashCode method. If it is required, then it should be mutated in the listAreEqual method.