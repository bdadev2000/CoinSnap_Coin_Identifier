package com.mbridge.msdk.splash.f;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {
    private static final String a = "d";

    /* renamed from: b, reason: collision with root package name */
    private int f15234b;

    /* renamed from: c, reason: collision with root package name */
    private String f15235c;

    public abstract void a(List<Frame> list);

    public abstract void a(List<h> list, CampaignUnit campaignUnit);

    public abstract void b(int i10, String str);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        ad.b(a, "errorCode = " + aVar.a);
        b(aVar.a, com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.d<JSONObject> dVar) {
        com.mbridge.msdk.foundation.same.net.d.a aVar;
        CampaignUnit parseCampaignUnit;
        String str;
        super.onSuccess(dVar);
        if (dVar != null && (aVar = dVar.f13366b) != null) {
            int i10 = this.f15234b;
            if (i10 == 0) {
                final List<h> list = aVar.f13368b;
                final JSONObject jSONObject = dVar.f13367c;
                final int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt) {
                    calcRequestTime(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.splash.f.d.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            final CampaignUnit parseCampaignUnit2;
                            if ("v5".equals(optString)) {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), d.this.f15235c);
                            } else {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), d.this.f15235c);
                            }
                            com.mbridge.msdk.foundation.same.f.b.c().post(new Runnable() { // from class: com.mbridge.msdk.splash.f.d.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str2;
                                    CampaignUnit campaignUnit = parseCampaignUnit2;
                                    if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit2.getAds().size() > 0) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        d.this.a(list, parseCampaignUnit2);
                                        d.this.saveRequestTime(parseCampaignUnit2.getAds().size());
                                        return;
                                    }
                                    CampaignUnit campaignUnit2 = parseCampaignUnit2;
                                    if (campaignUnit2 != null) {
                                        str2 = campaignUnit2.getMsg();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                                    }
                                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                    d.this.b(optInt, str2);
                                }
                            });
                        }
                    });
                    return;
                }
                b(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
            if (i10 == 1) {
                List<h> list2 = aVar.f13368b;
                JSONObject jSONObject2 = dVar.f13367c;
                int optInt2 = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt2) {
                    calcRequestTime(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f15235c);
                    } else {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f15235c);
                    }
                    if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                        List<Frame> listFrames = parseCampaignUnit.getListFrames();
                        a(listFrames);
                        saveRequestTime(listFrames.size());
                        return;
                    } else {
                        if (parseCampaignUnit != null) {
                            str = parseCampaignUnit.getMsg();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        b(optInt2, str);
                        return;
                    }
                }
                b(optInt2, jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE));
            }
        }
    }

    public final void a(String str) {
        this.f15235c = str;
    }
}
