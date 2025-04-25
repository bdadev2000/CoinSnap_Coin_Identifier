package com.glority.android.netpromoterscore.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.netpromoterscore.R;

/* loaded from: classes2.dex */
public class DialogNetPromoterScoreBindingImpl extends DialogNetPromoterScoreBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.cl_root, 1);
        sparseIntArray.put(R.id.iv_nps_dialog_close, 2);
        sparseIntArray.put(R.id.tv_nps_dialog_title, 3);
        sparseIntArray.put(R.id.ll_scores_container, 4);
        sparseIntArray.put(R.id.tv_nps_score00, 5);
        sparseIntArray.put(R.id.tv_nps_score01, 6);
        sparseIntArray.put(R.id.tv_nps_score02, 7);
        sparseIntArray.put(R.id.tv_nps_score03, 8);
        sparseIntArray.put(R.id.tv_nps_score04, 9);
        sparseIntArray.put(R.id.tv_nps_score05, 10);
        sparseIntArray.put(R.id.tv_nps_score06, 11);
        sparseIntArray.put(R.id.tv_nps_score07, 12);
        sparseIntArray.put(R.id.tv_nps_score08, 13);
        sparseIntArray.put(R.id.tv_nps_score09, 14);
        sparseIntArray.put(R.id.tv_nps_score10, 15);
        sparseIntArray.put(R.id.ll_nps_hint_container, 16);
        sparseIntArray.put(R.id.et_nps_experience_input, 17);
        sparseIntArray.put(R.id.tv_nps_dialog_submit, 18);
    }

    public DialogNetPromoterScoreBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 19, sIncludes, sViewsWithIds));
    }

    private DialogNetPromoterScoreBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (AppCompatEditText) objArr[17], (ImageView) objArr[2], (ConstraintLayout) objArr[16], (LinearLayout) objArr[4], (ScrollView) objArr[0], (TextView) objArr[18], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[12], (TextView) objArr[13], (TextView) objArr[14], (TextView) objArr[15]);
        this.mDirtyFlags = -1L;
        this.npsScrollview.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
