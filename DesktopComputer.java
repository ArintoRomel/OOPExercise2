class DesktopComputer extends Computer {

    public DesktopComputer(String processor, int memory, int storage) {
        super(processor, memory, storage);
    }

    @Override
    public boolean portable() {
        return false;
    }
}
