(defproject enfocus-demp "2.0.0-SNAPSHOT"
  :description "enfocus documentation site"
  :url "http://ckirkendall.github.io/enfocus-site"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2234"]
                 [enfocus "2.1.0"]
                 [ring/ring-core "1.1.8"]
                 [ring/ring-jetty-adapter "1.1.8"]]
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]
            [lein-ring "0.8.3"]]
  :cljsbuild {:builds {:prod {:source-paths ["src"],
                              :compiler {:output-to "resources/public/js/bootstrap.js"
                                         :optimizations :advanced
                                         :externs ["resources/public/js/prettify.js" "resources/public/js/lang-clj.js"]
                                         :pretty-print false}}}})
