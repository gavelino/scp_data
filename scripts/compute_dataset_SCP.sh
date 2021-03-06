#!/bin/bash

repos=("activeadmin/activeadmin"	"ajaxorg/ace"	"alexreisner/geocoder"	"android/platform_frameworks_base"	"ansible/ansible"	"apache/cassandra"	"atom/atom-shell"	"bbatsov/rubocop"	"bitcoin/bitcoin"	"bjorn/tiled"	"boto/boto"	"bumptech/glide"	"bundler/bundler"	"bup/bup"	"BVLC/caffe"	"caskroom/homebrew-cask"	"celery/celery"	"celluloid/celluloid"	"chef/chef"	"clojure/clojure"	"cocos2d/cocos2d-x"	"codemirror/CodeMirror"	"composer/composer"	"cucumber/cucumber"	"diaspora/diaspora"	"divio/django-cms"	"django/django"	"driftyco/ionic"	"dropwizard/dropwizard"	"dropwizard/metrics"	"drupal/drupal"	"elasticsearch/elasticsearch"	"elasticsearch/logstash"	"emberjs/ember.js"	"erikhuda/thor"	"Eugeny/ajenti"	"excilys/androidannotations"	"facebook/osquery"	"facebook/presto"	"fog/fog"	"FriendsOfPHP/PHP-CS-Fixer"	"fzaninotto/Faker"	"getsentry/sentry"	"git/git"	"github/android"	"github/linguist"	"gradle/gradle"	"gruntjs/grunt"	"haml/haml"	"Homebrew/homebrew"	"iojs/io.js"	"ipython/ipython"	"Itseez/opencv"	"jadejs/jade"	"janl/mustache.js"	"jashkenas/backbone"	"jekyll/jekyll"	"JetBrains/intellij-community"	"jnicklas/capybara"	"JohnLangford/vowpal_wabbit"	"joomla/joomla-cms"	"jquery/jquery"	"jquery/jquery-ui"	"jrburke/requirejs"	"justinfrench/formtastic"	"kivy/kivy"	"koush/ion"	"kriswallsmith/assetic"	"Leaflet/Leaflet"	"less/less.js"	"libgdx/libgdx"	"mailpile/Mailpile"	"mbostock/d3"	"meskyanichi/backup"	"meteor/meteor"	"mitchellh/vagrant"	"mitsuhiko/flask"	"moment/moment"	"mongoid/mongoid"	"mozilla/pdf.js"	"mrdoob/three.js"	"nate-parrott/Flashlight"	"netty/netty"	"nicolasgramlich/AndEngine"	"odoo/odoo"	"omab/django-social-auth"	"openframeworks/openFrameworks"	"paulasmuth/fnordmetric"	"phacility/phabricator"	"php/php-src"	"plataformatec/devise"	"powerline/powerline"	"prawnpdf/prawn"	"puphpet/puphpet"	"puppetlabs/puppet"	"pydata/pandas"	"rails/rails"	"ratchetphp/Ratchet"	"ReactiveX/RxJava"	"Respect/Validation"	"resque/resque"	"rg3/youtube-dl"	"ruby/ruby"	"saltstack/salt"	"sampsyo/beets"	"sandstorm-io/capnproto"	"sass/sass"	"scikit-learn/scikit-learn"	"sebastianbergmann/phpunit"	"Seldaek/monolog"	"sferik/twitter"	"SFTtech/openage"	"Shopify/active_merchant"	"silexphp/Silex"	"sparklemotion/nokogiri"	"spotify/luigi"	"spring-projects/spring-framework"	"sstephenson/sprockets"	"strongloop/express"	"substack/node-browserify"	"thinkaurelius/titan"	"ThinkUpLLC/ThinkUp"	"thoughtbot/factory_girl"	"thoughtbot/paperclip"	"thumbor/thumbor"	"TryGhost/Ghost"	"v8/v8"	"webscalesql/webscalesql-5.6"	"WordPress/WordPress"	"wp-cli/wp-cli"	"xetorthio/jedis"	"yiisoft/yii2")
#releases=("v4.7")
repos_path=$1
repositoryName=$2
current_path=${PWD}
clear
now=$(date)
echo -e $now: BEGIN Compute data script: $repos_path \\n 



echo "fullname;developers;authors;ratio" >> authors-ratio-dataset.log
echo "release;fullname;path;module;usernameId;name;email;firstDevCommit;lastDevCommit;firstDevFileCommit;lastDevFileCommit" >> author-workload-dataset.log
for repo in "${repos[@]}"; do
  repo_path="$repos_path${repo/\//-}"
  cd "$repo_path"
	rm *.log
	echo $repo
	cd $current_path
	./commit_log_script.sh "$repo_path" 
	./linguist_script.sh "$repo_path"
	java -jar system_authors_ratio.jar "$repo_path" $repo "" >> authors-ratio-dataset.log
	java -jar system_files_authors.jar "$repo_path" $repo "" >> author-workload-dataset.log
done
	
	
echo -e $now: END Compute data script: $repos_path \\n 
