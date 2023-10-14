# Assignment_2_testing_2

1) Reflections

1.1 Computer Mouse
Identify the types of testing you would perform on a computer mouse, to make sure
that it is of the highest quality.

Durability Testing:

    Conduct a button longevity test to verify the lifespan of the mouse's buttons (e.g., left-click and right-click buttons).
    Drop and impact tests to assess the mouse's ability to withstand accidental drops.
    Stress testing to evaluate the overall build quality and resistance to wear and tear.
    
Functionality Testing:

    Basic Functionality: Test if the mouse can perform basic functions, like cursor movement and button clicks.
    Button Functionality: Check the functionality of all buttons (left-click, right-click, middle-click, and additional buttons).
    Scroll Wheel: Ensure the scroll wheel functions smoothly and registers scrolling accurately.
    DPI (Dots Per Inch) Adjustment: Verify that the mouse can change sensitivity settings accurately.

    User Testing:

    Gather feedback from a diverse group of users to assess real-world usability and comfort.

1.2 Catastrophic Failure
Find a story where a software system defect had a bad outcome. Describe what
happened. Can you identify a test that would have prevented it?

The Therac-25 Radiation Therapy Machine Disaster

In the 1980s, a series of life-threatening incidents occurred due to a software defect in the Therac-25 radiation therapy machine, 
causing severe harm to patients undergoing radiation treatment.

What Happened:
The Therac-25 was a medical device used for radiation therapy, primarily in the treatment of cancer. It had two operating modes, 
one for X-ray therapy and another for electron beam therapy. 
Due to a software defect, the machine's X-ray mode inadvertently delivered lethal doses of radiation to patients.

The Software Defect:
The software defect allowed the Therac-25 to be used in "high-energy" mode, a mode intended only for electron beam therapy, without proper safeguards. 
When operators switched to high-energy mode, the machine's software failed to provide the necessary safety interlocks to prevent the administration of excessive radiation.

Preventative Measures:

- Software Verification and Validation: A more rigorous software verification process could have uncovered the defect, ensuring that the machine's software adhered to safety and operational requirements.

- Independent Reviews: Independent reviews and third-party audits of the software and system could have identified the software defect and prevented it from reaching the operational stage.

- Operator Training: Proper training for machine operators is crucial to ensure they understand the system's operation and potential risks. In this case, operators were not adequately trained to recognize the software's malfunction.

- Immediate Response: After the first incident, a quicker response from the manufacturer to investigate and address the issue could have prevented subsequent incidents.


3) Investigation of Tools

3.1 JUnit 5
  Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.
    @Tag:
        Usefulness: This annotation allows you to categorize your tests with tags or labels. 
        It's beneficial for organizing and filtering tests. For example, you can tag tests as "integration," "unit," or "performance" and then run only specific groups of tests based on these tags. 
        This helps you manage and focus on relevant tests during development and CI/CD pipelines.

    @Disabled:
        Usefulness: This annotation marks a test method as disabled or ignored, meaning it won't be executed during test runs. 
        It's handy when you want to temporarily exclude a test without deleting it. 
        Developers often use it when they encounter known issues and want to prevent a test from failing the build.

    @RepeatedTest:
        Usefulness: This annotation allows you to repeat a test a specified number of times, which can be helpful for testing the same functionality with multiple data inputs. 
        It's useful when you want to verify that a test remains consistent over multiple executions, potentially uncovering intermittent issues or race conditions.

    @BeforeEach and @AfterEach:
        Usefulness: These annotations are used to mark methods that run before and after each test method. 
        @BeforeEach is helpful for setting up the test environment, initializing variables, or preparing resources. 
        @AfterEach is useful for cleaning up resources, ensuring that each test starts with a clean slate. 
        They help maintain test isolation and prevent interference between tests.

    @BeforeAll and @AfterAll:
        Usefulness: These annotations mark methods that run once before and after all test methods in a test class. 
        They are used for setup and teardown of shared resources that need to be initialized and cleaned up only once. 
        This can significantly reduce redundant setup and teardown code for multiple test methods in a class, improving test performance.

    @DisplayName:
        Usefulness: This annotation allows you to provide custom names for test methods, making your test reports and logs more descriptive. 
        It's especially beneficial when test method names need to be more expressive or when you want to include special characters or spaces in the display name for clarity.

    @Nested:
        Usefulness: This annotation enables the creation of nested test classes, enhancing the organization and readability of tests. 
        It helps you group related tests and provides a clear hierarchy in test reports. 
        Nested tests can also share setup and teardown methods defined in the outer test class.

    assumeFalse and assumeTrue:
        Usefulness: These are not annotations but methods in JUnit 5's Assumptions class. 
        They allow you to conditionally abort a test if certain assumptions are not met. 
        This is useful for skipping tests based on conditions that are not met in the current environment or configuration. 
        For example, you can use assumeTrue to skip tests that require a specific database connection if the connection is unavailable.


3.2 MOCKING FRAMEWORKS
Investigate mocking frameworks for your preferred language. Choose at least two
frameworks, and answer the questions. (One could be Mockito, which we saw in class.)

• What are their similarities?
    Mock Object Creation: Both Mockito and JMock allow you to create mock objects to simulate the behavior of real objects, enabling you to isolate the code under test.

    Verification: Both frameworks support verification of method calls on mock objects, ensuring that interactions with dependencies occur as expected.

    Annotations: Mockito and JMock both use annotations for declaring and managing mock objects, making integration with testing frameworks seamless.

• What are their differences?
    Mocking Approach: Mockito follows a strict, "expect-act-assert" approach for mocking, where you set up expectations, perform actions, and then verify results. 
    JMock, on the other hand, uses a more dynamic, "record-replay-verify" approach, allowing you to record expected behavior as you go along.

    Syntax and Language: Mockito is a Java-specific framework, while JMock can be used with both Java and other JVM languages like Scala. 
    This can be an advantage for projects that involve multiple JVM languages.

    Matchers: JMock provides a rich set of built-in matchers for more expressive and readable assertions, while Mockito relies on custom assertions or third-party libraries.

• Which one would you prefer, if any, and why?
    Use Mockito When: You want a dedicated and widely adopted mocking framework for Java that is known for its user-friendliness and simplicity. 
    Mockito is a popular choice for unit testing in Java.

    Use JMock When: You work with multiple JVM languages or want a more dynamic mocking approach with expressive matchers. 
    JMock is versatile and can be used with both Java and other JVM languages, and it is known for its rich set of built-in matchers.

The choice between Mockito and JMock depends on your specific project requirements and the preferences of your development team. 
If you are using Java exclusively and prefer a straightforward mocking framework, Mockito is a strong choice. 
If you require cross-language compatibility or value a more dynamic mocking approach and expressive matchers, JMock may be the better option.
