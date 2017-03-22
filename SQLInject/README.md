# SQLInject

A coursework that could be done in either C++, Java, Perl, Python, Haskell

I chose Python because it is less verbose and clearer than either C++ or
Java. Also because there main bottleneck in speed is waiting for pages to be
returned from the practice dummy server/website, so there is negilible benefit
from using a compiled language.

## The exercise

A dummy website was set-up, which had login information via it's url. If the
login information was 'correct' then a secret message would be displayed,
otherwise the webpage would just display a single word 'Nope'.

Given a valid username, the idea was first to find out how to get to the secret
message without a valid password and second to try and find out the password of
the given username. 

## Main Idea

This exercise was part of the security section of the standard Operating Systems
course at my university. I think it was to demonstrate that even though no
server code was displaying any SQL database information a simple login
success/failure can be used to obtain confidential information from the
database. This is dependent on if the SQLInjection vunerability is there, and
repeat logins can be tried and also if some of the structure of the SQL
table can be guessed or gained another way.
