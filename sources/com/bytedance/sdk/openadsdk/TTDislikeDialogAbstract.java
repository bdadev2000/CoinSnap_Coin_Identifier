package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog {
    private List<FilterWord> KS;
    private String lMd;
    private View zp;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
    }

    private void zp() {
        if (this.KS == null || this.zp == null) {
            return;
        }
        int[] tTDislikeListViewIds = getTTDislikeListViewIds();
        if (tTDislikeListViewIds != null && tTDislikeListViewIds.length > 0) {
            for (int i9 : tTDislikeListViewIds) {
                View findViewById = this.zp.findViewById(i9);
                if (findViewById != null) {
                    if (findViewById instanceof TTDislikeListView) {
                        ((TTDislikeListView) findViewById).setMaterialMeta(this.lMd);
                    } else {
                        throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id , please check");
                    }
                } else {
                    throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id,please check");
                }
            }
            return;
        }
        throw new IllegalArgumentException("The options list of dislike is empty, please set TTDislikeListView");
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public abstract int[] getTTDislikeListViewIds();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.zp = layoutView;
        if (layoutView != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            View view = this.zp;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            setContentView(view, layoutParams);
            zp();
            return;
        }
        throw new IllegalArgumentException("getLayoutView,layout  may be abnormal, please check");
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.lMd = str;
        this.KS = list;
        zp();
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i9) {
        super(context, i9);
    }
}
