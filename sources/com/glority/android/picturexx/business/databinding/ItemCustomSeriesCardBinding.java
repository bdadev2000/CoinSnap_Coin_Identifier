package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemCustomSeriesCardBinding extends ViewDataBinding {
    public final CardView cardView;
    public final AppCompatTextView countTv;
    public final ViewSeriesCollectionFolderLayoutBinding icSeriesFolder;
    public final FrameLayout ivMeSeriesMore;
    public final AppCompatTextView tvMeSeriesName;
    public final AppCompatTextView updateTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCustomSeriesCardBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView cardView, AppCompatTextView countTv, ViewSeriesCollectionFolderLayoutBinding icSeriesFolder, FrameLayout ivMeSeriesMore, AppCompatTextView tvMeSeriesName, AppCompatTextView updateTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cardView = cardView;
        this.countTv = countTv;
        this.icSeriesFolder = icSeriesFolder;
        this.ivMeSeriesMore = ivMeSeriesMore;
        this.tvMeSeriesName = tvMeSeriesName;
        this.updateTv = updateTv;
    }

    public static ItemCustomSeriesCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCustomSeriesCardBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_card, root, attachToRoot, component);
    }

    public static ItemCustomSeriesCardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesCardBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCustomSeriesCardBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_card, null, false, component);
    }

    public static ItemCustomSeriesCardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesCardBinding bind(View view, Object component) {
        return (ItemCustomSeriesCardBinding) bind(component, view, R.layout.item_custom_series_card);
    }
}
