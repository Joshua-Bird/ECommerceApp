# UML Class Diagram

```mermaid
classDiagram
    class Customer {
        + attributeType = defaultValue
        + attribute2.type
        + attribute3.type
        + operation1(params) returnType
        - operation2(params)
        - operation3()
    }
    
    class Places {
    }
    
    class Tracked {
    }
    
    class Card {
        + attributeType = defaultValue
        + attribute2.type
        + attribute3.type
        + operation1(params) returnType
        - operation2(params)
        - operation3()
    }
    
    class Paid {
    }
    
    class Order {
        + attributeType = defaultValue
        + attribute2.type
        + attribute3.type
        + operation1(params) returnType
        - operation2(params)
        - operation3()
    }
    
    class OrderItem {
        + attributeType = defaultValue
        + attribute2.type
        + attribute3.type
        + operation1(params) returnType
        - operation2(params)
        - operation3()
    }
    
    class Product {
        + attributeType = defaultValue
        + attribute2.type
        + attribute3.type
        + operation1(params) returnType
        - operation2(params)
        - operation3()
    }
    
    class Payment {
        + attributeType = defaultValue
        + attribute2.type
        + attribute3.type
        + operation1(params) returnType
        - operation2(params)
        - operation3()
    }
    
    class Shipping {
        + attributeType = defaultValue
        + attribute2.type
        + attribute3.type
        + operation1(params) returnType
        - operation2(params)
        - operation3()
    }
    
    Customer -- Places : "0..*"
    Tracked -- Card : "HAS 0..*"
    Paid -- Order : "USED FOR"
    Order -- OrderItem : "CONTAINS 1..*"
    OrderItem -- Product : "LINKS 0..*"
    Order -- Payment : ""
    Order -- Shipping : ""
