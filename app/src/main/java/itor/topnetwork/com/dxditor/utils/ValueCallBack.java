package itor.topnetwork.com.dxditor.utils;

/**
 * Created by Silas on 2016/10/7.
 */
public interface ValueCallBack<T> {

    void onSuccess(T t);

    void onFail(String code);
}
