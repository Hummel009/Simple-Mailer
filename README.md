[![Code Smells][code_smells_badge]][code_smells_link]
[![Maintainability Rating][maintainability_rating_badge]][maintainability_rating_link]
[![Security Rating][security_rating_badge]][security_rating_link]
[![Bugs][bugs_badge]][bugs_link]
[![Vulnerabilities][vulnerabilities_badge]][vulnerabilities_link]
[![Duplicated Lines (%)][duplicated_lines_density_badge]][duplicated_lines_density_link]
[![Reliability Rating][reliability_rating_badge]][reliability_rating_link]
[![Quality Gate Status][quality_gate_status_badge]][quality_gate_status_link]
[![Technical Debt][technical_debt_badge]][technical_debt_link]
[![Lines of Code][lines_of_code_badge]][lines_of_code_link]

Программа для чтения адресов и сообщений из текстовых файлов и рассылки этих сообщений по адресам. Была разработана для
афёры на лабораторной работе, когда PHP отказывался слать письмо. Вместо этого исполнялся вызов к jar-файлу с
аргументами.

## Использование

* Взять файл с расширением .jar;
* Положить в папке рядом с ним файл `recipients.txt` (на каждой строке одна почта);
* Положить в папке рядом с ним файл `subject.txt` (строка с заголовком);
* Положить в папке рядом с ним файл `message.txt` (строка с текстом);
* Зарегистрироваться на @mail.ru, загуглить `mail.ru smtp` и получить токен по инструкции.
* Открыть консоль Windows в папке с вышеупомянутым файлом с расширением .jar и выполнить
  команду `java -jar JarFileName.jar your@mail.com yourMailToken`. Эту же команду можно вызвать из кода PHP.

<!----------------------------------------------------------------------------->

[code_smells_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=code_smells

[code_smells_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[maintainability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=sqale_rating

[maintainability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[security_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=security_rating

[security_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[bugs_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=bugs

[bugs_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[vulnerabilities_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=vulnerabilities

[vulnerabilities_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[duplicated_lines_density_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=duplicated_lines_density

[duplicated_lines_density_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[reliability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=reliability_rating

[reliability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[quality_gate_status_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=alert_status

[quality_gate_status_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[technical_debt_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=sqale_index

[technical_debt_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer

[lines_of_code_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Simple-Mailer&metric=ncloc

[lines_of_code_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Simple-Mailer
