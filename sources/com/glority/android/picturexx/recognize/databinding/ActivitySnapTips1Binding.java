package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes5.dex */
public abstract class ActivitySnapTips1Binding extends ViewDataBinding {
    public final Guideline glCenter;
    public final ImageView imgBottom1;
    public final ImageView imgBottom2;
    public final ImageView imgBottom3;
    public final ImageView imgTop1;
    public final ImageView imgTop2;
    public final GlTextView tvBottom1;
    public final GlTextView tvBottom2;
    public final GlTextView tvBottom3;
    public final MaterialButton tvContinue;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySnapTips1Binding(Object obj, View view, int i, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, GlTextView glTextView, GlTextView glTextView2, GlTextView glTextView3, MaterialButton materialButton) {
        super(obj, view, i);
        this.glCenter = guideline;
        this.imgBottom1 = imageView;
        this.imgBottom2 = imageView2;
        this.imgBottom3 = imageView3;
        this.imgTop1 = imageView4;
        this.imgTop2 = imageView5;
        this.tvBottom1 = glTextView;
        this.tvBottom2 = glTextView2;
        this.tvBottom3 = glTextView3;
        this.tvContinue = materialButton;
    }

    public static ActivitySnapTips1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySnapTips1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivitySnapTips1Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_snap_tips1, viewGroup, z, obj);
    }

    public static ActivitySnapTips1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySnapTips1Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivitySnapTips1Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_snap_tips1, null, false, obj);
    }

    public static ActivitySnapTips1Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySnapTips1Binding bind(View view, Object obj) {
        return (ActivitySnapTips1Binding) bind(obj, view, R.layout.activity_snap_tips1);
    }
}
