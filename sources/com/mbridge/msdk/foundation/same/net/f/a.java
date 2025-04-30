package com.mbridge.msdk.foundation.same.net.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes3.dex */
public class a extends c {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.f.c
    public void addExtraParams(String str, e eVar) {
        try {
            try {
                int a6 = ai.a();
                String c9 = ai.c();
                if (eVar != null) {
                    eVar.a("misk_spt", String.valueOf(a6));
                    if (!TextUtils.isEmpty(c9)) {
                        eVar.a("misk_spt_det", c9);
                    }
                }
            } catch (Exception e4) {
                ad.a("CampaignRequest", e4.getMessage());
            }
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}
