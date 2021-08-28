package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	@Test
	public void Reajuste3Porcento() {
		
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000"));
		
		service.reajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
		
	}
	
	@Test
	public void Reajuste15Porcento() {
		
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000"));
		
		service.reajuste(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
		
	}
	
	@Test
	public void Reajuste20Porcento() {
		
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000"));
		
		service.reajuste(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
		
	}
	
}
