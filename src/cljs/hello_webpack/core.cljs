(ns hello-webpack.core
  (:require [request :as rq]))

(set! *warn-on-infer* true)

(.log js/console rq)
