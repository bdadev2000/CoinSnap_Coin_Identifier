package com.mbridge.msdk.video.module.c;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.f.c;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes3.dex */
public class a extends c {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.f.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a("platform", "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a(CampaignEx.JSON_KEY_PACKAGE_NAME, z.e(this.mContext));
        eVar.a("app_version_name", z.p(this.mContext));
        eVar.a("app_version_code", z.q(this.mContext) + "");
        eVar.a("orientation", z.r(this.mContext) + "");
        eVar.a("model", z.h());
        eVar.a("brand", z.x());
        eVar.a("mnc", z.k(this.mContext));
        eVar.a("mcc", z.j(this.mContext));
        eVar.a("gaid", "");
        eVar.a("gaid2", com.mbridge.msdk.foundation.tools.e.b());
        int l = z.l(this.mContext);
        eVar.a("network_type", l + "");
        eVar.a("network_str", z.a(this.mContext, l) + "");
        eVar.a("language", z.s(this.mContext));
        eVar.a("timezone", z.y());
        eVar.a("useragent", z.g());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", z.i(this.mContext) + "x" + z.g(this.mContext));
    }
}
