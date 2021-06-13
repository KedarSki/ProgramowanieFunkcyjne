;; Zadanie 1. Proszę uzależnić ilość kroków wykonywanych przez procedurę heron-sqrt
;;            od pewnego parametru tej procedury określającego dokładność
;;            (zamiast stałej 0.00000001).

(defn abs [x] 
(if (< x 0) (- x) x))
(defn square [x] (* x x))
(defn good-enough? [G x prec] (<= (abs (- x (square G))) prec ))
(defn avg [x y] (/ (+ x y) 2))
(defn improve [G x] (avg G (/ x G)))
(defn heron-sqrt
  [G x prec]
  (println "G is" G)
  (if (good-enough? G x prec)
    G
 
    ;; otherwise,
    (heron-sqrt (improve G x) x prec)))

    (heron-sqrt 1 2 0.000000000001)

; Zadanie 4
(defn find-index [haystack needle] 
    (if (== (.indexOf haystack needle) -1) nil (.indexOf haystack needle)))

    (find-index (list "a" "b" "c") "c")

    ; Zadanie 5

    (defn unique-seq [mylist] (distinct mylist))

    (unique-seq [1 2 3 4 1 1 2 2 7 7 3 2 1 12 5548 ])