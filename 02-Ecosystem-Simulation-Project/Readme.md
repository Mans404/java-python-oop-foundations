# 🌿 Ecosystem Simulation Project

## 💡 Idea

The **Ecosystem Simulation** models a simplified natural ecosystem where animals interact with their environment through eating and moving. Animals have energy levels that decrease when they move and increase when they eat. The simulation supports two types of animals — **predators** (who eat meat) and **herbivores** (who eat herbs) — and tracks their survival based on energy.

The environment manages the lifecycle of all animals and food sources, removing dead animals and depleted food automatically.

---

## 🧩 List of Components

| Class | Type | Description |
|-------|------|-------------|
| `Animal` | Base Class | Core entity with energy, movement, and eating behavior |
| `Predator` | Subclass of Animal | Carnivore that consumes `Meat` |
| `Herbivore` | Subclass of Animal | Plant-eater that consumes `Herbs` |
| `Food` | Base Class | Generic food source with availability and consumption logic |
| `Meat` | Subclass of Food | Food type specific to predators |
| `Herbs` | Subclass of Food | Food type specific to herbivores |
| `Environment` | Manager Class | Holds and manages all animals and food sources |
| `Main` | Entry Point | Demonstrates a simple simulation scenario |

---

## 🔗 Relations Between Components

- **`Animal`** is the parent of `Predator` and `Herbivore` *(Inheritance)*
- **`Food`** is the parent of `Meat` and `Herbs` *(Inheritance)*
- **`Predator`** depends on `Meat` to eat *(Dependency / Association)*
- **`Herbivore`** depends on `Herbs` to eat *(Dependency / Association)*
- **`Animal`** uses `Food` in its generic `eat(Food)` method *(Association)*
- **`Environment`** contains lists of `Animal` and `Food` objects *(Aggregation)*
- **`Main`** creates instances of `Predator`, `Meat`, and `Environment` *(Client)*

---

## 📊 UML Class Diagram

```
┌─────────────────────────────┐
│           Animal            │
├─────────────────────────────┤
│ - energyLevel: int          │
├─────────────────────────────┤
│ + Animal(energyLevel)       │
│ + eat(food: Food): void     │
│ + move(): void              │
│ + isAlive(): boolean        │
│ + getEnergyLevel(): int     │
│ + setEnergyLevel(int): void │
└──────────────┬──────────────┘
               │ extends
       ┌───────┴────────┐
       │                │
┌──────▼──────┐   ┌─────▼───────┐
│  Predator   │   │  Herbivore  │
├─────────────┤   ├─────────────┤
│             │   │             │
├─────────────┤   ├─────────────┤
│ + eat(      │   │ + eat(      │
│   Meat)     │   │   Herbs)    │
└──────┬──────┘   └──────┬──────┘
       │ uses             │ uses
       │                  │
┌──────▼──────┐   ┌───────▼─────┐
│    Meat     │   │    Herbs    │
├─────────────┤   ├─────────────┤
│             │   │             │
└──────┬──────┘   └──────┬──────┘
       │ extends          │ extends
       └────────┬─────────┘
                │
┌───────────────▼─────────────┐
│            Food             │
├─────────────────────────────┤
│ - amount: int               │
├─────────────────────────────┤
│ + Food(amount)              │
│ + isAvailable(): boolean    │
│ + consume(): void           │
│ + getAmount(): int          │
└─────────────────────────────┘


┌──────────────────────────────────┐
│           Environment            │
├──────────────────────────────────┤
│ - animals: List<Animal>          │
│ - foods: List<Food>              │
├──────────────────────────────────┤
│ + addAnimal(Animal): void        │
│ + addFood(Food): void            │
│ + removeDeadAnimals(): void      │
│ + removeFood(): void             │
│ + getAnimals(): List<Animal>     │
│ + getFoods(): List<Food>         │
└──────────────────────────────────┘
         ○ aggregates Animal & Food
```

### Relationship Legend

| Symbol | Meaning |
|--------|---------|
| `extends` | Inheritance (IS-A) |
| `uses` | Dependency (uses the object) |
| `○ aggregates` | Aggregation (HAS-A, lifecycle independent) |

---

## 🚀 How to Run

```bash
# Compile all files
javac Ecosystem_Simulation_project/*.java

# Run the main class
java Ecosystem_Simulation_project.Main
```

**Expected Output:**
```
Lion's energy level: 6
```

---

## 📁 Project Structure

```
Ecosystem_Simulation_project/
├── Animal.java          # Base animal class
├── Predator.java        # Meat-eating animal
├── Herbivore.java       # Plant-eating animal
├── Food.java            # Base food class
├── Meat.java            # Food for predators
├── Herbs.java           # Food for herbivores
├── Environment.java     # Ecosystem manager
└── Main.java            # Entry point
```
