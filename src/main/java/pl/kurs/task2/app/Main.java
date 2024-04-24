package pl.kurs.task2.app;

import pl.kurs.task2.datatype.Circle;
import pl.kurs.task2.datatype.Figure;
import pl.kurs.task2.datatype.Rectangle;
import pl.kurs.task2.datatype.Square;
import pl.kurs.task2.service.FigureService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "figuresList.obj";
        FigureService figureService = new FigureService();

        System.out.println(new Square(3));
        System.out.println(new Circle(25));
        System.out.println(new Rectangle(8, 12));

        List<Figure> figures = Arrays.asList(Figure.createSquare(10), Figure.createCircle(20),
                Figure.createRectangle(10, 20));

        figureService.printFiguresList(figures);

        System.out.println("Figure with largest perimeter: " + figureService.getFigureWithLargestPerimeter(figures));
        System.out.println("Figure with largest area: " + figureService.getFigureWithLargestArea(figures));

        System.out.println(figures.contains(new Square(10)));

        figureService.saveFiguresListToFile(figures, fileName);

        List<Figure> loadedList = figureService.loadFiguresListFromFile(fileName);

        figureService.printFiguresList(loadedList);
    }
}
