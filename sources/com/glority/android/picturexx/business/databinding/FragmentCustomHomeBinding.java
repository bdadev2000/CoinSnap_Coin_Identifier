package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.ChatbotView;

/* loaded from: classes2.dex */
public abstract class FragmentCustomHomeBinding extends ViewDataBinding {
    public final ChatbotView chatbotView;
    public final ImageView homeBg;
    public final RecyclerView rv;
    public final LinearLayout searchView;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomHomeBinding(Object _bindingComponent, View _root, int _localFieldCount, ChatbotView chatbotView, ImageView homeBg, RecyclerView rv, LinearLayout searchView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.chatbotView = chatbotView;
        this.homeBg = homeBg;
        this.rv = rv;
        this.searchView = searchView;
    }

    public static FragmentCustomHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomHomeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_home, root, attachToRoot, component);
    }

    public static FragmentCustomHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomHomeBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomHomeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_home, null, false, component);
    }

    public static FragmentCustomHomeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomHomeBinding bind(View view, Object component) {
        return (FragmentCustomHomeBinding) bind(component, view, R.layout.fragment_custom_home);
    }
}
