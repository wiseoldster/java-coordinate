package coordinate.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FigureGeneratorTest {
    @Test
    void Point_2개_입력됐을_때_Line을_만드는지_확인() {
        List<Point> points = new ArrayList<>(Arrays.asList(new Point(1, 1), new Point(2, 2)));

        assertThat(new FigureGenerator().generate(points) instanceof Line).isTrue();
    }

    @Test
    void Point_3개_입력됐을_때_Triangle을_만드는지_확인() {
        List<Point> points = new ArrayList<>(Arrays.asList(new Point(1, 1), new Point(2, 2), new Point(3, 3)));

        assertThat(new FigureGenerator().generate(points) instanceof Triangle).isTrue();
    }

    @Test
    void Point_4개_입력됐을_때_Rectangle을_만드는지_확인() {
        List<Point> points = new ArrayList<>(Arrays.asList(new Point(1, 1), new Point(1, 2), new Point(2, 1), new Point(2, 2)));

        assertThat(new FigureGenerator().generate(points) instanceof Rectangle).isTrue();
    }
}
