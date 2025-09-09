# Mule 4 CPU Core Calculation Project

This MuleSoft project provides an HTTP endpoint (`/cores`) that returns the number of available CPU cores on the server by calling a custom Java static method.  
This is particularly useful for tuning parallel processing in integration solutions.

---

## Features

- **REST endpoint:** Easy HTTP GET to `/cores` to retrieve the current server's CPU core count.
- **No scripting required:** Uses Java for accurate detection, compatible across platforms.
- **Extensible design:** Ready to add to larger Mule flows for dynamic concurrency control.

