package com.glority.widget.skeleton;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public class ViewSkeletonScreen implements SkeletonScreen {
    private static final String TAG = "com.glority.widget.skeleton.ViewSkeletonScreen";
    private final View mActualView;
    private final boolean mShimmer;
    private final int mShimmerAngle;
    private final int mShimmerColor;
    private final int mShimmerDuration;
    private final int mSkeletonResID;
    private final ViewReplacer mViewReplacer;

    private ViewSkeletonScreen(Builder builder) {
        this.mActualView = builder.mView;
        this.mSkeletonResID = builder.mSkeletonLayoutResID;
        this.mShimmer = builder.mShimmer;
        this.mShimmerDuration = builder.mShimmerDuration;
        this.mShimmerAngle = builder.mShimmerAngle;
        this.mShimmerColor = builder.mShimmerColor;
        this.mViewReplacer = new ViewReplacer(builder.mView);
    }

    private ShimmerLayout generateShimmerContainerLayout(ViewGroup viewGroup) {
        final ShimmerLayout shimmerLayout = (ShimmerLayout) LayoutInflater.from(this.mActualView.getContext()).inflate(R.layout.gl_layout_shimmer, viewGroup, false);
        shimmerLayout.setShimmerColor(this.mShimmerColor);
        shimmerLayout.setShimmerAngle(this.mShimmerAngle);
        shimmerLayout.setShimmerAnimationDuration(this.mShimmerDuration);
        View inflate = LayoutInflater.from(this.mActualView.getContext()).inflate(this.mSkeletonResID, (ViewGroup) shimmerLayout, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            shimmerLayout.setLayoutParams(layoutParams);
        }
        shimmerLayout.addView(inflate);
        shimmerLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.glority.widget.skeleton.ViewSkeletonScreen.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                shimmerLayout.startShimmerAnimation();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                shimmerLayout.stopShimmerAnimation();
            }
        });
        shimmerLayout.startShimmerAnimation();
        return shimmerLayout;
    }

    private View generateSkeletonLoadingView() {
        ViewParent parent = this.mActualView.getParent();
        if (parent == null) {
            Log.e(TAG, "the source view have not attach to any view");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (this.mShimmer) {
            return generateShimmerContainerLayout(viewGroup);
        }
        return LayoutInflater.from(this.mActualView.getContext()).inflate(this.mSkeletonResID, viewGroup, false);
    }

    @Override // com.glority.widget.skeleton.SkeletonScreen
    public void show() {
        View generateSkeletonLoadingView = generateSkeletonLoadingView();
        if (generateSkeletonLoadingView != null) {
            this.mViewReplacer.replace(generateSkeletonLoadingView);
        }
    }

    @Override // com.glority.widget.skeleton.SkeletonScreen
    public void hide() {
        if (this.mViewReplacer.getTargetView() instanceof ShimmerLayout) {
            ((ShimmerLayout) this.mViewReplacer.getTargetView()).stopShimmerAnimation();
        }
        this.mViewReplacer.restore();
    }

    /* loaded from: classes12.dex */
    public static class Builder {
        private int mShimmerColor;
        private int mSkeletonLayoutResID;
        private final View mView;
        private boolean mShimmer = true;
        private int mShimmerDuration = 1000;
        private int mShimmerAngle = 20;

        public Builder(View view) {
            this.mView = view;
            this.mShimmerColor = ContextCompat.getColor(view.getContext(), R.color.gl_shimmer_color);
        }

        public Builder load(int i) {
            this.mSkeletonLayoutResID = i;
            return this;
        }

        public Builder color(int i) {
            this.mShimmerColor = ContextCompat.getColor(this.mView.getContext(), i);
            return this;
        }

        public Builder shimmer(boolean z) {
            this.mShimmer = z;
            return this;
        }

        public Builder duration(int i) {
            this.mShimmerDuration = i;
            return this;
        }

        public Builder angle(int i) {
            this.mShimmerAngle = i;
            return this;
        }

        public ViewSkeletonScreen show() {
            ViewSkeletonScreen viewSkeletonScreen = new ViewSkeletonScreen(this);
            viewSkeletonScreen.show();
            return viewSkeletonScreen;
        }
    }
}
