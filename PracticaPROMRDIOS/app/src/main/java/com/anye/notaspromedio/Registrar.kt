package com.anye.notaspromedio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Registrar : AppCompatActivity() {
    var documentos: EditText? = null
    var nombre: EditText? = null
    var edad: EditText? = null
    var telefono: EditText? = null
    var direccion: EditText? = null

    var materia1: EditText? =null
    var materia2: EditText? =null
    var materia3: EditText? =null
    var materia4: EditText? =null
    var materia5: EditText? =null

    var nota1: EditText? =null
    var nota2: EditText? =null
    var nota3: EditText? =null
    var nota4: EditText? =null
    var nota5: EditText? =null

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
         var alumnoss:Alumno= Alumno()
         var materias:Materias= Materias()

         documentos =findViewById(R.id.documento)
         nombre = findViewById(R.id.nombre)
         edad=findViewById(R.id.edad)
         telefono = findViewById(R.id.telefono2)
         direccion = findViewById(R.id.direccion)

         alumnoss.documento= documentos.toString()
         alumnoss.nombre= nombre.toString()
         alumnoss.edad=edad.toString().toInt()
         alumnoss.telefono= telefono.toString().toInt()
         alumnoss.dirección= direccion.toString()


         materia1= findViewById(R.id.materia1)
         materia2= findViewById(R.id.materia2)
         materia3= findViewById(R.id.materia3)
         materia4= findViewById(R.id.materia4)
         materia5= findViewById(R.id.materia5)

         nota1= findViewById(R.id.nota1)
         nota2= findViewById(R.id.nota2)
         nota3= findViewById(R.id.nota3)
         nota4= findViewById(R.id.nota4)
         nota5= findViewById(R.id.nota5)

         materias.materia1=materia1.toString()
         materias.materia2=materia2.toString()
         materias.materia3= materia3.toString()
         materias.materia4= materia4.toString()
         materias.materia5= materia5.toString()

         materias.nota1=nota1.toString().toDouble()
         materias.nota2=nota2.toString().toDouble()
         materias.nota3=nota3.toString().toDouble()
         materias.nota4=nota4.toString().toDouble()
         materias.nota5=nota5.toString().toDouble()

        var btnregistrar: Button = findViewById(R.id.registrar)
        btnregistrar.setOnClickListener { onClick(1) }

        var btnregistro: Button = findViewById(R.id.registrar)
        btnregistro.setOnClickListener { onClick(2) }
    }



    private  fun onClick(funcionbutton: Int) {
        var notas1: Double = nota1?.text.toString().toDouble()
        var notas2: Double = nota2?.text.toString().toDouble()
        var notas3: Double = nota3?.text.toString().toDouble()
        var notas4: Double = nota4?.text.toString().toDouble()
        var notas5: Double = nota5?.text.toString().toDouble()

        var sumanotas = notas1+notas2+notas3+notas4+notas5
        var promedio = sumanotas/5

        var respuesta= ""
        var  resrecupera= ""
        if(promedio >3.5){
            respuesta ="Has ganado la materia "
        }
        else{
            respuesta ="Has perdido la materia"
        }
        if (promedio == 2.5){
            resrecupera ="Has perdido la materia, pero puedes recuperar "
        }
        else{
            resrecupera="Has perdido la materia sin derecho a recuperar"
        }
        when(funcionbutton){

        }


    }

}