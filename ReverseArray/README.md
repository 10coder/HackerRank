#Python 

array slicing:
arr[start index: end index : action]

action : skip level
action : 1 creates new copy of array
action : 2 creates a copy by skippig 1 element
  eg: 
  arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
  selected_elements = arr[::2]
  print(selected_elements)  # Output: [1, 3, 5, 7, 9]
action : -1 reverses the array
