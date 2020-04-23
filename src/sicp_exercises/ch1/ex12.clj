(ns sicp-exercises.ch1.ex12)

(defn pascal-nth [n]
  (defn iter [cnt prev]
    (if (= cnt 1)
      (vec prev)
      (iter (- cnt 1)
            (let [zero-added (conj (into [0] prev) 0)
                  result (map
                           (fn [p] (let [[n1 n2] p]
                                     (+ n1 n2)))
                           (partition 2 1 zero-added))]
              result))))
  (iter n [1]))

(pascal-nth 1)
(pascal-nth 2)
(pascal-nth 5)
