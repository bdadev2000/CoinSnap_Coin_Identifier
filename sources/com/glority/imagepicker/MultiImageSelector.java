package com.glority.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.glority.imagepicker.bean.ResultImage;
import com.glority.utils.ui.ToastUtils;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MultiImageSelector {
    public static final String EXTRA_RESULT = "select_result";
    private static MultiImageSelector sSelector;
    private ArrayList<ResultImage> mOriginData;
    private SelectorListener mSelectorListener;
    private boolean mShowCamera = true;
    private int mMaxCount = 9;
    private int mMode = 1;

    /* loaded from: classes6.dex */
    public interface SelectorListener extends Serializable {
        void onResult(int i, ArrayList<ResultImage> arrayList);
    }

    private MultiImageSelector() {
    }

    public static MultiImageSelector create() {
        if (sSelector == null) {
            sSelector = new MultiImageSelector();
        }
        sSelector.listener(null);
        return sSelector;
    }

    public MultiImageSelector showCamera(boolean z) {
        this.mShowCamera = z;
        return sSelector;
    }

    public MultiImageSelector count(int i) {
        this.mMaxCount = i;
        return sSelector;
    }

    public MultiImageSelector single() {
        this.mMode = 0;
        return sSelector;
    }

    public MultiImageSelector multi() {
        this.mMode = 1;
        return sSelector;
    }

    public MultiImageSelector origin(ArrayList<ResultImage> arrayList) {
        this.mOriginData = arrayList;
        return sSelector;
    }

    public MultiImageSelector listener(SelectorListener selectorListener) {
        this.mSelectorListener = selectorListener;
        return sSelector;
    }

    public void start(Activity activity, int i) {
        if (hasPermission(activity)) {
            activity.startActivityForResult(createIntent(activity), i);
        } else {
            ToastUtils.showNotice(R.string.mis_error_no_permission, new Object[0]);
        }
    }

    public void start(Fragment fragment, int i) {
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        if (hasPermission(context)) {
            fragment.startActivityForResult(createIntent(context), i);
        } else {
            ToastUtils.showNotice(R.string.mis_error_no_permission, new Object[0]);
        }
    }

    private boolean hasPermission(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private Intent createIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) MultiImageSelectorActivity.class);
        intent.putExtra("show_camera", this.mShowCamera);
        intent.putExtra("max_select_count", this.mMaxCount);
        ArrayList<ResultImage> arrayList = this.mOriginData;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("default_list", arrayList);
        }
        intent.putExtra("select_count_mode", this.mMode);
        MultiImageSelectorActivity.setSelectorListener(this.mSelectorListener);
        return intent;
    }
}
