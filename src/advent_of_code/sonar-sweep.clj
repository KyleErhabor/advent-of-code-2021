(ns advent-of-code.sonar-sweep
  (:require [clojure.string :as str]))

(defn nums []
  (map #(Long/parseLong %) (str/split-lines (slurp "resources/sonar-sweep.txt"))))

(defn part1 []
  (->> (nums)
       (partition 2 1)
       (filter (partial apply <))
       count))

(defn part2 []
  (->> (nums)
       (partition 3 1)
       (map (partial apply +))
       (partition 2 1)
       (filter (partial apply <))
       (count)))
