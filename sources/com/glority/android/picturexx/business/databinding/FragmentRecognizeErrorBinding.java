package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class FragmentRecognizeErrorBinding extends ViewDataBinding {
    public final GlTextView contentTv;
    public final GlTextView errorTv;
    public final ImageView iv;
    public final ImageView ivClose;
    public final GlTextView nameTv;
    public final MaterialButton retakeBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentRecognizeErrorBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView contentTv, GlTextView errorTv, ImageView iv, ImageView ivClose, GlTextView nameTv, MaterialButton retakeBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.contentTv = contentTv;
        this.errorTv = errorTv;
        this.iv = iv;
        this.ivClose = ivClose;
        this.nameTv = nameTv;
        this.retakeBt = retakeBt;
    }

    public static FragmentRecognizeErrorBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecognizeErrorBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentRecognizeErrorBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_recognize_error, root, attachToRoot, component);
    }

    public static FragmentRecognizeErrorBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecognizeErrorBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentRecognizeErrorBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_recognize_error, null, false, component);
    }

    public static FragmentRecognizeErrorBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecognizeErrorBinding bind(View view, Object component) {
        return (FragmentRecognizeErrorBinding) bind(component, view, R.layout.fragment_recognize_error);
    }
}
