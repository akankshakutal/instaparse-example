(ns instaparse-example.core
  (:require [instaparse.core :as insta]))

(def whitespace
  (insta/parser
    "whitespace = #'\\s+'"))

(def exp-parser
  (insta/parser
    "<S> =  <'('> OPERATION <')'> | NUM | <'('> defn FUNC_NAME S <')'>
     OPERATION = OPERATOR + S*
     OPERATOR = '+' | '-' | '*' | '/'
     NUM = #'[0-9]+'
     FUNC_NAME = #'[a-z]+'
     <defn> = <'defn'>"
    :auto-whitespace whitespace))




