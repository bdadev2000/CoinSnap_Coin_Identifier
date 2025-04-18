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

/* loaded from: classes4.dex */
public class a {
    protected Context a;

    /* renamed from: b, reason: collision with root package name */
    protected h f13434b;

    public a(h hVar) {
        this.f13434b = hVar;
        Context c10 = c.m().c();
        this.a = c10;
        if (this.f13434b != null && c10 != null) {
            int l10 = z.l(c10);
            this.f13434b.d(l10);
            this.f13434b.c(z.a(this.a, l10));
        }
    }

    public final void a() {
        if (this.f13434b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", this.f13434b.b());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f13434b.h());
                jSONObject.put("fb", this.f13434b.e());
                jSONObject.put("num", this.f13434b.c());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f13434b.a());
                jSONObject.put("timeout", this.f13434b.i());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f13434b.d());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f13434b.g());
                    jSONObject.put("network_str", this.f13434b.f());
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

    public final void b(int i10) {
        h hVar = this.f13434b;
        if (hVar != null) {
            hVar.a(i10);
        }
    }

    public final void c(int i10) {
        h hVar = this.f13434b;
        if (hVar != null) {
            hVar.c(i10);
        }
    }

    public final void b(String str) {
        h hVar = this.f13434b;
        if (hVar != null) {
            hVar.b(str);
        }
    }

    public final void a(int i10) {
        h hVar = this.f13434b;
        if (hVar != null) {
            hVar.b(i10);
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13434b.a(str);
    }
}
