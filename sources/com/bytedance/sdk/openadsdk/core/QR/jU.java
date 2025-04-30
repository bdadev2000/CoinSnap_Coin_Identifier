package com.bytedance.sdk.openadsdk.core.QR;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import com.bytedance.sdk.openadsdk.core.QR.lMd.lMd;
import com.bytedance.sdk.openadsdk.core.QR.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU {
    private String FP;
    private long KVG;
    private boolean cz;
    private boolean pvr;
    private final zp tG;
    private boolean vwr;
    private woN woN;
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> zp = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> lMd = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> KS = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> jU = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> COT = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> HWF = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> QR = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> ku = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> YW = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> dT = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.lMd> Bj = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.zp> vDp = new ArrayList();
    private final AtomicBoolean rV = new AtomicBoolean(false);
    private final AtomicBoolean dQp = new AtomicBoolean(false);

    public jU(zp zpVar) {
        this.tG = zpVar;
    }

    public void Bj(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.YW.addAll(list);
    }

    public void COT(long j7) {
        if (this.dQp.compareAndSet(false, true)) {
            zp(j7, this.HWF, (com.bytedance.sdk.openadsdk.core.QR.zp.zp) null);
        }
    }

    public void HWF(long j7) {
        zp(j7, this.QR, (com.bytedance.sdk.openadsdk.core.QR.zp.zp) null);
    }

    public void KS(long j7) {
        zp(j7, this.jU, (com.bytedance.sdk.openadsdk.core.QR.zp.zp) null);
    }

    public void QR(long j7) {
        zp(j7, this.ku, null, new KS.lMd(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.woN));
    }

    public void YW(long j7) {
        zp(j7, this.dT, (com.bytedance.sdk.openadsdk.core.QR.zp.zp) null);
    }

    public void dT(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.zp.addAll(list);
    }

    public void jU(long j7) {
        zp(j7, this.COT, null, new KS.lMd("video_progress", this.woN, 1.0f));
    }

    public void ku(long j7) {
        zp(j7, this.YW, (com.bytedance.sdk.openadsdk.core.QR.zp.zp) null);
    }

    public void lMd(long j7) {
        zp(j7, this.KS, (com.bytedance.sdk.openadsdk.core.QR.zp.zp) null);
    }

    public void vDp(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.dT.addAll(list);
    }

    public void zp(com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar) {
        zp(-1L, this.zp, zpVar);
    }

    private void lMd(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.woN, this.FP, "vast_play_track", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void HWF(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.QR.addAll(list);
    }

    public void KS(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.jU.addAll(list);
    }

    public void QR(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.ku.addAll(list);
    }

    public void YW(List<com.bytedance.sdk.openadsdk.core.QR.lMd.zp> list) {
        this.vDp.addAll(list);
        Collections.sort(this.vDp);
    }

    public void jU(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.COT.addAll(list);
    }

    public void ku(List<com.bytedance.sdk.openadsdk.core.QR.lMd.lMd> list) {
        this.Bj.addAll(list);
        Collections.sort(this.Bj);
    }

    public void zp(long j7) {
        if (this.rV.compareAndSet(false, true)) {
            zp(j7, this.lMd, null, new KS.lMd("show_impression", this.woN));
        }
    }

    private JSONArray KS() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.QR.lMd.zp> it = this.vDp.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().zp());
        }
        return jSONArray;
    }

    public void COT(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.HWF.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(long r8, long r10, com.bytedance.sdk.openadsdk.core.QR.HWF r12) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.KVG
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Le
            return
        Le:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L87
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L87
            long r0 = java.lang.System.currentTimeMillis()
            r7.KVG = r0
            float r0 = (float) r8
            float r10 = (float) r10
            float r0 = r0 / r10
            java.util.List r4 = r7.zp(r8, r0)
            r10 = 1048576000(0x3e800000, float:0.25)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r1 = 1
            if (r11 < 0) goto L3f
            boolean r11 = r7.vwr
            if (r11 != 0) goto L3f
            java.lang.String r11 = "firstQuartile"
            r7.lMd(r11)
            r7.vwr = r1
            if (r12 == 0) goto L3d
            r11 = 6
            r7.zp(r12, r11)
        L3d:
            r0 = r10
            goto L70
        L3f:
            r10 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 < 0) goto L57
            boolean r11 = r7.pvr
            if (r11 != 0) goto L57
            java.lang.String r11 = "midpoint"
            r7.lMd(r11)
            r7.pvr = r1
            if (r12 == 0) goto L3d
            r11 = 7
            r7.zp(r12, r11)
            goto L3d
        L57:
            r10 = 1061158912(0x3f400000, float:0.75)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 < 0) goto L70
            boolean r11 = r7.cz
            if (r11 != 0) goto L70
            java.lang.String r11 = "thirdQuartile"
            r7.lMd(r11)
            r7.cz = r1
            if (r12 == 0) goto L3d
            r11 = 8
            r7.zp(r12, r11)
            goto L3d
        L70:
            r10 = 1022739087(0x3cf5c28f, float:0.03)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 >= 0) goto L78
            r0 = 0
        L78:
            com.bytedance.sdk.openadsdk.core.QR.lMd.KS$lMd r6 = new com.bytedance.sdk.openadsdk.core.QR.lMd.KS$lMd
            java.lang.String r10 = "video_progress"
            com.bytedance.sdk.openadsdk.core.model.woN r11 = r7.woN
            r6.<init>(r10, r11, r0)
            r5 = 0
            r1 = r7
            r2 = r8
            r1.zp(r2, r4, r5, r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.QR.jU.zp(long, long, com.bytedance.sdk.openadsdk.core.QR.HWF):void");
    }

    public void lMd(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.KS.addAll(list);
    }

    private JSONArray lMd() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.QR.lMd.lMd> it = this.Bj.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().lMd());
        }
        return jSONArray;
    }

    private void zp(final HWF hwf, final int i9) {
        com.bytedance.sdk.component.utils.ku.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.jU.1
            @Override // java.lang.Runnable
            public void run() {
                HWF hwf2 = hwf;
                if (hwf2 != null) {
                    hwf2.zp(i9);
                }
            }
        });
    }

    private void zp(long j7, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list, com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar, KS.lMd lmd) {
        zp zpVar2 = this.tG;
        com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(list, zpVar, j7, zpVar2 != null ? zpVar2.QR() : null, lmd);
    }

    private void zp(long j7, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list, com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar) {
        zp(j7, list, zpVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> zp(long j7, float f9) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < this.Bj.size(); i9++) {
            com.bytedance.sdk.openadsdk.core.QR.lMd.lMd lmd = this.Bj.get(i9);
            if (lmd.zp(f9)) {
                arrayList.add(lmd);
            }
        }
        for (int i10 = 0; i10 < this.vDp.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.QR.lMd.zp zpVar = this.vDp.get(i10);
            if (zpVar.zp(j7)) {
                arrayList.add(zpVar);
            }
        }
        return arrayList;
    }

    public void zp(List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        this.lMd.addAll(list);
    }

    public JSONObject zp() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.zp));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.lMd));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.KS));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.jU));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.COT));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.HWF));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.QR));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.ku));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.YW));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.dT));
        jSONObject.put("fractionalTrackers", lMd());
        jSONObject.put("absoluteTrackers", KS());
        return jSONObject;
    }

    public void zp(JSONObject jSONObject) {
        dT(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("errorTrackers")));
        zp(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("impressionTrackers")));
        lMd(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("pauseTrackers"), true));
        KS(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("resumeTrackers"), true));
        jU(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("completeTrackers")));
        COT(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("closeTrackers")));
        HWF(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("skipTrackers")));
        QR(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("clickTrackers")));
        Bj(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("muteTrackers"), true));
        vDp(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(jSONObject.optJSONArray("unMuteTrackers"), true));
        ku(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.lMd(jSONObject.optJSONArray("fractionalTrackers")));
        YW(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.KS(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void zp(woN won) {
        this.woN = won;
    }

    public void zp(String str) {
        this.FP = str;
    }

    public void zp(String str, long j7) {
        if (TextUtils.isEmpty(str) || j7 < 0) {
            return;
        }
        YW(Collections.singletonList(new zp.C0102zp(str, j7).zp()));
    }

    public void zp(String str, float f9) {
        if (TextUtils.isEmpty(str) || f9 < 0.0f) {
            return;
        }
        ku(Collections.singletonList(new lMd.zp(str, f9).zp()));
    }

    public void zp(jU jUVar) {
        dT(jUVar.zp);
        zp(jUVar.lMd);
        lMd(jUVar.KS);
        KS(jUVar.jU);
        jU(jUVar.COT);
        COT(jUVar.HWF);
        HWF(jUVar.QR);
        QR(jUVar.ku);
        Bj(jUVar.YW);
        vDp(jUVar.dT);
        ku(jUVar.Bj);
        YW(jUVar.vDp);
    }
}
