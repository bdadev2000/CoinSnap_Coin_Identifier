package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ViewRecognizeHeaderNewBinding extends ViewDataBinding {
    public final LinearLayout doubleImageLayout;
    public final AppCompatImageView iv1;
    public final AppCompatImageView iv2;
    public final AppCompatImageView ivCollectorChoice;
    public final LottieAnimationView lottieFireworks;
    public final LinearLayout mutliImageLayout;
    public final AppCompatImageView official1Iv;
    public final AppCompatImageView official2Iv;
    public final LinearLayout officialLl;
    public final GlTextView officialMask;
    public final AppCompatImageView photo1Iv;
    public final AppCompatImageView photo2Iv;
    public final LinearLayout photoLl;
    public final GlTextView photoMask;
    public final AppCompatImageView singleIv;
    public final AppCompatImageView themeBigIv;
    public final ShapeableImageView themeIv;
    public final LinearLayout themeLl;
    public final GlTextView themeMask;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewRecognizeHeaderNewBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout doubleImageLayout, AppCompatImageView iv1, AppCompatImageView iv2, AppCompatImageView ivCollectorChoice, LottieAnimationView lottieFireworks, LinearLayout mutliImageLayout, AppCompatImageView official1Iv, AppCompatImageView official2Iv, LinearLayout officialLl, GlTextView officialMask, AppCompatImageView photo1Iv, AppCompatImageView photo2Iv, LinearLayout photoLl, GlTextView photoMask, AppCompatImageView singleIv, AppCompatImageView themeBigIv, ShapeableImageView themeIv, LinearLayout themeLl, GlTextView themeMask) {
        super(_bindingComponent, _root, _localFieldCount);
        this.doubleImageLayout = doubleImageLayout;
        this.iv1 = iv1;
        this.iv2 = iv2;
        this.ivCollectorChoice = ivCollectorChoice;
        this.lottieFireworks = lottieFireworks;
        this.mutliImageLayout = mutliImageLayout;
        this.official1Iv = official1Iv;
        this.official2Iv = official2Iv;
        this.officialLl = officialLl;
        this.officialMask = officialMask;
        this.photo1Iv = photo1Iv;
        this.photo2Iv = photo2Iv;
        this.photoLl = photoLl;
        this.photoMask = photoMask;
        this.singleIv = singleIv;
        this.themeBigIv = themeBigIv;
        this.themeIv = themeIv;
        this.themeLl = themeLl;
        this.themeMask = themeMask;
    }

    public static ViewRecognizeHeaderNewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewRecognizeHeaderNewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewRecognizeHeaderNewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_recognize_header_new, root, attachToRoot, component);
    }

    public static ViewRecognizeHeaderNewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewRecognizeHeaderNewBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewRecognizeHeaderNewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_recognize_header_new, null, false, component);
    }

    public static ViewRecognizeHeaderNewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewRecognizeHeaderNewBinding bind(View view, Object component) {
        return (ViewRecognizeHeaderNewBinding) bind(component, view, R.layout.view_recognize_header_new);
    }
}
