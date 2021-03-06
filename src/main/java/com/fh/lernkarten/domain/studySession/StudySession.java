package com.fh.lernkarten.domain.studySession;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fh.lernkarten.domain.deck.Card;

@Document
public class StudySession {

	@Id
	private String id;

	private Set<Card> knownCards = new HashSet<Card>();
	private Set<Card> unknownCards = new HashSet<Card>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private Date date;

	public Set<Card> getKnownCards() {
		return knownCards;
	}

	public void setKnownCards(Set<Card> knownCards) {
		this.knownCards = knownCards;
	}

	public Set<Card> getUnknownCards() {
		return unknownCards;
	}

	public void setUnknownCards(Set<Card> unknownCards) {
		this.unknownCards = unknownCards;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
