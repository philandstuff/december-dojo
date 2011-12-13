(ns december-dojo.core)

;; #59: juxtaposition
(defn juxt [& fns]
            (fn [& args]
              (vec (map #(apply % args) fns))))

;; #60: reductions
;; does correct calculation but fails for not being lazy
(defn my-red
          ([f coll]
            (if (seq coll)
                (cons (first coll) (map #(+ % (first coll)) (my-red f (rest (seq coll)))))
                []))
        ([f init coll]
           (my-red f (cons init coll))))


