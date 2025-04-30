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

/* loaded from: classes3.dex */
public class MBNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f16885a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16886c;

    /* renamed from: d, reason: collision with root package name */
    private String f16887d;

    /* renamed from: e, reason: collision with root package name */
    private String f16888e;

    /* renamed from: f, reason: collision with root package name */
    private a f16889f;

    /* renamed from: g, reason: collision with root package name */
    private String f16890g;

    /* renamed from: h, reason: collision with root package name */
    private d f16891h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f16893j;

    /* renamed from: p, reason: collision with root package name */
    private int f16897p;

    /* renamed from: q, reason: collision with root package name */
    private int f16898q;

    /* renamed from: r, reason: collision with root package name */
    private int f16899r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16892i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f16894k = 2;
    private boolean l = false;
    private boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16895n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16896o = false;

    public MBNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e4 = ai.e(str2);
        if (!TextUtils.isEmpty(e4)) {
            ai.b(str2, e4);
        }
        this.f16885a = str;
        this.f16890g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f16889f == null) {
                a aVar = new a();
                this.f16889f = aVar;
                aVar.a(true);
                this.f16889f.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f16891h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f16891h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f16892i) {
            return;
        }
        try {
            if (this.f16889f != null) {
                ab.b();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f16892i) {
            d dVar = this.f16891h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f16889f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f16892i) {
            d dVar = this.f16891h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f16889f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f16892i) {
            d dVar = this.f16891h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f16889f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16892i = a6;
        if (a6) {
            b();
            d dVar = this.f16891h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f16889f != null) {
            this.f16889f.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f16890g, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a6 = b.a().a("new_bridge_reward_video");
        this.f16892i = a6;
        if (a6) {
            b();
            d dVar = this.f16891h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f16889f != null) {
            this.f16889f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f16890g, true, 1));
        }
    }

    public void playVideoMute(int i9) {
        this.f16894k = i9;
        if (this.f16892i) {
            d dVar = this.f16891h;
            if (dVar != null) {
                dVar.a(i9);
                return;
            }
            return;
        }
        a aVar = this.f16889f;
        if (aVar != null) {
            aVar.a(i9);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.b = str;
        this.f16886c = str2;
        this.f16887d = str3;
        this.f16888e = str4;
        this.f16895n = true;
        this.f16896o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f16890g, jSONObject);
    }

    public void setIVRewardEnable(int i9, int i10) {
        this.f16897p = i9;
        this.f16898q = i10;
        this.f16899r = com.mbridge.msdk.foundation.same.a.f15663J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16893j = newInterstitialListener;
        this.l = true;
        this.m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16893j = newInterstitialListener;
        this.l = true;
        this.m = true;
    }

    public void show() {
        if (this.f16892i) {
            b();
            d dVar = this.f16891h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f16889f != null) {
            this.f16889f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f16890g, false, -1));
        }
    }

    private void b() {
        if (this.f16891h == null) {
            b(this.f16885a, this.f16890g);
        }
        if (this.l) {
            d dVar = this.f16891h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f16893j));
            }
            this.l = false;
        }
        if (this.f16896o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f16890g, this.b, this.f16886c, this.f16887d, this.f16888e);
            this.f16896o = false;
        }
        d dVar2 = this.f16891h;
        if (dVar2 != null) {
            dVar2.a(this.f16897p, this.f16899r, this.f16898q);
            this.f16891h.a(this.f16894k);
        }
    }

    public void setIVRewardEnable(int i9, double d2) {
        this.f16897p = i9;
        this.f16898q = (int) (d2 * 100.0d);
        this.f16899r = com.mbridge.msdk.foundation.same.a.f15662I;
    }

    private void a() {
        if (this.f16889f == null) {
            a(this.f16885a, this.f16890g);
        }
        if (this.m) {
            a aVar = this.f16889f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f16893j, this.f16890g, false));
            }
            this.m = false;
        }
        if (this.f16895n) {
            a aVar2 = this.f16889f;
            if (aVar2 != null) {
                aVar2.a(this.b, this.f16886c, this.f16887d, this.f16888e);
            }
            this.f16895n = false;
        }
        a aVar3 = this.f16889f;
        if (aVar3 != null) {
            aVar3.a(this.f16897p, this.f16899r, this.f16898q);
            this.f16889f.a(this.f16894k);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        this.f16885a = str;
        this.f16890g = str2;
    }
}
