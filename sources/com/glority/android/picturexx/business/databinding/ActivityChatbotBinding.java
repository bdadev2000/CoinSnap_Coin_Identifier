package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ActivityChatbotBinding extends ViewDataBinding {
    public final FrameLayout fragmentFl;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityChatbotBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout fragmentFl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentFl = fragmentFl;
    }

    public static ActivityChatbotBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityChatbotBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityChatbotBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_chatbot, root, attachToRoot, component);
    }

    public static ActivityChatbotBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityChatbotBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityChatbotBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_chatbot, null, false, component);
    }

    public static ActivityChatbotBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityChatbotBinding bind(View view, Object component) {
        return (ActivityChatbotBinding) bind(component, view, R.layout.activity_chatbot);
    }
}
