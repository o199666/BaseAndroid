package cwj.com.baseandroid.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cwj.com.baseandroid.R;
import cwj.com.baseandroid.base.BaseFragment;

/**
 * Created by CWJ on 2018/12/10.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public class OneFragment extends BaseFragment {
    private TextView textView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_movice, container, false);
//        return mBinding.getRoot();
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void httpDate() {

    }

    public static OneFragment newInstance(String info) {
        OneFragment oneFragment = new OneFragment();
        Bundle args = new Bundle();
        args.putString("info", "info");
        oneFragment.setArguments(args);
        return oneFragment;
    }
}
