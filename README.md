# JKVC - Key Value Coding for Java data structures
====

## Description 

JKVC is a tool for querying hierarchies of Java collections (currently lists + maps). It's based off of the [kvc project](https://github.com/etrepum/kvc).

## Status

- Very much a work in progress. 
- Error handling
- Once I get things completely tested, I'll release a maven artifact to Maven central.



## Example

```
HashMap<String, List<Integer>> m = new HashMap<String, List<Integer>>();
List<Integer> a = new ArrayList<Integer>();
a.add(100);
a.add(200);
a.add(300);

List<Integer> b = new ArrayList<Integer>();
b.add(111);
b.add(222);
b.add(333);

m.put("foo", a);
m.put("bar", b);

// get the value of foo from m
assertEquals("[100, 200, 300]", JKVC.prepare("foo").eval(m).toString());

// get the value of foo from m, get it's "1th" element (starting from 0)
assertEquals(200, JKVC.prepare("foo.@i[1]").eval(m));

// get the value of foo from m, call the @count aggregate function on the list
assertEquals(3l, JKVC.prepare("foo.@count").eval(m));

// get the value of foo from m, call the .size() Java method
assertEquals(3, JKVC.prepare("foo.#size").eval(m));

// get the value of foo from m, call the @sum aggregate function on the list
assertEquals(600.0d, JKVC.prepare("foo.@sum").eval(m));

// get the value of foo from m, get it's first element (starting from 0)
assertEquals(111, JKVC.prepare("bar.@i[0]").eval(m));
```

## Customizing

A developer can supply their own `JKVCEvalFactory` to the JKVC.prepare() method to specify their own method of traversing a hierarchy. 



## Contributing

Fork this repo, create a feature branch using something like this:
	
	git checkout -b branch_name
	
and submit a pull request. 

Please send me an email (dparfitt at basho dot com) and let me know if you want to work on any features.

Only friendly pull requests accepted.

#License

http://www.apache.org/licenses/LICENSE-2.0.html

---

© 2013 Dave Parfitt
