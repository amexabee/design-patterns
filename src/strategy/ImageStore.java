package strategy;

public class ImageStore {
    private String compressor;
    private String filter;

    public ImageStore(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if (this.compressor == "jpeg")
            System.out.println("Compressing using JPEG");
        else if (this.compressor == "png")
            System.out.println("Compressing using PNG");

        if (this.filter == "b&w")
            System.out.println("Applying B&W filter");
        else if (this.filter == "high-contrast")
            System.out.println("Applying high-contrast filter");
    }

}
