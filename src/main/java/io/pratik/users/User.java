/**
 * 
 */
package io.pratik.users;

/**
 * @author Pratik Das
 *
 */

public class User {

	private String firstName;
	private String lastName;
	private String mobile;
	private String email;

	public User(String firstName, String lastName, String mobile, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
	}

	public User() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private User user;

		private Builder() {
			user = new User();
		}

		public Builder firstName(String firstName) {
			this.user.firstName = firstName;
			return this;
		}

		public Builder setLastName(String lastName) {
			this.user.lastName = lastName;
			return this;
		}

		public Builder setMobile(String mobile) {
			this.user.mobile = mobile;
			return this;
		}

		public Builder setEmail(String email) {
			this.user.email = email;
			return this;
		}

		public User build() {
			return this.user;
		}

	}

}
