package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, j0> trackedViews;
    private final Handler visibilityHandler;
    private final k0 visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final h0 Companion = new h0(null);
    private static final String TAG = l0.class.getSimpleName();

    public l0(Context context, Map<View, j0> trackedViews, Handler visibilityHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedViews, "trackedViews");
        Intrinsics.checkNotNullParameter(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new k0(this);
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.g0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean m28_init_$lambda0;
                m28_init_$lambda0 = l0.m28_init_$lambda0(l0.this);
                return m28_init_$lambda0;
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m28_init_$lambda0(l0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    private final View getTopView(Context context, View view) {
        View view2;
        if (context instanceof Activity) {
            view2 = ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        } else {
            view2 = null;
        }
        if (view2 == null && view != null) {
            if (!ViewCompat.isAttachedToWindow(view)) {
                com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                uVar.w(TAG2, "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                view2 = rootView.findViewById(R.id.content);
            }
            if (view2 == null) {
                return rootView;
            }
            return view2;
        }
        return view2;
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i10) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long height = this.clipRect.height() * this.clipRect.width();
        long height2 = view.getHeight() * view.getWidth();
        if (height2 <= 0 || 100 * height < i10 * height2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            com.vungle.ads.internal.util.u uVar2 = com.vungle.ads.internal.util.v.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            uVar2.d(TAG3, "The root view tree observer was not alive");
            return false;
        }
        this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
        return true;
    }

    public final void addView(View view, i0 i0Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        j0 j0Var = this.trackedViews.get(view);
        if (j0Var == null) {
            j0Var = new j0();
            this.trackedViews.put(view, j0Var);
            scheduleVisibilityCheck();
        }
        j0Var.setMinViewablePercent(1);
        j0Var.setImpressionListener(i0Var);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(Context context) {
        this(context, new WeakHashMap(10), new Handler());
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
