(defproject finances-banks-accounts "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.datomic/datomic-free "0.9.5703"]
                 [clj-time "0.15.0"]
                 [expectations "2.1.10"]
                 [metosin/compojure-api "1.1.11"]]
  :ring {:handler finances-banks-accounts.core/app}
  :datomic {:schemas ["resources" ["schema.dtm"]]}
  :profiles {:dev
              {:plugins [[lein-ring "0.12.5"]
                         [lein-midje "3.2.1"]]
               :dependencies [[javax.servlet/servlet-api "2.5"]
                              [cheshire "5.8.1"]
                              [ring/ring-mock "0.3.2"]
                              [midje "1.9.6"]]}})
