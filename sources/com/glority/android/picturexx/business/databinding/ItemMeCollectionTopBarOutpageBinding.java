package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemMeCollectionTopBarOutpageBinding extends ViewDataBinding {
    public final ImageView filterIv;
    public final LinearLayout filterLl;
    public final GlTextView filterTv;
    public final LinearLayout searchLl;
    public final GlTextView sortIv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeCollectionTopBarOutpageBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView filterIv, LinearLayout filterLl, GlTextView filterTv, LinearLayout searchLl, GlTextView sortIv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.filterIv = filterIv;
        this.filterLl = filterLl;
        this.filterTv = filterTv;
        this.searchLl = searchLl;
        this.sortIv = sortIv;
    }

    public static ItemMeCollectionTopBarOutpageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionTopBarOutpageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeCollectionTopBarOutpageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_top_bar_outpage, root, attachToRoot, component);
    }

    public static ItemMeCollectionTopBarOutpageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionTopBarOutpageBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeCollectionTopBarOutpageBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_collection_top_bar_outpage, null, false, component);
    }

    public static ItemMeCollectionTopBarOutpageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeCollectionTopBarOutpageBinding bind(View view, Object component) {
        return (ItemMeCollectionTopBarOutpageBinding) bind(component, view, R.layout.item_me_collection_top_bar_outpage);
    }
}
