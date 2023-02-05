phrase = "Don't panic!"
plist = list(phrase)
print(phrase)
print(plist)

for i in range(-1,-8, -1):
    plist.pop()
    
plist.pop(0)
plist.pop(2)
#plist.pop(4)
plist.insert(2, ' ')
plist.extend('a')
plist.extend('p')
#plist.pop(

new_phrase = ''.join(plist)
print(plist)
print(new_phrase)
