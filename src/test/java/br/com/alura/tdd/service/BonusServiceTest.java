package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusZeroPoisSalarioMuitoAlto() {
		
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("25000"));
		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(funcionario));
	
	}
	
	@Test
	void bonus10PorcentodDoSalario() {
		
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(
							new Funcionario("Matheus", 
								LocalDate.now(),
								new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusIgualA1000() {
		
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(
							new Funcionario("Matheus", 
								LocalDate.now(),
								new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
}
