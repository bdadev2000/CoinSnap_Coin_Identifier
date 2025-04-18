package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBBidInterstitialVideoHandler {
    private a a;

    /* renamed from: b, reason: collision with root package name */
    private String f13728b;

    /* renamed from: c, reason: collision with root package name */
    private String f13729c;

    /* renamed from: d, reason: collision with root package name */
    private String f13730d;

    /* renamed from: e, reason: collision with root package name */
    private String f13731e;

    /* renamed from: f, reason: collision with root package name */
    private String f13732f;

    /* renamed from: g, reason: collision with root package name */
    private String f13733g;

    /* renamed from: h, reason: collision with root package name */
    private d f13734h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f13736j;

    /* renamed from: p, reason: collision with root package name */
    private int f13742p;

    /* renamed from: q, reason: collision with root package name */
    private int f13743q;

    /* renamed from: r, reason: collision with root package name */
    private int f13744r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13735i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f13737k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13738l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13739m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13740n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13741o = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        this.f13728b = str2;
        this.f13729c = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.a == null) {
                a aVar = new a();
                this.a = aVar;
                aVar.a(true);
                this.a.b(true);
                this.a.b(str, str2);
            }
        } catch (Throwable th2) {
            ad.b("MBBidRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    private void b(String str, String str2) {
        if (this.f13734h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f13734h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f13735i) {
            return;
        }
        try {
            if (this.a != null) {
                ab.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f13735i) {
            d dVar = this.f13734h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.a;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f13735i) {
            d dVar = this.f13734h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.a;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f13735i) {
            d dVar = this.f13734h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.a;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f13735i = a;
        if (a) {
            b();
            d dVar = this.f13734h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.a != null) {
            this.a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f13728b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f13735i = a;
        if (a) {
            b();
            d dVar = this.f13734h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.a != null) {
            this.a.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f13728b, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f13737k = i10;
        if (this.f13735i) {
            d dVar = this.f13734h;
            if (dVar != null) {
                dVar.a(i10);
                return;
            }
            return;
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f13730d = str;
        this.f13731e = str2;
        this.f13732f = str3;
        this.f13733g = str4;
        this.f13740n = true;
        this.f13741o = true;
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f13742p = i10;
        this.f13743q = i11;
        this.f13744r = com.mbridge.msdk.foundation.same.a.J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f13736j = interstitialVideoListener;
        this.f13739m = true;
        this.f13738l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f13736j = interstitialVideoListener;
        this.f13739m = true;
        this.f13738l = true;
    }

    public void showFromBid() {
        if (this.f13735i) {
            b();
            d dVar = this.f13734h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.a != null) {
            this.a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f13728b, false, -1));
        }
    }

    private void b() {
        if (this.f13734h == null) {
            b(this.f13729c, this.f13728b);
        }
        if (this.f13738l) {
            d dVar = this.f13734h;
            if (dVar != null) {
                dVar.a(new InterstitialVideoListenerWrapper(this.f13736j));
            }
            this.f13738l = false;
        }
        if (this.f13741o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f13728b, this.f13730d, this.f13731e, this.f13732f, this.f13733g);
            this.f13741o = false;
        }
        d dVar2 = this.f13734h;
        if (dVar2 != null) {
            dVar2.a(this.f13742p, this.f13744r, this.f13743q);
            this.f13734h.a(this.f13737k);
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f13742p = i10;
        this.f13743q = (int) (d10 * 100.0d);
        this.f13744r = com.mbridge.msdk.foundation.same.a.I;
    }

    private void a() {
        if (this.a == null) {
            a(this.f13729c, this.f13728b);
        }
        if (this.f13739m) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f13736j, this.f13728b, true));
            }
            this.f13739m = false;
        }
        if (this.f13740n) {
            a aVar2 = this.a;
            if (aVar2 != null) {
                aVar2.a(this.f13730d, this.f13731e, this.f13732f, this.f13733g);
            }
            this.f13740n = false;
        }
        a aVar3 = this.a;
        if (aVar3 != null) {
            aVar3.a(this.f13742p, this.f13744r, this.f13743q);
            this.a.a(this.f13737k);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.f13728b = str2;
        this.f13729c = str;
    }
}
