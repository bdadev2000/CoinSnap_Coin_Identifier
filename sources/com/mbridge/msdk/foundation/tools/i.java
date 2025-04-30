package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class i extends c {

    /* renamed from: w, reason: collision with root package name */
    public int f16064w;

    /* renamed from: x, reason: collision with root package name */
    public int f16065x;

    public i(Context context) {
        super(context);
        this.f16065x = z.o();
        this.f16064w = z.f();
    }

    @Override // com.mbridge.msdk.foundation.tools.c
    public JSONObject a() {
        JSONObject a6 = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f16065x + "");
                jSONObject.put("dmf", this.f16064w);
            }
        } catch (JSONException e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DomainDeviceInfo", e4.getMessage());
            }
        }
        return a6;
    }
}
