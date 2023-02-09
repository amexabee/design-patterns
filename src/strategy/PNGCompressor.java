package strategy;

public class PNGCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing using PNG");
    }
}
