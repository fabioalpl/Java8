package testes.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Java8TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		List<Pessoa> pessoas = pessoa.populaPessoas(); 
		
		// filter - pesquisando pessoas que nasceram no Brasil
		Stream<Pessoa> stream = pessoas.stream().filter(p -> p.getNacionalidade().equals("Brasil"));
		
		// Map - Obter apenas a idade de pessoas que nasceram no Brasil
		Stream<Integer> streamMap = pessoas.stream().filter(
								p -> p.getNacionalidade().equals("Brasil")).map(Pessoa::getIdade);
		
		/* Sorted
		Stream<String> streamSorted = pessoas.stream().filter(
						p -> p.getNacionalidade().equals("Brasil")).sorted(Comparator.comparing(Pessoa::nome)); */
		
		
	}

}
