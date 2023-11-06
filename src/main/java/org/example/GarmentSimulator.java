package org.example;

// Abstract Product family
abstract class GarmentFamily {
    public abstract Top createTop();
    public abstract Pant createPant();
    public abstract Shoe createShoe();
}

// Concrete Product family
class ProfessionalGarmentFamily extends GarmentFamily {
    public Top createTop() {
        return new ProfessionalTop();
    }

    public Pant createPant() {
        return new ProfessionalPant();
    }

    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}

class CasualGarmentFamily extends GarmentFamily {
    public Top createTop() {
        return new CasualTop();
    }

    public Pant createPant() {
        return new CasualPant();
    }

    public Shoe createShoe() {
        return new CasualShoe();
    }
}

class PartyGarmentFamily extends GarmentFamily {
    public Top createTop() {
        return new PartyTop();
    }

    public Pant createPant() {
        return new PartyPant();
    }

    public Shoe createShoe() {
        return new PartyShoe();
    }
}

// Abstract Product interfaces
interface Top {
    void display();
}

interface Pant {
    void display();
}

interface Shoe {
    void display();
}

// Concrete Products
// Professional garments
class ProfessionalTop implements Top {
    public void display() {
        System.out.println("Professional Top");
    }
}

class ProfessionalPant implements Pant {
    public void display() {
        System.out.println("Professional Pant");
    }
}

class ProfessionalShoe implements Shoe {
    public void display() {
        System.out.println("Professional Shoe");
    }
}

// Casual garments
class CasualTop implements Top {
    public void display() {
        System.out.println("Casual Top");
    }
}

class CasualPant implements Pant {
    public void display() {
        System.out.println("Casual Pant");
    }
}

class CasualShoe implements Shoe {
    public void display() {
        System.out.println("Casual Shoe");
    }
}

// Party garments
class PartyTop implements Top {
    public void display() {
        System.out.println("Party Top");
    }
}

class PartyPant implements Pant {
    public void display() {
        System.out.println("Party Pant");
    }
}

class PartyShoe implements Shoe {
    public void display() {
        System.out.println("Party Shoe");
    }
}

// Garment Factory
class GarmentFactory {
    private GarmentFamily garmentFamily;

    public GarmentFactory(GarmentFamily garmentFamily) {
        this.garmentFamily = garmentFamily;
    }

    public Top createTop() {
        return garmentFamily.createTop();
    }

    public Pant createPant() {
        return garmentFamily.createPant();
    }

    public Shoe createShoe() {
        return garmentFamily.createShoe();
    }
}

// Client code

public class GarmentSimulator {
    public static void main(String[] args) {
        // Create a factory for a Professional outfit
        GarmentFactory professionalFactory = new GarmentFactory(new ProfessionalGarmentFamily());
        Top professionalTop = professionalFactory.createTop();
        Pant professionalPant = professionalFactory.createPant();
        Shoe professionalShoe = professionalFactory.createShoe();

        // Display Professional outfit
        professionalTop.display();
        professionalPant.display();
        professionalShoe.display();

        // Create a factory for a Casual outfit
        GarmentFactory casualFactory = new GarmentFactory(new CasualGarmentFamily());
        Top casualTop = casualFactory.createTop();
        Pant casualPant = casualFactory.createPant();
        Shoe casualShoe = casualFactory.createShoe();

        // Display Casual outfit
        casualTop.display();
        casualPant.display();
        casualShoe.display();

        // Create a factory for a Party outfit
        GarmentFactory partyFactory = new GarmentFactory(new PartyGarmentFamily());
        Top partyTop = partyFactory.createTop();
        Pant partyPant = partyFactory.createPant();
        Shoe partyShoe = partyFactory.createShoe();

        // Display Party outfit
        partyTop.display();
        partyPant.display();
        partyShoe.display();
    }
}
