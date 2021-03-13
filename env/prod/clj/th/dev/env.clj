(ns th.dev.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[th.dev started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[th.dev has shut down successfully]=-"))
   :middleware identity})
