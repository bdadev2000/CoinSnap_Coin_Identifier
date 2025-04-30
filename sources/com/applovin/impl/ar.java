package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public abstract class ar {

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6781a;
        final /* synthetic */ Runnable b;

        public a(View view, Runnable runnable) {
            this.f6781a = view;
            this.b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f6781a.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6782a;
        final /* synthetic */ Runnable b;

        public b(View view, Runnable runnable) {
            this.f6782a = view;
            this.b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f6782a.setVisibility(4);
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f6782a.setVisibility(0);
        }
    }

    public static void a(View view, long j7) {
        a(view, j7, (Runnable) null);
    }

    public static boolean b(int i9) {
        return i9 == 0;
    }

    public static void c(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void a(View view, long j7, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j7);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static void b(View view, long j7, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j7);
        alphaAnimation.setAnimationListener(new b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static View b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(R.id.content);
        return findViewById != null ? findViewById : rootView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if ((r2 & 1) == 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        if ((r2 & 16) == 16) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] a(int r2, int r3, int r4) {
        /*
            if (r2 != 0) goto L7
            int[] r2 = new int[]{r3, r4}
            return r2
        L7:
            r0 = r2 & 119(0x77, float:1.67E-43)
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L14
            r2 = 13
            int[] r2 = new int[]{r2}
            return r2
        L14:
            r0 = r2 & 112(0x70, float:1.57E-43)
            r1 = 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L1b
            goto L33
        L1b:
            r0 = r2 & 48
            r1 = 48
            if (r0 != r1) goto L24
            r3 = 10
            goto L35
        L24:
            r0 = r2 & 80
            r1 = 80
            if (r0 != r1) goto L2d
            r3 = 12
            goto L35
        L2d:
            r0 = r2 & 16
            r1 = 16
            if (r0 != r1) goto L35
        L33:
            r3 = 15
        L35:
            r0 = r2 & 7
            r1 = 7
            if (r0 != r1) goto L3b
            goto L6f
        L3b:
            boolean r0 = com.applovin.impl.x3.d()
            if (r0 == 0) goto L4b
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r2 & r0
            if (r1 != r0) goto L4b
            r4 = 20
            goto L71
        L4b:
            r0 = r2 & 3
            r1 = 3
            if (r0 != r1) goto L53
            r4 = 9
            goto L71
        L53:
            boolean r0 = com.applovin.impl.x3.d()
            if (r0 == 0) goto L63
            r0 = 8388613(0x800005, float:1.175495E-38)
            r1 = r2 & r0
            if (r1 != r0) goto L63
            r4 = 21
            goto L71
        L63:
            r0 = r2 & 5
            r1 = 5
            if (r0 != r1) goto L6b
            r4 = 11
            goto L71
        L6b:
            r0 = 1
            r2 = r2 & r0
            if (r2 != r0) goto L71
        L6f:
            r4 = 14
        L71:
            int[] r2 = new int[]{r4, r3}
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ar.a(int, int, int):int[]");
    }

    public static String a(int i9) {
        if (i9 == 0) {
            return "VISIBLE";
        }
        if (i9 == 4) {
            return "INVISIBLE";
        }
        if (i9 == 8) {
            return "GONE";
        }
        return String.valueOf(i9);
    }

    public static boolean a(int i9, int i10) {
        return b(i9) != b(i10);
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                if (a(view, viewGroup.getChildAt(i9))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return a(view, window.getDecorView());
            }
            View findViewById = activity.findViewById(R.id.content);
            if (findViewById != null) {
                return a(view, findViewById.getRootView());
            }
        }
        return false;
    }

    public static Activity a(View view, com.applovin.impl.sdk.k kVar) {
        if (view == null) {
            return null;
        }
        for (int i9 = 0; i9 < 1000; i9++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("ViewUtils", "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static String a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }
}
