package src.basicweb;

import org.junit.*;

import static org.junit.Assert.*;

public class JUnitIntroductionTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Executed before class");
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception {
        System.out.println("Executed after class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before.....");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after.....");
    }

    @Test
    public void test(){
        System.out.println("Exececuted Test1......");
    }

    @Test
    public void test2(){
        System.out.println("Executed Test2......");
    }
}