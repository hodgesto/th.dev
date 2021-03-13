(ns th.dev.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [th.dev.core-test]))

(doo-tests 'th.dev.core-test)

