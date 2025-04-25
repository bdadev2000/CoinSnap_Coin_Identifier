package com.glority.widget.skeleton;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes12.dex */
public class ViewReplacer {
    private static final String TAG = "com.glority.widget.skeleton.ViewReplacer";
    private View mCurrentView;
    private ViewGroup mSourceParentView;
    private final View mSourceView;
    private final int mSourceViewId;
    private final ViewGroup.LayoutParams mSourceViewLayoutParams;
    private View mTargetView;
    private int mTargetViewResID = -1;
    private int mSourceViewIndexInParent = 0;

    public ViewReplacer(View view) {
        this.mSourceView = view;
        this.mSourceViewLayoutParams = view.getLayoutParams();
        this.mCurrentView = view;
        this.mSourceViewId = view.getId();
    }

    public void replace(int i) {
        if (this.mTargetViewResID != i && init()) {
            this.mTargetViewResID = i;
            replace(LayoutInflater.from(this.mSourceView.getContext()).inflate(this.mTargetViewResID, this.mSourceParentView, false));
        }
    }

    public void replace(View view) {
        if (this.mCurrentView == view) {
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (init()) {
            this.mTargetView = view;
            this.mSourceParentView.removeView(this.mCurrentView);
            this.mTargetView.setId(this.mSourceViewId);
            this.mSourceParentView.addView(this.mTargetView, this.mSourceViewIndexInParent, this.mSourceViewLayoutParams);
            this.mCurrentView = this.mTargetView;
        }
    }

    public void restore() {
        ViewGroup viewGroup = this.mSourceParentView;
        if (viewGroup != null) {
            viewGroup.removeView(this.mCurrentView);
            this.mSourceParentView.addView(this.mSourceView, this.mSourceViewIndexInParent, this.mSourceViewLayoutParams);
            this.mCurrentView = this.mSourceView;
            this.mTargetView = null;
            this.mTargetViewResID = -1;
        }
    }

    public View getSourceView() {
        return this.mSourceView;
    }

    public View getTargetView() {
        return this.mTargetView;
    }

    public View getCurrentView() {
        return this.mCurrentView;
    }

    private boolean init() {
        if (this.mSourceParentView != null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) this.mSourceView.getParent();
        this.mSourceParentView = viewGroup;
        if (viewGroup == null) {
            Log.e(TAG, "the source view have not attach to any view");
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.mSourceView == this.mSourceParentView.getChildAt(i)) {
                this.mSourceViewIndexInParent = i;
                return true;
            }
        }
        return true;
    }
}
