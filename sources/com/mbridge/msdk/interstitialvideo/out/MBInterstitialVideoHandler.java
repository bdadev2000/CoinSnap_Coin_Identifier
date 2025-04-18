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

/* loaded from: classes4.dex */
public class MBInterstitialVideoHandler {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private a f13745b;

    /* renamed from: c, reason: collision with root package name */
    private String f13746c;

    /* renamed from: d, reason: collision with root package name */
    private String f13747d;

    /* renamed from: e, reason: collision with root package name */
    private String f13748e;

    /* renamed from: f, reason: collision with root package name */
    private String f13749f;

    /* renamed from: g, reason: collision with root package name */
    private String f13750g;

    /* renamed from: h, reason: collision with root package name */
    private d f13751h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f13753j;

    /* renamed from: p, reason: collision with root package name */
    private int f13759p;

    /* renamed from: q, reason: collision with root package name */
    private int f13760q;

    /* renamed from: r, reason: collision with root package name */
    private int f13761r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13752i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f13754k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13755l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13756m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13757n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13758o = false;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        this.a = str;
        this.f13746c = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f13745b == null) {
                a aVar = new a();
                this.f13745b = aVar;
                aVar.a(true);
                this.f13745b.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    private void b(String str, String str2) {
        if (this.f13751h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f13751h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f13752i) {
            return;
        }
        try {
            if (this.f13745b != null) {
                ab.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f13752i) {
            d dVar = this.f13751h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f13745b;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f13752i) {
            d dVar = this.f13751h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f13745b;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f13752i) {
            d dVar = this.f13751h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f13745b;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f13752i = a;
        if (a) {
            b();
            d dVar = this.f13751h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f13745b != null) {
            this.f13745b.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f13746c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f13752i = a;
        if (a) {
            b();
            d dVar = this.f13751h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f13745b != null) {
            this.f13745b.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f13746c, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f13754k = i10;
        if (this.f13752i) {
            d dVar = this.f13751h;
            if (dVar != null) {
                dVar.a(i10);
                return;
            }
            return;
        }
        a aVar = this.f13745b;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f13747d = str;
        this.f13748e = str2;
        this.f13749f = str3;
        this.f13750g = str4;
        this.f13757n = true;
        this.f13758o = true;
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f13759p = i10;
        this.f13760q = i11;
        this.f13761r = com.mbridge.msdk.foundation.same.a.J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f13753j = interstitialVideoListener;
        this.f13756m = true;
        this.f13755l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f13753j = interstitialVideoListener;
        this.f13756m = true;
        this.f13755l = true;
    }

    public void show() {
        if (this.f13752i) {
            b();
            d dVar = this.f13751h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f13745b != null) {
            this.f13745b.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f13746c, false, -1));
        }
    }

    private void b() {
        if (this.f13751h == null) {
            b(this.a, this.f13746c);
        }
        if (this.f13755l) {
            this.f13751h.a(new InterstitialVideoListenerWrapper(this.f13753j));
            this.f13755l = false;
        }
        if (this.f13758o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f13746c, this.f13747d, this.f13748e, this.f13749f, this.f13750g);
            this.f13758o = false;
        }
        d dVar = this.f13751h;
        if (dVar != null) {
            dVar.a(this.f13759p, this.f13761r, this.f13760q);
            this.f13751h.a(this.f13754k);
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f13759p = i10;
        this.f13760q = (int) (d10 * 100.0d);
        this.f13761r = com.mbridge.msdk.foundation.same.a.I;
    }

    private void a() {
        if (this.f13745b == null) {
            a(this.a, this.f13746c);
        }
        if (this.f13756m) {
            this.f13745b.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f13753j, this.f13746c, false));
            this.f13756m = false;
        }
        if (this.f13757n) {
            this.f13745b.a(this.f13747d, this.f13748e, this.f13749f, this.f13750g);
            this.f13757n = false;
        }
        a aVar = this.f13745b;
        if (aVar != null) {
            aVar.a(this.f13759p, this.f13761r, this.f13760q);
            this.f13745b.a(this.f13754k);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        this.f13746c = str2;
        this.a = str;
    }
}
