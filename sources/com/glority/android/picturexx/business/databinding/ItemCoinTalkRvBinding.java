package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemCoinTalkRvBinding extends ViewDataBinding {
    public final RecyclerView coinTalkRv;
    public final TextView tvListTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCoinTalkRvBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView coinTalkRv, TextView tvListTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.coinTalkRv = coinTalkRv;
        this.tvListTitle = tvListTitle;
    }

    public static ItemCoinTalkRvBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCoinTalkRvBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCoinTalkRvBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_coin_talk_rv, root, attachToRoot, component);
    }

    public static ItemCoinTalkRvBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCoinTalkRvBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCoinTalkRvBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_coin_talk_rv, null, false, component);
    }

    public static ItemCoinTalkRvBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCoinTalkRvBinding bind(View view, Object component) {
        return (ItemCoinTalkRvBinding) bind(component, view, R.layout.item_coin_talk_rv);
    }
}
