package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called once!!!");
    }
}