package com.mbridge.msdk.splash.d;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.splash.c.e;
import com.mbridge.msdk.splash.c.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* loaded from: classes3.dex */
public final class c {
    private static String b = "SplashProvider";

    /* renamed from: A, reason: collision with root package name */
    private boolean f17898A;

    /* renamed from: B, reason: collision with root package name */
    private CampaignEx f17899B;

    /* renamed from: C, reason: collision with root package name */
    private MBSplashPopView f17900C;

    /* renamed from: c, reason: collision with root package name */
    private String f17903c;

    /* renamed from: d, reason: collision with root package name */
    private String f17904d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeIds f17905e;

    /* renamed from: g, reason: collision with root package name */
    private long f17907g;

    /* renamed from: h, reason: collision with root package name */
    private e f17908h;

    /* renamed from: i, reason: collision with root package name */
    private f f17909i;

    /* renamed from: j, reason: collision with root package name */
    private b f17910j;

    /* renamed from: k, reason: collision with root package name */
    private MBSplashShowListener f17911k;
    private d l;
    private MBSplashView m;

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f17912n;

    /* renamed from: o, reason: collision with root package name */
    private View f17913o;

    /* renamed from: p, reason: collision with root package name */
    private k f17914p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17915q;

    /* renamed from: r, reason: collision with root package name */
    private ViewGroup f17916r;

    /* renamed from: s, reason: collision with root package name */
    private j f17917s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f17918t;

    /* renamed from: z, reason: collision with root package name */
    private Activity f17924z;

    /* renamed from: f, reason: collision with root package name */
    private int f17906f = 5;

    /* renamed from: u, reason: collision with root package name */
    private int f17919u = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f17920v = z.i(com.mbridge.msdk.foundation.controller.c.m().c());

    /* renamed from: w, reason: collision with root package name */
    private int f17921w = z.g(com.mbridge.msdk.foundation.controller.c.m().c());

    /* renamed from: x, reason: collision with root package name */
    private Object f17922x = new Object();

    /* renamed from: y, reason: collision with root package name */
    private Object f17923y = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f17902a = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f17901D = false;

    public c(Activity activity, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = str;
        }
        this.f17904d = str3;
        this.f17903c = str2;
        this.f17905e = new MBridgeIds(str, str2);
        this.f17924z = activity;
        if (this.f17909i == null) {
            if (activity != null) {
                this.f17909i = new f(activity, this.f17904d, this.f17903c);
            } else {
                this.f17909i = new f(com.mbridge.msdk.foundation.controller.c.m().c(), this.f17904d, this.f17903c);
            }
        }
        if (this.m == null) {
            if (activity != null) {
                this.m = new MBSplashView(activity);
            } else {
                this.m = new MBSplashView(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        }
        if (this.f17917s == null) {
            this.f17917s = new j();
        }
        this.f17917s.a(com.mbridge.msdk.foundation.controller.c.m().c(), com.mbridge.msdk.foundation.controller.c.m().k(), com.mbridge.msdk.foundation.controller.c.m().b(), this.f17903c);
    }

    public final long b() {
        return this.f17907g;
    }

    public final boolean c() {
        return this.f17918t;
    }

    public final int d() {
        return this.f17906f;
    }

    public final String e() {
        if (!this.f17902a) {
            e eVar = this.f17908h;
            if (eVar != null) {
                return eVar.a();
            }
            return "";
        }
        f fVar = this.f17909i;
        if (fVar != null) {
            return fVar.a();
        }
        return "";
    }

    public final String f() {
        if (!this.f17902a) {
            e eVar = this.f17908h;
            if (eVar != null) {
                return eVar.b();
            }
            return "";
        }
        f fVar = this.f17909i;
        if (fVar != null) {
            return fVar.b();
        }
        return "";
    }

    public final void g() {
        this.f17901D = true;
        MBSplashPopView mBSplashPopView = this.f17900C;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public final void h() {
        this.f17901D = false;
        MBSplashShowListener mBSplashShowListener = this.f17911k;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f17904d, this.f17903c));
        }
        MBSplashPopView mBSplashPopView = this.f17900C;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public final void i() {
        f fVar = this.f17909i;
        if (fVar != null) {
            fVar.c();
        }
        MBSplashPopView mBSplashPopView = this.f17900C;
        if (mBSplashPopView != null && this.f17901D) {
            mBSplashPopView.reStartCountDown();
        }
    }

    public final void j() {
        f fVar = this.f17909i;
        if (fVar != null) {
            fVar.d();
        }
        MBSplashPopView mBSplashPopView = this.f17900C;
        if (mBSplashPopView != null && this.f17901D) {
            mBSplashPopView.pauseCountDown();
        }
    }

