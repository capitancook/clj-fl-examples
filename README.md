# example

Two simple use cases for the clj-fl Frame Language library.

## Usage

i) Download the repository

```bash
git clone https://github.com/capitancook/clj-fl-examples.git <your-dir>
```


ii) Start a REPL:

```bash
cd <your-dir>

lein repl
```

iii) At the repl prompt, type

```clojure
(ns clj-fl-examples
  (:require  [clj-fl.core :refer :all]
             [clj-fl-examples.core :refer :all]
             [clj-fl-examples.renderlib :refer :all]
             [clj-fl-examples.demons :refer :all]
             [vijual :as v]))
```
iv) It's time to play now!


### Knowledge Based Computer Aided Design (KBCAD) example

Please, read the following posts to have more information about this use case:

[Frame language: the knowledge based computer aided design (KBCAD) example (part 1)](http://highorderdysfunctions.blogspot.com/2014/12/frame-language-knowledge-based-computer.html)

[Frame language: the knowledge based computer aided design (KBCAD) example (part 2)](http://highorderdysfunctions.blogspot.com/2014/12/frame-language-knowledge-based-computer_9.html)

### Knowledge Based Human Resource Management  (KBHRM) example

TBD

## Todo

Add more functionalities to both KBCAD and KBHRM

## License
Copyright © 2014 Luciano Capitanio

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
