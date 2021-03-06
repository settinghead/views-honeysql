(defproject views/honeysql "0.1.0-SNAPSHOT"
  :description "HoneySQL view implementation for views"
  :url "https://github.com/kirasystems/views-honeysql"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[views "1.4.0-SNAPSHOT"]
                 [honeysql "0.5.2"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [org.clojure/tools.logging "0.3.1"]]
  :profiles {:dev {:dependencies
                   [[org.clojure/clojure "1.6.0"]]}})
