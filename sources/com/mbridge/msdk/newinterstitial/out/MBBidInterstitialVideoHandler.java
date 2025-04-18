package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f14270b;

    /* renamed from: c, reason: collision with root package name */
    private String f14271c;

    /* renamed from: d, reason: collision with root package name */
    private String f14272d;

    /* renamed from: e, reason: collision with root package name */
    private String f14273e;

    /* renamed from: f, reason: collision with root package name */
    private a f14274f;

    /* renamed from: g, reason: collision with root package name */
    private d f14275g;

    /* renamed from: i, reason: collision with root package name */
    private NewInterstitialListener f14277i;
    public String mUnitId;

    /* renamed from: o, reason: collision with root package name */
    private int f14283o;

    /* renamed from: p, reason: collision with root package name */
    private int f14284p;

    /* renamed from: q, reason: collision with root package name */
    private int f14285q;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14276h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f14278j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14279k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14280l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14281m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14282n = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        this.mUnitId = str2;
        this.a = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f14274f == null) {
                a aVar = new a();
                this.f14274f = aVar;
                aVar.a(true);
                this.f14274f.b(true);
                this.f14274f.b(str, str2);
            }
        } catch (Throwable th2) {
            ad.b("MBBidInterstitialVideoHandler", th2.getMessage(), th2);
        }
    }

    private void b(String str, String str2) {
        if (this.f14275g == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f14275g = new d(287, str, str2, true);
        }
    }

    private void c() {
        if (this.f14275g == null) {
            b(this.a, this.mUnitId);
        }
        d();
    }

    private void d() {
        if (this.f14279k) {
            d dVar = this.f14275g;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f14277i));
            }
            this.f14279k = false;
        }
        if (this.f14282n) {
            MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, this.f14271c, this.f14270b, this.f14272d, this.f14273e);
            this.f14282n = false;
        }
        d dVar2 = this.f14275g;
        if (dVar2 != null) {
            dVar2.a(this.f14283o, this.f14285q, this.f14284p);
            this.f14275g.a(this.f14278j);
        }
    }

    public void clearVideoCache() {
        if (this.f14276h) {
            return;
        }
        try {
            if (this.f14274f != null) {
                ab.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f14276h) {
            d dVar = this.f14275g;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f14274f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f14276h) {
            d dVar = this.f14275g;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f14274f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f14276h) {
            d dVar = this.f14275g;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f14274f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f14276h = a;
        if (a) {
            c();
            d dVar = this.f14275g;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f14274f != null) {
            this.f14274f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f14276h = a;
        if (a) {
            c();
            d dVar = this.f14275g;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f14274f != null) {
            this.f14274f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f14278j = i10;
        if (this.f14276h) {
            d dVar = this.f14275g;
            if (dVar != null) {
                dVar.a(i10);
                return;
            }
            return;
        }
        a aVar = this.f14274f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f14271c = str;
        this.f14270b = str2;
        this.f14272d = str3;
        this.f14273e = str4;
        this.f14282n = true;
        this.f14281m = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f14283o = i10;
        this.f14284p = i11;
        this.f14285q = com.mbridge.msdk.foundation.same.a.J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f14277i = newInterstitialListener;
        this.f14279k = true;
        this.f14280l = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f14277i = newInterstitialListener;
        this.f14279k = true;
        this.f14280l = true;
    }

    public void showFromBid() {
        if (this.f14276h) {
            c();
            d dVar = this.f14275g;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f14274f != null) {
            this.f14274f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, false, -1));
        }
    }

    private void b() {
        if (this.f14280l) {
            a aVar = this.f14274f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f14277i));
            }
            this.f14280l = false;
        }
        if (this.f14281m) {
            a aVar2 = this.f14274f;
            if (aVar2 != null) {
                aVar2.a(this.f14271c, this.f14270b, this.f14272d, this.f14273e);
            }
            this.f14281m = false;
        }
        a aVar3 = this.f14274f;
        if (aVar3 != null) {
            aVar3.a(this.f14283o, this.f14285q, this.f14284p);
            this.f14274f.a(this.f14278j);
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f14283o = i10;
        this.f14284p = (int) (d10 * 100.0d);
        this.f14285q = com.mbridge.msdk.foundation.same.a.I;
    }

    private void a() {
        if (this.f14274f == null) {
            a(this.a, this.mUnitId);
        }
        b();
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.mUnitId = str2;
        this.a = str;
    }
}
