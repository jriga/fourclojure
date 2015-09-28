(ns fourclojure.core)

(defn f41
  "Drop Every Nth Item"
  [col a]
  (loop [acc [] remaining col]
    (if (empty? remaining)
      (apply vector acc)
      (recur (concat acc (take (- a 1) remaining)) (drop a remaining)))))

(defn f49
  "Split a sequence"
  [a col]
  [(vec (take a col)) (vec (drop a col))])


(def f51 [1 2 3 4 5])

(defn f61
  "Map Construction"
  [keys vals]
  (loop [acc {}
        k keys
        v vals]
    (if (or (empty? k) (empty? v))
      acc
      (recur (assoc acc (first k) (first v)) (rest k) (rest v)))))

(defn f61-2
  [k v]
  (apply assoc {} (interleave k v)))


(defmacro code-praiser
  [code]
  (println "aaa" code)
  (println `(println "bbb" ~code))
  `(println
    "Sweet gorilla of Manila, this is good code:"
    (quote ~code)))


(defn fa [] 4)

(defmacro test-ev
  [code]
  `(+ 1 ~(inc 1) ~(fa)))
