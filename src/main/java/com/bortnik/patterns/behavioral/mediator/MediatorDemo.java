package com.bortnik.patterns.behavioral.mediator;

/**
 * The Mediator pattern distributes responsibility and reduces connectivity between objects,
 * shifting control of their interaction to a centralized intermediary object.
 */
public class MediatorDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Mediator Pattern ===");
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ConcreteUser(chatRoom, "Obi-Van Kenobi");
        User user2 = new ConcreteUser(chatRoom, "Grievous");
        User user3 = new ConcreteUser(chatRoom, "Droid 1");
        User user4 = new ConcreteUser(chatRoom, "Droid 2");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello there!");
        user2.send("General Kenobi, you are a bold one! Kill him");
    }
}
