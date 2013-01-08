package de.fhk_gm.model.president

class Deck ( multiples: Int, cards: Int ) {
	var totalCardNumber = multiples*cards
	var deckcards = Array.fill(totalCardNumber){0}
	var x = multiples
	var y = cards
	
	def fillDeck {
		for(i <- deckcards.indices) { deckcards(i) = 13-y; x-=1 
			if( x==0 ) { y-=1; x = multiples } 
		}
	}
	
	def randomizeDeck {	deckcards = util.Random.shuffle(deckcards.toSeq).toArray }
}