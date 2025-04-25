package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public class FragmentCollectionShareBindingImpl extends FragmentCollectionShareBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ScrollView mboundView0;

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
        sparseIntArray.put(R.id.card_view, 1);
        sparseIntArray.put(R.id.image_container, 2);
        sparseIntArray.put(R.id.main_image_vp, 3);
        sparseIntArray.put(R.id.tv_name, 4);
        sparseIntArray.put(R.id.tv_grade, 5);
        sparseIntArray.put(R.id.pager_index, 6);
        sparseIntArray.put(R.id.acquisition_ll, 7);
        sparseIntArray.put(R.id.iv_edit, 8);
        sparseIntArray.put(R.id.ll_year, 9);
        sparseIntArray.put(R.id.tv_year, 10);
        sparseIntArray.put(R.id.mintmark_year, 11);
        sparseIntArray.put(R.id.tv_mintmark, 12);
        sparseIntArray.put(R.id.ll_date_acquired, 13);
        sparseIntArray.put(R.id.tv_date, 14);
        sparseIntArray.put(R.id.ll_cost, 15);
        sparseIntArray.put(R.id.tv_cost, 16);
        sparseIntArray.put(R.id.note_ll, 17);
        sparseIntArray.put(R.id.note_tv, 18);
        sparseIntArray.put(R.id.ll_download, 19);
        sparseIntArray.put(R.id.ll_share, 20);
    }

    public FragmentCollectionShareBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }

    private FragmentCollectionShareBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[7], (CardView) bindings[1], (FrameLayout) bindings[2], (GlTextView) bindings[8], (FrameLayout) bindings[15], (FrameLayout) bindings[13], (LinearLayout) bindings[19], (LinearLayout) bindings[20], (FrameLayout) bindings[9], (ViewPager2) bindings[3], (FrameLayout) bindings[11], (LinearLayout) bindings[17], (GlTextView) bindings[18], (TextView) bindings[6], (GlTextView) bindings[16], (GlTextView) bindings[14], (GlTextView) bindings[5], (GlTextView) bindings[12], (TextView) bindings[4], (GlTextView) bindings[10]);
        this.mDirtyFlags = -1L;
        ScrollView scrollView = (ScrollView) bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag(null);
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
