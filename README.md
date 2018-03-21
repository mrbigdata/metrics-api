# metrics-api
generic setup for consuming data, transforming data, and serving metrics based on underlying event data

Local env setup:
---------------
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
brew install gradle
brew install git

Running docker:
--------------
docker-compose -f docker/docker-compose.yml up

Stopping docker:
---------------
docker-compose -f docker/docker-compose.yml down

Start service locally
--------------------
set -a;. .env gradle bootRun

Usage example 
---------------
curl 'http://localhost:8080/metrics/metric1'
