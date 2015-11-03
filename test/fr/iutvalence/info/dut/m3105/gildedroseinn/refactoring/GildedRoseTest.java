package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void itemsSellingAndQualityAreUpdatedEachDays()
	{
		 
		 	Item item = new Item("+5 Dexterity Vest", 10, 20);
			 int qualityBefore=item.getQuality();
			 int sellInBefore=item.getSellIn();
			 GildedRose.updateItem(item);
			 assertEquals(qualityBefore,(item.getQuality())+1);
			 assertEquals(sellInBefore,(item.getSellIn())+1);
	}

}