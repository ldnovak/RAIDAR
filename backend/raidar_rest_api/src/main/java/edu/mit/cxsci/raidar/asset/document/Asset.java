package edu.mit.cxsci.raidar.asset.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Asset {
	@Id
	private String id;
	private String name;
	private int population;

	public Asset(String name, int population) {
		this.name = name;
		this.population = population;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Asset asset = (Asset) o;
		return population == asset.population && Objects.equals(id, asset.id) && Objects.equals(name, asset.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, population);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Country{");
		sb.append("id='").append(id).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", population=").append(population);
		sb.append('}');
		return sb.toString();
	}
}
