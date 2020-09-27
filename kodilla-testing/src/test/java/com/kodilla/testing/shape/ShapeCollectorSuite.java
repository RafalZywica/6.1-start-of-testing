package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
class ShapeCollectorSuite {

    private static int testCounter = 0;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    void afterEveryTest() {
        System.out.println("Executed test #" + testCounter);
    }
    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.0);

        //When
        shapeCollector.addFigure(circle);

        //Then

        Assertions.assertEquals("Circle", shapeCollector.showFigures());
    }
    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.0);
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals("", shapeCollector.showFigures());
    }
    @Nested
    @DisplayName("Testing getFigure for circle")
    class CircleTest {
        @Test
        void testGetFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2.0);
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, retrievedShape);
            Assertions.assertEquals(3.14159265359 * 4.0, retrievedShape.getField());
        }
    }
    @Nested
    @DisplayName("Testing getFigure for square")
    class SquareTest {
        @Test
        void testGetFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2.0);
            shapeCollector.addFigure(square);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(square, retrievedShape);
            Assertions.assertEquals(4, retrievedShape.getField());
        }
    }
    @Nested
    @DisplayName("Testing getFigure for triangle")
    class TriangleTest {
        @Test
        void testGetFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(2.0, 2.0);
            shapeCollector.addFigure(triangle);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, retrievedShape);
            Assertions.assertEquals(2.0 * 2.0 * 0.5, retrievedShape.getField());
        }
    }
}
