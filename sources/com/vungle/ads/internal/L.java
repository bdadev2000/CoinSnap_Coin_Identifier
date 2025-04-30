package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class L {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, J> trackedViews;
    private final Handler visibilityHandler;
    private final K visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final H Companion = new H(null);
    private static final String TAG = L.class.getSimpleName();

    public L(Context context, Map<View, J> map, Handler handler) {
        G7.j.e(context, "context");
        G7.j.e(map, "trackedViews");
        G7.j.e(handler, "visibilityHandler");
        this.trackedViews = map;
        this.visibilityHandler = handler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new K(this);
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.G
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean m21_init_$lambda0;
                m21_init_$lambda0 = L.m21_init_$lambda0(L.this);
                return m21_init_$lambda0;
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m21_init_$lambda0(L l) {
        G7.j.e(l, "this$0");
        l.scheduleVisibilityCheck();
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
                String str = TAG;
                G7.j.d(str, "TAG");
                uVar.w(str, "Trying to call View#rootView() on an unattached View.");
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
    public final boolean isVisible(View view, int i9) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long height = this.clipRect.height() * this.clipRect.width();
        long height2 = view.getHeight() * view.getWidth();
        if (height2 <= 0 || 100 * height < i9 * height2) {
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
            String str = TAG;
            G7.j.d(str, "TAG");
            uVar.d(str, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            com.vungle.ads.internal.util.u uVar2 = com.vungle.ads.internal.util.v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar2.d(str2, "The root view tree observer was not alive");
            return false;
        }
        this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
        return true;
    }

    public final void addView(View view, I i9) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        J j7 = this.trackedViews.get(view);
        if (j7 == null) {
            j7 = new J();
            this.trackedViews.put(view, j7);
            scheduleVisibilityCheck();
        }
        j7.setMinViewablePercent(1);
        j7.setImpressionListener(i9);
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
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        G7.j.e(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(Context context) {
        this(context, new WeakHashMap(10), new Handler());
        G7.j.e(context, "context");
    }
}
