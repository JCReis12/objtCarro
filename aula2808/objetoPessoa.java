package aula2808;

public class objetoPessoa {

	public static void main(String[] args) {
		
		pessoa aviao = new pessoa();
		
		aviao.setempresa("QATAR");
		aviao.setmotores(2);
		aviao.setcor("Branco");
		aviao.setpeso(590);
		aviao.setvelocidade(850);
		aviao.setaltura(12.5);

		System.out.println(aviao.empresa());
		System.out.println(aviao.motores()+" motores");
		System.out.println(aviao.cor());
		System.out.println(aviao.peso()+" Toneladas");
		System.out.println(aviao.velocidade()+" KM/h");
		System.out.println(aviao.altura()+" KM");
		
		
	}

}
