# DGIWG Core

Provides common assertions and utilities for test suites based on [DGIWG application 
profiles](https://www.dgiwg.org/dgiwg/htm/documents/standards_implementation_profiles.htm).

Forked from [Official Opengeospatial GitHub repository](https://github.com/opengeospatial/ets-dgiwg-core). 

Since this library isn't available in the official Maven repository (as for 20201128), we'll build and install it into local Maven repository before other ETS libs.

## Additions 
To ensure proper build with TEAMEngine 5.4 and verisonning aligment with other DGIWG application profile based ETS, we modified the following in `pom.xml`: 
### Setup version to 0.4 to match child ETS requirements 
```
<artifactId>ets-dgiwg-core</artifactId>
<version>0.4</version>
```
### Correct TEAMEngine SPI versionning 
The 5.0 TEAMEngine version isn't available anymore in official Maven repositories.
We need to swithch to a working one.
```
<artifactId>ets-dgiwg-core</artifactId>
<version>5.4</version>
```
