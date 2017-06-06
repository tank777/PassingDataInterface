package com.bgt.passingdatainterface;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Bhavesh on 06-06-2017.
 */

public class FragmentClass  extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_class,container,false);
        ((MainActivity) getActivity()).passVal(new FragmentCommunicator() {
            @Override
            public void passData(String name) {
                Toast.makeText(getActivity(), name, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
