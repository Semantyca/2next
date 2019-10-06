package com.toonext.core.api;


public class AnonymousUser extends SystemUser {
    public final static String USER_NAME = "anonymous";
    public final static long ID = 0;


    @Override
    public Long getId() {
        return (long) ID;
    }

    @Override
    public String getLogin() {
        return USER_NAME;
    }

    @Override
    public String getName() {
        return USER_NAME;
    }

    @Override
    public boolean isAnonymous(){
        return true;
    }




}