package de.fham.softwareentwicklung.zwei.queue;

import de.fham.softwareentwicklung.zwei.stack.IntStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class IntStackTestShould {

    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new IntQueue();
    }

    @Test
    void returnElementsInLiFoOrder() {
        // Setup - Prepare the tast

        Stack stack = new IntStack();
        stack.push(1);
        stack.push(2);

        // Execute
        int element = queue.element();

        // Validate
        assertThat(element).isEqualTo(1);
    }
}
