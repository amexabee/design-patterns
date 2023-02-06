package state;

public class Canvas {
    private ToolType currentTool;

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("Selection Icon");
        if (currentTool == ToolType.BRUSH)
            System.out.println("Brush Icon");
        if (currentTool == ToolType.ERASER)
            System.out.println("Erase Icon");
    }

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        if (currentTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        if (currentTool == ToolType.ERASER)
            System.out.println("Erase something");
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
