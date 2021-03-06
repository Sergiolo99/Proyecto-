package gr�ficos;

public final class Sprite {

	private final int lado;

	private int x;
	private int y;

	public int[] pixeles;
	private final HojaSprites hoja;

	// colecci�n de Sprites

	public static Sprite asfalto = new Sprite(32, 0, 0, HojaSprites.suelo);

	// fin de la colecci�n

	public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja) {
		this.lado = lado;

		pixeles = new int[this.lado * this.lado];

		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;

		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
			}
		}
	}

}
