class Player {
    private Frame last;
    private final Decoder decoder;
    private final Renderer renderer;

    Player(Decoder decoder, Renderer renderer) {
        this.decoder = decoder;
        this.renderer = renderer;
    }

    void play(byte[] fileBytes) {
        last = decoder.decode(fileBytes);
        renderer.render(last);
        System.out.println("Cached last frame? " + (last != null));
    }
}