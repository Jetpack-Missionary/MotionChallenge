package com.flywith24.motionchallenge

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.fragment_host.*

/**
 * @author Flywith24
 * @date   2020/6/12
 * time   22:17
 * description
 */
class HostFragment : Fragment(R.layout.fragment_host) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        jetpack.setOnClickListener {
            replaceFragment(MotionJetpackFragment())
        }

        dragonBall.setOnClickListener {
            replaceFragment(MotionGokuFragment())
        }
    }

    fun replaceFragment(t: Fragment) {
        parentFragmentManager.commit {
            replace(R.id.container, t)
            addToBackStack(null)
        }
    }
}