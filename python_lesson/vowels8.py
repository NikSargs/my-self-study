def search4vowels(phrase:str)-> set:
        """Выводит гласные найденные в введенном слове."""
        vowels = {'a', 'e', 'i', 'o', 'u'}
        return vowels.intersection(set(phrase))
         
