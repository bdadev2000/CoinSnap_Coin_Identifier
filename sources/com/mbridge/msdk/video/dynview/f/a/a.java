package com.mbridge.msdk.video.dynview.f.a;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private int f18609a;
    private String b;

    public abstract void a(int i9, String str);

    public abstract void a(List<h> list, CampaignUnit campaignUnit);

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
        String str;
        super.onSuccess(dVar);
        if (dVar != null && (aVar = dVar.b) != null && this.f18609a == 0) {
            List<h> list = aVar.b;
            JSONObject jSONObject = dVar.f15778c;
            int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
            if (1 == optInt) {
                calcRequestTime(System.currentTimeMillis());
                if ("v5".equals(jSONObject.optString("version"))) {
                    parseCampaignUnit = b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.b);
                } else {
                    parseCampaignUnit = b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.b);
                }
                if (parseCampaignUnit != null && parseCampaignUnit.getAds() != null && parseCampaignUnit.getAds().size() > 0) {
                    a(list, parseCampaignUnit);
                    saveRequestTime(parseCampaignUnit.getAds().size());
                    return;
                }
                if (parseCampaignUnit != null) {
                    str = parseCampaignUnit.getMsg();
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(optInt, str);
                return;
            }
            a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }
}
