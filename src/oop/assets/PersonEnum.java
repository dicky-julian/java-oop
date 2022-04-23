package oop.assets;

public enum PersonEnum {
    ASSISTANT("Assistant"),
    ASSISTANT_MANAGER("Assistant Manager"),
    MANAGER("Manager");

    private String description;

    PersonEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
