# Basic Apache Kafka Project

This repository contains a basic Apache Kafka project that demonstrates key Kafka concepts such as Producers, Consumers, and Listeners.

## Table of Contents

1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Getting Started](#getting-started)
4. [Usage](#usage)



## Introduction

Apache Kafka is a distributed streaming platform that allows you to build real-time data pipelines and streaming applications. This project serves as a simple introduction to Kafka's core components:

- **Producer:** Producers are responsible for publishing messages to Kafka topics. In this project, you'll find examples of how to create Kafka producers to send messages.

- **Consumer:** Consumers read messages from Kafka topics. We provide examples of Kafka consumers to process messages.

- **Listeners:** Listeners are components that respond to events in Kafka topics. In this project, we demonstrate how to set up event listeners to react to incoming messages.


## Prerequisites

Before you begin, ensure you have the following prerequisites:

- **Docker Desktop:** You need Docker Desktop installed on your machine to run Kafka in a container. You can download and install Docker Desktop from [here](https://www.docker.com/products/docker-desktop).
- **Postman:** You need Postman installed on your machine to interact with the Kafka API. You can download and install Postman from [here](https://www.postman.com/downloads/).


## Getting Started

To get started with this Kafka project, follow these steps:

1. Clone this repository to your local machine.
2. If you do not have any kafka broker in your local machine, install Docker Desktop and execute "docker-compose up" command in project directory.
3. Run application using "KafkaApplication.java" file.

## Usage

1. Execute "docker ps" command to see broker's container ID.
2. Execute "docker exec -it <kafka_conatiner_id> sh"
3. Go to "/bin" directory
4. Execute "kafka-console-consumer.sh --topic emailTopic --from-beginning --bootstrap-server localhost:9092" now you are listening "emailTopic"
5. Adjust Postman URL as "http://localhost:8080/api/v1/messages/send" - POST
6. Send request as below JSON format
   ```json  
    {
    "message": "Hellow World!"
    }
   ```
7. Observe "Hello World!" message from terminal.


