(ns name-generator.core)

;; first sloane name
(def sloane-first-name
  {"a" "Ally-Pally"
   "b" "Bongo"
   "c" "Chippers"
   "d" "Dingo"
   "e" "Eddy"
   "f" "Flappy"
   "g" "Gussy"
   "h" "Henners"
   "i" "Indy"
   "j" "Jolly"
   "k" "Knobber"
   "l" "L-dog"
   "m" "Muffy"
   "n" "Noddy"
   "o" "Olly"
   "p" "Piggers"
   "q" "Quicky"
   "r" "Ratty"
   "s" "Smelly"
   "t" "Tinks"
   "u" "Uggers"
   "v" "Vadge"
   "w" "Wiffy"
   "x" "Xan-Xan"
   "y" "Yum"
   "z" "Zippy"})

;; second sloane name
(def sloane-second-name
  {"a" "Anstruther"
   "b" "Beaufort"
   "c" "Cholmondeley"
   "d" "De Lisle"
   "e" "Enniskillen"
   "f" "Featherstonehaugh"
   "g" "Gladstone"
   "h" "Hereford"
   "i" "Innes"
   "j" "Jarvis"
   "k" "Keppel"
   "l" "Legge"
   "m" "Mountbatten"
   "n" "Naseby"
   "o" "Onslow"
   "p" "Ponsonby"
   "q" "Quim"
   "r" "Runciman"
   "s" "Spiffington"
   "t" "Talbot"
   "u" "Uppingham"
   "v" "Vane"
   "w" "Wodehouse"
   "x" "Xavier"
   "y" "Yarborough"
   "z" "Zermatt"})

;; third sloane name
(def sloane-third-name
  {"a" "Arbuthnot"
   "b" "Battenburg"
   "c" "Coutts"
   "d" "Drummond"
   "e" "Eden"
   "f" "Finknottle"
   "g" "Glenconner"
   "h" "Home"
   "i" "Ingleby"
   "j" "Janner"
   "k" "Knollys"
   "l" "Lambton"
   "m" "Molyneux"
   "n" "Newburgh"
   "o" "Oppenheimer"
   "p" "Percy"
   "q" "Queensberry"
   "r" "Redesdale"
   "s" "Smythe"
   "t" "Tollemache"
   "u" "Ullswater"
   "v" "Villiers"
   "w" "Wellesley"
   "x" "Xerxes"
   "y" "Yorke"
   "z" "Zakynthos"})

;; get a name out of map by a character
(defn get-name [name-map character]
  (get sloane-first-name character))

;; get a character form first, second and last name
(defn get-first-character [name] (clojure.string/lower-case (first name)))
(defn get-second-character [name] (clojure.string/lower-case (first name)))
(defn get-third-character [name] (clojure.string/lower-case (first name)))

;; put it all together
(defn my-sloane-name
  [first-name second-name third-name]
  (let [first-character (get-first-character first-name)
        second-character (get-first-character second-name)
        third-character (get-first-character third-name)]
    (str (get sloane-first-name first-character)
         " "
    (get sloane-second-name second-character)
         " "
    (get sloane-third-name third-character))))

;; test
(my-sloane-name "Alice" "Catherine" "Miles")
;; => "Ally-Pally Cholmondeley Molyneux"
