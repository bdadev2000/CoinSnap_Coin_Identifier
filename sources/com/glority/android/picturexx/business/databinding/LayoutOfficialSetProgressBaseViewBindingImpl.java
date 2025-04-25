package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class LayoutOfficialSetProgressBaseViewBindingImpl extends LayoutOfficialSetProgressBaseViewBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_series_collection_folder_layout"}, new int[]{1}, new int[]{R.layout.view_series_collection_folder_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tv_me_series_name, 2);
        sparseIntArray.put(R.id.tv_me_series_progress, 3);
        sparseIntArray.put(R.id.pb_me_series_progress, 4);
    }

    public LayoutOfficialSetProgressBaseViewBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private LayoutOfficialSetProgressBaseViewBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ViewSeriesCollectionFolderLayoutBinding) bindings[1], (LinearLayout) bindings[0], (ProgressBar) bindings[4], (AppCompatTextView) bindings[2], (AppCompatTextView) bindings[3]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.icSeriesCollectionFolder);
        this.llOfficialSetContainer.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.icSeriesCollectionFolder.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.icSeriesCollectionFolder.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.icSeriesCollectionFolder.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeIcSeriesCollectionFolder((ViewSeriesCollectionFolderLayoutBinding) object, fieldId);
    }

    private boolean onChangeIcSeriesCollectionFolder(ViewSeriesCollectionFolderLayoutBinding IcSeriesCollectionFolder, int fieldId) {
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
        executeBindingsOn(this.icSeriesCollectionFolder);
    }
}
