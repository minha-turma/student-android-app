package minhaturma.ufrpe.br.minhaturma.assignments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import minhaturma.ufrpe.br.minhaturma.R;

public class AssignmentsFragment extends Fragment {

    static AssignmentsFragment instance;

    public static AssignmentsFragment getInstance() {
        if (instance == null) {
            instance = new AssignmentsFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_assignments, container, false);
    }

}
