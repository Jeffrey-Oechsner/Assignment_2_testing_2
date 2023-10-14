package org.example;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class GameSteps {
    Game g;

    @Before
    public void gameSetup() {
        g = new Game();
    }

    @Given("Having a bad game")
    public void i_am_very_bad_and_can_t_hit_a_single_pin_doing_the_game() { }

    @When("I played {int} rounds and i hit {int} pins in each round")
    public void i_play_the_round_game_and_i_hit_pins_in_each_round(int rounds, int pins) {
        rollMany(rounds, pins);
    }

    @Then("the score should be {int} because i didn't hit any pin")
    public void i_should_have_no_points(int expectedPoints) {
        assertEquals(expectedPoints, g.score());
    }

    @Given("I am bad, but i was able to hit 1 pin in each round")
    public void i_am_bad_but_i_was_able_to_hit_1_pin_in_each_round() { }

    @When("I played {int} rounds and i was able to hit {int} pin in each round")
    public void i_play_the_round_game_and_i_was_able_to_hit_pin_in_each_round(int rounds, int pins) {
        rollMany(rounds, pins);
    }

    @Then("the score should be {int} because i hit 1 pin in each round")
    public void i_should_have_points(int expectedPoints) {
        assertEquals(expectedPoints, g.score());
    }

    @Given("I am new, but i was able to hit a spare")
    public void i_am_new_but_i_was_able_to_hit_a_spare() { }

    @When("I played {int} rounds where i hit {int} pins. Then i hit {int} spare and hit {int} pin in the next roll")
    public void i_played_17_rounds_where_i_did_t_hit_any_pins_Then_i_hit_1_spare_and_hit_3_pin_in_the_next_roll(int zeroPinRounds, int zeroPin, int spares, int pinNextRoll) {
        for(int i = 0; i < spares; i++) {
            rollSpare();
        }
        g.roll(pinNextRoll);
        rollMany(zeroPinRounds, zeroPin);
    }

    @Then("the score should be {int} because i hit 1 spare and 3 pin in the next roll")
    public void the_score_should_be_16_because_i_hit_1_spare_and_3_pin_in_the_next_roll(int expectedScore) {
        assertEquals(expectedScore, g.score());
    }

    @Given("I am able to hit a strike")
    public void i_am_able_to_hit_a_strike() { }

    @When("I hit {int} strike, then rolled {int} and {int} pins in the next 2 rolls. The last {int} rolls i hit {int} pins")
    public void i_hit_strike_then_rolled_and_pins_in_the_next_2_rolls_The_last_rolls_i_hit_pins(int strikes, int firstRoll, int secondRoll, int zeroPinRounds, int zeroPin) {
        for(int i = 0; i < strikes; i++) {
            rollStrike();
        }
        g.roll(firstRoll);
        g.roll(secondRoll);
        rollMany(zeroPinRounds, zeroPin);
    }

    @Then("the score should be {int} because i hit a strike and 3 and 4 pins in the next 2 rolls")
    public void the_score_should_be_24_because_i_hit_a_strike_and_3_and_4_pins_in_the_next_2_rolls(int expectedScore) {
        assertEquals(expectedScore, g.score());
    }

    @Given("I am able very good at bowling")
    public void i_am_able_very_good_at_bowling() { }

    @When("I hit {int} strikes in a row")
    public void i_hit_strikes_in_a_row(int strikes) {
        rollMany(strikes, 10);
    }

    @Then("the score should be {int} because i hit 12 strikes in a row")
    public void the_score_should_be_300_because_i_hit_12_strikes_in_a_row(int expectedScore) {
        assertEquals(expectedScore, g.score());
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

}
