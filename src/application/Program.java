package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		//Primeiro Exemplo
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		//System.out.println(set.contains("Notebook"));
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
		*/
		/*
		//Segundo Exemplo
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e)
		
*/
		/*
		//Terceiro Exemplo
		Set<Product> set = new HashSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
		*/
		
		//Quarto exemplo(TreeSet<>())
		Set<Product> set = new TreeSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		//Para Funcionar quando ultilizamos TreeSet, devemos implementar o Comparable
		for (Product p : set) {
			
			System.out.println(p);
		
		}

	}

}
