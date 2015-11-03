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
	
	@Test
	public void itemsSellingAndQualityAreUpdatedWhenSellInIsUnderZero()
	{
		 
		 Item item = new Item("+5 Dexterity Vest", 0, 20);
		 int qualityBefore=item.getQuality();
		 int sellInBefore=item.getSellIn();
		 GildedRose.updateItem(item);
		 assertEquals(qualityBefore,(item.getQuality())+2);
		 assertEquals(sellInBefore,(item.getSellIn())+1);
	}
	
	@Test
	public void qualityNeverNegative(){
		 Item item = new Item("+5 Dexterity Vest", 10, 15);
		 int qualityBefore=item.getQuality();
		 GildedRose.updateItem(item);
		 //assertEquals(item.getQuality()+1,qualityBefore) || assertEquals(item.getQuality(),0);
		 
	}
	

}