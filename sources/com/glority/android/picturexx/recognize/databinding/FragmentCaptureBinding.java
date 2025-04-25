package com.glority.android.picturexx.recognize.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.FocusFrameLayout;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.widget.CameraVerticalZoomSeekBar;
import com.glority.android.picturexx.recognize.widget.CameraZoomSelectView;
import com.glority.android.picturexx.recognize.widget.CoinFocusCornerView;
import com.glority.android.picturexx.recognize.widget.CoinFocusView;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes5.dex */
public abstract class FragmentCaptureBinding extends ViewDataBinding {
    public final FrameLayout animateContainer;
    public final ShapeableImageView animateIv;
    public final View bgWhite;
    public final GlTextView btnAllowAccess;
    public final CoinFocusCornerView cfcv;
    public final CoinFocusView cfv;
    public final GlTextView countDownTv;
    public final FocusFrameLayout cv;
    public final LinearLayout detTipsLl;
    public final ImageView ivClose;
    public final ImageView ivFlash;
    public final FrameLayout ivShot;
    public final AppCompatImageView ivShotIn;
    public final ConstraintLayout llAccessContainer;
    public final LinearLayout llAlbum;
    public final LinearLayout llMultiCaptureImagesContainer;
    public final TextView modelInfoTv;
    public final FrameLayout snapLl;
    public final ImageView snapTipsIcon;
    public final LinearLayout tipsLl;
    public final AppCompatTextView tvCaptureHint;
    public final GlTextView tvImgTitle;
    public final LinearLayout tvUnlock;
    public final View vHeader;
    public final CameraVerticalZoomSeekBar zoomSeekBar;
    public final CameraZoomSelectView zoomSelector;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCaptureBinding(Object obj, View view, int i, FrameLayout frameLayout, ShapeableImageView shapeableImageView, View view2, GlTextView glTextView, CoinFocusCornerView coinFocusCornerView, CoinFocusView coinFocusView, GlTextView glTextView2, FocusFrameLayout focusFrameLayout, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, FrameLayout frameLayout2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, FrameLayout frameLayout3, ImageView imageView3, LinearLayout linearLayout4, AppCompatTextView appCompatTextView, GlTextView glTextView3, LinearLayout linearLayout5, View view3, CameraVerticalZoomSeekBar cameraVerticalZoomSeekBar, CameraZoomSelectView cameraZoomSelectView) {
        super(obj, view, i);
        this.animateContainer = frameLayout;
        this.animateIv = shapeableImageView;
        this.bgWhite = view2;
        this.btnAllowAccess = glTextView;
        this.cfcv = coinFocusCornerView;
        this.cfv = coinFocusView;
        this.countDownTv = glTextView2;
        this.cv = focusFrameLayout;
        this.detTipsLl = linearLayout;
        this.ivClose = imageView;
        this.ivFlash = imageView2;
        this.ivShot = frameLayout2;
        this.ivShotIn = appCompatImageView;
        this.llAccessContainer = constraintLayout;
        this.llAlbum = linearLayout2;
        this.llMultiCaptureImagesContainer = linearLayout3;
        this.modelInfoTv = textView;
        this.snapLl = frameLayout3;
        this.snapTipsIcon = imageView3;
        this.tipsLl = linearLayout4;
        this.tvCaptureHint = appCompatTextView;
        this.tvImgTitle = glTextView3;
        this.tvUnlock = linearLayout5;
        this.vHeader = view3;
        this.zoomSeekBar = cameraVerticalZoomSeekBar;
        this.zoomSelector = cameraZoomSelectView;
    }

    public static FragmentCaptureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCaptureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentCaptureBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_capture, viewGroup, z, obj);
    }

    public static FragmentCaptureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCaptureBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentCaptureBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_capture, null, false, obj);
    }

    public static FragmentCaptureBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCaptureBinding bind(View view, Object obj) {
        return (FragmentCaptureBinding) bind(obj, view, R.layout.fragment_capture);
    }
}
