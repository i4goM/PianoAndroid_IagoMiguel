package com.example.piano_iagomartin_miguelcervera

import android.media.AudioAttributes
import android.media.SoundPool
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val soundPool: SoundPool

    init {
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(10)
            .setAudioAttributes(audioAttributes)
            .build()
    }

    var C2 = 0
    var Db2 = 0
    var D2 = 0
    var Eb2 = 0
    var E2 = 0
    var F2 = 0
    var Gb2 = 0
    var G2 = 0
    var Ab2 = 0
    var A2 = 0
    var Bb2 = 0
    var B2 = 0
    var C3 = 0
    var Db3 = 0
    var D3 = 0
    var Eb3 = 0
    var E3 = 0
    var F3 = 0
    var Gb3 = 0
    var G3 = 0
    var Ab3 = 0
    var A3 = 0
    var Bb3 = 0
    var B3 = 0
    var C4 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        C2 = soundPool.load(this, R.raw.C2, 1)
        Db2 = soundPool.load(this, R.raw.Db2, 1)
        D2 = soundPool.load(this, R.raw.D2, 1)
        Eb2 = soundPool.load(this, R.raw.Eb2, 1)
        E2 = soundPool.load(this, R.raw.E2, 1)
        F2 = soundPool.load(this, R.raw.F2, 1)
        Gb2 = soundPool.load(this, R.raw.Gb2, 1)
        G2 = soundPool.load(this, R.raw.G2, 1)
        Ab2 = soundPool.load(this, R.raw.Ab2, 1)
        A2 = soundPool.load(this, R.raw.A2, 1)
        Bb2 = soundPool.load(this, R.raw.Bb2, 1)
        B2 = soundPool.load(this, R.raw.B2, 1)
        C3 = soundPool.load(this, R.raw.C3, 1)
        Db3 = soundPool.load(this, R.raw.Db3, 1)
        D3 = soundPool.load(this, R.raw.D3, 1)
        Eb3 = soundPool.load(this, R.raw.Eb3, 1)
        E3 = soundPool.load(this, R.raw.E3, 1)
        F3 = soundPool.load(this, R.raw.F3, 1)
        Gb3 = soundPool.load(this, R.raw.Gb3, 1)
        G3 = soundPool.load(this, R.raw.G3, 1)
        Ab3 = soundPool.load(this, R.raw.Ab3, 1)
        A3 = soundPool.load(this, R.raw.A3, 1)
        Bb3 = soundPool.load(this, R.raw.Bb3, 1)
        B3 = soundPool.load(this, R.raw.B3, 1)
        C4 = soundPool.load(this, R.raw.C4, 1)

        val btnC2 = findViewById<ImageButton>(R.id.c2);
        val btnDb2 = findViewById<ImageButton>(R.id.db2);
        val btnD2 = findViewById<ImageButton>(R.id.d2);
        val btnEb2 = findViewById<ImageButton>(R.id.eb2);
        val btnE2 = findViewById<ImageButton>(R.id.e2);
        val btnF2 = findViewById<ImageButton>(R.id.f2);
        val btnGb2 = findViewById<ImageButton>(R.id.gb2);
        val btnG2 = findViewById<ImageButton>(R.id.g2);
        val btnAb2 = findViewById<ImageButton>(R.id.ab2);
        val btnA2 = findViewById<ImageButton>(R.id.a2);
        val btnBb2 = findViewById<ImageButton>(R.id.b2);
        val btnB2 = findViewById<ImageButton>(R.id.b2);
        val btnC3 = findViewById<ImageButton>(R.id.c3);
        val btnDb3 = findViewById<ImageButton>(R.id.db3);
        val btnD3 = findViewById<ImageButton>(R.id.d3);
        val btnEb3 = findViewById<ImageButton>(R.id.eb3);
        val btnE3 = findViewById<ImageButton>(R.id.e3);
        val btnF3 = findViewById<ImageButton>(R.id.f3);
        val btnGb3 = findViewById<ImageButton>(R.id.gb3);
        val btnG3 = findViewById<ImageButton>(R.id.g3);
        val btnAb3 = findViewById<ImageButton>(R.id.ab3);
        val btnA3 = findViewById<ImageButton>(R.id.a3);
        val btnBb3 = findViewById<ImageButton>(R.id.bb3);
        val btnB3 = findViewById<ImageButton>(R.id.b3);
        val btnC4 = findViewById<ImageButton>(R.id.c4);

        setKey(btnC2, C2)
        setKey(btnDb2, Db2)
        setKey(btnD2, D2)
        setKey(btnEb2, Eb2)
        setKey(btnE2, E2)
        setKey(btnF2, F2)
        setKey(btnGb2, Gb2)
        setKey(btnG2, G2)
        setKey(btnAb2, Ab2)
        setKey(btnA2, A2)
        setKey(btnBb2, Bb2)
        setKey(btnB2, B2)
        setKey(btnC3, C3)
        setKey(btnDb3, Db3)
        setKey(btnD3, D3)
        setKey(btnEb3, Eb3)
        setKey(btnE3, E3)
        setKey(btnF3, F3)
        setKey(btnGb3, Gb3)
        setKey(btnG3, G3)
        setKey(btnAb3, Ab3)
        setKey(btnA3, A3)
        setKey(btnBb3, Bb3)
        setKey(btnB3, B3)
        setKey(btnC4, C4)


    }
    private fun setKey(button: ImageButton, sound: Int) {

        button.setOnTouchListener { v, event ->

            when (event.action) {

                MotionEvent.ACTION_DOWN -> {

                    button.isPressed = true

                    soundPool.play(
                        sound,
                        1f,
                        1f,
                        1,
                        0,
                        1f
                    )

                    v.performClick()
                    true
                }

                MotionEvent.ACTION_UP,
                MotionEvent.ACTION_CANCEL -> {

                    button.isPressed = false
                    true
                }

                else -> false
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        soundPool.release()
    }
}