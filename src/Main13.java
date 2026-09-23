void main() {
//13.1
    Point point = new Point(12, 8);
Point point1 = new Point(12, 8);
System.out.println(point == point1);//false
System.out.println(point.equals(point1));//true
    HashSet<Point> hashSet = new HashSet<>();
    hashSet.add(point);
    hashSet.add(point1);
    System.out.println("Mножество считает их дубликатом?" + hashSet.size());
//13.2
    Person person = new Person("Alice", 30);
    Person person1 = new Person("Alice", 30);
    HashMap<Person, String> map = new HashMap<>();
    map.put(person, "person");
    map.put(person1, "person1");
    System.out.println("equals: " + person.equals(person1));
    System.out.println("Размер map: " + map.size());

    //13.3
    Point pointR = new Point(12, 8);
    Point pointR1 = new Point(12, 8);
    System.out.println(pointR == pointR1);//false
    System.out.println(pointR.equals(pointR1));//true
    HashSet<Point> hashSetR = new HashSet<>();
    hashSetR.add(pointR);
    hashSetR.add(pointR1);
    System.out.println("Mножество считает их дубликатом?" + hashSetR.size());
   // point.x = 5;//'x' has private access in 'Point'
}