package com.mbridge.msdk.video.module.c;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.x;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.c.a, com.mbridge.msdk.foundation.same.net.f.c
    public final void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        if (L.f(h.a()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String b = x.b(jSONObject.toString());
                    if (!TextUtils.isEmpty(b)) {
                        eVar.a("dvi", b);
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }
}
