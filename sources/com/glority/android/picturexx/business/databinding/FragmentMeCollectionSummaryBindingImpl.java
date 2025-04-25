package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.views.CollectionBestOfficialSetCardView;
import com.glority.android.picturexx.views.CollectionBestVarietiesCardView;
import com.glority.android.picturexx.views.CollectionGeoDistributionCardView;
import com.glority.android.picturexx.views.CollectionMeltPriceCardView;
import com.glority.android.picturexx.views.SummaryCardView;

/* loaded from: classes2.dex */
public class FragmentMeCollectionSummaryBindingImpl extends FragmentMeCollectionSummaryBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"layout_none_collection_empty_view"}, new int[]{2}, new int[]{R.layout.layout_none_collection_empty_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.nsv_content, 3);
        sparseIntArray.put(R.id.summary_card, 4);
        sparseIntArray.put(R.id.summary_melt_price_card, 5);
        sparseIntArray.put(R.id.summary_best_varieties_card, 6);
        sparseIntArray.put(R.id.summary_geo_distribution_card, 7);
        sparseIntArray.put(R.id.summary_best_official_set_card, 8);
    }

    public FragmentMeCollectionSummaryBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private FragmentMeCollectionSummaryBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[1], (LayoutNoneCollectionEmptyViewBinding) bindings[2], (NestedScrollView) bindings[3], (CollectionBestOfficialSetCardView) bindings[8], (CollectionBestVarietiesCardView) bindings[6], (SummaryCardView) bindings[4], (CollectionGeoDistributionCardView) bindings[7], (CollectionMeltPriceCardView) bindings[5]);
        this.mDirtyFlags = -1L;
        this.clEmptyView.setTag(null);
        setContainedBinding(this.icEmptyLayout);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.icEmptyLayout.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.icEmptyLayout.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.icEmptyLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeIcEmptyLayout((LayoutNoneCollectionEmptyViewBinding) object, fieldId);
    }

    private boolean onChangeIcEmptyLayout(LayoutNoneCollectionEmptyViewBinding IcEmptyLayout, int fieldId) {
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
        executeBindingsOn(this.icEmptyLayout);
    }
}
