class ConsoleRenderer implements Renderer {
    public void render(Frame frame) {
        System.out.println("\u25B6 Playing " + frame.data.length + " bytes");
    }
}
