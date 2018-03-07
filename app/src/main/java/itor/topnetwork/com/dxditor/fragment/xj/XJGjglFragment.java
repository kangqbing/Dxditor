package itor.topnetwork.com.dxditor.fragment.xj;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import itor.topnetwork.com.dxditor.R;
import itor.topnetwork.com.dxditor.activitys.XjjcLiveActivity;
import itor.topnetwork.com.dxditor.adapter.XjGjglAdapter;
import itor.topnetwork.com.dxditor.bean.Gjlb;
import itor.topnetwork.com.dxditor.fragment.BaseFragment;
import itor.topnetwork.com.dxditor.presenter.xj.XjglPresenter;
import itor.topnetwork.com.dxditor.view.xj.IXjGjglView;

/**
 * 线夹告警管理
 * Created by D.Han on 2017/12/6.
 */

public class XJGjglFragment extends BaseFragment<XjglPresenter> implements IXjGjglView {
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView xjgjgl_rv;
    private XjGjglAdapter xjGjglAdapter;

    @Override
    public XjglPresenter initPresent() {
        return new XjglPresenter(this);
    }

    @Override
    public int getLayout() {
        return R.layout.xjgjgl_layout;
    }

    @Override
    public void initView() {
        xjgjgl_rv = view.findViewById(R.id.xjgjgl_rv);
    }

    @Override
    public void onPrepare() {
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        // 设置布局管理器
        xjgjgl_rv.setLayoutManager(mLayoutManager);
        xjGjglAdapter = new XjGjglAdapter(getActivity(), basepresenter.getGjadapterData());
        xjgjgl_rv.setAdapter(xjGjglAdapter);
        xjGjglAdapter.setOnItemClickListener(new XjGjglAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {

                Intent xjjcIntent = new Intent(getActivity(), XjjcLiveActivity.class);
                xjjcIntent.putExtra("sbid", basepresenter.getGjadapterData().get(position).getSb());
                startActivity(xjjcIntent);
            }
        });
        basepresenter.initData();
    }

    /**
     * 刷新adapter
     */
    @Override
    public void refreshAdapter(ArrayList<Gjlb> gjxxBeans) {
        xjGjglAdapter.updateData(gjxxBeans);
    }

}