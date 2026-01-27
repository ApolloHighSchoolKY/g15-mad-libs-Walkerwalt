//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("run");
		nouns.add("Jonathan Leohr");
		adjectives.add("purple");
		story = "Jonathan Leohr run down the purple road.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		Scanner storyReader = new Scanner(fileName);

		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech
			

			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			}


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		Scanner nounReader = new Scanner(new File("nouns.dat"));

		try
		{
			while (nounReader.hasNext())
			{
				nouns.add(nounReader.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		Scanner verbReader = new Scanner("verbs.dat");

		try
		{
			while (verbReader.hasNext())
			{
				verbs.add(verbReader.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		Scanner adjectiveReader = new Scanner("adjectives.dat");

		try
		{
			while (adjectiveReader.hasNext())
			{
				adjectives.add(adjectiveReader.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		int x = (int)(Math.random() * (verbs.size()));
		
		return "" + verbs.get(x);
	}

	public String getRandomNoun()
	{
		Random x = new Random(nouns.size());
		int y = x.nextInt();

		return "" + nouns.get(y);
	}

	public String getRandomAdjective()
	{
		int x = (int)(Math.random() *(adjectives.size()));

		return "" + adjectives.get(x);
	}

	public String toString()
	{
		return "";
	}
}