package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoPointsTest {

    /** when created, getPoint() should show both points at the origin */
    @Test
    public void getPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }

    /** verify that arbitrary values are properly stored via setPoint() */
    @Test    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);
    }

    @Test
    public void randomValue() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.randomValue(0);
        Point p1 = testPoints.getPoint(0);
        assertNotEquals(p1.x, 0, 0.000001);
        assertNotEquals(p1.y, 0, 0.000001);
    }

    @Test
    public void setOrigin() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(1, -3, 5);
        testPoints.setOrigin(1);
        Point p1 = testPoints.getPoint(0);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
    }

    @Test
    public void copy() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 6, 9);
        testPoints.setPoint(1, 9, 6);
        testPoints.copy(1, 0);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 9);
        assertEquals(p1.y, 6);
    }

    @Test
    public void distance() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 0, 1);
        testPoints.setPoint(1, 0, 0);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        double d1 = testPoints.distance();
        assertEquals(d1, 1.0, 0.000001);
    }

    @Test
    public void slope() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 0, 0);
        testPoints.setPoint(1, 2, 4);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        double s1 = testPoints.slope();
        assertEquals(s1, 2.0, 0.000001);

    }
}