    public final void k() {
        this.f17899B = null;
        if (this.f17911k != null) {
            this.f17911k = null;
        }
        if (this.f17910j != null) {
            this.f17910j = null;
        }
        if (this.l != null) {
            this.l = null;
        }
        e eVar = this.f17908h;
        if (eVar != null) {
            eVar.c();
        }
        f fVar = this.f17909i;
        if (fVar != null) {
            fVar.e();
        }
        if (this.f17924z != null) {
            this.f17924z = null;
        }
    }

    public final void a(ViewGroup viewGroup) {
        this.f17916r = viewGroup;
    }

    public final void b(String str) {
        a(str, 1);
    }

    public final boolean c(String str) {
        return com.mbridge.msdk.splash.c.d.a(this.m, this.f17904d, this.f17903c, str, this.f17918t, this.f17906f, false, true) != null;
    }

    public final void d(String str, Activity activity) {
        ViewGroup a6 = a(activity);
        if (a6 == null) {
            MBSplashShowListener mBSplashShowListener = this.f17911k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f17905e, "activity is except,please check it");
                return;
            }
            return;
        }
        d(str, a6);
    }

    public final boolean a() {
        return this.f17915q;
    }

    public final void b(String str, Activity activity) {
        ViewGroup a6 = a(activity);
        if (a6 == null) {
            if (this.f17910j != null) {
                this.f17910j.a(new com.mbridge.msdk.foundation.c.b(880036), 1);
                return;
            }
            return;
        }
        b(str, a6);
    }

    public final void c(String str, Activity activity) {
        ViewGroup a6 = a(activity);
        if (a6 == null) {
            MBSplashShowListener mBSplashShowListener = this.f17911k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f17905e, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, a6);
    }

    public final void a(boolean z8) {
        this.f17915q = z8;
    }

    public final void a(int i9) {
        this.f17919u = i9;
    }

    public final void a(long j7) {
        this.f17907g = j7;
    }

    public final void d(String str, ViewGroup viewGroup) {
        this.f17912n = viewGroup;
        MBSplashView mBSplashView = this.m;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx a6 = com.mbridge.msdk.splash.c.d.a(this.m, this.f17904d, this.f17903c, str, this.f17918t, this.f17906f, true, false);
        if (a6 != null) {
            if (this.f17914p == null) {
                this.f17914p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17903c);
            }
            d dVar = new d(this, this.f17911k, a6);
            this.l = dVar;
            if (this.f17920v != 0 && this.f17921w != 0) {
                int i9 = this.f17906f;
                if (i9 >= 2 && i9 <= 10) {
                    a(a6, this.f17914p.r(), false);
                    return;
                }
                dVar.a(this.f17905e, "countDownTime must in 2 - 10 ,but now is " + this.f17906f);
                return;
            }
            dVar.a(this.f17905e, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f17911k;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f17905e, "campaignEx is vali");
        }
    }

    public final void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f17910j == null) {
            this.f17910j = new b(this, this.f17905e);
        }
        this.f17910j.a(mBSplashLoadListener);
    }

    public final void c(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f17911k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f17905e, "token is null or empty");
                return;
            }
            return;
        }
        d(str, viewGroup);
    }

    public final void b(String str, ViewGroup viewGroup) {
        this.f17912n = viewGroup;
        MBSplashView mBSplashView = this.m;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public final void a(MBSplashShowListener mBSplashShowListener) {
        this.f17911k = mBSplashShowListener;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f17910j != null) {
                this.f17910j.a(new com.mbridge.msdk.foundation.c.b(880035), 1);
                return;
            }
            return;
        }
        a(str, 1);
    }

    public final void c(boolean z8) {
        this.f17898A = z8;
    }

    public final void b(boolean z8) {
        this.f17918t = z8;
    }

    public final void b(int i9) {
        this.f17906f = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final CampaignEx campaignEx, final int i9, final boolean z8) {
        if (!com.mbridge.msdk.splash.c.d.a(this.m, campaignEx)) {
            if (i9 > 0) {
                this.f17909i.f17810o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.d.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.b(campaignEx, i9 - 1, z8);
                    }
                }, 1L);
                return;
            }
            d dVar = this.l;
            if (dVar != null) {
                dVar.a(this.f17905e, "campaignEx is not ready");
                return;
            }
            return;
        }
        d(true);
        ViewGroup.LayoutParams layoutParams = this.f17912n.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f17912n.setLayoutParams(layoutParams);
        this.f17912n.removeAllViews();
        this.f17909i.a(this.f17906f);
        this.f17909i.a(this.f17916r);
        this.f17909i.a(this.l);
        ad.b(b, "start show process");
        ViewGroup viewGroup = this.f17912n;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ar.a(this.m);
            this.f17912n.addView(this.m);
        }
        this.f17909i.a(this.f17918t);
        this.f17909i.a(campaignEx, this.m);
    }

    public final void a(String str, Activity activity) {
        ViewGroup a6 = a(activity);
        if (a6 == null) {
            if (this.f17910j != null) {
                this.f17910j.a(new com.mbridge.msdk.foundation.c.b(880036), 1);
                return;
            }
            return;
        }
        a(str, a6);
    }

    public final void d(boolean z8) {
        MBSplashView mBSplashView = this.m;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z8);
        }
    }

    public final void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f17910j != null) {
                this.f17910j.a(new com.mbridge.msdk.foundation.c.b(880035), 1);
                return;
            }
            return;
        }
        b(str, viewGroup);
    }

    public final void a(int i9, int i10) {
        b(i10, i9);
    }

    public final void a(CampaignEx campaignEx, int i9, boolean z8) {
        if (campaignEx != null && z8) {
            if (this.f17914p == null) {
                this.f17914p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17903c);
            }
            this.l = new d(this, this.f17911k, campaignEx);
        }
        ViewGroup viewGroup = this.f17912n;
        if (viewGroup == null) {
            d dVar = this.l;
            if (dVar != null) {
                dVar.a(this.f17905e, "container is null");
                return;
            }
            return;
        }
        if (this.f17909i == null) {
            this.f17909i = new f(viewGroup.getContext(), this.f17904d, this.f17903c);
        }
        this.f17899B = campaignEx;
        b(campaignEx, i9, z8);
    }

    private void b(int i9, int i10) {
        int i11 = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
        int g9 = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
        int i12 = this.f17919u;
        if (i12 == 1) {
            if (g9 >= i10 * 4) {
                this.f17921w = g9 - i10;
                this.f17920v = i11;
                return;
            } else {
                this.f17921w = 0;
                this.f17920v = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (i11 >= i9 * 4) {
                this.f17920v = i11 - i9;
                this.f17921w = g9;
            } else {
                this.f17921w = 0;
                this.f17920v = 0;
            }
        }
    }

    private void a(String str, int i9) {
        boolean z8;
        synchronized (this.f17922x) {
            try {
                if (this.f17915q) {
                    if (this.f17910j != null) {
                        this.f17910j.a(new com.mbridge.msdk.foundation.c.b(880016, "current unit is loading"), i9);
                        this.f17915q = true;
                    }
                    return;
                }
                this.f17915q = true;
                int i10 = this.f17906f;
                if (i10 >= 2 && i10 <= 10) {
                    if (this.f17920v != 0 && this.f17921w != 0) {
                        try {
                            z8 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
                        } catch (Exception unused) {
                            z8 = false;
                        }
                        if (!z8) {
                            if (this.f17910j != null) {
                                this.f17910j.a(new com.mbridge.msdk.foundation.c.b(880029), i9);
                                return;
                            }
                            return;
                        }
                        this.m.clearResState();
                        this.f17914p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17903c);
                        if (this.f17908h == null) {
                            this.f17908h = new e(this.f17904d, this.f17903c, this.f17907g * 1000);
                        }
                        b bVar = this.f17910j;
                        if (bVar != null) {
                            bVar.a(str);
                            this.f17908h.a(this.f17910j);
                        }
                        this.m.resetLoadState();
                        this.f17908h.a(this.f17906f);
                        this.f17908h.a(this.m);
                        this.f17908h.a(this.f17914p);
                        this.f17908h.a(this.f17920v, this.f17921w);
                        this.f17908h.a(this.f17918t);
                        this.f17908h.b(this.f17919u);
                        this.f17908h.a(str, i9);
                        return;
                    }
                    if (this.f17910j != null) {
                        this.f17910j.a(new com.mbridge.msdk.foundation.c.b(880028), i9);
                        return;
                    }
                    return;
                }
                if (this.f17910j != null) {
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880037);
                    bVar2.a("countDownTime must in 2 - 10");
                    this.f17910j.a(bVar2, i9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f17913o = view;
        if (view != null) {
            b(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.m;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public final ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.m().c(), new BaseSplashPopView.a(this.f17904d, this.f17903c, zoomOutTypeEnum.getIndex(), this.f17899B), this.l);
        this.f17900C = mBSplashPopView;
        return mBSplashPopView;
    }

    private ViewGroup a(Activity activity) {
        Throwable th;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            ad.d(b, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
            try {
                try {
                    return (ViewGroup) viewGroup.getChildAt(0);
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    return viewGroup;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th3) {
            th = th3;
            viewGroup = null;
        }
    }

    public final void a(int i9, int i10, int i11, int i12) {
        try {
            MBSplashView mBSplashView = this.m;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i9, i10, i11, i12);
            }
        } catch (Throwable th) {
            ad.b(b, th.getMessage());
        }
    }
}
