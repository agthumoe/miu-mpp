For the problem 1,
explaination about One way leads to a “false”, the other to a “true.”

p1.equals(p2) // returns false
p1 is a PersonWithJob object. Since p2 is a Person, but not necessary a PersonWithJob, the method returns false.

p2.equals(p1) // returns true
p2 is a Person. But p1 is a subclass of Person, it returns true.
