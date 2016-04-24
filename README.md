# neo4j-geo-datamodel-builder

This is an experimental attempt to create a generic interface/boilerplate model builder for adding/modeling geo data (specilly GPS Cordinates) for property graph database neo4j.  

I wrote this module for one of my personal project to encode GPS data to a property graph database but this repo will be developed as generic as possible while will be focusing specifically on GPS data and their relations to objects.

Original idea was to write this module with **golang** but unfotunatly **neo4j-spatial** doesn't have official **golang** language support yet. So for the time being this will be writting in java and in future this will be either re-writting in **golang** or will take a **"polyglot aproach"**.

This uses **neo4j-spatial**(an awesome plugging with many capabilities ) for geo data processing and we will also provide simple and intutive wrapper for ease of use and to get started quickly.

### Prerequisities
You will need to have neo4j server installed on your computer.

## Authors
* **Harsha Jayaweera** - [[Linkedin]](https://lk.linkedin.com/in/harshajayaweera)