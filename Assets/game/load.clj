(ns game.load
  (:require [arcadia.core :refer :all]
             [game.core :refer :all])
  )

(defn Start [obj role-key] 
  (state+ (object-named "GameState") :state (InitGameState players)))

(defn Next [obj role-key]
  (let [gs (state (object-named "GameState") :state )]
    (state+ (object-named "GameState") :state (ComputeNextGameState gs (Roll))))
)


