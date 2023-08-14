# Junior Three
- edge cases zijn de randgevallen die precies rond de ideale input vallen. Wanneer we bijvoorbeeld willen checken of een getal groter is dan 30, dan zijn er minimaal 3 logische edge cases,
namelijk: 
  - checkThirty(29); (wat gebeurt er als de input kleiner dan 30 is?)
  - checkThirty(31); (wat gebeurt er als de input groter dan 30 is?)
  - checkThirty(30); (wat gebeurt er als de input exact 30 is?)
maar je kunt ook denken aan andere edge cases, zoals 
  - checkThirty(0); (wat doet de methode met 0 waarde?)
  - checkThirty(-1); (wat doet de methode met negatieve waardes?)
  - checkThirty(2147483648) (wat doet de methode met inputs groter dan de maximum waarde van een Integer?)
  - checkThirty("banaan") (wat doet de methode met onjuiste input?)