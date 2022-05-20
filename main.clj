;; Hello World
(println "Hello World!")

;; Argumentos de línea de comando
(doseq [arg *command-line-args*]
  (println (str "Arg: " arg)))

;; Standard Streams
(def n (read-line)) ;; Standard input
(println "You typed: " n) ;; Standard output
(binding [*out* *err*]
  (println "Error!"))

;; Variables de ambiente
(println (System/getenv "OS"))
(println (System/getenv "PATHEXT"))
(println (System/getenv "PROCESSOR_LEVEL"))
(println (System/getenv "USERNAME"))
(println (System/getenv "windir"))

;; File I/O
(spit "file.txt" " Durán" :append true) ;; Escritura
(println (slurp "file.txt")) ;; Lectura

;; Network I/O
(println (slurp "https://devicon.dev/"))