# Cron Expression Parser

## Description

This project is a Java-based parser for cron expressions. The parser supports the standard cron format: minute, hour, day of month, month, and day of week.

### Assumptions

- Cron format will always be minute, hour, day of month, month, and day of week
- Minutes will be between 0-59
- Hours will be between 0-23
- Day of month will be between 1-31
- Month will be between 1-12
- Day of week will be between 1-7 (7=Sunday)

### Wild Characters

| Character | Meaning            |
|-----------|---------------------|
| *         | any value           |
| ,         | value list separator|
| -         | range of values     |
| /         | step values         |

## Enhancements

- Using Regex to validate the cron expression
- Valid date in a month
- Thorough all the parsers

## Dependencies

- Java 8
- Maven

## Usage

Run the following commands:

```sh
mvn clean package
java -jar ./target/cron-1.0-SNAPSHOT.jar "*/15 0 1,15 * 1-5 /usr/bin/find"# Cron-Parser
