package com.hyun.android.animationsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var duration = 1000L
    var dp = 0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dp = resources.displayMetrics.density

        scaleAni()
        alphaAni()
        transXAni()
        transYAni()
        rotationAni()
        alphaScaleAni()
        transXAplhaScaleAni()
        rotationScaleAni()
    }

    private fun scaleAni() {
        btn_scaleX.setOnClickListener {
            btn_scaleX.animate().scaleX(0.5f).setDuration(duration).withEndAction {
                btn_scaleX.scaleX = 1f
            }.start()
        }
        btn_scaleY.setOnClickListener {
            btn_scaleY.animate().scaleY(0.5f).setDuration(duration).withEndAction {
                btn_scaleY.scaleY = 1f
            }.start()
        }
        btn_scaleXY.setOnClickListener {
            btn_scaleXY.animate().scaleX(0.5f).scaleY(0.5f).setDuration(duration).withEndAction {
                btn_scaleXY.scaleX = 1f
                btn_scaleXY.scaleY = 1f
            }.start()
        }
        btn_scaleX_.setOnClickListener {
            btn_scaleX_.animate().scaleX(1f).setDuration(duration).withEndAction {
                btn_scaleX_.scaleX = 0.5f
            }.start()
        }
        btn_scaleY_.setOnClickListener {
            btn_scaleY_.animate().scaleY(1f).setDuration(duration).withEndAction {
                btn_scaleY_.scaleY = 0.5f
            }.start()

        }
        btn_scaleXY_.setOnClickListener {
            btn_scaleXY_.animate().scaleX(1f).scaleY(1f).setDuration(duration).withEndAction {
                btn_scaleXY_.scaleX = 0.5f
                btn_scaleXY_.scaleY = 0.5f
            }.start()

        }
    }

    private fun alphaAni() {
        btn_alpha_on.setOnClickListener {
            btn_alpha_on.animate().alpha(1f).setDuration(duration).withEndAction {
                btn_alpha_on.alpha = 0.1f
            }.start()
        }
        btn_alpha_off.setOnClickListener {
            btn_alpha_off.animate().alpha(0f).setDuration(duration).withEndAction {
                btn_alpha_off.alpha = 1f
            }.start()
        }
    }

    private fun transXAni() {
        btn_transX_left.setOnClickListener {
            btn_transX_left.animate().translationX(-400f * dp).setDuration(duration).withEndAction {
                btn_transX_left.translationX = 0f
            }.start()
        }
        btn_transX_right.setOnClickListener {
            btn_transX_right.animate().translationX(400f * dp).setDuration(duration).withEndAction {
                btn_transX_right.translationX = 0f
            }.start()

        }
    }

    private fun transYAni() {
        btn_transY_down.setOnClickListener {
            btn_transY_down.animate().translationY(500f * dp).setDuration(duration).withEndAction {
                btn_transY_down.translationY = 0f
            }.start()
        }
        btn_transY_up.setOnClickListener {
            btn_transY_up.animate().translationY(-500f * dp).setDuration(duration).withEndAction {
                btn_transY_up.translationY = 0f
            }.start()

        }
    }

    private fun rotationAni() {
        btn_rotationX.setOnClickListener {
            btn_rotationX.animate().rotationX(360f).setDuration(duration).withEndAction {
                btn_rotationX.rotationX = 0f
            }.start()
        }
        btn_rotationY.setOnClickListener {
            btn_rotationY.animate().rotationY(360f).setDuration(duration).withEndAction {
                btn_rotationY.rotationY = 0f
            }.start()

        }
        btn_rotation.setOnClickListener {
            btn_rotation.animate().rotationX(360f).rotationY(360f).setDuration(duration).withEndAction {
                btn_rotation.rotationX = 0f
                btn_rotation.rotationY = 0f

            }.start()


        }
    }


    private fun alphaScaleAni() {
        btn_alpha_complex_on.setOnClickListener {
            btn_alpha_complex_on.animate().alpha(1f).scaleX(1f).scaleY(1f).setDuration(duration).withEndAction {
                btn_alpha_complex_on.alpha = 0.1f
                btn_alpha_complex_on.scaleX = 0.5f
                btn_alpha_complex_on.scaleY = 0.5f
            }.start()
        }
        btn_alpha_complex_off.setOnClickListener {
            btn_alpha_complex_off.animate().alpha(0f).scaleX(0.5f).scaleY(0.5f).setDuration(duration).withEndAction {
                btn_alpha_complex_off.alpha = 1f
                btn_alpha_complex_off.scaleX = 1f
                btn_alpha_complex_off.scaleY = 1f
            }.start()
        }
    }


    private fun transXAplhaScaleAni() {
        btn_transX_complex_left.setOnClickListener {
            btn_transX_complex_left.animate().translationX(-400f * dp).alpha(0.1f).scaleX(0.5f).scaleY(0.5f).setDuration(duration).withEndAction {
                btn_transX_complex_left.translationX = 0f
                btn_transX_complex_left.alpha = 1f
                btn_transX_complex_left.scaleX = 1f
                btn_transX_complex_left.scaleY = 1f
            }.start()
        }
        btn_transX_complex_right.setOnClickListener {
            btn_transX_complex_right.animate().translationX(400f * dp).alpha(1f).scaleX(1f).scaleY(1f).setDuration(duration).withEndAction {
                btn_transX_complex_right.translationX = 0f
                btn_transX_complex_right.alpha = 0.1f
                btn_transX_complex_right.scaleX = 0.5f
                btn_transX_complex_right.scaleY = 0.5f
            }.start()

        }
    }

    private fun rotationScaleAni() {
        btn_rotationX_complex.setOnClickListener {
            btn_rotationX_complex.animate().rotationX(360f).scaleX(1f).scaleY(1f).setDuration(duration).withEndAction {
                btn_rotationX_complex.rotationX = 0f
                btn_rotationX_complex.scaleX = 0.5f
                btn_rotationX_complex.scaleY = 0.5f
            }.start()
        }
        btn_rotationY_complex.setOnClickListener {
            btn_rotationY_complex.animate().rotationY(360f).scaleX(0.5f).scaleY(0.5f).setDuration(duration).withEndAction {
                btn_rotationY_complex.rotationY = 0f
                btn_rotationY_complex.scaleX = 1f
                btn_rotationY_complex.scaleY = 1f
            }.start()

        }
        btn_rotation_complex.setOnClickListener {
            btn_rotation_complex.animate().rotationX(360f).rotationY(360f).scaleX(1f).scaleY(1f).setDuration(duration).withEndAction {
                btn_rotation_complex.rotationX = 0f
                btn_rotation_complex.rotationY = 0f
                btn_rotation_complex.scaleX = 0.5f
                btn_rotation_complex.scaleY = 0.5f

            }.start()
        }
    }
}