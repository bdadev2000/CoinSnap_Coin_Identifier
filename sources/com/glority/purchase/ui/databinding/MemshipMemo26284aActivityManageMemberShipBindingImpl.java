package com.glority.purchase.ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.purchase.ui.R;

/* loaded from: classes9.dex */
public class MemshipMemo26284aActivityManageMemberShipBindingImpl extends MemshipMemo26284aActivityManageMemberShipBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

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
        sparseIntArray.put(R.id.a_scrollView, 1);
        sparseIntArray.put(R.id.b_start_date, 2);
        sparseIntArray.put(R.id.b_premium, 3);
        sparseIntArray.put(R.id.b_text_date, 4);
        sparseIntArray.put(R.id.b_end_date, 5);
        sparseIntArray.put(R.id.b_pay_type, 6);
        sparseIntArray.put(R.id.b_tv_keep, 7);
        sparseIntArray.put(R.id.b_tv_change, 8);
        sparseIntArray.put(R.id.b_iv_close, 9);
    }

    public MemshipMemo26284aActivityManageMemberShipBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private MemshipMemo26284aActivityManageMemberShipBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ScrollView) objArr[1], (TextView) objArr[5], (ImageView) objArr[9], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[7]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
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
