package com.pratice;

interface MobileAPI {
	
	public void add();

	public String userInterface();

	 String userScrreenSzie();
	
	default void defaultTest() {
		System.out.println("testing");
		
		System.out.println("New Implementation Logic");
	}
	
;
	
	public static void  getMobileInterface() {
		System.out.println("12313212");
	}
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

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	
	
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

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
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
		
		MobileAPI.getMobileInterface();
		samsumgObj.defaultTest();
		

	}
}
