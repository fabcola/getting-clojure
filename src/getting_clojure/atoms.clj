(ns getting-clojure.atoms)

;; Create one
(def word-store (atom []))

;; Empty for now
@word-store
(deref word-store)

;; We add something with swap
(swap! word-store #(conj 1 %))

;; Reset to a state
(reset! word-store 2)

;; This is like a conditional reset. works ony,if the atom state is the same as the first arg
(compare-and-set! word-store 7 6)

;; If multiple args, atom is passed as the first one
(swap! word-store #(+ (* 2 %1) %2) 3)

;; Swap-vals returns the before and after values after applyinf f to the atom
(swap-vals! word-store #(+ (* 2 %1) %2) 3)



