if ((ls | ? {$_.Name -eq "bin" }).Count -eq 0) {
    mkdir bin
}

javac App.java -d bin
ls | ? {$_.Name.EndsWith(".fxml") } | % { cp $_ bin}

clear
javac App.java -d bin
cd bin
java App
cd ..
