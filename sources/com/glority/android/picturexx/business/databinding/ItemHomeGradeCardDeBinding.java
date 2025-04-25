package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemHomeGradeCardDeBinding extends ViewDataBinding {
    public final LinearLayout gradingLl;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemHomeGradeCardDeBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout gradingLl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.gradingLl = gradingLl;
    }

    public static ItemHomeGradeCardDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeGradeCardDeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemHomeGradeCardDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_grade_card_de, root, attachToRoot, component);
    }

    public static ItemHomeGradeCardDeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeGradeCardDeBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemHomeGradeCardDeBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_home_grade_card_de, null, false, component);
    }

    public static ItemHomeGradeCardDeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemHomeGradeCardDeBinding bind(View view, Object component) {
        return (ItemHomeGradeCardDeBinding) bind(component, view, R.layout.item_home_grade_card_de);
    }
}
