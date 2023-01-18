abstract class Computer {
    protected String processor;
    protected int memory;
    protected int storage;

    public Computer(String processor, int memory, int storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public abstract boolean portable();

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }
}
