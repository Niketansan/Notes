package com.pratice;

interface MobileAPI {

	public String userInterface();

	public String userScrreenSzie();
}

interface SamsungOldAPI extends MobileAPI {

	public String getVersion();
}

interface VersionAPI {

	public String getVersionRead();
}

abstract class SamsungCustomImpl {

	public abstract String scrolling();

}

class SamsuangAPI extends SamsungCustomImpl implements SamsungOldAPI, VersionAPI {

	@Override
	public String userInterface() {
		// TODO Auto-generated method stub
		return "userInterface";
	}

	@Override
	public String userScrreenSzie() {
		// TODO Auto-generated method stub
		return "userScrreenSzie";
	}

	@Override
	public String getVersionRead() {
		// TODO Auto-generated method stub
		return "getVersionRead";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "getVersion";
	}

	@Override
	public String scrolling() {
		// TODO Auto-generated method stub
		return "scrolling";
	} // Multiple Inheritence we acheive only using interfaces

}

class MIMobile implements SamsungOldAPI, VersionAPI  {

	@Override
	public String userInterface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userScrreenSzie() {
		// TODO Auto-generated method stub
		return "MI Screen Size";
	}

	@Override
	public String getVersionRead() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {

		// with reference of interface will create object for our implementation class.

		SamsungOldAPI samsumgObj = new SamsuangAPI();
		

		VersionAPI versionIbj = new SamsuangAPI();

		System.out.println(samsumgObj.getVersion());
		System.out.println(versionIbj.getVersionRead());
		
		MobileAPI  miObject = new MIMobile();
		System.out.println(miObject.userScrreenSzie());

	}
}
/*
SaiRam Sir: UserDao -- Interface
SaiRam Sir: UserDaoImpl -class
SaiRam Sir: UserDao userobj = new UserDaoImpl
SaiRam Sir: save , delete , update , getuser*/
