package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes2.dex */
public class DialogSyncCollectionsBindingImpl extends DialogSyncCollectionsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

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
        sparseIntArray.put(R.id.iv_close, 1);
        sparseIntArray.put(R.id.desc_tv, 2);
        sparseIntArray.put(R.id.tv_count, 3);
        sparseIntArray.put(R.id.tv_progress, 4);
        sparseIntArray.put(R.id.pb, 5);
        sparseIntArray.put(R.id.got_it_tv, 6);
        sparseIntArray.put(R.id.error_ll, 7);
        sparseIntArray.put(R.id.gotit2_tv, 8);
        sparseIntArray.put(R.id.retry_tv, 9);
    }

    public DialogSyncCollectionsBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    private DialogSyncCollectionsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (MaterialTextView) bindings[2], (LinearLayout) bindings[7], (MaterialButton) bindings[6], (MaterialButton) bindings[8], (ImageView) bindings[1], (LinearProgressIndicator) bindings[5], (MaterialButton) bindings[9], (TextView) bindings[3], (TextView) bindings[4]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
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
