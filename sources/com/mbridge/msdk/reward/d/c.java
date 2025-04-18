package com.mbridge.msdk.reward.d;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {
    private static final String a = "c";

    /* renamed from: b, reason: collision with root package name */
    private int f15023b;

    /* renamed from: c, reason: collision with root package name */
    private String f15024c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f15025d;

    public abstract void a(List<Frame> list);

    public abstract void a(List<h> list, CampaignUnit campaignUnit);

    public abstract void b(int i10, String str, com.mbridge.msdk.foundation.same.report.d.b bVar);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        ad.b(a, "errorCode = " + aVar.a);
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(aVar.a, com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.e(aVar.f13364b);
        this.f15025d.a(bVar);
        b(aVar.a, com.mbridge.msdk.foundation.same.net.e.a.a(aVar), this.f15025d);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(d<JSONObject> dVar) {
        com.mbridge.msdk.foundation.same.net.d.a aVar;
        CampaignUnit parseCampaignUnit;
        String str;
        super.onSuccess(dVar);
        if (dVar != null && (aVar = dVar.f13366b) != null) {
            int i10 = this.f15023b;
            if (i10 == 0) {
                final List<h> list = aVar.f13368b;
                final JSONObject jSONObject = dVar.f13367c;
                final int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt) {
                    calcRequestTime(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            final CampaignUnit parseCampaignUnit2;
                            if ("v5".equals(optString)) {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), c.this.f15024c);
                            } else {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), c.this.f15024c);
                            }
                            com.mbridge.msdk.foundation.same.f.b.c().post(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str2;
                                    CampaignUnit campaignUnit = parseCampaignUnit2;
                                    if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit2.getAds().size() > 0) {
                                        parseCampaignUnit2.setMetricsData(c.this.f15025d);
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c.this.a(list, parseCampaignUnit2);
                                        c.this.saveRequestTime(parseCampaignUnit2.getAds().size());
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
                                    c cVar = c.this;
                                    cVar.b(optInt, str2, cVar.f15025d);
                                }
                            });
                        }
                    });
                    return;
                }
                a(list, jSONObject, optInt, this.f15025d);
                return;
            }
            if (i10 == 1) {
                List<h> list2 = aVar.f13368b;
                JSONObject jSONObject2 = dVar.f13367c;
                int optInt2 = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt2) {
                    calcRequestTime(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f15024c);
                    } else {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f15024c);
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
                        b(optInt2, str, this.f15025d);
                        return;
                    }
                }
                a(list2, jSONObject2, optInt2, this.f15025d);
            }
        }
    }

    public final void a(String str) {
        this.f15024c = str;
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        this.f15025d = bVar;
    }

    private void a(List<h> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.foundation.c.b b3;
        String str = "";
        if (list != null && list.size() > 0) {
            for (h hVar : list) {
                if (hVar != null) {
                    String a10 = hVar.a();
                    if (!TextUtils.isEmpty(a10) && a10.equals("data_res_type")) {
                        str = hVar.b();
                    }
                }
            }
        }
        String str2 = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(str) && str.equals("1")) {
            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880018, str2);
            if (bVar != null) {
                bVar.a(b10);
                bVar.b(true);
                if (TextUtils.isEmpty(str2)) {
                    str2 = b10.b();
                }
            }
            b(i10, str2, bVar);
            return;
        }
        if (i10 == -1) {
            b3 = com.mbridge.msdk.foundation.c.a.b(880017, str2);
        } else {
            b3 = com.mbridge.msdk.foundation.c.a.b(880003, str2);
        }
        if (bVar != null) {
            bVar.a(b3);
            bVar.b(false);
            if (TextUtils.isEmpty(str2)) {
                str2 = b3.b();
            }
        }
        b(i10, str2, bVar);
    }
}
