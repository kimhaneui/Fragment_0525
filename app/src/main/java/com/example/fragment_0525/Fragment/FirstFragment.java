package com.example.fragment_0525.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.fragment_0525.R;
import com.example.fragment_0525.databinding.FragmentFirstBinding;

public class FirstFragment extends BaseFragment {

    FragmentFirstBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false);
        return  binding.getRoot();
    }

//    나를 담고 있는 액티비티의 onCreate가 실행된 시점
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUp();
        setValues();
    }

    @Override
    public void setUp() {
        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = binding.messageEdt.getText().toString();
                binding.myText.setText(input);
                Toast.makeText(mcontext,"두번째 프래그먼트 입니다",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setValues() {

    }
//    액티비티가

}
