package com.mantas.training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TrainingTest {

    @InjectMocks
    private Training training;

    @Test
    public void firstTest() {
        String result = training.getTrainingResults("one", "two");

        assertThat(result).isEqualTo("onetwo");

    }
}
