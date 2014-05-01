@Test
public void testMultiply() {

   // MyClass is tested
   MyClass tester = new MyClass();
   
   // Check if multiply(10,5) returns 50
   assertEquals("Result", 50, tester.multiply(10, 5));
 }