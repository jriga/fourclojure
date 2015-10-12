(ns fourclojure.core-test
  (:require [clojure.test :refer :all]
            [fourclojure.core :refer :all]))

(deftest 41
  (testing "Drop Every Nth Item"
    (is (= (f41 [1 2 3 4 5 6 7 8] 3)   [1 2 4 5 7 8]))
    (is (= (f41 [:a :b :c :d :e :f] 2) [:a :c :e]))
    (is (= (f41 [1 2 3 4 5 6] 4)       [1 2 3 5 6]))))

(deftest 49
  (testing "Split a sequence"
    (is (= (f49 3 [1 2 3 4 5 6])       [[1 2 3] [4 5 6]]))
    (is (= (f49 1 [:a :b :c :d])       [[:a] [:b :c :d]]))
    (is (= (f49 2 [ [1 2] [3 4] [5 6] ]) [[[1 2] [3 4]] [[5 6]]]))))

(deftest 51
  (testing "Advanced Destructing"
    (is (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] f51] [a b c d])))))

(deftest 61
  (testing "Map Contstruction"
    (is (= (f61 [:a :b :c] [1 2 3])               {:a 1, :b 2, :c 3}))
    (is (= (f61 [1 2 3 4] ["one" "two" "three"])  {1 "one", 2 "two", 3 "three"}))
    (is (= (f61 [:foo :bar] ["foo" "bar" "baz"])  {:foo "foo", :bar "bar"}) )))

