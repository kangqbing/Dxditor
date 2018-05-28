package itor.topnetwork.com.dxditor.activitys;

import android.view.View;
import android.widget.Button;

import itor.topnetwork.com.dxditor.R;
import itor.topnetwork.com.dxditor.myview.ViewDialogFragment;
import itor.topnetwork.com.dxditor.presenter.BasePresenter;
import itor.topnetwork.com.dxditor.utils.Constants;
import itor.topnetwork.com.dxditor.utils.ShareReferenceSaver;

/**
 * @Description:
 * @Created by D.Han on 2018/4/3 15:23 in Peking.
 */

public class SeetingActivity extends BaseActivity implements ViewDialogFragment.Callback {


    @Override
    public BasePresenter initPresent() {
        return null;
    }

    @Override
    public int getLayout() {
        return R.layout.setting_activity;
    }

    @Override
    public void initView() {
        Button set_but = findViewById(R.id.set_but);
        set_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewDialogFragment viewDialogFragment = new ViewDialogFragment();
                viewDialogFragment.show(getFragmentManager(),SeetingActivity.this);
            }
        });
    }

    @Override
    public void onPrepare() {

    }

    @Override
    public void setIP(String ip) {
        ShareReferenceSaver.saveData(SeetingActivity.this, Constants.SHAREDPREFERENCESIP,ip);
    }
}
