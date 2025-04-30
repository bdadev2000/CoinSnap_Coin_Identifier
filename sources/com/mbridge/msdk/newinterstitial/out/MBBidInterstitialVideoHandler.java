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
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f16856a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16857c;

    /* renamed from: d, reason: collision with root package name */
    private String f16858d;

    /* renamed from: e, reason: collision with root package name */
    private String f16859e;

    /* renamed from: f, reason: collision with root package name */
    private a f16860f;

    /* renamed from: g, reason: collision with root package name */
    private d f16861g;

    /* renamed from: i, reason: collision with root package name */
    private NewInterstitialListener f16863i;
    public String mUnitId;

    /* renamed from: o, reason: collision with root package name */
    private int f16867o;

    /* renamed from: p, reason: collision with root package name */
    private int f16868p;

    /* renamed from: q, reason: collision with root package name */
    private int f16869q;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16862h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f16864j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16865k = false;
    private boolean l = false;
    private boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16866n = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e4 = ai.e(str2);
        if (!TextUtils.isEmpty(e4)) {
            ai.b(str2, e4);
        }
        this.mUnitId = str2;
        this.f16856a = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f16860f == null) {
                a aVar = new a();
                this.f16860f = aVar;
                aVar.a(true);
                this.f16860f.b(true);
                this.f16860f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.b("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f16861g == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f16861g = new d(287, str, str2, true);
        }
    }

    private void c() {
        if (this.f16861g == null) {
            b(this.f16856a, this.mUnitId);
        }
        d();
    }

    private void d() {
        if (this.f16865k) {
            d dVar = this.f16861g;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f16863i));
            }
            this.f16865k = false;
        }
        if (this.f16866n) {
            MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, this.f16857c, this.b, this.f16858d, this.f16859e);
            this.f16866n = false;
        }
        d dVar2 = this.f16861g;
        if (dVar2 != null) {
            dVar2.a(this.f16867o, this.f16869q, this.f16868p);
            this.f16861g.a(this.f16864j);
        }
    }

    public void clearVideoCache() {
        if (this.f16862h) {
            return;
        }
        try {
            if (this.f16860f != null) {
                ab.b();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f16862h) {
            d dVar = this.f16861g;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f16860f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f16862h) {
            d dVar = this.f16861g;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f16860f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f16862h) {
            d dVar = this.f16861g;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f16860f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16862h = a6;
        if (a6) {
            c();
            d dVar = this.f16861g;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f16860f != null) {
            this.f16860f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16862h = a6;
        if (a6) {
            c();
            d dVar = this.f16861g;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f16860f != null) {
            this.f16860f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i9) {
        this.f16864j = i9;
        if (this.f16862h) {
            d dVar = this.f16861g;
            if (dVar != null) {
                dVar.a(i9);
                return;
            }
            return;
        }
        a aVar = this.f16860f;
        if (aVar != null) {
            aVar.a(i9);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f16857c = str;
        this.b = str2;
        this.f16858d = str3;
        this.f16859e = str4;
        this.f16866n = true;
        this.m = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i9, int i10) {
        this.f16867o = i9;
        this.f16868p = i10;
        this.f16869q = com.mbridge.msdk.foundation.same.a.f15663J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16863i = newInterstitialListener;
        this.f16865k = true;
        this.l = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16863i = newInterstitialListener;
        this.f16865k = true;
        this.l = true;
    }

    public void showFromBid() {
        if (this.f16862h) {
            c();
            d dVar = this.f16861g;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f16860f != null) {
            this.f16860f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.mUnitId, false, -1));
        }
    }

    private void b() {
        if (this.l) {
            a aVar = this.f16860f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f16863i));
            }
            this.l = false;
        }
        if (this.m) {
            a aVar2 = this.f16860f;
            if (aVar2 != null) {
                aVar2.a(this.f16857c, this.b, this.f16858d, this.f16859e);
            }
            this.m = false;
        }
        a aVar3 = this.f16860f;
        if (aVar3 != null) {
            aVar3.a(this.f16867o, this.f16869q, this.f16868p);
            this.f16860f.a(this.f16864j);
        }
    }

    public void setIVRewardEnable(int i9, double d2) {
        this.f16867o = i9;
        this.f16868p = (int) (d2 * 100.0d);
        this.f16869q = com.mbridge.msdk.foundation.same.a.f15662I;
    }

    private void a() {
        if (this.f16860f == null) {
            a(this.f16856a, this.mUnitId);
        }
        b();
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.mUnitId = str2;
        this.f16856a = str;
    }
}
