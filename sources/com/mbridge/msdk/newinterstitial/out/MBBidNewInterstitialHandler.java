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

/* loaded from: classes3.dex */
public class MBBidNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f16870a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16871c;

    /* renamed from: d, reason: collision with root package name */
    private String f16872d;

    /* renamed from: e, reason: collision with root package name */
    private String f16873e;

    /* renamed from: f, reason: collision with root package name */
    private a f16874f;

    /* renamed from: g, reason: collision with root package name */
    private String f16875g;

    /* renamed from: h, reason: collision with root package name */
    private d f16876h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f16878j;

    /* renamed from: p, reason: collision with root package name */
    private int f16882p;

    /* renamed from: q, reason: collision with root package name */
    private int f16883q;

    /* renamed from: r, reason: collision with root package name */
    private int f16884r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16877i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f16879k = 2;
    private boolean l = false;
    private boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16880n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16881o = false;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e4 = ai.e(str2);
        if (!TextUtils.isEmpty(e4)) {
            ai.b(str2, e4);
        }
        this.f16870a = str;
        this.f16875g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f16874f == null) {
                a aVar = new a();
                this.f16874f = aVar;
                aVar.a(true);
                this.f16874f.b(true);
                this.f16874f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.b("MBBidNewInterstitialHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f16876h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f16876h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f16877i) {
            return;
        }
        try {
            if (this.f16874f != null) {
                ab.b();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f16877i) {
            d dVar = this.f16876h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f16874f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f16877i) {
            d dVar = this.f16876h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f16874f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f16877i) {
            d dVar = this.f16876h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f16874f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16877i = a6;
        if (a6) {
            b();
            d dVar = this.f16876h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f16874f != null) {
            this.f16874f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f16875g, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16877i = a6;
        if (a6) {
            b();
            d dVar = this.f16876h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f16874f != null) {
            this.f16874f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f16875g, true, 2));
        }
    }

    public void playVideoMute(int i9) {
        this.f16879k = i9;
        if (this.f16877i) {
            d dVar = this.f16876h;
            if (dVar != null) {
                dVar.a(i9);
                return;
            }
            return;
        }
        a aVar = this.f16874f;
        if (aVar != null) {
            aVar.a(i9);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f16871c = str;
        this.b = str2;
        this.f16872d = str3;
        this.f16873e = str4;
        this.f16880n = true;
        this.f16881o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f16875g, jSONObject);
    }

    public void setIVRewardEnable(int i9, int i10) {
        this.f16882p = i9;
        this.f16883q = i10;
        this.f16884r = com.mbridge.msdk.foundation.same.a.f15663J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16878j = newInterstitialListener;
        this.l = true;
        this.m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16878j = newInterstitialListener;
        this.l = true;
        this.m = true;
    }

    public void showFromBid() {
        if (this.f16877i) {
            b();
            d dVar = this.f16876h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f16874f != null) {
            this.f16874f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f16875g, false, -1));
        }
    }

    private void b() {
        if (this.f16876h == null) {
            b(this.f16870a, this.f16875g);
        }
        if (this.l) {
            d dVar = this.f16876h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f16878j));
            }
            this.l = false;
        }
        if (this.f16881o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f16875g, this.f16871c, this.b, this.f16872d, this.f16873e);
            this.f16881o = false;
        }
        d dVar2 = this.f16876h;
        if (dVar2 != null) {
            dVar2.a(this.f16879k);
            this.f16876h.a(this.f16882p, this.f16884r, this.f16883q);
        }
    }

    public void setIVRewardEnable(int i9, double d2) {
        this.f16882p = i9;
        this.f16883q = (int) (d2 * 100.0d);
        this.f16884r = com.mbridge.msdk.foundation.same.a.f15662I;
    }

    private void a() {
        if (this.f16874f == null) {
            a(this.f16870a, this.f16875g);
        }
        if (this.m) {
            a aVar = this.f16874f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f16878j, this.f16875g, true));
            }
            this.m = false;
        }
        if (this.f16880n) {
            a aVar2 = this.f16874f;
            if (aVar2 != null) {
                aVar2.a(this.f16871c, this.b, this.f16872d, this.f16873e);
            }
            this.f16880n = false;
        }
        a aVar3 = this.f16874f;
        if (aVar3 != null) {
            aVar3.a(this.f16879k);
            this.f16874f.a(this.f16882p, this.f16884r, this.f16883q);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        this.f16870a = str;
        this.f16875g = str2;
    }
}
