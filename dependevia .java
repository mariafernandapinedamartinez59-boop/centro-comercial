    public int usarHabilidad(Personaje origen, Habilidad habilidad, Personaje objetivo) {
        int efecto = habilidad.calcularEfecto(objetivo);
        objetivo.recibirDano(efecto);
        System.out.println(origen.getNombre() + " usa " + habilidad.getNombre());
        return efecto; 
