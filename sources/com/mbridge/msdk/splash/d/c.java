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

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static String f15205b = "SplashProvider";
    private boolean A;
    private CampaignEx B;
    private MBSplashPopView C;

    /* renamed from: c, reason: collision with root package name */
    private String f15206c;

    /* renamed from: d, reason: collision with root package name */
    private String f15207d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeIds f15208e;

    /* renamed from: g, reason: collision with root package name */
    private long f15210g;

    /* renamed from: h, reason: collision with root package name */
    private e f15211h;

    /* renamed from: i, reason: collision with root package name */
    private f f15212i;

    /* renamed from: j, reason: collision with root package name */
    private b f15213j;

    /* renamed from: k, reason: collision with root package name */
    private MBSplashShowListener f15214k;

    /* renamed from: l, reason: collision with root package name */
    private d f15215l;

    /* renamed from: m, reason: collision with root package name */
    private MBSplashView f15216m;

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f15217n;

    /* renamed from: o, reason: collision with root package name */
    private View f15218o;

    /* renamed from: p, reason: collision with root package name */
    private k f15219p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f15220q;

    /* renamed from: r, reason: collision with root package name */
    private ViewGroup f15221r;

    /* renamed from: s, reason: collision with root package name */
    private j f15222s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15223t;

    /* renamed from: z, reason: collision with root package name */
    private Activity f15228z;

    /* renamed from: f, reason: collision with root package name */
    private int f15209f = 5;
    private int u = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f15224v = z.i(com.mbridge.msdk.foundation.controller.c.m().c());

    /* renamed from: w, reason: collision with root package name */
    private int f15225w = z.g(com.mbridge.msdk.foundation.controller.c.m().c());

    /* renamed from: x, reason: collision with root package name */
    private Object f15226x = new Object();

    /* renamed from: y, reason: collision with root package name */
    private Object f15227y = new Object();
    public boolean a = false;
    private boolean D = false;

    public c(Activity activity, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = str;
        }
        this.f15207d = str3;
        this.f15206c = str2;
        this.f15208e = new MBridgeIds(str, str2);
        this.f15228z = activity;
        if (this.f15212i == null) {
            if (activity != null) {
                this.f15212i = new f(activity, this.f15207d, this.f15206c);
            } else {
                this.f15212i = new f(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15207d, this.f15206c);
            }
        }
        if (this.f15216m == null) {
            if (activity != null) {
                this.f15216m = new MBSplashView(activity);
            } else {
                this.f15216m = new MBSplashView(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        }
        if (this.f15222s == null) {
            this.f15222s = new j();
        }
        this.f15222s.a(com.mbridge.msdk.foundation.controller.c.m().c(), com.mbridge.msdk.foundation.controller.c.m().k(), com.mbridge.msdk.foundation.controller.c.m().b(), this.f15206c);
    }

    public final long b() {
        return this.f15210g;
    }

    public final boolean c() {
        return this.f15223t;
    }

    public final int d() {
        return this.f15209f;
    }

    public final String e() {
        if (!this.a) {
            e eVar = this.f15211h;
            if (eVar != null) {
                return eVar.a();
            }
            return "";
        }
        f fVar = this.f15212i;
        if (fVar != null) {
            return fVar.a();
        }
        return "";
    }

    public final String f() {
        if (!this.a) {
            e eVar = this.f15211h;
            if (eVar != null) {
                return eVar.b();
            }
            return "";
        }
        f fVar = this.f15212i;
        if (fVar != null) {
            return fVar.b();
        }
        return "";
    }

    public final void g() {
        this.D = true;
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public final void h() {
        this.D = false;
        MBSplashShowListener mBSplashShowListener = this.f15214k;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f15207d, this.f15206c));
        }
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public final void i() {
        f fVar = this.f15212i;
        if (fVar != null) {
            fVar.c();
        }
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView != null && this.D) {
            mBSplashPopView.reStartCountDown();
        }
    }

    public final void j() {
        f fVar = this.f15212i;
        if (fVar != null) {
            fVar.d();
        }
        MBSplashPopView mBSplashPopView = this.C;
        if (mBSplashPopView != null && this.D) {
            mBSplashPopView.pauseCountDown();
        }
    }

    public final void k() {
        this.B = null;
        if (this.f15214k != null) {
            this.f15214k = null;
        }
        if (this.f15213j != null) {
            this.f15213j = null;
        }
        if (this.f15215l != null) {
            this.f15215l = null;
        }
        e eVar = this.f15211h;
        if (eVar != null) {
            eVar.c();
        }
        f fVar = this.f15212i;
        if (fVar != null) {
            fVar.e();
        }
        if (this.f15228z != null) {
            this.f15228z = null;
        }
    }

    public final void a(ViewGroup viewGroup) {
        this.f15221r = viewGroup;
    }

    public final void b(String str) {
        a(str, 1);
    }

    public final boolean c(String str) {
        return com.mbridge.msdk.splash.c.d.a(this.f15216m, this.f15207d, this.f15206c, str, this.f15223t, this.f15209f, false, true) != null;
    }

    public final void d(String str, Activity activity) {
        ViewGroup a = a(activity);
        if (a == null) {
            MBSplashShowListener mBSplashShowListener = this.f15214k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f15208e, "activity is except,please check it");
                return;
            }
            return;
        }
        d(str, a);
    }

    public final boolean a() {
        return this.f15220q;
    }

    public final void b(String str, Activity activity) {
        ViewGroup a = a(activity);
        if (a == null) {
            if (this.f15213j != null) {
                this.f15213j.a(new com.mbridge.msdk.foundation.c.b(880036), 1);
                return;
            }
            return;
        }
        b(str, a);
    }

    public final void c(String str, Activity activity) {
        ViewGroup a = a(activity);
        if (a == null) {
            MBSplashShowListener mBSplashShowListener = this.f15214k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f15208e, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, a);
    }

    public final void a(boolean z10) {
        this.f15220q = z10;
    }

    public final void a(int i10) {
        this.u = i10;
    }

    public final void a(long j3) {
        this.f15210g = j3;
    }

    public final void d(String str, ViewGroup viewGroup) {
        this.f15217n = viewGroup;
        MBSplashView mBSplashView = this.f15216m;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx a = com.mbridge.msdk.splash.c.d.a(this.f15216m, this.f15207d, this.f15206c, str, this.f15223t, this.f15209f, true, false);
        if (a != null) {
            if (this.f15219p == null) {
                this.f15219p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f15206c);
            }
            d dVar = new d(this, this.f15214k, a);
            this.f15215l = dVar;
            if (this.f15224v != 0 && this.f15225w != 0) {
                int i10 = this.f15209f;
                if (i10 >= 2 && i10 <= 10) {
                    a(a, this.f15219p.r(), false);
                    return;
                }
                dVar.a(this.f15208e, "countDownTime must in 2 - 10 ,but now is " + this.f15209f);
                return;
            }
            dVar.a(this.f15208e, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f15214k;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f15208e, "campaignEx is vali");
        }
    }

    public final void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f15213j == null) {
            this.f15213j = new b(this, this.f15208e);
        }
        this.f15213j.a(mBSplashLoadListener);
    }

    public final void c(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f15214k;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f15208e, "token is null or empty");
                return;
            }
            return;
        }
        d(str, viewGroup);
    }

    public final void b(String str, ViewGroup viewGroup) {
        this.f15217n = viewGroup;
        MBSplashView mBSplashView = this.f15216m;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public final void a(MBSplashShowListener mBSplashShowListener) {
        this.f15214k = mBSplashShowListener;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f15213j != null) {
                this.f15213j.a(new com.mbridge.msdk.foundation.c.b(880035), 1);
                return;
            }
            return;
        }
        a(str, 1);
    }

    public final void c(boolean z10) {
        this.A = z10;
    }

    public final void b(boolean z10) {
        this.f15223t = z10;
    }

    public final void b(int i10) {
        this.f15209f = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final CampaignEx campaignEx, final int i10, final boolean z10) {
        if (!com.mbridge.msdk.splash.c.d.a(this.f15216m, campaignEx)) {
            if (i10 > 0) {
                this.f15212i.f15130o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.d.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.b(campaignEx, i10 - 1, z10);
                    }
                }, 1L);
                return;
            }
            d dVar = this.f15215l;
            if (dVar != null) {
                dVar.a(this.f15208e, "campaignEx is not ready");
                return;
            }
            return;
        }
        d(true);
        ViewGroup.LayoutParams layoutParams = this.f15217n.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f15217n.setLayoutParams(layoutParams);
        this.f15217n.removeAllViews();
        this.f15212i.a(this.f15209f);
        this.f15212i.a(this.f15221r);
        this.f15212i.a(this.f15215l);
        ad.b(f15205b, "start show process");
        ViewGroup viewGroup = this.f15217n;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ar.a(this.f15216m);
            this.f15217n.addView(this.f15216m);
        }
        this.f15212i.a(this.f15223t);
        this.f15212i.a(campaignEx, this.f15216m);
    }

    public final void a(String str, Activity activity) {
        ViewGroup a = a(activity);
        if (a == null) {
            if (this.f15213j != null) {
                this.f15213j.a(new com.mbridge.msdk.foundation.c.b(880036), 1);
                return;
            }
            return;
        }
        a(str, a);
    }

    public final void d(boolean z10) {
        MBSplashView mBSplashView = this.f15216m;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    public final void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f15213j != null) {
                this.f15213j.a(new com.mbridge.msdk.foundation.c.b(880035), 1);
                return;
            }
            return;
        }
        b(str, viewGroup);
    }

    public final void a(int i10, int i11) {
        b(i11, i10);
    }

    public final void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f15219p == null) {
                this.f15219p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f15206c);
            }
            this.f15215l = new d(this, this.f15214k, campaignEx);
        }
        ViewGroup viewGroup = this.f15217n;
        if (viewGroup == null) {
            d dVar = this.f15215l;
            if (dVar != null) {
                dVar.a(this.f15208e, "container is null");
                return;
            }
            return;
        }
        if (this.f15212i == null) {
            this.f15212i = new f(viewGroup.getContext(), this.f15207d, this.f15206c);
        }
        this.B = campaignEx;
        b(campaignEx, i10, z10);
    }

    private void b(int i10, int i11) {
        int i12 = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
        int g10 = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
        int i13 = this.u;
        if (i13 == 1) {
            if (g10 >= i11 * 4) {
                this.f15225w = g10 - i11;
                this.f15224v = i12;
                return;
            } else {
                this.f15225w = 0;
                this.f15224v = 0;
                return;
            }
        }
        if (i13 == 2) {
            if (i12 >= i10 * 4) {
                this.f15224v = i12 - i10;
                this.f15225w = g10;
            } else {
                this.f15225w = 0;
                this.f15224v = 0;
            }
        }
    }

    private void a(String str, int i10) {
        boolean z10;
        synchronized (this.f15226x) {
            if (this.f15220q) {
                if (this.f15213j != null) {
                    this.f15213j.a(new com.mbridge.msdk.foundation.c.b(880016, "current unit is loading"), i10);
                    this.f15220q = true;
                }
                return;
            }
            this.f15220q = true;
            int i11 = this.f15209f;
            if (i11 >= 2 && i11 <= 10) {
                if (this.f15224v != 0 && this.f15225w != 0) {
                    try {
                        z10 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
                    } catch (Exception unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        if (this.f15213j != null) {
                            this.f15213j.a(new com.mbridge.msdk.foundation.c.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f15216m.clearResState();
                    this.f15219p = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f15206c);
                    if (this.f15211h == null) {
                        this.f15211h = new e(this.f15207d, this.f15206c, this.f15210g * 1000);
                    }
                    b bVar = this.f15213j;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f15211h.a(this.f15213j);
                    }
                    this.f15216m.resetLoadState();
                    this.f15211h.a(this.f15209f);
                    this.f15211h.a(this.f15216m);
                    this.f15211h.a(this.f15219p);
                    this.f15211h.a(this.f15224v, this.f15225w);
                    this.f15211h.a(this.f15223t);
                    this.f15211h.b(this.u);
                    this.f15211h.a(str, i10);
                    return;
                }
                if (this.f15213j != null) {
                    this.f15213j.a(new com.mbridge.msdk.foundation.c.b(880028), i10);
                    return;
                }
                return;
            }
            if (this.f15213j != null) {
                com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880037);
                bVar2.a("countDownTime must in 2 - 10");
                this.f15213j.a(bVar2, i10);
            }
        }
    }

    public final void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f15218o = view;
        if (view != null) {
            b(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f15216m;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public final ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.m().c(), new BaseSplashPopView.a(this.f15207d, this.f15206c, zoomOutTypeEnum.getIndex(), this.B), this.f15215l);
        this.C = mBSplashPopView;
        return mBSplashPopView;
    }

    private ViewGroup a(Activity activity) {
        Throwable th2;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            ad.d(f15205b, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
            try {
                try {
                    return (ViewGroup) viewGroup.getChildAt(0);
                } catch (Throwable th3) {
                    th2 = th3;
                    th2.printStackTrace();
                    return viewGroup;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th4) {
            th2 = th4;
            viewGroup = null;
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f15216m;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th2) {
            ad.b(f15205b, th2.getMessage());
        }
    }
}
