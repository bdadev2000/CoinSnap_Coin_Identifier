package com.mbridge.msdk.mbbanner.common.f;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.f.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends c<JSONObject> {
    private static final String a = "a";

    /* renamed from: b, reason: collision with root package name */
    private String f13884b = "";

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        ad.c(a, "onFailed errorCode = " + aVar.a);
        a(aVar.a, com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(d<JSONObject> dVar) {
        super.onSuccess(dVar);
        List<h> list = dVar.f13366b.f13368b;
        final JSONObject jSONObject = dVar.f13367c;
        ad.c(a, "parseLoad content = " + jSONObject);
        final int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == optInt) {
            calcRequestTime(System.currentTimeMillis());
            final String optString = jSONObject.optString("version");
            b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.f.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    final CampaignUnit parseCampaignUnit;
                    if ("v5".equals(optString)) {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), a.this.f13884b);
                    } else {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), a.this.f13884b);
                    }
                    b.c().post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.f.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            CampaignUnit campaignUnit = parseCampaignUnit;
                            if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit.getAds().size() > 0) {
                                a.this.a(parseCampaignUnit);
                                if (!TextUtils.isEmpty(a.this.f13884b)) {
                                    a.this.saveHbState(1);
                                }
                                a.this.saveRequestTime(parseCampaignUnit.getAds().size());
                                return;
                            }
                            CampaignUnit campaignUnit2 = parseCampaignUnit;
                            if (campaignUnit2 != null) {
                                str = campaignUnit2.getMsg();
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.this.a(optInt, str);
                        }
                    });
                }
            });
            return;
        }
        a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }

    public final void a(String str) {
        this.f13884b = str;
    }
}
