(defproject december-dojo "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.2.1"]])

;; #59: juxtaposition
(defn juxt [& fns]
            (fn [& args]
              (vec (map #(apply % args) fns))))

