package memento;

import java.util.Stack;

public class Editor {
    private String content;
    private Stack myStack = new Stack<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        myStack.push(content);
    }

    public void undo() {
        if (!myStack.isEmpty()) {
            myStack.pop();

            if (!myStack.isEmpty())
                content = (String) myStack.peek();
        }
    }
}
