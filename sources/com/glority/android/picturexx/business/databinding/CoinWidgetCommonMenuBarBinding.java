package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class CoinWidgetCommonMenuBarBinding extends ViewDataBinding {
    public final FrameLayout camera;
    public final View meRedDot;
    public final ConstraintLayout rlMenu;
    public final AppCompatTextView tab0;
    public final AppCompatTextView tab1;
    public final AppCompatTextView tab2;

    /* JADX INFO: Access modifiers changed from: protected */
    public CoinWidgetCommonMenuBarBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout camera, View meRedDot, ConstraintLayout rlMenu, AppCompatTextView tab0, AppCompatTextView tab1, AppCompatTextView tab2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.camera = camera;
        this.meRedDot = meRedDot;
        this.rlMenu = rlMenu;
        this.tab0 = tab0;
        this.tab1 = tab1;
        this.tab2 = tab2;
    }

    public static CoinWidgetCommonMenuBarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CoinWidgetCommonMenuBarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CoinWidgetCommonMenuBarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.coin_widget_common_menu_bar, root, attachToRoot, component);
    }

    public static CoinWidgetCommonMenuBarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CoinWidgetCommonMenuBarBinding inflate(LayoutInflater inflater, Object component) {
        return (CoinWidgetCommonMenuBarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.coin_widget_common_menu_bar, null, false, component);
    }

    public static CoinWidgetCommonMenuBarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CoinWidgetCommonMenuBarBinding bind(View view, Object component) {
        return (CoinWidgetCommonMenuBarBinding) bind(component, view, R.layout.coin_widget_common_menu_bar);
    }
}
