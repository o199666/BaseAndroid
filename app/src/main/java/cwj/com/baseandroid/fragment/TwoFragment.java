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
public class TwoFragment extends BaseFragment {
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

    /**
     * 多个标签公用一个Fragment的时候需要用这个方法，用来传值标识。区分。
     * @param info
     * @return
     */
    public static TwoFragment newInstance(String info) {
        TwoFragment oneFragment = new TwoFragment();
        Bundle args = new Bundle();
        args.putString("info", "two");
        oneFragment.setArguments(args);
        return oneFragment;
    }


}
