package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class ViewRecognizeHeaderBinding extends ViewDataBinding {
    public final FrameLayout doubleImageLayout;
    public final ImageView iv1;
    public final ImageView iv2;
    public final LinearLayout mutliImageLayout;
    public final ImageView official1Iv;
    public final ImageView official2Iv;
    public final LinearLayout officialLl;
    public final GlTextView officialMask;
    public final ImageView officialMaskArrow;
    public final ImageView photo1Iv;
    public final ImageView photo2Iv;
    public final LinearLayout photoLl;
    public final GlTextView photoMask;
    public final ImageView photoMaskArrow;
    public final LinearLayout singleImageLayout;
    public final ImageView singleIv;
    public final ShapeableImageView themeBigIv;
    public final GlTextView themeDescTv;
    public final ShapeableImageView themeIv;
    public final LinearLayout themeLl;
    public final GlTextView themeMask;
    public final ImageView themeMaskArrow;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewRecognizeHeaderBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout doubleImageLayout, ImageView iv1, ImageView iv2, LinearLayout mutliImageLayout, ImageView official1Iv, ImageView official2Iv, LinearLayout officialLl, GlTextView officialMask, ImageView officialMaskArrow, ImageView photo1Iv, ImageView photo2Iv, LinearLayout photoLl, GlTextView photoMask, ImageView photoMaskArrow, LinearLayout singleImageLayout, ImageView singleIv, ShapeableImageView themeBigIv, GlTextView themeDescTv, ShapeableImageView themeIv, LinearLayout themeLl, GlTextView themeMask, ImageView themeMaskArrow) {
        super(_bindingComponent, _root, _localFieldCount);
        this.doubleImageLayout = doubleImageLayout;
        this.iv1 = iv1;
        this.iv2 = iv2;
        this.mutliImageLayout = mutliImageLayout;
        this.official1Iv = official1Iv;
        this.official2Iv = official2Iv;
        this.officialLl = officialLl;
        this.officialMask = officialMask;
        this.officialMaskArrow = officialMaskArrow;
        this.photo1Iv = photo1Iv;
        this.photo2Iv = photo2Iv;
        this.photoLl = photoLl;
        this.photoMask = photoMask;
        this.photoMaskArrow = photoMaskArrow;
        this.singleImageLayout = singleImageLayout;
        this.singleIv = singleIv;
        this.themeBigIv = themeBigIv;
        this.themeDescTv = themeDescTv;
        this.themeIv = themeIv;
        this.themeLl = themeLl;
        this.themeMask = themeMask;
        this.themeMaskArrow = themeMaskArrow;
    }

    public static ViewRecognizeHeaderBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewRecognizeHeaderBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ViewRecognizeHeaderBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_recognize_header, root, attachToRoot, component);
    }

    public static ViewRecognizeHeaderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewRecognizeHeaderBinding inflate(LayoutInflater inflater, Object component) {
        return (ViewRecognizeHeaderBinding) ViewDataBinding.inflateInternal(inflater, R.layout.view_recognize_header, null, false, component);
    }

    public static ViewRecognizeHeaderBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewRecognizeHeaderBinding bind(View view, Object component) {
        return (ViewRecognizeHeaderBinding) bind(component, view, R.layout.view_recognize_header);
    }
}
