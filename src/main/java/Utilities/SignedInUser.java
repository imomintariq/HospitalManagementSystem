package Utilities;

import Entities.HmsUser;

public class SignedInUser {
    private static SignedInUser signedInUser = null;

    public HmsUser getUser() {
        return user;
    }

    public void setUser(HmsUser user) {
        this.user = user;
    }

    private HmsUser user;

    private SignedInUser(){
    }

    public static SignedInUser getInstance(){
        if(signedInUser ==  null){
            signedInUser = new SignedInUser();
        }
        return signedInUser;
    }


}
