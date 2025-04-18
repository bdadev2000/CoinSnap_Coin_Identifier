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
        final /* synthetic */ View a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f3790b;

        public a(View view, Runnable runnable) {
            this.a = view;
            this.f3790b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f3790b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.a.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        final /* synthetic */ View a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f3791b;

        public b(View view, Runnable runnable) {
            this.a = view;
            this.f3791b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.setVisibility(4);
            Runnable runnable = this.f3791b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.a.setVisibility(0);
        }
    }

    public static void a(View view, long j3) {
        a(view, j3, (Runnable) null);
    }

    public static boolean b(int i10) {
        return i10 == 0;
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

    public static void a(View view, long j3, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j3);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static void b(View view, long j3, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j3);
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

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if ((r5 & 1) == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0036, code lost:
    
        if ((r5 & 16) == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] a(int r5, int r6, int r7) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto Lc
            int[] r5 = new int[r0]
            r5[r1] = r6
            r5[r2] = r7
            return r5
        Lc:
            r3 = r5 & 119(0x77, float:1.67E-43)
            r4 = 119(0x77, float:1.67E-43)
            if (r3 != r4) goto L19
            int[] r5 = new int[r2]
            r6 = 13
            r5[r1] = r6
            return r5
        L19:
            r3 = r5 & 112(0x70, float:1.57E-43)
            r4 = 112(0x70, float:1.57E-43)
            if (r3 != r4) goto L20
            goto L38
        L20:
            r3 = r5 & 48
            r4 = 48
            if (r3 != r4) goto L29
            r6 = 10
            goto L3a
        L29:
            r3 = r5 & 80
            r4 = 80
            if (r3 != r4) goto L32
            r6 = 12
            goto L3a
        L32:
            r3 = r5 & 16
            r4 = 16
            if (r3 != r4) goto L3a
        L38:
            r6 = 15
        L3a:
            r3 = r5 & 7
            r4 = 7
            if (r3 != r4) goto L40
            goto L73
        L40:
            boolean r3 = com.applovin.impl.x3.d()
            if (r3 == 0) goto L50
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r4 = r5 & r3
            if (r4 != r3) goto L50
            r7 = 20
            goto L75
        L50:
            r3 = r5 & 3
            r4 = 3
            if (r3 != r4) goto L58
            r7 = 9
            goto L75
        L58:
            boolean r3 = com.applovin.impl.x3.d()
            if (r3 == 0) goto L68
            r3 = 8388613(0x800005, float:1.175495E-38)
            r4 = r5 & r3
            if (r4 != r3) goto L68
            r7 = 21
            goto L75
        L68:
            r3 = r5 & 5
            r4 = 5
            if (r3 != r4) goto L70
            r7 = 11
            goto L75
        L70:
            r5 = r5 & r2
            if (r5 != r2) goto L75
        L73:
            r7 = 14
        L75:
            int[] r5 = new int[r0]
            r5[r1] = r7
            r5[r2] = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ar.a(int, int, int):int[]");
    }

    public static String a(int i10) {
        return i10 == 0 ? "VISIBLE" : i10 == 4 ? "INVISIBLE" : i10 == 8 ? "GONE" : String.valueOf(i10);
    }

    public static boolean a(int i10, int i11) {
        return b(i10) != b(i11);
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (a(view, viewGroup.getChildAt(i10))) {
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
        for (int i10 = 0; i10 < 1000; i10++) {
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
            } catch (Throwable th2) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("ViewUtils", "Encountered error while retrieving activity from view", th2);
                }
            }
        }
        return null;
    }

    public static String a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }
}
