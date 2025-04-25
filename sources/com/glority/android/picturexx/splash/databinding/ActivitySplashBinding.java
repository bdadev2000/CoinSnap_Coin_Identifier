package com.glority.android.picturexx.splash.databinding;

import android.opengl.GLSurfaceView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.glority.android.picturexx.splash.R;

/* loaded from: classes5.dex */
public abstract class ActivitySplashBinding extends ViewDataBinding {
    public final ConstraintLayout clSplashContainer;
    public final GLSurfaceView glSurfaceView;
    public final FragmentContainerView splashNavHostFragment;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySplashBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, GLSurfaceView gLSurfaceView, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.clSplashContainer = constraintLayout;
        this.glSurfaceView = gLSurfaceView;
        this.splashNavHostFragment = fragmentContainerView;
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivitySplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_splash, viewGroup, z, obj);
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivitySplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_splash, null, false, obj);
    }

    public static ActivitySplashBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySplashBinding bind(View view, Object obj) {
        return (ActivitySplashBinding) bind(obj, view, R.layout.activity_splash);
    }
}
