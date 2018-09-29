# Measuring and Analyzing Code Authorship in 1+118 Open Source Projects (DATA)
This repository contains the scripts to compute the data used in the study. 

## Repositories
In this study we investigate code authorship in 1+118 open-source projects. The developement history of the selected repositories were collected from their GitHub repositoroes. 

### Linux kernel
We investiga 66 stable releases of Linux kernel (v2.6.12–v4.17). Repository url = https://github.com/torvalds/linux

### 118 repositories (extended dataset)
We contrast the Linux results with the ones computed for an extended dataset of 118 popular opens-source projects. All projects were cloned from their GitHub repository on September 27th, 2018. More details about these projecs are provided in table below.

Project | Repository Url | Last commit
------------ | ------------- | -------------
activeadmin/activeadmin | https://github.com/activeadmin/activeadmin | 96b22bf08a879dc856aee0f7396d2a70fbc65209
ajaxorg/ace | https://github.com/ajaxorg/ace | 653005f8a3d8c1adeedd731d2d4f4feb1e5ca301
alexreisner/geocoder | https://github.com/alexreisner/geocoder | 1c4db14ab909e92f6f8e566afcd4e612e209da20
android/platform_frameworks_base | https://github.com/android/platform_frameworks_base | 4106e419b204c677afc1d9e216953ef4f04b3b73
ansible/ansible | https://github.com/ansible/ansible | 698c8059e9f4d65f06b2630a5698d6fd44a39625
apache/cassandra | https://github.com/apache/cassandra | 914c66685c5bebe1624d827a9b4562b73a08c297
atom/atom-shell | https://github.com/atom/atom-shell | 5c108728d6c657480c86cdbdd9b819c2df7bae86
bbatsov/rubocop | https://github.com/bbatsov/rubocop | b421841bef5e8739529d6164d3200c2c52f363d2
bitcoin/bitcoin | https://github.com/bitcoin/bitcoin | ae1cc010b88dd594d2a27b2717cfe14ef04ec852
bjorn/tiled | https://github.com/bjorn/tiled | 52d5fdc52584db9da168187498f678bc52663198
boto/boto | https://github.com/boto/boto | eca5f987aa59ec7490aa91466853c36b0cf40b3c
bumptech/glide | https://github.com/bumptech/glide | 00bae3a41e3017d316ae56481fd2fc17eda2272c
bundler/bundler | https://github.com/bundler/bundler | 8501b1e3608579acf53a4978b62c0d8891d23005
bup/bup | https://github.com/bup/bup | 6acbb4d025af9c4c0b9dd207c230caf688d9e812
BVLC/caffe | https://github.com/BVLC/caffe | 99bd99795dcdf0b1d3086a8d67ab1782a8a08383
caskroom/homebrew-cask | https://github.com/caskroom/homebrew-cask | 3b8397782d032dd1bf4d5faa1a58e2f1303a6d79
celery/celery | https://github.com/celery/celery | 7a0ae58e94150267bfb795253073f4815fa35ed3
celluloid/celluloid | https://github.com/celluloid/celluloid | 6891b409859756c6bb2e56f9d7bbcc5d143c9bfd
chef/chef | https://github.com/chef/chef | 8daa1c6598182777802eba6a74928f28a32f6835
clojure/clojure | https://github.com/clojure/clojure | 16ebe679e6a5fd1c7c24df5f9b9b5056bc18d2ec
cocos2d/cocos2d-x | https://github.com/cocos2d/cocos2d-x | aca3016bee4db8d9f2edf57a8519b12ef75256d5
codemirror/CodeMirror | https://github.com/codemirror/CodeMirror | 5791b2d7c2e43d8607185c35f9fcd956f4fffca4
composer/composer | https://github.com/composer/composer | 041028920f7ba5be4a3fab3ba344ce4fc1d09ae2
cucumber/cucumber | https://github.com/cucumber/cucumber | d7873129db98c40f91f5bfef27ffc1807b36dbf2
diaspora/diaspora | https://github.com/diaspora/diaspora | 026e63b961ed3e293b75d233e763e4b062acc262
divio/django-cms | https://github.com/divio/django-cms | 6eaa3b6c1bc4c01a5fa6bb2a6f0b7b4632afe8ac
django/django | https://github.com/django/django | 40c8ffad7249fd37ca1629f06d3ab6b129d84b21
driftyco/ionic | https://github.com/driftyco/ionic | 844c33a0244eb79a47a358586654541e6f47003f
dropwizard/dropwizard | https://github.com/dropwizard/dropwizard | 6948f4bdfa9ce7038ee4200915dd29eee0c6c88b
dropwizard/metrics | https://github.com/dropwizard/metrics | 9680fc801a6302a46cce0d299a960c2796ee21cd
drupal/drupal | https://github.com/drupal/drupal | faf551f8820d7b0f7dbb38b680b8bded4a72db00
elasticsearch/elasticsearch | https://github.com/elasticsearch/elasticsearch | 5f19146bace768255363c748fdcaa2c94766f299
elasticsearch/logstash | https://github.com/elasticsearch/logstash | 6c71b507475b9788112209ce9f6bbd69ac10ef66
emberjs/ember.js | https://github.com/emberjs/ember.js | bcdba9bc4da5a4a72232b583ec4e27a848149122
erikhuda/thor | https://github.com/erikhuda/thor | 57fe753c6d652f5afa73d8e8f2841fc3015ff310
Eugeny/ajenti | https://github.com/Eugeny/ajenti | ec75299866b26dcb0ceedd8229a152aa596da7d9
excilys/androidannotations | https://github.com/excilys/androidannotations | 5703c1a02bcee62e893be7ae0cdc5143313f47e8
facebook/osquery | https://github.com/facebook/osquery | 0314871908273b2770129da9f5a7c3206f224f68
facebook/presto | https://github.com/facebook/presto | d6e78652a83d405c636ae74beaf7152300729ec9
fog/fog | https://github.com/fog/fog | e4baf0e1c5dd723d57ac40e451264af53d9bf303
FriendsOfPHP/PHP-CS-Fixer | https://github.com/FriendsOfPHP/PHP-CS-Fixer | 0257ccae7ddcbdd5f7d51de3ae92ffac02d0e1c1
fzaninotto/Faker | https://github.com/fzaninotto/Faker | 82daf83b19d934291d4c2f2a22a4b3e0aacc68dd
getsentry/sentry | https://github.com/getsentry/sentry | ea5be2b67011c2b2053cde018f9338dc52ca53ab
git/git | https://github.com/git/git | fe8321ec057f9231c26c29b364721568e58040f7
github/android | https://github.com/github/android | a452de518751a9176f5643b1f4dbe9abb86520cd
github/linguist | https://github.com/github/linguist | 8cd9d744caa7bd3920c0cb8f9ca494ce7d8dc206
gradle/gradle | https://github.com/gradle/gradle | 77078ad580b546410d52e9df34f96d1d57dc51ff
gruntjs/grunt | https://github.com/gruntjs/grunt | 7db6cf77f63ad088c2016b45538a88415a867040
haml/haml | https://github.com/haml/haml | c32fa3c3356d3f4c1df73518910f46ea5f5d9fda
Homebrew/homebrew | https://github.com/Homebrew/homebrew | 5a9e19f9d5c70e904dae5bcc4efda71886e3b13d
iojs/io.js | https://github.com/iojs/io.js | 709b3b1e1c75afe6b5dd9d7859d0142dd4d20e5c
ipython/ipython | https://github.com/ipython/ipython | 4030de4e0eb2da391f240899acdf1a70e7dd58fe
Itseez/opencv | https://github.com/Itseez/opencv | 29e88e50ffaa8393eacd8343f09fbf2388535161
jadejs/jade | https://github.com/jadejs/jade | a1b046321416fc4ab297b43083ccda25ec8959e5
janl/mustache.js | https://github.com/janl/mustache.js | 17510f07d12ed3fb09866fec8226cf34cff90339
jashkenas/backbone | https://github.com/jashkenas/backbone | 27f7d41de1f64f6662a96f44531d7518953b1e07
jekyll/jekyll | https://github.com/jekyll/jekyll | 997c9044d5d3c1fcc9846339661b82c46366bc29
JetBrains/intellij-community | https://github.com/JetBrains/intellij-community | 24e4b6da70c2d24914bdae095818d85408f84082
jnicklas/capybara | https://github.com/jnicklas/capybara | edc285937672f16f04edb76674d71505dc5c5d41
JohnLangford/vowpal_wabbit | https://github.com/JohnLangford/vowpal_wabbit | c383410bb77b1d0390b7bf3d61b74691b423a779
joomla/joomla-cms | https://github.com/joomla/joomla-cms | 34315f9f0a248b524645aa3b468bc77ffc109f74
jquery/jquery | https://github.com/jquery/jquery | dfa92ccead70d7dd5735a36c6d0dd1af680271cd
jquery/jquery-ui | https://github.com/jquery/jquery-ui | 74f8a0ac952f6f45f773312292baef1c26d81300
jrburke/requirejs | https://github.com/jrburke/requirejs | 2516bc0a2995b4eef9902b7daa944873fa2d0d78
justinfrench/formtastic | https://github.com/justinfrench/formtastic | ebd9b6627e1ee867347094cb7488292ce69d01a6
kivy/kivy | https://github.com/kivy/kivy | 5bef72df85015f04b54eda43078fcbf699b57a2b
koush/ion | https://github.com/koush/ion | 7e7e68ef132bacc3c95e8c7893307a5e1ca07b0f
kriswallsmith/assetic | https://github.com/kriswallsmith/assetic | e911c437dbdf006a8f62c2f59b15b2d69a5e0aa1
Leaflet/Leaflet | https://github.com/Leaflet/Leaflet | 094e6c296973c5aab41a0d7cf8d770e4f39369ac
less/less.js | https://github.com/less/less.js | a84358d2956d3245f45083adc50069119de2e431
libgdx/libgdx | https://github.com/libgdx/libgdx | 7491e2b9a89db28e6e36fcf20c278b846ebd4984
mailpile/Mailpile | https://github.com/mailpile/Mailpile | a3f269db13a72a724bdd89465475b87eee44c964
mbostock/d3 | https://github.com/mbostock/d3 | 3e2bbb506b536fdf13bfdf6a106d1c16b4859666
meskyanichi/backup | https://github.com/meskyanichi/backup | e09c51247ee11119a62c51523fedc841892a8c39
meteor/meteor | https://github.com/meteor/meteor | c42170568af7ce798a4b12ffdc7712f3ebb5a59f
mitchellh/vagrant | https://github.com/mitchellh/vagrant | b5cb5f300b2baf3366f9132d3bb2a2fc690f3e2f
mitsuhiko/flask | https://github.com/mitsuhiko/flask | 9a2e6ead00f2e5a3a6fe5a3136951c7a038fe5ed
moment/moment | https://github.com/moment/moment | 2e2a5b35439665d4b0200143d808a7c26d6cd30f
mongoid/mongoid | https://github.com/mongoid/mongoid | 63ece9973709a837a1817824d202b367db3e3688
mozilla/pdf.js | https://github.com/mozilla/pdf.js | 54d6c2436c17b6d0efc6fb8e36f36358eba1a9e6
mrdoob/three.js | https://github.com/mrdoob/three.js | 2410ad1a8f5844df00191600eafda59def537830
nate-parrott/Flashlight | https://github.com/nate-parrott/Flashlight | c3a7c7278a1cccf8918e7543faffc68e863ff5ab
netty/netty | https://github.com/netty/netty | 5650db582607a8eb95022cd73cdc490cc94c0e1c
nicolasgramlich/AndEngine | https://github.com/nicolasgramlich/AndEngine | 720897f99d2c56ba357e8fe361454bd8d88c37ed
odoo/odoo | https://github.com/odoo/odoo | d61a248523f30526afa73767ac558c38c9dcf9fe
omab/django-social-auth | https://github.com/omab/django-social-auth | 699571a3b6d84aa2c25ffce59daa4c7f3559a0e4
openframeworks/openFrameworks | https://github.com/openframeworks/openFrameworks | 1241140f4d399f8e3f670691f4c274fdc814d8b6
paulasmuth/fnordmetric | https://github.com/paulasmuth/fnordmetric | 7f765dc6049bd773076324c2dda9df8e006dd969
phacility/phabricator | https://github.com/phacility/phabricator | 8065433ee8dcfd31ca544c52b3bcc620db9df13f
php/php-src | https://github.com/php/php-src | 5a4cb3edde32a6cc4bce6439abea21f3e6b4bbf6
plataformatec/devise | https://github.com/plataformatec/devise | 4656e96d9ebd3947ceee27e698aee76393dc578f
powerline/powerline | https://github.com/powerline/powerline | d7a93938887de4c135423bff5fcf3946099115e5
prawnpdf/prawn | https://github.com/prawnpdf/prawn | 2cdd2e7994c742c97f104e2927d2e2fd3dedc767
puphpet/puphpet | https://github.com/puphpet/puphpet | a4da7b71c5c80f8a1bfff6b29f8f6ac8f2b27233
puppetlabs/puppet | https://github.com/puppetlabs/puppet | bf06b6258b10c3669e32f670fcd4052ce02e1953
pydata/pandas | https://github.com/pydata/pandas | a85140102691ae675a942da6673edd5d95fa9b06
rails/rails | https://github.com/rails/rails | 8a0194f1514fc2374b18db909f78f733ba0857b9
ratchetphp/Ratchet | https://github.com/ratchetphp/Ratchet | bca7183c5a4bd895f8a59f09ade17069e58c5ec2
ReactiveX/RxJava | https://github.com/ReactiveX/RxJava | fd48d56266bf0664568226160516b182e046a62a
Respect/Validation | https://github.com/Respect/Validation | 5a067faec79d0cd74aa189fc535a644fa29e0c70
resque/resque | https://github.com/resque/resque | 2a03db682a41f47390412561ea8e7156a5d6a5fc
rg3/youtube-dl | https://github.com/rg3/youtube-dl | 85cd69adcb41454f30d4db85eeb4d5cc26b6bb5d
ruby/ruby | https://github.com/ruby/ruby | 0e3e0f824966c9c05870b2dbac88c0a8eef2b579
saltstack/salt | https://github.com/saltstack/salt | d07af09130e22933ba9e8de930d878f052761e90
sampsyo/beets | https://github.com/sampsyo/beets | 54cf6d4d443094fb044418a0d4481b787ab10222
sandstorm-io/capnproto | https://github.com/sandstorm-io/capnproto | a00ccd91b3746ef2ab51d40fe3265829949d1ace
sass/sass | https://github.com/sass/sass | ed6036d2bf3b0b5331aca27764fe3128709626ae
scikit-learn/scikit-learn | https://github.com/scikit-learn/scikit-learn | da0cb32270ce18963799906a8a0a75216749e21c
sebastianbergmann/phpunit | https://github.com/sebastianbergmann/phpunit | d278688cead456c68f86603be7d856e9f82c92a3
Seldaek/monolog | https://github.com/Seldaek/monolog | 334b8d8783a1262c3b8311d6599889d82e9cc58c
sferik/twitter | https://github.com/sferik/twitter | 844818cad07ce490ccb9d8542ebb6b4fc7a61cb4
SFTtech/openage | https://github.com/SFTtech/openage | 082e95a1f9cb6e5418ea32eef730333083b87eb2
Shopify/active_merchant | https://github.com/Shopify/active_merchant | 668432c33efc8c7828b356b837aa993888e6170f
silexphp/Silex | https://github.com/silexphp/Silex | 2065bd6dcae0f6d11dc6680c1219343493b76087
sparklemotion/nokogiri | https://github.com/sparklemotion/nokogiri | 7feb4c167a9ae1ba4e87923597ba7e7b309b1713
spotify/luigi | https://github.com/spotify/luigi | b35e8bc1a7f8bc28a1291c9162b90f5628813175
spring-projects/spring-framework | https://github.com/spring-projects/spring-framework | 6ff8cd8a9ff571cfef82d472b3835853be3afd6d
sstephenson/sprockets | https://github.com/sstephenson/sprockets | e25e0f5f993cbdff685a33540bbee927a4567177
strongloop/express | https://github.com/strongloop/express | 09f8d824ab735e77ba6c4d5058ddb89f9f3a43ba
substack/node-browserify | https://github.com/substack/node-browserify | cfd3af23f6383bb5899dbb5e39beb7834b042d85
thinkaurelius/titan | https://github.com/thinkaurelius/titan | ee226e52415b8bf43b700afac75fa5b9767993a5
ThinkUpLLC/ThinkUp | https://github.com/ThinkUpLLC/ThinkUp | ac41d11625d9a2421f4edad397a21300f82d2836
thoughtbot/factory_girl | https://github.com/thoughtbot/factory_girl | 89dd55aaf5a278e5ba7d1797a65f33e665bc3f41
thoughtbot/paperclip | https://github.com/thoughtbot/paperclip | acbb03f76da032d9d5eca0adcc32c8bee9f5ab60
thumbor/thumbor | https://github.com/thumbor/thumbor | bf92bb033507cb1df7facb8a651fcf6ada22e942
TryGhost/Ghost | https://github.com/TryGhost/Ghost | b43ab65d8a79de454ddab96bd7762e8689b749c5
v8/v8 | https://github.com/v8/v8 | c6930923833ab49dba47f44ef3fc8a54501f3a9b
webscalesql/webscalesql-5.6 | https://github.com/webscalesql/webscalesql-5.6 | d9490a6c4cf5ac130b9349c5486a6a31b1518baa
WordPress/WordPress | https://github.com/WordPress/WordPress | 664f73e49084c40d32c7dd3a790f6b3016fcb2bf
wp-cli/wp-cli | https://github.com/wp-cli/wp-cli | 4e9e528095032307e71c1af3e0c2648ea085463f
xetorthio/jedis | https://github.com/xetorthio/jedis | b7120ee559ccd225f7392cbe44fc55835a656710
yiisoft/yii2 | https://github.com/yiisoft/yii2 | 9ed7eaa998fbc7daac79c4b1a411250077598c86



## Folders
*	**scripts**: script files and program used to extract and compute the authorship data. 
*	**authorshipAnalyzer**: Java project with the source code of the program used to compute file authorship. 
*	**data**: data used in this study.
* **data/linux**: Linux kernel authorship data.
* **data/bugs**: data from bugzilla and authorship data about the files changed to fix the bugs
* **data/extended_dataset**: authorship data of the other 118 repositories.

## Execution Environment 
The scripts were developed using Shell and AWK. So, the execution environment must support those script languages.  Additionally, the ruby interpreter is required to use the Linguist library to automatically discard files like documentation and third-party libraries. See the specific Linguist requirements in [linguist page](https://github.com/github/linguist).
