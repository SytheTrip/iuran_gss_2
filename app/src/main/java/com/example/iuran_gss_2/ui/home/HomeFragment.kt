package com.example.iuran_gss_2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.iuran_gss_2.R
import com.example.iuran_gss_2.databinding.FragmentHomeBinding
import com.example.iuran_gss_2.utils.PaymentCategory
import com.example.iuran_gss_2.utils.convertToString
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate();
    }

    private fun navigate() {
        binding.cardIuranKeamanan.setOnClickListener {
            HomeFragmentDirections.actionHomeFragmentToQrisFragment(convertToString(category = PaymentCategory.IuranKeamanan))
        }
        binding.cardIuranSampah.setOnClickListener {
            HomeFragmentDirections.actionHomeFragmentToQrisFragment(convertToString(category = PaymentCategory.IuranSampah))
        }
        binding.cardUangKas.setOnClickListener {
            HomeFragmentDirections.actionHomeFragmentToQrisFragment(convertToString(category = PaymentCategory.UangKas))
        }
        binding.cardTransaksi.setOnClickListener {
            Snackbar.make(requireView(), "Transaksi", Toast.LENGTH_SHORT).show()
        }
        binding.cardBantuan.setOnClickListener {
            Snackbar.make(requireView(), "Bantuan", Toast.LENGTH_SHORT).show()
        }
        binding.ivProfile.setOnClickListener {
            HomeFragmentDirections.actionHomeFragmentToProfileFragment()
        }

    }

}