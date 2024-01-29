package com.example.guru_coachconnect

import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.guru_coachconnect.profileFragment
import com.example.guru_coachconnect.goalsettingFragment


//class MainActivity : AppCompatActivity() {
//
//    private lateinit var bottomNavigationView: BottomNavigationView // 바텀 네비게이션 뷰
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        bottomNavigationView = findViewById(R.id.bottom_menu)
//
//        // 처음 화면
//        supportFragmentManager.beginTransaction().replace(R.id.containers, profileFragment()).commit() // FrameLayout에 fragment.xml 띄우기
//
//        // 바텀 네비게이션뷰 안의 아이템 설정
//        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                // item을 클릭시 id값을 가져와 FrameLayout에 fragment.xml띄우기
//                R.id.profile -> supportFragmentManager.beginTransaction().replace(R.id.containers, profileFragment()).commit()
//                R.id.icon -> supportFragmentManager.beginTransaction().replace(R.id.containers, goalsettingFragment()).commit()
//            }
//            true
//        }
//    }
//}



//
//import androidx.fragment.app.FragmentManager
//import butterknife.ButterKnife
//import butterknife.OnClick
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var fragmentManager: FragmentManager
//    private var fa: Fragment? = null
//    private var fb: Fragment? = null
//    private var fc: Fragment? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        ButterKnife.bind(this)
//
//        fragmentManager = supportFragmentManager
//
//        fa = A_Fragment()
//        fragmentManager.beginTransaction().replace(R.id.fl_main, fa!!).commit()
//    }
//
//    @OnClick(R.id.btn_main_a)
//    fun onMoveA() {
//        if (fa == null) {
//            fa = A_Fragment()
//            fragmentManager.beginTransaction().add(R.id.fl_main, fa!!).commit()
//        }
//
//        if (fa != null) fragmentManager.beginTransaction().show(fa!!).commit()
//        if (fb != null) fragmentManager.beginTransaction().hide(fb!!).commit()
//        if (fc != null) fragmentManager.beginTransaction().hide(fc!!).commit()
//    }
//
//    @OnClick(R.id.btn_main_b)
//    fun onMoveB() {
//        if (fb == null) {
//            fb = B_Fragment()
//            fragmentManager.beginTransaction().add(R.id.fl_main, fb!!).commit()
//        }
//
//        if (fa != null) fragmentManager.beginTransaction().hide(fa!!).commit()
//        if (fb != null) fragmentManager.beginTransaction().show(fb!!).commit()
//        if (fc != null) fragmentManager.beginTransaction().hide(fc!!).commit()
//    }
//
//    @OnClick(R.id.btn_main_c)
//    fun onMoveC() {
//        if (fc == null) {
//            fc = C_Fragment()
//            fragmentManager.beginTransaction().add(R.id.fl_main, fc!!).commit()
//        }
//
//        if (fa != null) fragmentManager.beginTransaction().hide(fa!!).commit()
//        if (fb != null) fragmentManager.beginTransaction().hide(fb!!).commit()
//        if (fc != null) fragmentManager.beginTransaction().show(fc!!).commit()
//    }
//}




class MainActivity : AppCompatActivity() {

    private val frame: LinearLayout by lazy { // activity_main의 화면 부분
        findViewById(R.id.linearLayout)
    }
    private val bottomNagivationView: BottomNavigationView by lazy { // 하단 네비게이션 바
        findViewById(R.id.bottom_menu)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 애플리케이션 실행 후 첫 화면 설정
        supportFragmentManager.beginTransaction().add(frame.id, profileFragment()).commit()

        // 하단 네비게이션 바 클릭 이벤트 설정
        bottomNagivationView.setOnNavigationItemSelectedListener {item ->
            when(item.itemId) {
                R.id.home -> {
                    replaceFragment(BookingFragment())
                    true
                }
                R.id.search -> {
                    replaceFragment(testFragment())
                    true
                }
                R.id.profile -> {
                    replaceFragment(profileFragment())
                    true
                }
                R.id.icon -> {
                    replaceFragment(goalsettingFragment())
                    true
                }
                else -> false
            }
        }
    }

    // 화면 전환 구현 메소드
    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(frame.id, fragment).commit()
    }
}


//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}