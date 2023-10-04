// Implement the Implementor Interface
interface AssistanceProvider {
    void provideAssistance(int amount);
}

// Create Concrete Implementors
class ISKPProvider implements AssistanceProvider {
    @Override
    public void provideAssistance(int amount) {
        System.out.println("Providing " + amount + " pesos cash assistance to ISKP.");
    }
}

class SNCAPProvider implements AssistanceProvider {
    @Override
    public void provideAssistance(int amount) {
        System.out.println("Providing " + amount + " pesos cash assistance to SNCA.");
    }
}

class MaharlikaProvider implements AssistanceProvider {
    @Override
    public void provideAssistance(int amount) {
        System.out.println("Providing " + amount + " pesos cash assistance to MAHARLIKA.");
    }
}

class BrupaProvider implements AssistanceProvider {
    @Override
    public void provideAssistance(int amount) {
        System.out.println("Providing " + amount + " pesos cash assistance to BRUPA.");
    }
}

class KawayanProvider implements AssistanceProvider {
    @Override
    public void provideAssistance(int amount) {
        System.out.println("Providing " + amount + " pesos cash assistance to KAWAYAN.");
    }
}

// Implement the Abstraction
abstract class CashAssistance {
    protected AssistanceProvider provider;

    public CashAssistance(AssistanceProvider provider) {
        this.provider = provider;
    }

    public abstract void provideAssistance(int amount);
}

// Create Concrete Abstractions
class SitioISKP extends CashAssistance {
    public SitioISKP(AssistanceProvider provider) {
        super(provider);
    }

    @Override
    public void provideAssistance(int amount) {
        System.out.println("Cash assistance for ISKP:");
        provider.provideAssistance(amount);
    }
}

class SitioSNCA extends CashAssistance {
    public SitioSNCA(AssistanceProvider provider) {
        super(provider);
    }

    @Override
    public void provideAssistance(int amount) {
        System.out.println("Cash assistance for SNCA:");
        provider.provideAssistance(amount);
    }
}

class SitioMaharlika extends CashAssistance {
    public SitioMaharlika(AssistanceProvider provider) {
        super(provider);
    }

    @Override
    public void provideAssistance(int amount) {
        System.out.println("Cash assistance for MAHARLIKA:");
        provider.provideAssistance(amount);
    }
}

class SitioBrupa extends CashAssistance {
    public SitioBrupa(AssistanceProvider provider) {
        super(provider);
    }

    @Override
    public void provideAssistance(int amount) {
        System.out.println("Cash assistance for BRUPA:");
        provider.provideAssistance(amount);
    }
}

class SitioKawayan extends CashAssistance {
    public SitioKawayan(AssistanceProvider provider) {
        super(provider);
    }

    @Override
    public void provideAssistance(int amount) {
        System.out.println("Cash assistance for KAWAYAN:");
        provider.provideAssistance(amount);
    }
}


