[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=code_smells)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=security_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=bugs)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=vulnerabilities)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=duplicated_lines_density)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=reliability_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=alert_status)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=sqale_index)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=ncloc)](https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer)

Программа для чтения адресов и сообщений из текстовых файлов и рассылки этих сообщений по адресам. Была разработана для
афёры на лабораторной работе, когда PHP отказывался слать письмо.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA.

| Технология                             | Версия |
|----------------------------------------|--------|
| Система автоматической сборки Gradle   | 8.5    |
| Java, используемая для запуска Gradle  | 8+     |
| Java, используемая для сборки проекта  | 8+     |
| Java, используемая для запуска проекта | 8+     |
| Kotlin                                 | 1.9.22 |

## Установка

Установка моих проектов Gradle и основы работы с ними примерно одинаковы, так что
смотрите [общую инструкцию](https://github.com/Hummel009/The-Rings-of-Power#readme).

## Использование

* Скомпилировать приложение в файл с расширением .jar;
* Положить в папке рядом с ним файл `recipients.txt` (на каждой строке одна почта);
* Положить в папке рядом с ним файл `subject.txt` (строка с заголовком);
* Положить в папке рядом с ним файл `message.txt` (строка с текстом);
* Зарегистрироваться на @mail.ru, загуглить `mail.ru smtp` и получить токен по инструкции.
* Открыть консоль Windows в папке с вышеупомянутым файлом с расширением .jar и выполнить
  команду `java -jar JarFileName.jar your@mail.com yourMailToken`.
