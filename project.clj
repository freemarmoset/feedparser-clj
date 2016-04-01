(defproject org.clojars.freemarmoset/feedparser-clj "0.6.1"
  :description "Parse RSS/Atom feeds with a simple, clojure-friendly API."
  :dependencies [[org.clojure/clojure "1.6.0"]
		 [org.jdom/jdom "2.0.2"]
		 [com.rometools/rome "1.6.0"]]
  :main feedparser-clj.core
  :deploy-repositories {"clojars-https" {:url "https://clojars.org/repo"
                                          :sign-releases false}})
