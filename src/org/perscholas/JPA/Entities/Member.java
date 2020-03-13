/**
 * @author Yvette U.
 * Entity implementation class for Entity: Member
 *
 */

package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity
@NamedQueries({
@NamedQuery(query="select m from Member m",name ="GetAllMembers"),
@NamedQuery(query="delete from Member m WHERE m.MemberId=:id",name="DeleteMemberById")
})


@Table(name = "member")
public class Member implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int MemberId;
	private String FirstName;
	private String LastName;
	private String AccountName;
	private String Password;
	@OneToOne(targetEntity=Goal.class) 
	private Goal goal;
	private static final long serialVersionUID = 1L;

	// @OneToMany (mappedBy="member")
	

	public Member() {
		super();
	}

	public Member(String firstName, String lastName, String accountName, String password) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAccountName(accountName);
		this.setPassword(password);
		
	}

	public int getMemberId() {
		return this.MemberId;
	}

	public void setMemberId(int MemberId) {
		this.MemberId = MemberId;
	}

	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getAccountName() {
		return this.AccountName;
	}

	public void setAccountName(String AccountName) {
		this.AccountName = AccountName;
	}

	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	@Override
	public String toString() {
		return "Member [MemberId=" + MemberId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", AccountName="
				+ AccountName + ", Password=" + Password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AccountName == null) ? 0 : AccountName.hashCode());
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + MemberId;
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		return result;
	}

	
}
