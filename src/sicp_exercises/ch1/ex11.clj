(ns sicp-exercises.ch1.ex11)

(defn rpf [n]
  (if (< n 3)
    n
    (+ (rpf (- n 1))
       (* 2 (rpf (- n 2)))
       (* 3 (rpf (- n 3))))))

(rpf 3)
(rpf 4)
(rpf 10)

(defn ipf [n]
  (defn iter [acc n]
    (if (< n 3)
      n
      (+ (iter acc (- n 1))
         (* 2 (iter acc (- n 2)))
         (* 3 (iter acc (- n 3))))))

  (iter 0 n))

(ipf 3)
(ipf 4)
(ipf 10)