package com.glority.android.picturexx.business.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.extensions.MetalTypeExtKt;
import com.picturecoin.generatedAPI.kotlinAPI.enums.MetalType;

/* loaded from: classes2.dex */
public class ViewSummaryMeltPriceRowLayoutBindingImpl extends ViewSummaryMeltPriceRowLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final AppCompatImageView mboundView1;
    private final AppCompatTextView mboundView2;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tv_melt_price, 3);
        sparseIntArray.put(R.id.tv_melt_weight, 4);
    }

    public ViewSummaryMeltPriceRowLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private ViewSummaryMeltPriceRowLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (AppCompatTextView) bindings[3], (AppCompatTextView) bindings[4]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) bindings[1];
        this.mboundView1 = appCompatImageView;
        appCompatImageView.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) bindings[2];
        this.mboundView2 = appCompatTextView;
        appCompatTextView.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
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
    public boolean setVariable(int variableId, Object variable) {
        if (BR.metalType != variableId) {
            return false;
        }
        setMetalType((MetalType) variable);
        return true;
    }

    @Override // com.glority.android.picturexx.business.databinding.ViewSummaryMeltPriceRowLayoutBinding
    public void setMetalType(MetalType MetalType) {
        this.mMetalType = MetalType;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(BR.metalType);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        int i;
        boolean z;
        boolean z2;
        Drawable drawable;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        MetalType metalType = this.mMetalType;
        long j2 = j & 3;
        if (j2 != 0) {
            i = MetalTypeExtKt.getTitleResource(metalType);
            z = metalType == MetalType.GOLD;
            if (j2 != 0) {
                j = z ? j | 8 : j | 4;
            }
        } else {
            i = 0;
            z = false;
        }
        long j3 = j & 4;
        if (j3 != 0) {
            z2 = metalType == MetalType.SILVER;
            if (j3 != 0) {
                j = z2 ? j | 32 : j | 16;
            }
        } else {
            z2 = false;
        }
        long j4 = 16 & j;
        Drawable drawable2 = null;
        if (j4 != 0) {
            boolean z3 = metalType == MetalType.PLATINUM;
            if (j4 != 0) {
                j |= z3 ? 128L : 64L;
            }
            drawable = AppCompatResources.getDrawable(this.mboundView1.getContext(), z3 ? R.drawable.icon_summary_melt_price_platinum : R.drawable.icon_summary_melt_price_palladium);
        } else {
            drawable = null;
        }
        if ((4 & j) == 0) {
            drawable = null;
        } else if (z2) {
            drawable = AppCompatResources.getDrawable(this.mboundView1.getContext(), R.drawable.icon_summary_melt_price_silver);
        }
        long j5 = j & 3;
        if (j5 != 0) {
            if (z) {
                drawable = AppCompatResources.getDrawable(this.mboundView1.getContext(), R.drawable.icon_summary_melt_price_gold);
            }
            drawable2 = drawable;
        }
        if (j5 != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.mboundView1, drawable2);
            this.mboundView2.setText(i);
        }
    }
}
