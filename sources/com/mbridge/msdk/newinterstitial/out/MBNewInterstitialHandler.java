package com.mbridge.msdk.newinterstitial.out;

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
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBNewInterstitialHandler implements BaseExtraInterfaceForHandler {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f14303b;

    /* renamed from: c, reason: collision with root package name */
    private String f14304c;

    /* renamed from: d, reason: collision with root package name */
    private String f14305d;

    /* renamed from: e, reason: collision with root package name */
    private String f14306e;

    /* renamed from: f, reason: collision with root package name */
    private a f14307f;

    /* renamed from: g, reason: collision with root package name */
    private String f14308g;

    /* renamed from: h, reason: collision with root package name */
    private d f14309h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f14311j;

    /* renamed from: p, reason: collision with root package name */
    private int f14317p;

    /* renamed from: q, reason: collision with root package name */
    private int f14318q;

    /* renamed from: r, reason: collision with root package name */
    private int f14319r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14310i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f14312k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14313l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14314m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14315n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14316o = false;

    public MBNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        this.a = str;
        this.f14308g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f14307f == null) {
                a aVar = new a();
                this.f14307f = aVar;
                aVar.a(true);
                this.f14307f.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    private void b(String str, String str2) {
        if (this.f14309h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f14309h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f14310i) {
            return;
        }
        try {
            if (this.f14307f != null) {
                ab.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f14310i) {
            d dVar = this.f14309h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f14307f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f14310i) {
            d dVar = this.f14309h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f14307f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f14310i) {
            d dVar = this.f14309h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f14307f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f14310i = a;
        if (a) {
            b();
            d dVar = this.f14309h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f14307f != null) {
            this.f14307f.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f14308g, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a = b.a().a("new_bridge_reward_video");
        this.f14310i = a;
        if (a) {
            b();
            d dVar = this.f14309h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f14307f != null) {
            this.f14307f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f14308g, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f14312k = i10;
        if (this.f14310i) {
            d dVar = this.f14309h;
            if (dVar != null) {
                dVar.a(i10);
                return;
            }
            return;
        }
        a aVar = this.f14307f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f14303b = str;
        this.f14304c = str2;
        this.f14305d = str3;
        this.f14306e = str4;
        this.f14315n = true;
        this.f14316o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f14308g, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f14317p = i10;
        this.f14318q = i11;
        this.f14319r = com.mbridge.msdk.foundation.same.a.J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f14311j = newInterstitialListener;
        this.f14313l = true;
        this.f14314m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f14311j = newInterstitialListener;
        this.f14313l = true;
        this.f14314m = true;
    }

    public void show() {
        if (this.f14310i) {
            b();
            d dVar = this.f14309h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f14307f != null) {
            this.f14307f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f14308g, false, -1));
        }
    }

    private void b() {
        if (this.f14309h == null) {
            b(this.a, this.f14308g);
        }
        if (this.f14313l) {
            d dVar = this.f14309h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f14311j));
            }
            this.f14313l = false;
        }
        if (this.f14316o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f14308g, this.f14303b, this.f14304c, this.f14305d, this.f14306e);
            this.f14316o = false;
        }
        d dVar2 = this.f14309h;
        if (dVar2 != null) {
            dVar2.a(this.f14317p, this.f14319r, this.f14318q);
            this.f14309h.a(this.f14312k);
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f14317p = i10;
        this.f14318q = (int) (d10 * 100.0d);
        this.f14319r = com.mbridge.msdk.foundation.same.a.I;
    }

    private void a() {
        if (this.f14307f == null) {
            a(this.a, this.f14308g);
        }
        if (this.f14314m) {
            a aVar = this.f14307f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f14311j, this.f14308g, false));
            }
            this.f14314m = false;
        }
        if (this.f14315n) {
            a aVar2 = this.f14307f;
            if (aVar2 != null) {
                aVar2.a(this.f14303b, this.f14304c, this.f14305d, this.f14306e);
            }
            this.f14315n = false;
        }
        a aVar3 = this.f14307f;
        if (aVar3 != null) {
            aVar3.a(this.f14317p, this.f14319r, this.f14318q);
            this.f14307f.a(this.f14312k);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        this.a = str;
        this.f14308g = str2;
    }
}
