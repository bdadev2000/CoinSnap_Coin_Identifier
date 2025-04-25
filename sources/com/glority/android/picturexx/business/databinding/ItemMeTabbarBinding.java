package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemMeTabbarBinding extends ViewDataBinding {
    public final ImageView alIv1;
    public final ImageView alIv2;
    public final FrameLayout allFl;
    public final LinearLayout allLl;
    public final TextView allTv;
    public final FrameLayout customSetsFl;
    public final TextView customSetsTv;
    public final HorizontalScrollView hsv;
    public final LinearLayout hsvContainer;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeTabbarBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView alIv1, ImageView alIv2, FrameLayout allFl, LinearLayout allLl, TextView allTv, FrameLayout customSetsFl, TextView customSetsTv, HorizontalScrollView hsv, LinearLayout hsvContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.alIv1 = alIv1;
        this.alIv2 = alIv2;
        this.allFl = allFl;
        this.allLl = allLl;
        this.allTv = allTv;
        this.customSetsFl = customSetsFl;
        this.customSetsTv = customSetsTv;
        this.hsv = hsv;
        this.hsvContainer = hsvContainer;
    }

    public static ItemMeTabbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeTabbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeTabbarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_tabbar, root, attachToRoot, component);
    }

    public static ItemMeTabbarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeTabbarBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeTabbarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_tabbar, null, false, component);
    }

    public static ItemMeTabbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeTabbarBinding bind(View view, Object component) {
        return (ItemMeTabbarBinding) bind(component, view, R.layout.item_me_tabbar);
    }
}
