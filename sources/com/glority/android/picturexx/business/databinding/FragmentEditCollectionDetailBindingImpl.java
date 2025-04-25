package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public class FragmentEditCollectionDetailBindingImpl extends FragmentEditCollectionDetailBinding {
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
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.iv_close, 2);
        sparseIntArray.put(R.id.container_v, 3);
        sparseIntArray.put(R.id.variety_tv, 4);
        sparseIntArray.put(R.id.mint_mark_ll, 5);
        sparseIntArray.put(R.id.variety_et, 6);
        sparseIntArray.put(R.id.mintmark_iv, 7);
        sparseIntArray.put(R.id.series_title_tv, 8);
        sparseIntArray.put(R.id.series_ll, 9);
        sparseIntArray.put(R.id.series_et, 10);
        sparseIntArray.put(R.id.value_tv, 11);
        sparseIntArray.put(R.id.price_unit_tv, 12);
        sparseIntArray.put(R.id.value_et, 13);
        sparseIntArray.put(R.id.grade_tv, 14);
        sparseIntArray.put(R.id.grade_ll, 15);
        sparseIntArray.put(R.id.grade_et, 16);
        sparseIntArray.put(R.id.more_info_ll, 17);
        sparseIntArray.put(R.id.date, 18);
        sparseIntArray.put(R.id.cl_acquisition_date, 19);
        sparseIntArray.put(R.id.acquisition_et, 20);
        sparseIntArray.put(R.id.tv_name_title, 21);
        sparseIntArray.put(R.id.name_et, 22);
        sparseIntArray.put(R.id.notes_et, 23);
        sparseIntArray.put(R.id.photo_tv, 24);
        sparseIntArray.put(R.id.rv, 25);
        sparseIntArray.put(R.id.add_more_bt, 26);
        sparseIntArray.put(R.id.save_bt, 27);
    }

    public FragmentEditCollectionDetailBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }

    private FragmentEditCollectionDetailBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (GlTextView) bindings[20], (MaterialButton) bindings[26], (LinearLayout) bindings[19], (LinearLayout) bindings[3], (LinearLayout) bindings[18], (TextView) bindings[16], (LinearLayout) bindings[15], (GlTextView) bindings[14], (ImageView) bindings[2], (LinearLayout) bindings[5], (ImageView) bindings[7], (LinearLayout) bindings[17], (EditText) bindings[22], (EditText) bindings[23], (GlTextView) bindings[24], (TextView) bindings[12], (RecyclerView) bindings[25], (MaterialButton) bindings[27], (TextView) bindings[10], (LinearLayout) bindings[9], (GlTextView) bindings[8], (GlTextView) bindings[1], (GlTextView) bindings[21], (EditText) bindings[13], (GlTextView) bindings[11], (GlTextView) bindings[6], (GlTextView) bindings[4]);
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
