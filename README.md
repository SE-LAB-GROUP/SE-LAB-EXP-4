# Software Engineering Lab
## Experiment 4

Upon composing the scenario outline and executing the runner, we encountered an 'undefined steps' error.
The issue arose due to the input number being negative, rendering the regex unable to capture it.
This was resolved by modifying the regex pattern to include `-?\\d` instead of `\\d` when defining steps.
