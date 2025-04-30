package com.mbridge.msdk.foundation.same.report.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.tracker.e;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f15869a;
    protected h b;

    public a(h hVar) {
        this.b = hVar;
        Context c9 = c.m().c();
        this.f15869a = c9;
        if (this.b != null && c9 != null) {
            int l = z.l(c9);
            this.b.d(l);
            this.b.c(z.a(this.f15869a, l));
        }
    }

    public final void a() {
        if (this.b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", this.b.b());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.b.h());
                jSONObject.put("fb", this.b.e());
                jSONObject.put("num", this.b.c());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.b.a());
                jSONObject.put("timeout", this.b.i());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.b.d());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.b.g());
                    jSONObject.put("network_str", this.b.f());
                }
                e eVar = new e("2000006");
                eVar.b(0);
                eVar.a(0);
                eVar.a(jSONObject);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.c());
                com.mbridge.msdk.foundation.same.report.d.c.a().c().a(eVar);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(int i9) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(i9);
        }
    }

    public final void c(int i9) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.c(i9);
        }
    }

    public final void b(String str) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.b(str);
        }
    }

    public final void a(int i9) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.b(i9);
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.a(str);
    }
}
