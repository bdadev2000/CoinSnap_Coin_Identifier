package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemHomeHeaderExpertPicksBinding extends ViewDataBinding {
    public final GlTextView dateTv;
    public final TextView tvListTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeHeaderExpertPicksBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView dateTv, TextView tvListTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.dateTv = dateTv;
        this.tvListTitle = tvListTitle;
    }

    public static ItemHomeHeaderExpertPicksBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeHeaderExpertPicksBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeHeaderExpertPicksBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_header_expert_picks, root, attachToRoot, component);
    }

    public static ItemHomeHeaderExpertPicksBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeHeaderExpertPicksBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeHeaderExpertPicksBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_header_expert_picks, null, false, component);
    }

    public static ItemHomeHeaderExpertPicksBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeHeaderExpertPicksBinding bind(View view, Object component) {
        return (ItemHomeHeaderExpertPicksBinding) bind(component, view, R.layout.item_home_header_expert_picks);
    }
}
