package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class FragmentSimpleCollectionListBindingImpl extends FragmentSimpleCollectionListBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"item_me_collection_top_bar_inpage", "item_me_collection_top_bar_outpage"}, new int[]{1, 2}, new int[]{R.layout.item_me_collection_top_bar_inpage, R.layout.item_me_collection_top_bar_outpage});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.rv, 3);
    }

    public FragmentSimpleCollectionListBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private FragmentSimpleCollectionListBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (ItemMeCollectionTopBarOutpageBinding) bindings[2], (RecyclerView) bindings[3], (ItemMeCollectionTopBarInpageBinding) bindings[1]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.outSearchBar);
        setContainedBinding(this.searchBar);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        this.searchBar.invalidateAll();
        this.outSearchBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.searchBar.hasPendingBindings() || this.outSearchBar.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.searchBar.setLifecycleOwner(lifecycleOwner);
        this.outSearchBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return onChangeOutSearchBar((ItemMeCollectionTopBarOutpageBinding) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return onChangeSearchBar((ItemMeCollectionTopBarInpageBinding) object, fieldId);
    }

    private boolean onChangeOutSearchBar(ItemMeCollectionTopBarOutpageBinding OutSearchBar, int fieldId) {
        if (fieldId != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeSearchBar(ItemMeCollectionTopBarInpageBinding SearchBar, int fieldId) {
        if (fieldId != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        executeBindingsOn(this.searchBar);
        executeBindingsOn(this.outSearchBar);
    }
}
