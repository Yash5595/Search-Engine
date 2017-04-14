# Search-Engine

In this assignment we will build the basic data structure underlying search
engines: an inverted index. We will use this inverted index to answer some
simple search queries.

INVERTED INDEX FOR A SET OF WEBPAGES -

Suppose we are given a set of webpages W . For our purposes, each webpage
w ∈ W will be considered to be a sequence of words w 1 , w 2 , . . . w k . Another
way of representing the webpage could be to maintain a list of words along
with the position(s) of the words in the webpage. For example consider a
web page with the following text:
Data structures is the study of structures for storing data.
This can be represented as

{(data : 1, 10), (structures : 2, 7), (study : 5), (storing : 9)}

Note that the small connector words like “is”, “the”, “of”, “for” have not
been stored. Words like this are referred to as stop words and are generally
removed since they are very frequent and normally contain no information
about the content of the webpage.

For example, consider the following (small) collection of documents.
1: Data structures is the study of structures for storing data.
2: Structural engineers collect data about structures
The inverted index for this would be
{(data : {(1,1), (1,10), (2,4)}),
(structures: {(1,2), (1,7), (2,6)}),
(study : {(1,5)}),
(storing : {(1,9)}),
(structural : {(2,1)}),
(engineers : {(2,2)}),
(collect : {(2,3)}) }

• addPage x Add webpage x to the search engine database. The contents
of the webpage are stored in a file named x in the webpages folder.

• queryFindPagesWhichContainWord x Print the name of the webpages
which contain the word x. The list of webpage names should be comma
separated. If the word is not found in any webpage, then print “No
webpage contains word x”

• queryFindPositionsOfWordInAPage x y Print the word indice’s where
the word x is found in the document y. The word indices should be
separated by a comma. If the word x is not found in webpage y, then
print “Webpage y does not contain word x”.

