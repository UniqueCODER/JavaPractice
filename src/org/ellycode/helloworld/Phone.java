package org.ellycode.helloworld;

public class Phone {
    String name;
    int screenSize;
    int camera;
    int memoryRam;

    public Phone(String name, int screenSize, int camera, int memoryRam) {
        this.name = name;
        this.screenSize = screenSize;
        this.camera = camera;
        this.memoryRam = memoryRam;
    }

    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    public void playMusic(String trackName) {
        System.out.println("Playing" + trackName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }
}
