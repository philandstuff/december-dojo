(ns december-dojo.core)

;; #59: juxtaposition
(defn juxt [& fns]
            (fn [& args]
              (vec (map #(apply % args) fns))))

