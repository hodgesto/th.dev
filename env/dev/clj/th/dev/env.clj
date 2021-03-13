(ns th.dev.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [th.dev.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[th.dev started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[th.dev has shut down successfully]=-"))
   :middleware wrap-dev})
