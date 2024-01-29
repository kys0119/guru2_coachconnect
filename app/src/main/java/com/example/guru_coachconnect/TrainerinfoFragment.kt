package com.example.guru_coachconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class TrainerInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_trainerinfo)

        val back = findViewById<ImageButton>(R.id.back)
        val btnBook = findViewById<Button>(R.id.btnBook)
        val btnMessage = findViewById<Button>(R.id.btnMessage)

        // 예약하기 클릭 시
        btnBook.setOnClickListener {
            // 회원가입 액티비티로 이동
            val intent = Intent(this, BookingFragment::class.java)
            startActivity(intent)

            // back 버튼 클릭 시
            //back.setOnClickListener {
            // 트레이너 목록 액티비티로 이동
            // val intent = Intent(this, 트레이너 목록 페이지::class.java)
            // startActivity(intent)
        }
    }
}
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//
//import android.content.Intent
//import android.widget.Button
//import android.widget.ImageButton
//import androidx.fragment.app.FragmentTransaction
//
//class TrainerInfoFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.fragment_trainerinfo, container, false)
//
//        val back = view.findViewById<ImageButton>(R.id.back)
//        val btnBook = view.findViewById<Button>(R.id.btnBook)
//        val btnMessage = view.findViewById<Button>(R.id.btnMessage)
//
//        // 예약하기 클릭 시
//        btnBook.setOnClickListener {
//            // 회원가입 액티비티로 이동
//            val intent = Intent(requireContext(), SignUpActivity::class.java)
//            startActivity(intent)
//        }
//
//        return view
//    }
//}



//class TrainerinfoFragment : Fragment() {
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_trainerinfo, container, false)
//    }
//
//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment TrainerinfoFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            TrainerinfoFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
//}