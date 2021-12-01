(ns advent-of-code.sonar-sweep
  (:require [clojure.string :as str]))

(defn sonar-sweep []
  (->> (str/split (slurp "resources/sonar-sweep.txt") #"\n")
       (map #(Long/parseLong %))
       (partition 2 1)
       (filter (partial apply <))
       count))
