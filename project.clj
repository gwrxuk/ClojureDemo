(defproject demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.10.866"]
                 [javax.xml.bind/jaxb-api "2.3.0"]]
  :plugins [[lein-cljsbuild "1.1.8"]]
  :main ^:skip-aot demo.core
  :target-path "target/%s"
  :cljsbuild {
            :builds [{
                      :source-paths ["src-cljs"]
                      :compiler {
                                  :target :nodejs
                                  :optimizations :advanced
                                  :pretty-print false}}]}
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
