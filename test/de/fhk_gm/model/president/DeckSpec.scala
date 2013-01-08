package de.fhk_gm.model.president

import org.specs2.mutable._

class DeckSpec extends SpecificationWithJUnit {
	
	"A new Deck with 0 cards" should {
		val deck1 = new Deck(0, 0)
    
		"have a totalCardNumber of 0" in {
			deck1.totalCardNumber must be_==(0)
		}
	}

  
	"A new Deck with multiples = 4 and cards = 5, which gets filled" should {
		val deck2 = new Deck(4, 5)
		deck2.fillDeck
		var j = 0
		
		"have a totalCardNumber of 20" in {
			deck2.totalCardNumber must be_==(20)
		}
		
		"have no placeholder (cardID = 13) in the deckcards-array" in {
			for(j <- 0 until deck2.totalCardNumber ) { deck2.deckcards(j) must be_!=(13) }
		}
		
		var minCard1 = 13
		var temp1 = 0
		"have 10 (cardID = 8) as the lowest card" in {
			for(j <- 0 until deck2.totalCardNumber ) { temp1 = deck2.deckcards(j); if(temp1 < minCard1) { minCard1 = temp1 } }
			minCard1 must be_==(8)
		}
	}
	
	"A new Deck with multiples = 5 and cards = 4, which gets filled and shuffled" should {
		val deck3 = new Deck(5, 4)
		deck3.fillDeck
		deck3.randomizeDeck
		var j = 0
		
		"have a totalCardNumber of 20" in {
			deck3.totalCardNumber must be_==(20)
		}
		
		"have no placeholder (cardID = 13) in the deckcards-array" in {
			for(j <- 0 until deck3.totalCardNumber ) { deck3.deckcards(j) must be_!=(13) }
		}
				
		var minCard2 = 13
		var temp2 = 0
		"have Bube (cardID = 9) as the lowest card" in {
			for(j <- 0 until deck3.totalCardNumber ) { temp2 = deck3.deckcards(j); if(temp2 < minCard2) { minCard2 = temp2 } }
			minCard2 must be_==(9)
		}
	}
  
}