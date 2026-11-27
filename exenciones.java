 public boolean recoger(Personaje p, Item item) {
        try {
            p.recoger(item);
            return true;
        } catch (InventarioLlenoException e) {
            System.out.println("No cabe: " + e.getMessage());
            return false;
        }
    }
