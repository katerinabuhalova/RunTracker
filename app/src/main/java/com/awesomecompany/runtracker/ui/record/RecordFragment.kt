package com.awesomecompany.runtracker.ui.record

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.awesomecompany.runtracker.App
import com.awesomecompany.runtracker.databinding.FragmentRecordBinding
import com.awesomecompany.runtracker.ui.home.HomeViewModel
import javax.inject.Inject

class RecordFragment : Fragment() {

    private var _binding: FragmentRecordBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var recordViewModel: RecordViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity?.application as App).appComponent.inject(this)

        _binding = FragmentRecordBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.map
        recordViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}