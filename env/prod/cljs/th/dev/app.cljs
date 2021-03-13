(ns th.dev.app
  (:require [th.dev.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
