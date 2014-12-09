(ns clj-fl-examples.demons
  (:require [clj-fl.core :refer :all]
            [clj-fl-examples.renderlib :refer :all]))

;;----- 2D rendering ---- start

(defn render2dbu [f]
  (let [ims (fget f :cof :value)
        areastr (if (fget "renderfilter" :showarea :value)
                  (str " area=" (fget-v-d-p f :area) " m²")
                  "")
        namestr (if (fget "renderfilter" :showname :value)
                  (fget f :name :value)
                  "")
        bustr (str namestr areastr)]
    (drawcolorstring
     (list 0 0 255) bustr (fget f :sps :value))
    (dorun (map #((resolve (fget-ii % :render2d :proc)) %) ims))))

(defn render2dsu [f]
  (let [ims (fget f :cof :value)
        areastr (if (fget "renderfilter" :showarea :value)
                  (str " area=" (fget-v-d-p f :area) " m²")
                  "")
        namestr (if (fget "renderfilter" :showname :value)
                  (fget f :name :value)
                  "")
        sustr (str namestr areastr)]
    (drawcolorstring
     (list 0 0 255) sustr (fget f :sps :value))
    (dorun (map #((resolve (fget-ii % :render2d :proc)) %) ims))))

(defn render2dbe [f]
  (drawcolorline (fget-i f :color :value) (fget-i f :width :value) (fget f :sps :value)))

;;----- 2D rendering ---- end


;;----- show relationships ---- start

(defn showcofs
  "show the hierarchy :cof for a given frame f"
  [f]
  (let [cofs (getcof f) cofslist (forceseq cofs)]
    (if (nil? cofs)
      (vector f)
      (reduce #( conj %1 ((if-let [showproc (fget-ii %2 :showcofs :proc)] (resolve showproc) (vector %2)) %2)) (vector f)  cofslist))))

(defn showisis
  "show the hierarchy :isi for a given frame f"
  [f]
  (let [isis (getisi f) isislist (forceseq isis)]
    (if (nil? isis)
      (vector f)
      (reduce #( conj %1 ((if-let [showproc (fget-ii %2 :showisis :proc)] (resolve showproc) (vector %2)) %2)) (vector f)  isislist))))

;;----- show relationships ---- end


;;----- area computation ---- start



(defn polygonarea
  "Calculate the area of the polygon poly"
  [p]
  (defn crunch
    [uno due]
    (- (* (first uno) (second due))
       (* (second uno) (first due))))
  (loop [ acc 0 poly p]
    (if (nil? poly)
      (abs (/ acc 2.0))
      (let [p1 (first(first poly)) p2 (second(first poly))]
        (recur (+ acc (crunch p1 p2)) (next poly))))))

(defn be-area
  [f s]
  0)


(defn su-area
  [f s]
  (let [components (forceseq (getcof f))
        poly (reduce #(concat % (list (fget %2 :sps :value))) '() components)]
    (polygonarea poly)))

(defn bu-area
  [f s]
  (let [components (forceseq (getcof f))]
    (reduce #(+ %1 (fget-v-d-p %2 :area)) 0 components)))

;;----- area computation ---- end
