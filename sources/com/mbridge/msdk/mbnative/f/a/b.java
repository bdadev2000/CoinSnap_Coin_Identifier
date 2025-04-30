package com.mbridge.msdk.mbnative.f.a;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b extends c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16570a = "b";
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f16571c;

    public abstract void a(int i9, String str);

    public final void a(String str) {
        this.f16571c = str;
    }

    public abstract void a(List<h> list, CampaignUnit campaignUnit);

    public final int b() {
        return this.b;
    }

    public abstract void b(List<Frame> list);

    public final void e(int i9) {
        this.b = i9;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        a(aVar.f15773a, com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(d<JSONObject> dVar) {
        com.mbridge.msdk.foundation.same.net.d.a aVar;
        CampaignUnit parseCampaignUnit;
        super.onSuccess(dVar);
        if (dVar != null && (aVar = dVar.b) != null) {
            int i9 = this.b;
            if (i9 == 0) {
                final List<h> list = aVar.b;
                final JSONObject jSONObject = dVar.f15778c;
                final int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt) {
                    calcRequestTime(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbnative.f.a.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            final CampaignUnit parseCampaignUnit2;
                            if ("v5".equals(optString)) {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
                            } else {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
                            }
                            com.mbridge.msdk.foundation.same.f.b.c().post(new Runnable() { // from class: com.mbridge.msdk.mbnative.f.a.b.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CampaignUnit campaignUnit = parseCampaignUnit2;
                                    if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit2.getAds().size() > 0) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        b.this.a(list, parseCampaignUnit2);
                                        b.this.saveRequestTime(parseCampaignUnit2.getAds().size());
                                    } else {
                                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                        b.this.a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                                    }
                                }
                            });
                        }
                    });
                    return;
                }
                a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
            if (i9 == 1) {
                List<h> list2 = aVar.b;
                JSONObject jSONObject2 = dVar.f15778c;
                int optInt2 = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt2) {
                    calcRequestTime(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
                    } else {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
                    }
                    if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                        b(parseCampaignUnit.getListFrames());
                        saveRequestTime(parseCampaignUnit.getListFrames().size());
                        return;
                    } else {
                        a(optInt2, jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE));
                        return;
                    }
                }
                a(optInt2, jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE));
            }
        }
    }

    public final String a() {
        return this.f16571c;
    }
}
