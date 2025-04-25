package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ItemHomeCollectionDeBinding extends ViewDataBinding {
    public final LinearLayout collectionMoreLl;
    public final AppCompatTextView countTv;
    public final ShapeableImageView iv1;
    public final ShapeableImageView iv2;
    public final ShapeableImageView iv3;
    public final ConstraintLayout seriesCard;
    public final GlTextView tvMeSeriesName;
    public final AppCompatTextView updateTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeCollectionDeBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout collectionMoreLl, AppCompatTextView countTv, ShapeableImageView iv1, ShapeableImageView iv2, ShapeableImageView iv3, ConstraintLayout seriesCard, GlTextView tvMeSeriesName, AppCompatTextView updateTv) {
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

    public static ItemHomeCollectionDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeCollectionDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection_de, root, attachToRoot, component);
    }

    public static ItemHomeCollectionDeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionDeBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeCollectionDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_collection_de, null, false, component);
    }

    public static ItemHomeCollectionDeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeCollectionDeBinding bind(View view, Object component) {
        return (ItemHomeCollectionDeBinding) bind(component, view, R.layout.item_home_collection_de);
    }
}
