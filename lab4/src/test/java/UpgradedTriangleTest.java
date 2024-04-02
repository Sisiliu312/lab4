
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpgradedTriangleTest {

    // 测试等边三角形的情况
    @Test
    public void testEquilateralTriangle() {

        assertEquals("EQUILATERAL", UpgradedTriangle.classifyTriangle(3, 3, 3));
    }

    // 测试等腰三角形的情况
    @Test
    public void testIsoscelesTriangle() {
        assertEquals("ISOSCELES", UpgradedTriangle.classifyTriangle(5, 5, 3));
    }

    // 测试不等边三角形的情况
    @Test
    public void testScaleneTriangle() {
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(3, 4, 5));
    }

    // 测试三条边长为0的情况
    @Test
    public void testInvalidZero() {
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(0, 0, 0));
    }

    // 测试无法构成三角形的情况
    @Test
    public void testInvalidImpossible() {
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(1, 2, 10));
    }

    // 测试其中一条边长为0的边界情况
    @Test
    public void testBoundaryZero1() {
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(0, 0, 1));
    }

    // 一般情况
    @Test
    public void testBoundaryNormal1() {
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(3, 4, 5));
    }

    // 一般情况
    @Test
    public void testBoundaryNormal2() {
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(2, 3, 4));
    }

    // 测试边长为负数的情况
    @Test
    public void testNegativeValues() {
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(-1, -1, -1));
    }

    // 测试边长有负数和正数的情况
    @Test
    public void testNegativePositiveValues() {
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(-1, 1, 1));
    }

    // 测试边长有负数和0的情况
    @Test
    public void testNegativeZeroValues() {
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(-1, 0, 1));
    }

    // 测试边长有0和负数的情况
    @Test
    public void testZeroNegativeValues() {
        assertEquals("INVALID", UpgradedTriangle.classifyTriangle(0, -1, 1));
    }

    // 测试等边三角形的情况
    @Test
    public void testEquivalenceEquilateral1() {
        assertEquals("EQUILATERAL", UpgradedTriangle.classifyTriangle(20, 20, 20));
    }

    // 测试等边三角形的情况
    @Test
    public void testEquivalenceEquilateral2() {
        assertEquals("EQUILATERAL", UpgradedTriangle.classifyTriangle(10, 10, 10));
    }

    // 测试不等边三角形的情况
    @Test
    public void testEquivalenceScalene() {
        assertEquals("SCALENE", UpgradedTriangle.classifyTriangle(7, 10, 5));
    }



    // 测试有效三角形的面积计算
    @Test
    public void testValidTriangle() {
        assertEquals(6.0, UpgradedTriangle.calculateArea(3, 4, 5), 0.0001);
    }

    // 测试无效三角形的面积计算
    @Test
    public void testInvalidTriangle() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(0, 0, 0), 0.0001);
    }

    // 测试无效三角形的面积计算
    @Test
    public void testZeroAreaTriangle() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(1, 1, 2), 0.0001);
    }

    // 测试边长为0的三角形的面积计算
    @Test
    public void testBoundaryZero() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(0, 1, 1), 0.0001);
    }

    // 测试边长为0的三角形的面积计算
    @Test
    public void testBoundaryMax() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(0, 0, 0), 0.0001);
    }

    // 测试正常的三角形的面积计算
    @Test
    public void testBoundaryNormal() {
        assertEquals(0.433, UpgradedTriangle.calculateArea(1, 1, 1), 0.001);
    }

    // 测试的有效三角形的面积计算
    @Test
    public void testEquivalenceValidTriangle() {
        assertEquals(16.2481, UpgradedTriangle.calculateArea(7, 10, 5), 0.0001);
    }

    // 测试无效三角形的面积计算
    @Test
    public void testEquivalenceInvalidTriangle() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(3, 3, 7), 0.0001);
    }

    // 测试边长为0的三角形的面积计算
    @Test
    public void testEquivalenceZeroAreaTriangle() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(0, 1, 1), 0.0001);
    }

    // 测试边长为0的三角形的面积计算
    @Test
    public void testEquivalenceBoundaryMax() {

        assertEquals(0.0, UpgradedTriangle.calculateArea(0, 0, 0), 0.0001);
    }

    // 测试边长为0的三角形的面积计算
    @Test
    public void testEquivalenceBoundaryZero() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(1, 0, 1), 0.0001);
    }

    // 测试正常的三角形的面积计算
    @Test
    public void testEquivalenceBoundaryNormal() {
        assertEquals(6.0, UpgradedTriangle.calculateArea(3, 4, 5), 0.001);
    }

    // 测试边长为负数的三角形的面积计算
    @Test
    public void testEquivalenceBoundaryNegative() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(-1, -1, -1), 0.0001);
    }

    // 测试边长为负数和正数的三角形的面积计算
    @Test
    public void testEquivalenceBoundaryMixed1() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(-1, 1, 1), 0.0001);
    }

    // 测试边长为负数和正数的三角形的面积计算
    @Test
    public void testEquivalenceBoundaryMixed2() {
        assertEquals(0.0, UpgradedTriangle.calculateArea(-1, -2, -3), 0.0001);
    }

}
