package itor.topnetwork.com.dxditor.myview;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import itor.topnetwork.com.dxditor.R;
import itor.topnetwork.com.dxditor.utils.Constants;
import itor.topnetwork.com.dxditor.utils.ShareReferenceSaver;

/**
 * @Description:
 * @Created by D.Han on 2018/5/28 18:10 in Peking.
 */

public class ViewDialogFragment extends DialogFragment {

    public interface Callback {
        void setIP(String ip);
    }

    private Callback callback;

    public void show(FragmentManager fragmentManager,Callback callback) {
        show(fragmentManager, "ViewDialogFragment");
        this.callback=callback;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View view = inflater.inflate(R.layout.ip_dialog, null);
        final EditText ip= view.findViewById(R.id.ip);
        ip.setText(ShareReferenceSaver.getData(getActivity(),Constants.SHAREDPREFERENCESIP));
        builder.setView(view)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (callback != null) {
                            callback.setIP(ip.getText().toString());
                        }
                    }
                })
        ;
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Callback) {
            callback = (Callback) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement Callback");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        callback = null;
    }
}
