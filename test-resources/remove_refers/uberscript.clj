(ns app.command)

(defn unused-fn [] nil)

(defn used-fn [] (prn "used-fn called"))

(ns app.cli
  (:require
   [app.command :refer [used-fn unused-fn]]))

(defn -main [& _args]
  (used-fn))

(ns user (:require [app.cli])) (apply app.cli/-main *command-line-args*)
