package com.capcom.Capcom;

import com.capcom.Capcom.Characters.*;

import java.util.ArrayList;

public class capcomApplication {

	public static void main(String[] args) {
			/*Scanner teclado = new Scanner(System.in).useLocale(Locale.ENGLISH);
		float altura;
		do {
			System.out.println("Por favor, ingrese la altura de su personaje: ");
			altura = teclado.nextFloat();

			if(altura <= 1.45){
				System.out.println("La altura del personaje es infima");
			}
			else if(altura >= 2.25){
				System.out.println("La altura es demasiado exagerada");
			}
			else{
				System.out.println("La altura es valida");
			}
		}
		while(altura <= 1.45 && altura >= 2.25); esto queda grisado, me saltan errores. consultar con Lautaro*/
		var items = new ArrayList<itemsBag>();
		var arma = new Armas("Ametralladora", 25);
		arma.setCantidad(25);
		arma.setCategoria(categoriaArmas.HEAVY_WEAPON);
		var chumbo = new Armas("Espada",1);
		var objetoclave = new ObjetosClave("escudo", 1);
		var objetoclave1 = new ObjetosClave("Sanacion del gauchito Gil", 1);
		objetoclave.setEsReutilizable(true);
		items.add(objetoclave);
		items.add(arma);
		items.add(chumbo);
		var Inventory = new Inventory();
		Inventory.setItems(items);
		Characters capitanAmerica;
		capitanAmerica = new Characters(
				"Capitan America",
				18,
				90.0f,
				1.80f,
				Inventory
		);
		Characters chunli = new Characters(
						"Chun Li",
						25,
						75.5f,
						1.90f,
						Inventory,
				Health.FINE,
				gender.MUJER
				);
		capitanAmerica.getInventario().showInventory(arma);
		capitanAmerica.getInventario().showInventory(objetoclave);
		chunli.getInventario().showInventory(chumbo);
		chunli.getInventario().showInventory(objetoclave1);
		System.out.println("El nombre del personaje 1 es " + capitanAmerica.getName() + " y el sexo es " + capitanAmerica.getGender() );
		System.out.println("El nombre del personaje 2 es " + chunli.getName() + " y el sexo es " + chunli.getGender() );
		capitanAmerica.setHealth(Health.DANGER);
		System.out.println("La salud del Capitan America ta " + capitanAmerica.health.estado);
		chunli.setHealth(Health.FINE);
		System.out.println("La salud de Chun-Li está " + chunli.health.estado);


	}

}
