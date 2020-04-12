package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main
{
	public static void main(String args[])throws IOException, ClassNotFoundException, SQLException
	{
		SkillDAO skilldao = new SkillDAO();
		
		TreeMap<Integer,Skill> map = new TreeMap<Integer,Skill>();
		
		map=skilldao.skillCount();
		System.out.println("Id"+"\t"+"name  "+"\t"+"\t"+"count");
		
		for(Entry<Integer,Skill> pair: map.entrySet())
		{
			int  count=pair.getKey();
			Skill skill=pair.getValue();
			System.out.println(skill.getSkilld()+"\t"+skill.getSkillName()  +"\t"+"\t"+count);
			
		}
		
	
	}
	
}
