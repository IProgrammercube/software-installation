def call(String filePath) {
    def map = [:]

    readFile(filePath).split("\n").each { line ->
        line = line.trim()

        if (line && !line.startsWith("#")) {
            def (key, value) = line.split("=", 2)
            map[key.trim()] = value.trim()
        }
    }
    return map
}

