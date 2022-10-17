package com.funny.jam.Entity;

import java.io.Serializable;
import java.util.Locale.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HashID implements Serializable {
    private String tag;
    private String category;

    private HashID GetEquals(String tag, String category){

        HashID iden = null;
        if(this.tag == tag && this.category == category){
            iden = new HashID(tag, category);
        }

        return iden;
    }

}
