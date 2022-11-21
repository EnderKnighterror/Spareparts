public record SpareObj(String name, Boolean genuine) {

    public String toString() {
        return name + genuine;
    }
}
