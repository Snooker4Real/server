package io.snooker.server.enumeration;

/**
 * @author Snooker4Real (https://snooker4real.github.io)
 * @version 1.0
 * @since 29/10/2021
 */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

}
