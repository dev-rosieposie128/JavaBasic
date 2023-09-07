package com.godOfJavas.generic;

public class GenericSample {

    public static void main(String[] args){
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
    }
    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());
        String temp1 = (String) dto1.getObject();

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());
        StringBuffer temp2 = (StringBuffer) dto2.getObject();
        System.out.println(temp2);

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());
        StringBuilder temp3 = (StringBuilder) dto3.getObject();
        System.out.println(temp3);

    }
}
