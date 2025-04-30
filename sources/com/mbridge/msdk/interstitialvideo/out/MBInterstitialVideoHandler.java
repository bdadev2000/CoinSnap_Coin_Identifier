package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes3.dex */
public class MBInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f16198a;
    private a b;

    /* renamed from: c, reason: collision with root package name */
    private String f16199c;

    /* renamed from: d, reason: collision with root package name */
    private String f16200d;

    /* renamed from: e, reason: collision with root package name */
    private String f16201e;

    /* renamed from: f, reason: collision with root package name */
    private String f16202f;

    /* renamed from: g, reason: collision with root package name */
    private String f16203g;

    /* renamed from: h, reason: collision with root package name */
    private d f16204h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f16206j;

    /* renamed from: p, reason: collision with root package name */
    private int f16210p;

    /* renamed from: q, reason: collision with root package name */
    private int f16211q;

    /* renamed from: r, reason: collision with root package name */
    private int f16212r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16205i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f16207k = 2;
    private boolean l = false;
    private boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16208n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16209o = false;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e4 = ai.e(str2);
        if (!TextUtils.isEmpty(e4)) {
            ai.b(str2, e4);
        }
        this.f16198a = str;
        this.f16199c = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.b == null) {
                a aVar = new a();
                this.b = aVar;
                aVar.a(true);
                this.b.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f16204h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f16204h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f16205i) {
            return;
        }
        try {
            if (this.b != null) {
                ab.b();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f16205i) {
            d dVar = this.f16204h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.b;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f16205i) {
            d dVar = this.f16204h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.b;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f16205i) {
            d dVar = this.f16204h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.b;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16205i = a6;
        if (a6) {
            b();
            d dVar = this.f16204h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.b != null) {
            this.b.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f16199c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16205i = a6;
        if (a6) {
            b();
            d dVar = this.f16204h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.b != null) {
            this.b.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f16199c, true, 1));
        }
    }

    public void playVideoMute(int i9) {
        this.f16207k = i9;
        if (this.f16205i) {
            d dVar = this.f16204h;
            if (dVar != null) {
                dVar.a(i9);
                return;
            }
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i9);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f16200d = str;
        this.f16201e = str2;
        this.f16202f = str3;
        this.f16203g = str4;
        this.f16208n = true;
        this.f16209o = true;
    }

    public void setIVRewardEnable(int i9, int i10) {
        this.f16210p = i9;
        this.f16211q = i10;
        this.f16212r = com.mbridge.msdk.foundation.same.a.f15663J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f16206j = interstitialVideoListener;
        this.m = true;
        this.l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f16206j = interstitialVideoListener;
        this.m = true;
        this.l = true;
    }

    public void show() {
        if (this.f16205i) {
            b();
            d dVar = this.f16204h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.b != null) {
            this.b.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f16199c, false, -1));
        }
    }

    private void b() {
        if (this.f16204h == null) {
            b(this.f16198a, this.f16199c);
        }
        if (this.l) {
            this.f16204h.a(new InterstitialVideoListenerWrapper(this.f16206j));
            this.l = false;
        }
        if (this.f16209o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f16199c, this.f16200d, this.f16201e, this.f16202f, this.f16203g);
            this.f16209o = false;
        }
        d dVar = this.f16204h;
        if (dVar != null) {
            dVar.a(this.f16210p, this.f16212r, this.f16211q);
            this.f16204h.a(this.f16207k);
        }
    }

    public void setIVRewardEnable(int i9, double d2) {
        this.f16210p = i9;
        this.f16211q = (int) (d2 * 100.0d);
        this.f16212r = com.mbridge.msdk.foundation.same.a.f15662I;
    }

    private void a() {
        if (this.b == null) {
            a(this.f16198a, this.f16199c);
        }
        if (this.m) {
            this.b.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f16206j, this.f16199c, false));
            this.m = false;
        }
        if (this.f16208n) {
            this.b.a(this.f16200d, this.f16201e, this.f16202f, this.f16203g);
            this.f16208n = false;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.f16210p, this.f16212r, this.f16211q);
            this.b.a(this.f16207k);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        this.f16199c = str2;
        this.f16198a = str;
    }
}
