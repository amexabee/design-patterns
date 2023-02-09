package strategy;

public class Main {
    public static void main(String[] args) {
        var image = new ImageStore();
        image.store("Hello", new JPEGCompressor(), new HighContrastFilter());
    }
}
