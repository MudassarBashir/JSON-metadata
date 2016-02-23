/**
 * Created by Mudassar Bashir on 2/23/2016.
 * A groovy script which goes through each file in the current directory and produces metadata about each file.
 */

def targetDirectory = "."
def dir = new File(targetDirectory)
def listOfFiles = dir.listFiles()

//listOfFiles.each { println it.name }

def builder = new groovy.json.JsonBuilder()
builder (
        listOfFiles.collect {
                        [
                                filename: it.name,
                                event: "NYE2016"
                        ]
                }
        )

println builder.toPrettyString()
