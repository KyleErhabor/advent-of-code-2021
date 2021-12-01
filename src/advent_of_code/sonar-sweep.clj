(ns advent-of-code.sonar-sweep
  (:require [clojure.string :as str]))

;; Tonsky's solution is even cooler: https://github.com/tonsky/advent2021/blob/main/src/advent2021/day1.clj

(defn nums []
  (map #(Long/parseLong %) (str/split-lines (slurp "resources/sonar-sweep.txt"))))

(defn solve [nums]
  (->> nums
       (partition 2 1)
       (filter (partial apply <))
       count))

(defn part1 []
  (solve (nums)))

(defn part2 []
  (->> (nums)
       (partition 3 1)
       (map (partial apply +))
       solve))
