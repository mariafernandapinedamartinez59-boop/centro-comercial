    private final List<Personaje> miembros = new ArrayList<>();
    public void agregar(Personaje p) {
        miembros.add(p);
    }
    public void quitar(Personaje p) {
        miembros.remove(p);
    }
    public int ataqueTotal() {
        int total = 0;
        for (Personaje p : miembros) {
            total += p.atacar();
        }
        return total;
    }
