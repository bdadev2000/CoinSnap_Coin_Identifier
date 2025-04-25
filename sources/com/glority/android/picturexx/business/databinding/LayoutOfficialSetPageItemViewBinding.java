package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutOfficialSetPageItemViewBinding extends ViewDataBinding {
    public final CardView cvOfficialSetCard;
    public final AppCompatImageView ivMore;
    public final LayoutOfficialSetProgressBaseViewBinding officialSetProgressView;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutOfficialSetPageItemViewBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView cvOfficialSetCard, AppCompatImageView ivMore, LayoutOfficialSetProgressBaseViewBinding officialSetProgressView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cvOfficialSetCard = cvOfficialSetCard;
        this.ivMore = ivMore;
        this.officialSetProgressView = officialSetProgressView;
    }

    public static LayoutOfficialSetPageItemViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutOfficialSetPageItemViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutOfficialSetPageItemViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_official_set_page_item_view, root, attachToRoot, component);
    }

    public static LayoutOfficialSetPageItemViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutOfficialSetPageItemViewBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutOfficialSetPageItemViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_official_set_page_item_view, null, false, component);
    }

    public static LayoutOfficialSetPageItemViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutOfficialSetPageItemViewBinding bind(View view, Object component) {
        return (LayoutOfficialSetPageItemViewBinding) bind(component, view, R.layout.layout_official_set_page_item_view);
    }
}
