def stutter(word):
	input(word)
	letters = list(word)
	shut = ''.join(letters[0:2])
	print(shut + "... " + shut + "... " + word + "?")

	return print