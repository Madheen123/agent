package com.infinite.ServletAgent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentDAO {
	Connection connection;
	PreparedStatement pst;
	public String updateAgent(Agent agentNew) throws SQLException, ClassNotFoundException{
		Agent agent = searchAgent(agentNew.getAgentid());
		if(agent!=null){
			String cmd = "update agent set name=?, City=?, Gender=?, Maritalstatus=?" + "Premium =? where Agentid=?";
	connection = ConnectionHelper.getConnection();
	pst = connection.prepareStatement(cmd);
	pst.setString(1, agentNew.getName());
	pst.setString(2, agentNew.getCity());
	pst.setString(3, agentNew.getGender());
	pst.setInt(4, agentNew.getMaritalstatus());
	pst.setDouble(5, agentNew.getPremium());
	pst.setInt(6, agentNew.getAgentid());
	pst.executeUpdate();
	return "Agent Record Updated...";


		}
		return"Record not found";
	}

	public String deleteAgent(int Agentid)throws ClassNotFoundException, SQLException{
		Agent agent = searchAgent(Agentid);
		if(agent!=null){
			connection = ConnectionHelper.getConnection();
			String cmd = "delete from Agent where Agentid=?";
			pst = connection.prepareStatement(cmd);
	pst.setInt(1, Agentid);
			return "Record Deleted..."; 
		}
		return"Record not found";

	}

	public String addAgent(Agent agent)throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Agent(name,city,gender,maritalstatus,premium)"+"values(?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, agent.getName());
		pst.setString(2, agent.getCity());
		pst.setString(3, agent.getGender());
		pst.setInt(4, agent.getMaritalstatus());
		pst.setDouble(5, agent.getPremium());

		pst.executeUpdate();
		return "Agent Record Inserted...";	
	}

	public Agent searchAgent(int Agentid)throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Agent where Agentid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, Agentid);
	ResultSet rs = pst.executeQuery();
	Agent agent = null;
	if(rs.next()){
		agent = new Agent();
		agent.setAgentid(rs.getInt("Agentid"));
		agent.setName(rs.getString("name"));
		agent.setCity(rs.getString("City"));
		agent.setGender(rs.getString("Gender"));
		agent.setMaritalstatus(rs.getInt("maritalstatus"));	
		agent.setPremium(rs.getDouble("Premium"));

	}
	return agent ;
	}

	public List<Agent> showAgent() throws ClassNotFoundException, SQLException {
		List<Agent> agentList = new ArrayList<Agent>();
		connection = ConnectionHelper.getConnection();
	String cmd = "Select * from Agent";
	pst = connection.prepareStatement(cmd);
	ResultSet rs = pst.executeQuery();
	Agent agent = null;
	while(rs.next()){
		agent = new Agent();
		agent.setAgentid(rs.getInt("Agentid"));
		agent.setName(rs.getString("name"));
		agent.setCity(rs.getString("city"));
		agent.setGender(rs.getString("gender"));
		agent.setMaritalstatus(rs.getInt("maritalstatus"));
		agent.setPremium(rs.getDouble("Premium"));

		agentList.add(agent);
			
	}
		return agentList ;

	}
}


