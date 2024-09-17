# Lab 7 Problem 1

1. The current implementation of equals method accepts `Employee` object as parameter. It should accept `Object` as parameter. Therefore, it does not override the `equals` method of `Object` class correctly and it is more of an overloaded method. Also, it is better to use getClass() method to check the class type of the object in the equals method. The recommended implementation is to override the `equals` method and `hashCode` method of the `Object` class, if one method returns true, the other should also return true. So, when the list.contains() method is called, contains method uses the equals method to check if the object is in the list. If the equals method is not overriden correctly, the contains method will not work as expected.
2. In this implementation of listsAreEqual method, it uses HasMap to check the duplicated elements in the list. HashMap uses hashcode to check if the key is contained in the map. If the hashcode is not overriden correctly, the containsKey method will not work correctly. Therefore, it is return false. The recommended implementation is to override the `equals` method and `hashCode` method. If one returns true, the other should also return true.

For partD
1. equals Method in Employee class
   - The equals method checks all fields, including visited to determine if two Employee objects are equal. The visited check between two employees who have the same name and salary but different visited statuses appear different.
   - Including visited causes HashMap and other collections that depend on equals to misbehave.
2. hashCode Method in Employee class
   - The hashCode method includes the visited field when calculating the hash code. This will cause when using HashMap for duplicate detection because two employees with the same name and salary but different visited states will generate different hash codes.
   - In a HashMap, both hashCode and equals are used to determine object equality.
3. removeDuplicates method
   - The removeDuplicates method modifies the visited field of employees when a duplicate is found. But the visited field is used within the equals and hashCode methods. This will cause to misbehave in duplicate removal when objects are pass in HashMap.
   - Since visited is part of both equals and hashCode, put visited to true inside removeDuplicates changes the employee’s hash code which cause duplicates to be missed.
5. listsAreEqual method
   - This method relies on the equals method to check if two employees are the same. Equals method compares the visited field, thest two lists contain identical employees logically and it might be considered different because of differing visited statuses.
   - Test might fail due to differences in the visited flag, leading to incorrect test results.
