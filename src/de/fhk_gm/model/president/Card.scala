package de.fhk_gm.model.president

class Card ( var cardID: Int ) {
	val cardnames = Array("2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "Koenig", "Ass", " ")
	//IDs                  0    1    2    3    4    5    6    7     8     9       10       11       12   13
	
	def returnRealName :String = { cardnames( cardID) }
}