package com.toonext.domain;


import com.toonext.domain.user.IUser;

import java.time.ZonedDateTime;

public interface IAppEntity<K> extends ISimpleAppEntity<K> {

    long getAuthor();

    void setLastModifier(IUser user);

    ZonedDateTime getRegDate();

    boolean isEditable();

    default boolean wasRead(){
        return true;
    }

    String getTitle();

    void setTitle(String title);

    default String getEntityType() {
        return this.getClass().getSimpleName();
    }

    boolean isNew();
}
