package strategy;

public class BWFilter implements Filter {
    @Override
    public void filter() {
        System.out.println("Applying B&W filter");
    }
}
