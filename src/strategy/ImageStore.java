package strategy;

public class ImageStore {
    private Compressor compressor;
    private Filter filter;

    public ImageStore(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        compressor.compress();
        filter.filter();
    }

}
