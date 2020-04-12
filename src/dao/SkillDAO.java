
package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;
import java.util.Map.Entry;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public TreeMap<Integer,Skill> skillCount() throws ClassNotFoundException, SQLException, IOException 
	{
		Connection con=ConnectionManager.getConnection();
		
		Statement stmt=  con.createStatement();
		int battingCount =0;
		int bowlingCount=0;
		int allrounderCount=0;
		
		ResultSet count =stmt.executeQuery("select * from player ");
		
		
		
		
		while(count.next())
		{
			if(count.getInt(4)==1)
			{
				battingCount ++;
				
			}
			else if(count.getInt(4)==2)
			{
				bowlingCount ++;
			}
			else
			{
				allrounderCount ++;
			}
		
		}
		
		
		
		Skill s1=new Skill((long)123,"batting");
		Skill s2=new Skill((long)127,"bowling");
		Skill s3=new Skill((long)130,"keeping");
		
		TreeMap<Integer,Skill> map=new TreeMap<Integer,Skill>();
		
		Integer i1=new Integer(battingCount);
		Integer i2=new Integer(bowlingCount);
		Integer i3=new Integer(allrounderCount);
		
		map.put(i1,s1);
		map.put(i2,s2);
		map.put(i3,s3);
		
		
		
		return map;
	
	}
	
}

