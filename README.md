# Obradu i Distribuciju Wikimedia Streamova uz pomoc Kafke

## Opis

Ova Spring Boot aplikacija demonstrira prikupljanje promena sa Wikimedia streamova i njihovu distribuciju Kafku.
## Tri modula
- `producer`, koji prikuplja stream podatke;
- `consumer`, koji konzumira poruke iz Kafka topica;
- `kafka-demo`, koji služi kao primer za slanje i prijem jednostavnih i JSON poruka.

## Funkcionalnosti

- **Prikupljanje Wikimedia promena u realnom vremenu** i njihovo slanje na Kafka topic `wikimedia-stream`.
- **Slanje tekstualnih i JSON poruka** na Kafka topic `jovana`.
- **Konzumiranje poruka** sa oba topica i logovanje primljenih poruka.

## Tehnologije

- **Spring Boot** za kreiranje i konfiguraciju aplikacije.
- **Apache Kafka** za asinhronu obradu i distribuciju poruka.
- **WebClient** za povezivanje sa Wikimedia stream API-jem.

## Kako Koristiti

### Slanje Poruka

Za slanje poruka na Kafka topic `jovana`:

- **POST** `/api/v1/messages` za slanje jednostavnih tekstualnih poruka.
- **POST** `/api/v1/messages/json` za slanje poruka u JSON formatu (npr. objekat `Student`).

### Prikupljanje i Distribucija Wikimedia Promena

Za pokretanje prikupljanja Wikimedia promena i njihovo slanje na topic `wikimedia-stream`:

- **GET** `/api/v1/wikimedia` pokreće proces prikupljanja i slanja stream podataka.

