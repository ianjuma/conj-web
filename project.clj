(defproject conj-web "0.1.0-SNAPSHOT"
  :description "shouter"
  :url "https://github.com/ianjuma/conj-web"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.2"]
                 [postgresql "9.1-901.jdbc4"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :main shouter.core
  :aot [shouter.core])
