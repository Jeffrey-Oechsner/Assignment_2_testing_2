Feature: Bowling game;

  Scenario: Having a bad game
    Given Having a bad game
    When I played 20 rounds and i hit 0 pins in each round
    Then the score should be 0 because i didn't hit any pin

  Scenario: This bowling player, can only hit 1 pin each round
    Given I am bad, but i was able to hit 1 pin in each round
    When  I played 20 rounds and i was able to hit 1 pin in each round
    Then the score should be 20 because i hit 1 pin in each round

  Scenario: New bowling player is new, was able to hit one spare
    Given I am new, but i was able to hit a spare
    When I played 17 rounds where i hit 0 pins. Then i hit 1 spare and hit 3 pin in the next roll
    Then the score should be 16 because i hit 1 spare and 3 pin in the next roll

  Scenario: The bowling player is average but he was able to hit a strike
    Given I am able to hit a strike
    When I hit 1 strike, then rolled 3 and 4 pins in the next 2 rolls. The last 16 rolls i hit 0 pins
    Then the score should be 24 because i hit a strike and 3 and 4 pins in the next 2 rolls

  Scenario: The bowling player is world class and had a perfect game
    Given I am able very good at bowling
    When I hit 12 strikes in a row
    Then the score should be 300 because i hit 12 strikes in a row