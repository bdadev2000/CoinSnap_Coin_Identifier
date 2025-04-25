package com.glority.android.picturexx.settings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes5.dex */
public class FragmentLoginBindingImpl extends FragmentLoginBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

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
        sparseIntArray.put(R.id.text_input_layout_email, 1);
        sparseIntArray.put(R.id.et_email, 2);
        sparseIntArray.put(R.id.text_input_layout_password, 3);
        sparseIntArray.put(R.id.et_password, 4);
        sparseIntArray.put(R.id.tv_forgot, 5);
        sparseIntArray.put(R.id.bt_login, 6);
        sparseIntArray.put(R.id.tv_sign_up, 7);
        sparseIntArray.put(R.id.ll_third_party_login, 8);
        sparseIntArray.put(R.id.ll_continue_with_title, 9);
        sparseIntArray.put(R.id.tv_other_continue_option, 10);
        sparseIntArray.put(R.id.iv_third_party_login_arrow, 11);
        sparseIntArray.put(R.id.ll_login_with_google, 12);
        sparseIntArray.put(R.id.tv_privacy_policy, 13);
        sparseIntArray.put(R.id.iv_back, 14);
    }

    public FragmentLoginBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 15, sIncludes, sViewsWithIds));
    }

    private FragmentLoginBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[6], (TextInputEditText) objArr[2], (TextInputEditText) objArr[4], (ImageView) objArr[14], (ImageView) objArr[11], (LinearLayout) objArr[9], (LinearLayout) objArr[12], (LinearLayout) objArr[8], (TextInputLayout) objArr[1], (TextInputLayout) objArr[3], (TextView) objArr[5], (TextView) objArr[10], (TextView) objArr[13], (TextView) objArr[7]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
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
