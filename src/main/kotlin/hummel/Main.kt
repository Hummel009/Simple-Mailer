package hummel

import java.io.File
import java.util.*
import javax.mail.Message
import javax.mail.Session
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

fun main(args: Array<String>) {
	val login = args[0] //trorereborsky@mail.ru
	val password = args[1] //cXWHUdYwpJQ0FVknFamc
	val properties = Properties()
	properties["mail.smtp.host"] = "smtp.mail.ru"
	properties["mail.smtp.port"] = "465"
	properties["mail.smtp.auth"] = "true"
	properties["mail.smtp.starttls.enable"] = "true"
	properties["mail.smtps.ssl.checkserveridentity"] = true
	properties["mail.smtps.ssl.trust"] = "*"
	properties["mail.smtp.ssl.enable"] = "true"

	val session = Session.getDefaultInstance(properties)
	val message = MimeMessage(session)

	message.setFrom(InternetAddress(login))
	val file = File("recipients.txt")
	val emails = mutableListOf<String>()
	file.forEachLine { line -> emails.add(line.trim()) }
	emails.forEach { message.addRecipient(Message.RecipientType.TO, InternetAddress(it)) }

	val subject = File("subject.txt").readText()
	message.subject = subject
	val msg = File("message.txt").readText()
	message.setText(msg)

	val transport = session.getTransport("smtp")
	transport.connect("smtp.mail.ru", login, password)
	transport.sendMessage(message, message.allRecipients)
	transport.close()
}