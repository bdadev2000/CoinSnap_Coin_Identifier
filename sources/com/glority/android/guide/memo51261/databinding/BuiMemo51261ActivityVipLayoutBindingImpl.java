package com.glority.android.guide.memo51261.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.guide.memo51261.R;

/* loaded from: classes3.dex */
public class BuiMemo51261ActivityVipLayoutBindingImpl extends BuiMemo51261ActivityVipLayoutBinding {
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
        sparseIntArray.put(R.id.sv_top, 1);
        sparseIntArray.put(R.id.tv_subtitle, 2);
        sparseIntArray.put(R.id.tv_17000_local, 3);
        sparseIntArray.put(R.id.tv_nearly_5_years, 4);
        sparseIntArray.put(R.id.tv_80_scholars, 5);
        sparseIntArray.put(R.id.ll_weekly, 6);
        sparseIntArray.put(R.id.tv_weekly_price, 7);
        sparseIntArray.put(R.id.ll_yearly, 8);
        sparseIntArray.put(R.id.tv_yearly_price, 9);
        sparseIntArray.put(R.id.tv_save_percent, 10);
        sparseIntArray.put(R.id.tv_price_per_month, 11);
        sparseIntArray.put(R.id.ll_monthly, 12);
        sparseIntArray.put(R.id.tv_monthly_price, 13);
        sparseIntArray.put(R.id.tv_continue, 14);
        sparseIntArray.put(R.id.tv_data_policy, 15);
        sparseIntArray.put(R.id.tv_restore, 16);
        sparseIntArray.put(R.id.iv_close, 17);
        sparseIntArray.put(R.id.ll_mask, 18);
    }

    public BuiMemo51261ActivityVipLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 19, sIncludes, sViewsWithIds));
    }

    private BuiMemo51261ActivityVipLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (ImageView) objArr[17], (FrameLayout) objArr[18], (LinearLayout) objArr[12], (LinearLayout) objArr[6], (LinearLayout) objArr[8], (ScrollView) objArr[1], (TextView) objArr[3], (TextView) objArr[5], (AppCompatTextView) objArr[14], (TextView) objArr[15], (TextView) objArr[13], (TextView) objArr[4], (TextView) objArr[11], (TextView) objArr[16], (TextView) objArr[10], (TextView) objArr[2], (TextView) objArr[7], (TextView) objArr[9]);
        this.mDirtyFlags = -1L;
        this.content.setTag(null);
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
