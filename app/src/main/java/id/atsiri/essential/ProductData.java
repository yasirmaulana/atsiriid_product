package id.atsiri.essential;

import java.util.ArrayList;

public class ProductData {
    public static String[][] data = new String[][]{
            {"Citronella", "Citronella Essential Oil - 10mL\n" +
                    "\n" +
                    "Rp. 185,000\n" +
                    "\n" +
                    "Manfaat UTAMA :\n" +
                    "Membantu Meringankan REMATIK", "http://atsiri.id/essenzo/citronella.png"},
            {"Clove Bud", "Clove Bud Essential Oil - 10mL\n" +
                    "\n" +
                    "Rp. 175,000\n" +
                    "\n" +
                    "Manfaat UTAMA :\n" +
                    "Membantu Mengurangi Sakit Gigi dan Gusi", "http://atsiri.id/essenzo/clovebud.png"},
            {"Lavender", "Lavender Essential Oil -10mL\n" +
                    "\n" +
                    "Rp. 250,000\n" +
                    "\n" +
                    "Manfaat UTAMA :\n" +
                    "Membantu Mengatasi SULIT TIDUR", "http://atsiri.id/essenzo/lavender.png"},
            {"Lemon", "Lemon Essential Oil - 10mL\n" +
                    "\n" +
                    "Rp. 160,000\n" +
                    "\n" +
                    "Manfaat UTAMA :\n" +
                    "Membantu Menurunkan DEMAM", "http://atsiri.id/essenzo/lemon.png"},
            {"Lemongress", "Lemongrass Essential Oil - 10mL\n" +
                    "\n" +
                    "Rp. 215,000\n" +
                    "\n" +
                    "Manfaat UTAMA :\n" +
                    "Membantu Meredakan Nyeri PMS", "http://atsiri.id/essenzo/lemongress.png"},
            {"Peppermint", "Peppermint Essential Oil - 10mL\n" +
                    "\n" +
                    "Rp. 225,000\n" +
                    "\n" +
                    "Manfaat UTAMA :\n" +
                    "Membantu Meredakan FLU dan MIGRAIN", "http://atsiri.id/essenzo/peppermint.png"},
            {"Tea Tree", "Tea Tree Essential Oil - 10mL\n" +
                    "\n" +
                    "Rp. 255,000\n" +
                    "\n" +
                    "Manfaat UTAMA :\n" +
                    "Membantu Proses Penyembuhan JERAWAT", "http://atsiri.id/essenzo/teatree.png"},
    };

    public static ArrayList<Product> getListData(){
        Product product = null;
        ArrayList<Product> list = new ArrayList<>();
        for(String[] aData : data) {
            product = new Product();
            product.setName(aData[0]);
            product.setRemark(aData[1]);
            product.setPhoto(aData[2]);

            list.add(product);
        }

        return list;
    }
}
