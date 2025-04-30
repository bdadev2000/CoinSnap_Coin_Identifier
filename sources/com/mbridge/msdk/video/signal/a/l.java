package com.mbridge.msdk.video.signal.a;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class l extends d {

    /* renamed from: o, reason: collision with root package name */
    public boolean f19092o = true;

    private com.mbridge.msdk.click.a q() {
        if (this.l == null) {
            this.l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f19067j);
        }
        return this.l;
    }

    public final void a(JSONObject jSONObject) {
        try {
            jSONObject.put("device", new com.mbridge.msdk.foundation.tools.h(com.mbridge.msdk.foundation.controller.c.m().c()).a());
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignEx r4, android.content.Context r5) {
        /*
            r3 = this;
            java.lang.String r5 = r4.getNoticeUrl()
            r0 = 0
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.m     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = r5.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L1a
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1a
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L1a
            goto L1b
        L1a:
            r5 = r0
        L1b:
            com.mbridge.msdk.video.signal.a$a r1 = r3.m
            r2 = 2
            if (r5 != r2) goto L21
            r0 = 1
        L21:
            r1.a(r0)
            com.mbridge.msdk.click.a r5 = r3.q()
            com.mbridge.msdk.video.signal.a$a r0 = r3.m
            r5.a(r0)
            com.mbridge.msdk.click.a r5 = r3.q()
            r5.a(r4)
            com.mbridge.msdk.foundation.controller.c r5 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r5 = r5.c()
            com.mbridge.msdk.video.module.b.b.d(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.a.l.a(com.mbridge.msdk.foundation.entity.CampaignEx, android.content.Context):void");
    }
}
