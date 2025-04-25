package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.BR;
import com.glority.base.R;
import com.glority.base.databinding.LayoutToolbarBinding;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public class FragmentConsultBindingImpl extends FragmentConsultBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final FrameLayout mboundView0;
    private final LinearLayoutCompat mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"layout_toolbar"}, new int[]{2}, new int[]{R.layout.layout_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.header_iv, 3);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.rv, 4);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.note_tv, 5);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.question_fl, 6);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.note_et, 7);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.note_count_tv, 8);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.email_tv, 9);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.email_et, 10);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.submit_btn, 11);
    }

    public FragmentConsultBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }

    private FragmentConsultBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (EditText) bindings[10], (GlTextView) bindings[9], (ShapeableImageView) bindings[3], (TextView) bindings[8], (EditText) bindings[7], (GlTextView) bindings[5], (FrameLayout) bindings[6], (RecyclerView) bindings[4], (MaterialButton) bindings[11], (LayoutToolbarBinding) bindings[2]);
        this.mDirtyFlags = -1L;
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) bindings[1];
        this.mboundView1 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.toolBar);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.toolBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.toolBar.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.toolBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeToolBar((LayoutToolbarBinding) object, fieldId);
    }

    private boolean onChangeToolBar(LayoutToolbarBinding ToolBar, int fieldId) {
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
        executeBindingsOn(this.toolBar);
    }
}
