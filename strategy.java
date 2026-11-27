    private EstrategiaAtaque estrategia = new AtaqueBasico();
    public void setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
    }
    public int atacar() {
        return estrategia.calcular();
    }
    // <<< FIN SALA 4.4
}
