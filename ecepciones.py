   def recoger(self, p, item):
        try:
            p.recoger(item)
            return True
        except InventarioLlenoError as e:
            print(f"No cabe: {e}")
            return False
