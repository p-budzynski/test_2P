package pl.kurs.task2.service;

import pl.kurs.task2.datatype.Figure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FigureService {

    public Figure getFigureWithLargestPerimeter(List<Figure> figures) {
        if (figures.isEmpty()) {
            throw new IllegalArgumentException("The list is empty. Cannot perform this operation.");
        }
        Figure maxPerimeterFigure = null;
        double maxPerimeter = 0;

        for (Figure figure : figures) {
            if (figure != null) {
                double perimeter = figure.calculatePerimeter();
                if (perimeter > maxPerimeter) {
                    maxPerimeter = perimeter;
                    maxPerimeterFigure = figure;
                }
            }
        }
        return maxPerimeterFigure;
    }

    public Figure getFigureWithLargestArea(List<Figure> figures) {
        if (figures.isEmpty()) {
            throw new IllegalArgumentException("The list is empty. Cannot perform this operation.");
        }
        Figure maxAreaFigure = null;
        double maxArea = 0;

        for (Figure figure : figures) {
            if (figure != null) {
                double area = figure.calculateArea();
                if (area > maxArea) {
                    maxArea = area;
                    maxAreaFigure = figure;
                }
            }
        }
        return maxAreaFigure;
    }

    public void saveFiguresListToFile(List<Figure> figures, String fileName) {
        if (figures.isEmpty()) {
            throw new IllegalArgumentException("The list is empty. Cannot perform this operation.");
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

            outputStream.writeObject(figures);
            System.out.println("The list of figures has been saved to a file.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Figure> loadFiguresListFromFile(String fileName) {
        List<Figure> figures = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
            figures = (List<Figure>) inputStream.readObject();
            System.out.println("The list of figures was loaded from a file.");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return figures;
    }

    public void printFiguresList(List<Figure> figures) {
        if (figures.isEmpty()) {
            throw new IllegalArgumentException("The list is empty. Cannot perform this operation.");
        }
        System.out.println("Figures list:");
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
