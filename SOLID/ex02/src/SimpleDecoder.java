class SimpleDecoder implements Decoder {
    public Frame decode(byte[] data) {
        return new Frame(data);
    }
}
