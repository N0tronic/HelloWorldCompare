package main

import (
	"fmt"
	"log"
	"net/http"
)

func main() {
	handleRequests()
}

func hello(w http.ResponseWriter, r *http.Request) {
	w.WriteHeader(200)
	_, _ = fmt.Fprintf(w, "Hello World!")
}

func handleRequests() {
	http.HandleFunc("/", hello)
	log.Fatal(http.ListenAndServe(":8080", nil))
}
