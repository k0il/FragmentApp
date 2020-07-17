package tutorial.org.fragmentapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_one extends Fragment{
    public static Fragment_one newInstance()
    {
        Fragment_one fragmentOne = new Fragment_one();
        return fragmentOne;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final  View rootView = inflater.inflate(R.layout.fragmentone,container,false);
        return rootView;
    }
}
