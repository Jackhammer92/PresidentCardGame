package de.fhk_gm.model.president

import org.specs2.mutable._

class CardSpec extends SpecificationWithJUnit {

	"A new Card with cardID = 0" should {
		val card1 = new Card(0)
	    val card2 = new Card(1)
		
		"have realname" in {
			card1.returnRealName must be_==("2")
		}
		
		"be lower than a card with cardID = 1" in {
			card1.cardID must be_<(card2.cardID)
		}
	}
	
	"A new Card with cardID = 12" should {
		val card3 = new Card(12)
	    val card4 = new Card(11)
		
		"have realname" in {
			card3.returnRealName must be_==("Ass")
		}
		
		"be higher than a card with cardID = 11" in {
			card3.cardID must be_>(card4.cardID)
		}
	}	
  
  
  
}