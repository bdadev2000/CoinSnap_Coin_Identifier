package com.mbridge.msdk.foundation.same.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c<T> implements b<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private com.mbridge.msdk.foundation.same.report.a.b mRequestTime = null;

    public void calcRequestTime(long j7) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = new com.mbridge.msdk.foundation.same.report.a.b(new h());
        this.mRequestTime = bVar;
        bVar.b(this.unitId);
        this.mRequestTime.b(1);
        this.mRequestTime.a((j7 - this.startTime) + "");
    }

    public void onCancel() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
    }

    public void onFinish() {
    }

    public void onNetworking() {
    }

    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    public void onProgressChange(long j7, long j9) {
    }

    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(d<T> dVar) {
        try {
            String str = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            com.mbridge.msdk.c.h.a();
            ad.b("Listener", dVar.f15778c + " " + str);
            T t9 = dVar.f15778c;
            if (t9 instanceof JSONObject) {
                com.mbridge.msdk.foundation.same.net.e.c.a().a(str, ((JSONObject) t9).optInt(NotificationCompat.CATEGORY_STATUS), ((JSONObject) dVar.f15778c).toString(), System.currentTimeMillis());
            }
            if (dVar.f15778c instanceof String) {
                com.mbridge.msdk.foundation.same.net.e.c.a().a(str, new JSONObject((String) dVar.f15778c).optInt(NotificationCompat.CATEGORY_STATUS), (String) dVar.f15778c, System.currentTimeMillis());
            }
        } catch (Exception e4) {
            ad.b("Listener", e4.getMessage());
        }
    }

    public void saveHbState(int i9) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.c(i9);
        }
    }

    public void saveRequestTime(int i9) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.a(i9);
            this.mRequestTime.a();
        }
    }

    public void setAdType(int i9) {
        this.adType = i9;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }
}
