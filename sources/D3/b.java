package D3;

import B3.l;
import F1.i;
import G7.j;
import G7.r;
import U3.k;
import U4.K;
import a7.C0399a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.AbstractC0407h;
import androidx.core.app.C0406g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.z0;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.I;
import c0.C0585d;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.facebook.C1827e;
import com.facebook.appevents.o;
import com.facebook.internal.DialogC1845n;
import com.facebook.internal.q;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import com.vungle.ads.C2137s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m4.AbstractC2466a;
import u6.AbstractC2795k;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f738c;

    public /* synthetic */ b(Object obj, int i9) {
        this.b = i9;
        this.f738c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Boolean, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Handler handler;
        C0406g c0406g;
        Application application;
        Application application2;
        int i9 = 2;
        int i10 = 12;
        int i11 = 4;
        boolean z8 = true;
        switch (this.b) {
            case 0:
                ((CarouselLayoutManager) this.f738c).c();
                return;
            case 1:
                int i12 = HomeActivity.m;
                HomeActivity homeActivity = (HomeActivity) this.f738c;
                j.e(homeActivity, "this$0");
                int i13 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "load_consent_2");
                com.facebook.appevents.g.t(new E1.c(homeActivity, i11));
                return;
            case 2:
                I2.e eVar = (I2.e) this.f738c;
                if (!O2.a.b(I2.e.class)) {
                    try {
                        j.e(eVar, "this$0");
                        WeakReference weakReference = eVar.b;
                        try {
                            View b = E2.e.b((Activity) weakReference.get());
                            Activity activity = (Activity) weakReference.get();
                            if (b != null && activity != null) {
                                Iterator it = I2.c.a(b).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (!A2.f.b(view)) {
                                        String d2 = I2.c.d(view);
                                        if (d2.length() > 0 && d2.length() <= 300) {
                                            HashSet hashSet = I2.h.f1449g;
                                            String localClassName = activity.getLocalClassName();
                                            j.d(localClassName, "activity.localClassName");
                                            I2.a.b(view, b, localClassName);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        O2.a.a(I2.e.class, th);
                        return;
                    }
                }
                return;
            case 3:
                int i14 = ImageLibraryActivity.l;
                ImageLibraryActivity imageLibraryActivity = (ImageLibraryActivity) this.f738c;
                j.e(imageLibraryActivity, "this$0");
                ((AbstractC2795k) imageLibraryActivity.k()).f23337q.requestFocus();
                return;
            case 4:
                l lVar = (l) this.f738c;
                lVar.f295c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) lVar.f297e;
                C0585d c0585d = sideSheetBehavior.f14113i;
                if (c0585d != null && c0585d.f()) {
                    lVar.a(lVar.b);
                    return;
                } else {
                    if (sideSheetBehavior.f14112h == 2) {
                        sideSheetBehavior.w(lVar.b);
                        return;
                    }
                    return;
                }
            case 5:
                int i15 = PermissionActivity.f19681i;
                PermissionActivity permissionActivity = (PermissionActivity) this.f738c;
                j.e(permissionActivity, "this$0");
                new D6.c((Context) permissionActivity, new E6.d(permissionActivity, i9)).show();
                return;
            case 6:
                View view2 = (View) this.f738c;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
            case 7:
                ((U3.d) this.f738c).t(true);
                return;
            case 8:
                k kVar = (k) this.f738c;
                boolean isPopupShowing = kVar.f3158h.isPopupShowing();
                kVar.t(isPopupShowing);
                kVar.m = isPopupShowing;
                return;
            case 9:
                ((TextInputLayout) this.f738c).f14165f.requestLayout();
                return;
            case 10:
                i iVar = (i) this.f738c;
                synchronized (((ArrayDeque) iVar.f1087g)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) iVar.f1084c).edit();
                    String str = (String) iVar.f1085d;
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) iVar.f1087g).iterator();
                    while (it2.hasNext()) {
                        sb.append((String) it2.next());
                        sb.append((String) iVar.f1086f);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
            case 11:
                StringBuilder sb2 = new StringBuilder("Service took too long to process intent: ");
                K k6 = (K) this.f738c;
                sb2.append(k6.f3276a.getAction());
                sb2.append(" finishing.");
                Log.w("FirebaseMessaging", sb2.toString());
                k6.b.trySetResult(null);
                return;
            case 12:
                Activity activity2 = (Activity) this.f738c;
                if (!activity2.isFinishing()) {
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 28) {
                        Class cls = AbstractC0407h.f4401a;
                        activity2.recreate();
                        return;
                    }
                    Class cls2 = AbstractC0407h.f4401a;
                    if (i16 != 26 && i16 != 27) {
                        z8 = false;
                    }
                    Method method = AbstractC0407h.f4405f;
                    if ((!z8 || method != null) && (AbstractC0407h.f4404e != null || AbstractC0407h.f4403d != null)) {
                        try {
                            Object obj2 = AbstractC0407h.f4402c.get(activity2);
                            if (obj2 != null && (obj = AbstractC0407h.b.get(activity2)) != null) {
                                Application application3 = activity2.getApplication();
                                C0406g c0406g2 = new C0406g(activity2);
                                application3.registerActivityLifecycleCallbacks(c0406g2);
                                Handler handler2 = AbstractC0407h.f4406g;
                                handler2.post(new f4.b(11, c0406g2, obj2));
                                try {
                                    if (i16 != 26 && i16 != 27) {
                                        activity2.recreate();
                                        handler = handler2;
                                        c0406g = c0406g2;
                                        application2 = application3;
                                    } else {
                                        ?? r17 = Boolean.FALSE;
                                        handler = handler2;
                                        handler2 = r17;
                                        c0406g = c0406g2;
                                        c0406g2 = null;
                                        application2 = application3;
                                        application3 = null;
                                        try {
                                            method.invoke(obj, obj2, null, null, 0, handler2, null, null, r17, r17);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            application = application2;
                                            handler.post(new f4.b(i10, application, c0406g));
                                            throw th;
                                        }
                                    }
                                    handler.post(new f4.b(i10, application2, c0406g));
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    handler = handler2;
                                    c0406g = c0406g2;
                                    application = application3;
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    activity2.recreate();
                    return;
                }
                return;
            case 13:
                r rVar = (r) this.f738c;
                j.e(rVar, "$seekCancelLambda");
                F7.a aVar = (F7.a) rVar.b;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 14:
                ArrayList arrayList = (ArrayList) this.f738c;
                j.e(arrayList, "$transitioningViews");
                z0.a(4, arrayList);
                return;
            case 15:
                ((Fragment) this.f738c).lambda$performCreateView$0();
                return;
            case 16:
                ((FragmentManager) this.f738c).lambda$cancelBackStackTransition$4();
                return;
            case 17:
                I i17 = (I) this.f738c;
                j.e(i17, "this$0");
                int i18 = i17.f4829c;
                C0513x c0513x = i17.f4833h;
                if (i18 == 0) {
                    i17.f4830d = true;
                    c0513x.e(EnumC0503m.ON_PAUSE);
                }
                if (i17.b == 0 && i17.f4830d) {
                    c0513x.e(EnumC0503m.ON_STOP);
                    i17.f4831f = true;
                    return;
                }
                return;
            case 18:
                AppLovinFullscreenActivity.a((AppLovinFullscreenActivity) this.f738c);
                return;
            case 19:
                com.applovin.exoplayer2.ui.b.b((com.applovin.exoplayer2.ui.b) this.f738c);
                return;
            case 20:
                AppLovinBroadcastManager.sendBroadcastSync((AppLovinCommunicatorMessage) this.f738c, null);
                return;
            case 21:
                MaxNativeAdView.c((MaxNativeAdView) this.f738c);
                return;
            case 22:
                ((MaxAdPlacer) this.f738c).b();
                return;
            case 23:
                C1827e c1827e = (C1827e) this.f738c;
                j.e(c1827e, "this$0");
                c1827e.a();
                return;
            case 24:
                o oVar = (o) this.f738c;
                if (!O2.a.b(com.facebook.appevents.h.class)) {
                    try {
                        j.e(oVar, "$reason");
                        com.facebook.appevents.h.d(oVar);
                        return;
                    } catch (Throwable th4) {
                        O2.a.a(com.facebook.appevents.h.class, th4);
                        return;
                    }
                }
                return;
            case 25:
                DialogC1845n.g((DialogC1845n) this.f738c);
                return;
            case 26:
                q qVar = (q) this.f738c;
                qVar.getClass();
                com.facebook.internal.r rVar2 = com.facebook.internal.r.f13653a;
                qVar.f13652a.d(com.facebook.internal.r.b(qVar.b));
                return;
            case 27:
                com.facebook.login.j jVar = (com.facebook.login.j) this.f738c;
                j.e(jVar, "this$0");
                jVar.h();
                return;
            case 28:
                ((com.google.android.material.timepicker.e) this.f738c).m();
                return;
            default:
                C2137s.b((com.vungle.ads.internal.executor.l) this.f738c);
                return;
        }
    }
}
