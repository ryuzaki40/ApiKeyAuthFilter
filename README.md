# 🔐 ApiKeyAuthFilter

A lightweight, plug-and-play Spring Boot filter that enables API key-based authentication for your REST APIs. This module secures your endpoints by requiring a predefined API key in the request headers.

## 🚀 Features

- Stateless API key-based authentication
- Simple configuration via `application.properties`
- Global filter for all incoming requests
- Easy integration with existing Spring Boot applications

## 📦 Tech Stack

- Java 17+
- Spring Boot 3.5.0
- Maven

## 🛡️ How It Works

The filter intercepts all HTTP requests and checks for a custom header (`X-API-KEY`). If the key is valid, the request proceeds. Otherwise, it is rejected with a `401 Unauthorized` response.

## ⚙️ Configuration

Add your API key in the `application.properties`:

```properties
api.key=super-secret-key
