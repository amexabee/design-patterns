package strategy;

public class Main {
    public static void main(String[] args) {
        var image = new ImageStore(new JPEGCompressor(), new HighContrastFilter());
        image.store("Hello");
    }
}
