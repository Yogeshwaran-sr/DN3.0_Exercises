package BuilderPatternExample;

public class Builder {
    String cpu;
    String ram;
    String storage;

    public Builder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Builder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public Builder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

}
