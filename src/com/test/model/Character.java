package com.test.model;

public class Character implements Comparable<Character> {
	 
    private int id;
    private String name;
    private int score;
     
    
    public Character(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}



	@Override
    public int compareTo(Character o) 
    {
        return this.getScore()<o.getScore()?1:this.getScore()==o.getScore()?0:-1;
    }

	

	public int getScore() {
		return score;
	}
	
	@Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof Character)
        {
            sameSame = this.id == ((Character) object).id;
        }

        return sameSame;
    }

	
}

