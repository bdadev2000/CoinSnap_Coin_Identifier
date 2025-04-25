package com.glority.android.picturexx.settings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.settings.BR;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public class FragmentProfileBindingImpl extends FragmentProfileBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_setting_toolbar"}, new int[]{1}, new int[]{R.layout.layout_setting_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.cl_avatar_container, 2);
        sparseIntArray.put(R.id.tv_avatar_label, 3);
        sparseIntArray.put(R.id.iv_avatar, 4);
        sparseIntArray.put(R.id.cl_nickname_container, 5);
        sparseIntArray.put(R.id.tv_nickname_label, 6);
        sparseIntArray.put(R.id.et_name, 7);
        sparseIntArray.put(R.id.cl_email_container, 8);
        sparseIntArray.put(R.id.tv_email_label, 9);
        sparseIntArray.put(R.id.et_email, 10);
    }

    public FragmentProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    private FragmentProfileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[5], (EditText) objArr[10], (EditText) objArr[7], (ImageView) objArr[4], (LayoutSettingToolbarBinding) objArr[1], (TextView) objArr[3], (TextView) objArr[9], (TextView) objArr[6]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
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
