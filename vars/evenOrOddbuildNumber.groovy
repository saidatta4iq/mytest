// vars/evenOrOddbuildNumber.groovy
def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
        println("even build")
  } else {
        println("odd build")
  }
}
