#!/bin/bash
set -e
declare -A PROJECTS=(
  [SingletonPatternExample]=SingletonTest
  [FactoryMethodPatternExample]=FactoryMethodTest
  [BuilderPatternExample]=BuilderTest
  [AdapterPatternExample]=AdapterTest
  [DecoratorPatternExample]=DecoratorTest
  [ProxyPatternExample]=ProxyTest
  [ObserverPatternExample]=ObserverTest
  [StrategyPatternExample]=StrategyTest
  [CommandPatternExample]=CommandTest
)
for proj in "${!PROJECTS[@]}"; do
  echo "===== $proj ====="
  javac -d "Week1/$proj/out" "Week1/$proj"/src/*.java
  java -cp "Week1/$proj/out" "${PROJECTS[$proj]}"
  echo
done
