package Entities;

import java.util.Date;

// Classe LogEntry representa uma entrada de log com um nome de usuário e um momento (data e hora).
public class LogEntry {

	private String username; // Nome de usuário associado à entrada de log.
	private Date moment;     // Data e hora da entrada de log.
	
	// Construtor para inicializar o nome de usuário e o momento da entrada de log.
	public LogEntry(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}

	// Método para obter o nome de usuário.
	public String getUsername() {
		return username;
	}

	// Método para definir o nome de usuário.
	public void setUsername(String username) {
		this.username = username;
	}

	// Método para obter o momento da entrada de log.
	public Date getMoment() {
		return moment;
	}

	// Método para definir o momento da entrada de log.
	public void setMoment(Date moment) {
		this.moment = moment;
	}

	// Método hashCode para gerar um código hash para a entrada de log.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	// Método equals para comparar duas entradas de log com base no nome de usuário.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}