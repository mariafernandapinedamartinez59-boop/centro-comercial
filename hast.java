    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        Item otro = (Item) o;
        return nombre.equals(otro.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
