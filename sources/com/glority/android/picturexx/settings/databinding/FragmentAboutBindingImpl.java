package com.glority.android.picturexx.settings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.settings.BR;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public class FragmentAboutBindingImpl extends FragmentAboutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_setting_toolbar"}, new int[]{1}, new int[]{R.layout.layout_setting_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tv_version, 2);
        sparseIntArray.put(R.id.about_info, 3);
        sparseIntArray.put(R.id.cv_content_container, 4);
        sparseIntArray.put(R.id.about_desc, 5);
        sparseIntArray.put(R.id.cl_contact_email, 6);
        sparseIntArray.put(R.id.email, 7);
    }

    public FragmentAboutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    private FragmentAboutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[5], (TextView) objArr[3], (CardView) objArr[6], (CardView) objArr[4], (TextView) objArr[7], (LayoutSettingToolbarBinding) objArr[1], (TextView) objArr[2]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        setContainedBinding(this.naviBar);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.naviBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.naviBar.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.naviBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeNaviBar((LayoutSettingToolbarBinding) obj, i2);
    }

    private boolean onChangeNaviBar(LayoutSettingToolbarBinding layoutSettingToolbarBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        executeBindingsOn(this.naviBar);
    }
}
