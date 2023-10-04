public class CommunityCashAssistance {
    public static void main(String[] args) {
        int amount = 1000;

        SitioISKP sitioISKP = new SitioISKP(new ISKPProvider());
        SitioSNCA sitioSNCA = new SitioSNCA(new SNCAPProvider());
        SitioMaharlika sitioMaharlika = new SitioMaharlika(new MaharlikaProvider());
        SitioBrupa sitioBrupa = new SitioBrupa(new BrupaProvider());
        SitioKawayan sitioKawayan = new SitioKawayan(new KawayanProvider());

        sitioISKP.provideAssistance(amount);
        sitioSNCA.provideAssistance(amount);
        sitioMaharlika.provideAssistance(amount);
        sitioBrupa.provideAssistance(amount);
        sitioKawayan.provideAssistance(amount);
    }
}
