# Quiz App Rest API 

[![Build Status](https://travis-ci.org/gat786/quiz_api.svg?branch=master)](https://travis-ci.org/gat786/quiz_api)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/67269fa5831a4b1999c91bf337130bcf)](https://www.codacy.com/project/gat786/quiz_api/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=gat786/quiz_api&amp;utm_campaign=Badge_Grade_Dashboard)

This is a restful API that I have made for my college project application that is made on flutter.

This API has 2 main endpoints 

/multiple (use this to get multiple choice questions data)

this endpoint has two ways to be used i.e. either you can use POST method directly on to it and yo have to provide json input in the body having elements such as 

1) question 2) answer 3) option1 4) option2 5) option3 

and you can also use get method here but you have to specify which subjects you want to get data there are currently 7 subjects that are included here 

i.e. 1) /science 2) /history 3) /mythology 4) /sports 5) /geography 6) /films 7) /computers 

/boolean (use this to get boolean questions data)

this endpoint has two ways to be used i.e. either you can use POST method directly on to it and yo have to provide json input in the body having elements such as 

1) question 2) answer 3) option1 4) option2 5) option3 

and you can also use get method here but you have to specify which subjects you want to get data there are currently 7 subjects that are included here 

i.e. 1) /science 2) /history 3) /mythology 4) /sports 5) /geography 6) /films 7) /computers 

