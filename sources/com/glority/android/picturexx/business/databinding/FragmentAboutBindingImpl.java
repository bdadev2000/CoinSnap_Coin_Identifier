package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.LayoutSettingToolbarBinding;

/* loaded from: classes2.dex */
public class FragmentAboutBindingImpl extends FragmentAboutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_setting_toolbar"}, new int[]{1}, new int[]{R.layout.layout_setting_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.tv_version, 2);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.about_info, 3);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.cv_content_container, 4);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.about_desc, 5);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.cl_contact_email, 6);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.email, 7);
    }

    public FragmentAboutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private FragmentAboutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[5], (TextView) bindings[3], (CardView) bindings[6], (CardView) bindings[4], (TextView) bindings[7], (LayoutSettingToolbarBinding) bindings[1], (TextView) bindings[2]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        setContainedBinding(this.naviBar);
        setRootTag(root);
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeNaviBar((LayoutSettingToolbarBinding) object, fieldId);
    }

    private boolean onChangeNaviBar(LayoutSettingToolbarBinding NaviBar, int fieldId) {
        if (fieldId != BR._all) {
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
