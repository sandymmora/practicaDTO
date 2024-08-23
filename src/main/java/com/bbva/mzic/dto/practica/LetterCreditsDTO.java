package com.bbva.mzic.dto.practica;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class LetterCreditsDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String letter;
	private String reference;
	private int secuence;
	private List<BankDTO> banks;
	private CostumerDTO costumer;


	public String getLetter() {
		return this.letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getSecuence() {
		return this.secuence;
	}

	public void setSecuence(int secuence) {
		this.secuence = secuence;
	}

	public List<BankDTO> getBanks() {
		return this.banks;
	}

	public void setBanks(List<BankDTO> banks) {
		this.banks = banks;
	}

	public CostumerDTO getCostumer() {
		return this.costumer;
	}

	public void setCostumer(CostumerDTO costumer) {
		this.costumer = costumer;
	}

 
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCreditsDTO rhs = (LetterCreditsDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(letter, rhs.letter)
					.append(reference, rhs.reference)
					.append(secuence, rhs.secuence)
					.append(banks, rhs.banks)
					.append(costumer, rhs.costumer)
					.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)
			.append(this.secuence)
			.append(this.banks)
			.append(this.costumer)
			.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("letter", letter)
			.append("reference", reference)
			.append("secuence", secuence)
			.append("banks", banks)
			.append("costumer", costumer)
			.toString();
	}
}
