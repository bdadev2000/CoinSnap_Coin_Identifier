package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemMeCollectionTopBarInpageBinding extends ViewDataBinding {
    public final GlTextView cancelTv;
    public final EditText et;
    public final ImageView filterIv;
    public final LinearLayout filterLl;
    public final GlTextView filterTv;
    public final LinearLayout searchLl;
    public final ImageView sortIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeCollectionTopBarInpageBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView cancelTv, EditText et, ImageView filterIv, LinearLayout filterLl, GlTextView filterTv, LinearLayout searchLl, ImageView sortIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cancelTv = cancelTv;
        this.et = et;
        this.filterIv = filterIv;
        this.filterLl = filterLl;
        this.filterTv = filterTv;
        this.searchLl = searchLl;
        this.sortIv = sortIv;
    }

    public static ItemMeCollectionTopBarInpageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionTopBarInpageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeCollectionTopBarInpageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_top_bar_inpage, root, attachToRoot, component);
    }

    public static ItemMeCollectionTopBarInpageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionTopBarInpageBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeCollectionTopBarInpageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_top_bar_inpage, null, false, component);
    }

    public static ItemMeCollectionTopBarInpageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionTopBarInpageBinding bind(View view, Object component) {
        return (ItemMeCollectionTopBarInpageBinding) bind(component, view, R.layout.item_me_collection_top_bar_inpage);
    }
}
