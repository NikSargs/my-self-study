phrase = "Don't panic!"
plist = list(phrase)
print(phrase)
print(plist)

plist = plist[1:5]
plist.pop(2)
plist.insert(2, ' ')
plist.extend(['a','p'])

new_phrase = ''.join(plist)
print(plist)
print(new_phrase)
