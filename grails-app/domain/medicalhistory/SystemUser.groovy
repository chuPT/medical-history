package medicalhistory

class SystemUser {

    static searchable = {
        spellCheck "include"
    }

    String username
	String password

	String firstName
	String lastName
	String status

    String role

	Date lastLogin

//    static constraints = {
//    }
}
