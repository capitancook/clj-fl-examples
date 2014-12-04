 ;-------------------------------------------Knowledge Base start--------------------------------------------------

[

 ;------ AKO frames

 {:frame       {:value "bu"}
  :name        {:value "Building Unit"}
  :description {:value "A man-made structure with a roof and walls standing more or less permanently in one place. Can be composed of other building unit"}}


 {:frame       {:value "su"}
  :name        {:value "Space Unit"}
  :description {:value "A space unit is  a building unit component. Is composed of building elements"}}


 {:frame       {:value "be"}
  :name        {:value "Building Element"}
  :description {:value "BEs are the physical elements that define the BU and BE. For example, a wall is a BE, a pillar is a BE and so on"}}


 ;------ ISA frames

 {:frame       {:value "flat"}
  :name        {:value "Flat"}
  :description {:value "A flat"}
  :ako         {:value "bu"}}

 {:frame       {:value "room"}
  :name        {:value "Room"}
  :description {:value "A room"}
  :ako         {:value "su"}}

 {:frame       {:value "sw"}
  :name        {:value "Structural Wall"}
  :description {:value "A structural wall is schematized as a line thicker than a partition wall"}
  :ako         {:value "be"}}

 {:frame       {:value "pw"}
  :name        {:value "Partition Wall"}
  :description {:value "A partition wall is schematized as a line thinner than a structural wall"}
  :ako         {:value "be"}}

 ;------  object frames

 {:frame       {:value "flat1"}
  :name        {:value "Flat 1"}
  :isa         {:value "flat"}
  :cof         {:value ("kitchen1" "bedroom1" "bathroom1")}}

 {:frame       {:value "kitchen1"}
  :name        {:value "Kitchen 1"}
  :isa         {:value "room"}
  :cof         {:value ("w1" "w2" "w3" "w4")}
  :isi         {:value "flat1"}}

 {:frame       {:value "bathroom1"}
  :name        {:value "Bathroom 1"}
  :isa         {:value "room"}
  :cof         {:value ("w3" "w10" "w9" "w8")}
  :isi         {:value "flat1"}}

 {:frame       {:value "bedroom1"}
  :name        {:value "Bedroom 1"}
  :isa         {:value "room"}
  :cof         {:value ("w5" "w4" "w8" "w7" "w6")}
  :isi         {:value "flat1"}}

 {:frame       {:value "w1"}
  :name        {:value "Wall 1"}
  :isa         {:value "sw"}
  :sps         {:value ((0 5) (0 0))}
  :isi         {:value "kitchen1"}}

 {:frame       {:value "w2"}
  :name        {:value "Wall 2"}
  :isa         {:value "sw"}
  :sps         {:value ((0 0) (6 0))}
  :isi         {:value "kitchen1"}}

 {:frame       {:value "w3"}
  :name        {:value "Wall 3"}
  :isa         {:value "pw"}
  :sps         {:value ((6 0) (6 5))}
  :isi         {:value ("kitchen1" "bathroom1")}}

 {:frame       {:value "w4"}
  :name        {:value "Wall 4"}
  :isa         {:value "pw"}
  :sps         {:value ((6 5) (0 5))}
  :isi         {:value ("kitchen1" "bedroom1")}}

 {:frame       {:value "w5"}
  :name        {:value "Wall 5"}
  :isa         {:value "sw"}
  :sps         {:value ((0 10) (0 5))}
  :isi         {:value "bedroom1"}}

 {:frame       {:value "w6"}
  :name        {:value "Wall 6"}
  :isa         {:value "sw"}
  :sps         {:value ((12 10) (0 10))}
  :isi         {:value "bedroom1"}}

 {:frame       {:value "w7"}
  :name        {:value "Wall 7"}
  :isa         {:value "sw"}
  :sps         {:value ((12 5) (12 10))}
  :isi         {:value "bedroom1"}}

 {:frame        {:value "w8"}
  :name        {:value "Wall 8"}
  :isa         {:value "pw"}
  :sps         {:value ((6 5) (12 5))}
  :isi         {:value ("bedroom1" "bathroom1")}}

 {:frame       {:value "w9"}
  :name        {:value "Wall 9"}
  :isa         {:value "sw"}
  :sps         {:value ((12 0) (12 5))}
  :isi         {:value ("bedroom1" "bathroom1")}}

 {:frame       {:value "w10"}
  :name        {:value "Wall 10"}
  :isa         {:value "sw"}
  :sps         {:value ((6 0) (12 0))}
  :isi         {:value ("bedroom1" "bathroom1")}}


 ;-------------------------------------------Knowledge Base end--------------------------------------------------

 ]
