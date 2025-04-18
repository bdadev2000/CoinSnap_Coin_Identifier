package com.mbridge.msdk.foundation.same.net.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public class h extends c {
    public h(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.f.c
    public void addExtraParams(String str, e eVar) {
        try {
            try {
                int a = ai.a();
                String c10 = ai.c();
                if (eVar != null) {
                    eVar.a("misk_spt", String.valueOf(a));
                    if (!TextUtils.isEmpty(c10)) {
                        eVar.a("misk_spt_det", c10);
                    }
                }
            } catch (Exception e2) {
                ad.a("CampaignRequest", e2.getMessage());
            }
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}
