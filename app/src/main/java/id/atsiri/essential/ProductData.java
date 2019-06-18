package id.atsiri.essential;

import java.util.ArrayList;

public class ProductData {
    public static String[][] data = new String[][]{
            {"Citronella", "Membantu Meringankan REMATIK", "http://atsiri.id/essenzo/citronella.png", "Rp. 185,000", "Membantu Meringankan REMATIK", "Meredakan Nyeri Otot dan Sendi\n" +
                    "Mengusir Serangga\n" +
                    "Anti Bakteri dan Jamur\n" +
                    "Meringankan Gejala Flu"},
            {"Clove Bud", "Membantu Mengurangi Sakit Gigi dan Gusi", "http://atsiri.id/essenzo/clovebud.png", "Rp. 175,000", "Membantu Mengurangi Sakit Gigi dan Gusi", "Membantu Mengatasi Jerawat\n" +
                    "Penghilang Bau Mulut\n" +
                    "Anti Bakteri\n" +
                    "Membantu Meningkatkan Sirkulasi Darah"},
            {"Lavender", "Membantu Mengatasi SULIT TIDUR", "http://atsiri.id/essenzo/lavender.png", "Rp. 250,000", "Membantu Mengatasi SULIT TIDUR", "Membantu Mengatasi Sakit Kepala\n" +
                    "Membantu Proses Penyembuhan Luka\n" +
                    "Mengurangi Stress\n" +
                    "Membantu Mengurangi Peradangan Jerawat"},
            {"Lemon", "Membantu Menurunkan DEMAM", "http://atsiri.id/essenzo/lemon.png", "Rp. 160,000", "Membantu Menurunkan DEMAM", "Membantu Mengatasi Flu\n" +
                    "Relaksasi Pikiran\n" +
                    "Pembersih Wajah Alami\n" +
                    "Membantu Proses Pemutihan Gigi"},
            {"Lemongress", "Membantu Meredakan Nyeri PMS", "http://atsiri.id/essenzo/lemongress.png", "Rp. 215,000", "Membantu Meredakan Nyeri PMS", "Membantu Meredakan Sakit Kepala\n" +
                    "Relaksasi Sistem Saraf\n" +
                    "Anti Bakteri\n" +
                    "Membantu Meringkan Infeksi dan Demam"},
            {"Peppermint", "Membantu Meredakan FLU dan MIGRAIN", "http://atsiri.id/essenzo/peppermint.png", "Rp. 225,000", "Membantu Meredakan FLU dan MIGRAIN", "Membantu Mengatasi Sakit Perut\n" +
                    "Mengurangi Sinusitis\n" +
                    "Mengatasi Kembung, Mual, dan Gangguan Lambung\n" +
                    "Membantu Meredakan Alergi"},
            {"Tea Tree", "Membantu Proses Penyembuhan JERAWAT", "http://atsiri.id/essenzo/teatree.png", "Rp. 255,000", "Membantu Proses Penyembuhan JERAWAT", "Membantu Meredakan Gatal Eksim atau Psoriasis\n" +
                    "Anti Bakteri\n" +
                    "Membantu Mengobati Masalah Kulit\n" +
                    "Membantu Mengurangi Alergi"},
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
