package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.CoinLoadingLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes2.dex */
public class FragmentSeriesDetailBindingImpl extends FragmentSeriesDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final AppBarLayout mboundView1;
    private final ItemUserSeriesLabelBinding mboundView11;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tool_bar, 3);
        sparseIntArray.put(R.id.rv, 4);
        sparseIntArray.put(R.id.got_it_tv, 5);
    }

    public FragmentSeriesDetailBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private FragmentSeriesDetailBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[5], (CoinLoadingLayout) bindings[0], (RecyclerView) bindings[4], (MaterialToolbar) bindings[3]);
        this.mDirtyFlags = -1L;
        this.loadingView.setTag(null);
        AppBarLayout appBarLayout = (AppBarLayout) bindings[1];
        this.mboundView1 = appBarLayout;
        appBarLayout.setTag(null);
        Object obj = bindings[2];
        this.mboundView11 = obj != null ? ItemUserSeriesLabelBinding.bind((View) obj) : null;
        setRootTag(root);
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
