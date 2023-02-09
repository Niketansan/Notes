package homework;

import java.util.*;

class UserInfo {

	String userName;
	String firstName;
	String lastName;
	String address;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {

		return userName;
	}

}

public class ScannerExample {

	public static void main(String[] args) {

		Map<String, List<UserInfo>> map = new HashMap<>();

		List<UserInfo> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int i = 3;
		while (i > 0) {

			String username = sc.next();
			UserInfo user = new UserInfo();

			user.setUserName(username);
			list.add(user);

			i--;
		}

		System.out.println("Press Y to display User lsit ");

		String input = sc.next();

		if (input.equalsIgnoreCase("Y")) {
			list.forEach(x -> {
				
				String fistCharacter = x.getUserName().substring(0, 1);

				if (map.containsKey(fistCharacter)) {
                      /// key found
					
					  //key related value 
					List updatedList = map.get(fistCharacter);
					updatedList.add(x);
					
					///put
					map.put(fistCharacter, updatedList);
					
				} else {
					List<UserInfo> neList = new ArrayList<>();
					neList.add(x);
					
					
                    ///put
					map.put(fistCharacter, neList);
				}

				System.out.println(x.getUserName());
			});
		}

		else {

			System.out.println(" thanks for visiting ");
		}

		System.out.println(map);
	}
}
