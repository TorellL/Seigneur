@Test
public void testMultiply() {

   // MyClass is tested
   MyClass tester = new MyClass();
   
   // Check if multiply(10,5) returns 50
   assertEquals("Result", 50, tester.multiply(10, 5));
<project default="test">
 
 <path id="cp">
   <pathelement location="lib/testng-testng-5.13.1.jar"/>
   <pathelement location="build"/>
 </path>
 
 <taskdef name="testng" classpathref="cp"
          classname="org.testng.TestNGAntTask" />
 
 <target name="test">
   <testng classpathref="cp" groups="fast">
     <classfileset dir="build" includes="example1/*.class"/>
   </testng>
 </target>
 
</project>
