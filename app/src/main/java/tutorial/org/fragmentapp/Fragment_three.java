package tutorial.org.fragmentapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_three extends Fragment{
    public static Fragment_three newInstance()
    {
        Fragment_three fragmentThree = new Fragment_three();
        return fragmentThree;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final  View rootView = inflater.inflate(R.layout.fragmentthree,container,false);
        return rootView;
    }
}
