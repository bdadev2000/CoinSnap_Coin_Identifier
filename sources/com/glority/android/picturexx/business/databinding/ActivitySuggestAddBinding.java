package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.base.databinding.LayoutToolbarBinding;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ActivitySuggestAddBinding extends ViewDataBinding {
    public final EditText botanicalNameInput;
    public final GlTextView botanicalNameTitle;
    public final LinearLayout commonNameAdd;
    public final RecyclerView commonNameRecyclerview;
    public final GlTextView commonNameTitle;
    public final MaterialButton sendLayout;
    public final LayoutToolbarBinding toolBar;
    public final GlTextView uploadImageNumber;
    public final RecyclerView uploadImageRecyclerview;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySuggestAddBinding(Object _bindingComponent, View _root, int _localFieldCount, EditText botanicalNameInput, GlTextView botanicalNameTitle, LinearLayout commonNameAdd, RecyclerView commonNameRecyclerview, GlTextView commonNameTitle, MaterialButton sendLayout, LayoutToolbarBinding toolBar, GlTextView uploadImageNumber, RecyclerView uploadImageRecyclerview) {
        super(_bindingComponent, _root, _localFieldCount);
        this.botanicalNameInput = botanicalNameInput;
        this.botanicalNameTitle = botanicalNameTitle;
        this.commonNameAdd = commonNameAdd;
        this.commonNameRecyclerview = commonNameRecyclerview;
        this.commonNameTitle = commonNameTitle;
        this.sendLayout = sendLayout;
        this.toolBar = toolBar;
        this.uploadImageNumber = uploadImageNumber;
        this.uploadImageRecyclerview = uploadImageRecyclerview;
    }

    public static ActivitySuggestAddBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySuggestAddBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySuggestAddBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_suggest_add, root, attachToRoot, component);
    }

    public static ActivitySuggestAddBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySuggestAddBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySuggestAddBinding) ViewDataBinding.inflateInternal(inflater, R.layout.activity_suggest_add, null, false, component);
    }

    public static ActivitySuggestAddBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySuggestAddBinding bind(View view, Object component) {
        return (ActivitySuggestAddBinding) bind(component, view, R.layout.activity_suggest_add);
    }
}
