    public static List<Personaje> vivos(List<Personaje> equipo) {
        List<Personaje> resultado = new ArrayList<>();
        for (Personaje p : equipo) {
            if (p.getVida() > 0) {
                resultado.add(p);
            }
        }
        return resultado;
    }
