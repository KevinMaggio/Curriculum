package com.example.curriculumkevinmaggio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.curriculumkevinmaggio.databinding.ActivityMainBinding
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btExperienciaAlkemy.setOnClickListener {
            startActivity(Intent(this,ExperienciaAlkemy::class.java))
        }
        binding.btExperienciaCencosud.setOnClickListener {
            startActivity(Intent(this,ExperienciaCencosud::class.java))
        }
        binding.btExperienciaReparacion.setOnClickListener {
            startActivity(Intent(this,ExperienciaReparacion::class.java))
        }
        binding.btQuienSoy.setOnClickListener {
            startActivity(Intent(this,QuienSoy::class.java))
        }
        binding.btSolicitarEntrevista.setOnClickListener {
            enviarMail()
        }

        binding.ibFacebook.setOnClickListener {
            showDialog(
                "facebook",
                "https://www.facebook.com/kevin.maggio.90",
                "Las redes solciales nos mantienen cerca y distantes de las personas mas queridas"
            )
        }

        binding.ibGit.setOnClickListener {
            showDialog(
                "git",
                "https://github.com/KevinMaggio",
                "El rincon mas importante de todo programador es su Repositorio"
            )
        }

        binding.ibGmail.setOnClickListener {
            showDialog(
                "gmail",
                "KevinMaggio57@Gmail.com",
                "Las noticias mas importantes llegan de forma rapida y segura"
            )
        }
        binding.ibLinkedin.setOnClickListener {
            showDialog(
                "linkedin",
                "https://www.linkedin.com/in/kevin-maggio57",
                "Un buen perfil profesional es la base de toda carrera"
            )
        }
        binding.ibLibrerias.setOnClickListener {
            startActivity(Intent(this,Librerias::class.java))
        }
    }

    private fun showDialog(style: String, title: String, message: String?) {
        lateinit var dialog: AlertDialog
        when (style) {
            "facebook" -> dialog =
                AlertDialog.Builder(this, R.style.MyDialogThemeFaceBook).setMessage(message)
                    .setTitle(title)
                    .setPositiveButton(
                        "Abrir"
                    ) { _, _ ->
                        val uri=Uri.parse("https://www.facebook.com/kevin.maggio.90")
                        startActivity(Intent(Intent.ACTION_VIEW, uri))
                    }
                    .setNeutralButton(
                        "Close"
                    ) { _, _ -> }
                    .create()
            "gmail" -> dialog =
                AlertDialog.Builder(this, R.style.MyDialogThemeGmail).setMessage(message)
                    .setTitle(title)
                    .setPositiveButton(
                        "Abrir"
                    ) { _, _ ->
                        val uri=Uri.parse("https://outlook.com")
                        startActivity(Intent(Intent.ACTION_VIEW, uri))  }
                    .setNeutralButton(
                        "Close"
                    ) { _, _ -> }
                    .create()
            "git" -> dialog =
                AlertDialog.Builder(this, R.style.MyDialogThemeGit).setMessage(message)
                    .setTitle(title)
                    .setPositiveButton(
                        "Abrir"
                    ) { _, _ ->
                        val uri=Uri.parse("https://github.com/KevinMaggio")
                        startActivity(Intent(Intent.ACTION_VIEW, uri))   }
                    .setNeutralButton(
                        "Close"
                    ) { _, _ -> }
                    .create()
            "linkedin" -> dialog =
                AlertDialog.Builder(this, R.style.MyDialogThemeLinkedIn).setMessage(message)
                    .setTitle(title)
                    .setPositiveButton(
                        "Abrir"
                    ) { _, _ ->
                        val uri=Uri.parse("https://www.linkedin.com/in/kevin-maggio57")
                        startActivity(Intent(Intent.ACTION_VIEW, uri))  }
                    .setNeutralButton(
                        "Close"
                    ) { _, _ -> }
                    .create()

        }
        dialog.show()
    }
    @SuppressLint("IntentReset")
    fun enviarMail() {
        val emailIntent = Intent(Intent.ACTION_SEND)
        emailIntent.data = Uri.parse("mailto:")
        emailIntent.type = "text/plain"
        emailIntent.putExtra(Intent.EXTRA_EMAIL,"kevinmaggio58@gmail.com")
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Entrevista")
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Kevin Maggio Queremos conocerlo")

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email..."))
            finish()
        } catch (ex:android.content.ActivityNotFoundException ) {
            Toast.makeText(
                this,
                "No tienes clientes de email instalados.", Toast.LENGTH_SHORT
            ).show()
        }
    }
}