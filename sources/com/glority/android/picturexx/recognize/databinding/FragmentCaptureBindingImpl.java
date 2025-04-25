package com.glority.android.picturexx.recognize.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.glority.android.picturexx.recognize.FocusFrameLayout;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.utils.RecognizeAbUtils;
import com.glority.android.picturexx.recognize.widget.CameraVerticalZoomSeekBar;
import com.glority.android.picturexx.recognize.widget.CameraZoomSelectView;
import com.glority.android.picturexx.recognize.widget.CoinFocusCornerView;
import com.glority.android.picturexx.recognize.widget.CoinFocusView;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes5.dex */
public class FragmentCaptureBindingImpl extends FragmentCaptureBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final TextView mboundView4;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.cv, 5);
        sparseIntArray.put(R.id.zoom_seek_bar, 6);
        sparseIntArray.put(R.id.zoom_selector, 7);
        sparseIntArray.put(R.id.ll_multi_capture_images_container, 8);
        sparseIntArray.put(R.id.det_tips_ll, 9);
        sparseIntArray.put(R.id.count_down_tv, 10);
        sparseIntArray.put(R.id.ll_access_container, 11);
        sparseIntArray.put(R.id.btn_allow_access, 12);
        sparseIntArray.put(R.id.v_header, 13);
        sparseIntArray.put(R.id.iv_close, 14);
        sparseIntArray.put(R.id.tv_unlock, 15);
        sparseIntArray.put(R.id.iv_flash, 16);
        sparseIntArray.put(R.id.animate_container, 17);
        sparseIntArray.put(R.id.animate_iv, 18);
        sparseIntArray.put(R.id.bg_white, 19);
        sparseIntArray.put(R.id.iv_shot, 20);
        sparseIntArray.put(R.id.iv_shot_in, 21);
        sparseIntArray.put(R.id.ll_album, 22);
        sparseIntArray.put(R.id.tips_ll, 23);
        sparseIntArray.put(R.id.snap_tips_icon, 24);
        sparseIntArray.put(R.id.snap_ll, 25);
        sparseIntArray.put(R.id.model_info_tv, 26);
        sparseIntArray.put(R.id.tv_capture_hint, 27);
    }

    public FragmentCaptureBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 28, sIncludes, sViewsWithIds));
    }

    private FragmentCaptureBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[17], (ShapeableImageView) objArr[18], (View) objArr[19], (GlTextView) objArr[12], (CoinFocusCornerView) objArr[2], (CoinFocusView) objArr[1], (GlTextView) objArr[10], (FocusFrameLayout) objArr[5], (LinearLayout) objArr[9], (ImageView) objArr[14], (ImageView) objArr[16], (FrameLayout) objArr[20], (AppCompatImageView) objArr[21], (ConstraintLayout) objArr[11], (LinearLayout) objArr[22], (LinearLayout) objArr[8], (TextView) objArr[26], (FrameLayout) objArr[25], (ImageView) objArr[24], (LinearLayout) objArr[23], (AppCompatTextView) objArr[27], (GlTextView) objArr[3], (LinearLayout) objArr[15], (View) objArr[13], (CameraVerticalZoomSeekBar) objArr[6], (CameraZoomSelectView) objArr[7]);
        this.mDirtyFlags = -1L;
        this.cfcv.setTag(null);
        this.cfv.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.mboundView4 = textView;
        textView.setTag(null);
        this.tvImgTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= !RecognizeAbUtils.enableCameraBigCircleStyle() ? 320L : 160L;
            }
            if ((j & 1) != 0) {
                j |= RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn() ? 20L : 10L;
            }
        }
        if ((j & 1) != 0) {
            this.cfcv.setVisibility(RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn() ? 0 : 8);
            CoinFocusView coinFocusView = this.cfv;
            if (RecognizeAbUtils.enableCameraBigCircleStyle()) {
                resources = this.cfv.getResources();
                i = R.dimen.x1;
            } else {
                resources = this.cfv.getResources();
                i = R.dimen.x300;
            }
            ViewBindingAdapter.setPaddingBottom(coinFocusView, resources.getDimension(i));
            CoinFocusView coinFocusView2 = this.cfv;
            if (RecognizeAbUtils.enableCameraBigCircleStyle()) {
                resources2 = this.cfv.getResources();
                i2 = R.dimen.x1;
            } else {
                resources2 = this.cfv.getResources();
                i2 = R.dimen.x150;
            }
            ViewBindingAdapter.setPaddingTop(coinFocusView2, resources2.getDimension(i2));
            this.cfv.setVisibility(RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn() ? 8 : 0);
            TextView textView = this.mboundView4;
            TextViewBindingAdapter.setText(textView, textView.getResources().getString(R.string.camera_text_tip1, this.mboundView4.getResources().getString(R.string.app_name)));
            this.tvImgTitle.setVisibility(RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn() ? 8 : 0);
        }
    }
}
