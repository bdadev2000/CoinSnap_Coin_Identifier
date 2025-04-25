package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ItemHomeCollectionBinding extends ViewDataBinding {
    public final LinearLayout collectionMoreLl;
    public final GlTextView countTv;
    public final ShapeableImageView iv1;
    public final ShapeableImageView iv2;
    public final ShapeableImageView iv3;
    public final ConstraintLayout seriesCard;
    public final GlTextView tvMeSeriesName;
    public final GlTextView updateTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeCollectionBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout collectionMoreLl, GlTextView countTv, ShapeableImageView iv1, ShapeableImageView iv2, ShapeableImageView iv3, ConstraintLayout seriesCard, GlTextView tvMeSeriesName, GlTextView updateTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.collectionMoreLl = collectionMoreLl;
        this.countTv = countTv;
        this.iv1 = iv1;
        this.iv2 = iv2;
        this.iv3 = iv3;
        this.seriesCard = seriesCard;
        this.tvMeSeriesName = tvMeSeriesName;
        this.updateTv = updateTv;
    }

    public static ItemHomeCollectionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeCollectionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection, root, attachToRoot, component);
    }

    public static ItemHomeCollectionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeCollectionBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection, null, false, component);
    }

    public static ItemHomeCollectionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionBinding bind(View view, Object component) {
        return (ItemHomeCollectionBinding) bind(component, view, R.layout.item_home_collection);
    }
}
