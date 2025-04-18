package com.bytedance.sdk.openadsdk.core.YoT;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
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
public class AlY {
    private final YFl GA;
    private boolean Wwa;
    private boolean aIu;
    private Wwa lG;
    private boolean qO;
    private long rkt;
    private String wXo;
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> YFl = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> Sg = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> tN = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> AlY = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> wN = new ArrayList();

    /* renamed from: vc, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> f10648vc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> DSW = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> qsH = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> NjR = new ArrayList();

    /* renamed from: nc, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> f10647nc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.Sg> eT = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl> YoT = new ArrayList();
    private final AtomicBoolean pDU = new AtomicBoolean(false);
    private final AtomicBoolean EH = new AtomicBoolean(false);

    public AlY(YFl yFl) {
        this.GA = yFl;
    }

    public void AlY(long j3) {
        YFl(j3, this.wN, null, new tN.Sg("video_progress", this.lG, 1.0f));
    }

    public void DSW(long j3) {
        YFl(j3, this.qsH, null, new tN.Sg(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.lG));
    }

    public void NjR(long j3) {
        YFl(j3, this.f10647nc, (com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl) null);
    }

    public void Sg(long j3) {
        YFl(j3, this.tN, (com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl) null);
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl) {
        YFl(-1L, this.YFl, yFl);
    }

    public void YoT(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.f10647nc.addAll(list);
    }

    public void eT(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.NjR.addAll(list);
    }

    public void nc(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.YFl.addAll(list);
    }

    public void qsH(long j3) {
        YFl(j3, this.NjR, (com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl) null);
    }

    public void tN(long j3) {
        YFl(j3, this.AlY, (com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl) null);
    }

    public void vc(long j3) {
        YFl(j3, this.DSW, (com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl) null);
    }

    public void wN(long j3) {
        if (this.EH.compareAndSet(false, true)) {
            YFl(j3, this.f10648vc, (com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl) null);
        }
    }

    private void Sg(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.lG, this.wXo, "vast_play_track", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void AlY(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.wN.addAll(list);
    }

    public void DSW(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.qsH.addAll(list);
    }

    public void NjR(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl> list) {
        this.YoT.addAll(list);
        Collections.sort(this.YoT);
    }

    public void YFl(long j3) {
        if (this.pDU.compareAndSet(false, true)) {
            YFl(j3, this.Sg, null, new tN.Sg("show_impression", this.lG));
        }
    }

    public void qsH(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.Sg> list) {
        this.eT.addAll(list);
        Collections.sort(this.eT);
    }

    public void tN(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.AlY.addAll(list);
    }

    public void vc(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.DSW.addAll(list);
    }

    private JSONArray tN() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl> it = this.YoT.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().YFl());
        }
        return jSONArray;
    }

    public void wN(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.f10648vc.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(long r8, long r10, com.bytedance.sdk.openadsdk.core.YoT.vc r12) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.rkt
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
            r7.rkt = r0
            float r0 = (float) r8
            float r10 = (float) r10
            float r0 = r0 / r10
            java.util.List r4 = r7.YFl(r8, r0)
            r10 = 1048576000(0x3e800000, float:0.25)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r1 = 1
            if (r11 < 0) goto L3f
            boolean r11 = r7.Wwa
            if (r11 != 0) goto L3f
            java.lang.String r11 = "firstQuartile"
            r7.Sg(r11)
            r7.Wwa = r1
            if (r12 == 0) goto L3d
            r11 = 6
            r7.YFl(r12, r11)
        L3d:
            r0 = r10
            goto L70
        L3f:
            r10 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 < 0) goto L57
            boolean r11 = r7.qO
            if (r11 != 0) goto L57
            java.lang.String r11 = "midpoint"
            r7.Sg(r11)
            r7.qO = r1
            if (r12 == 0) goto L3d
            r11 = 7
            r7.YFl(r12, r11)
            goto L3d
        L57:
            r10 = 1061158912(0x3f400000, float:0.75)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 < 0) goto L70
            boolean r11 = r7.aIu
            if (r11 != 0) goto L70
            java.lang.String r11 = "thirdQuartile"
            r7.Sg(r11)
            r7.aIu = r1
            if (r12 == 0) goto L3d
            r11 = 8
            r7.YFl(r12, r11)
            goto L3d
        L70:
            r10 = 1022739087(0x3cf5c28f, float:0.03)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 >= 0) goto L78
            r0 = 0
        L78:
            r5 = 0
            com.bytedance.sdk.openadsdk.core.YoT.Sg.tN$Sg r6 = new com.bytedance.sdk.openadsdk.core.YoT.Sg.tN$Sg
            java.lang.String r10 = "video_progress"
            com.bytedance.sdk.openadsdk.core.model.Wwa r11 = r7.lG
            r6.<init>(r10, r11, r0)
            r1 = r7
            r2 = r8
            r1.YFl(r2, r4, r5, r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.YoT.AlY.YFl(long, long, com.bytedance.sdk.openadsdk.core.YoT.vc):void");
    }

    public void Sg(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.tN.addAll(list);
    }

    private JSONArray Sg() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.YoT.Sg.Sg> it = this.eT.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().Sg());
        }
        return jSONArray;
    }

    private void YFl(final vc vcVar, final int i10) {
        com.bytedance.sdk.component.utils.DSW.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.AlY.1
            @Override // java.lang.Runnable
            public void run() {
                vc vcVar2 = vcVar;
                if (vcVar2 != null) {
                    vcVar2.YFl(i10);
                }
            }
        });
    }

    private void YFl(long j3, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list, com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl, tN.Sg sg2) {
        YFl yFl2 = this.GA;
        com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(list, yFl, j3, yFl2 != null ? yFl2.DSW() : null, sg2);
    }

    private void YFl(long j3, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list, com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl) {
        YFl(j3, list, yFl, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> YFl(long j3, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.eT.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.YoT.Sg.Sg sg2 = this.eT.get(i10);
            if (sg2.YFl(f10)) {
                arrayList.add(sg2);
            }
        }
        for (int i11 = 0; i11 < this.YoT.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl yFl = this.YoT.get(i11);
            if (yFl.YFl(j3)) {
                arrayList.add(yFl);
            }
        }
        return arrayList;
    }

    public void YFl(List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) {
        this.Sg.addAll(list);
    }

    public JSONObject YFl() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.YFl));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.Sg));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.tN));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.AlY));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.wN));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.f10648vc));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.DSW));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.qsH));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.NjR));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.f10647nc));
        jSONObject.put("fractionalTrackers", Sg());
        jSONObject.put("absoluteTrackers", tN());
        return jSONObject;
    }

    public void YFl(JSONObject jSONObject) {
        nc(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("errorTrackers")));
        YFl(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("impressionTrackers")));
        Sg(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("pauseTrackers"), true));
        tN(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("resumeTrackers"), true));
        AlY(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("completeTrackers")));
        wN(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("closeTrackers")));
        vc(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("skipTrackers")));
        DSW(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("clickTrackers")));
        eT(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("muteTrackers"), true));
        YoT(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(jSONObject.optJSONArray("unMuteTrackers"), true));
        qsH(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.Sg(jSONObject.optJSONArray("fractionalTrackers")));
        NjR(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.tN(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void YFl(Wwa wwa) {
        this.lG = wwa;
    }

    public void YFl(String str) {
        this.wXo = str;
    }

    public void YFl(String str, long j3) {
        if (TextUtils.isEmpty(str) || j3 < 0) {
            return;
        }
        NjR(Collections.singletonList(new YFl.C0117YFl(str, j3).YFl()));
    }

    public void YFl(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        qsH(Collections.singletonList(new Sg.YFl(str, f10).YFl()));
    }

    public void YFl(AlY alY) {
        nc(alY.YFl);
        YFl(alY.Sg);
        Sg(alY.tN);
        tN(alY.AlY);
        AlY(alY.wN);
        wN(alY.f10648vc);
        vc(alY.DSW);
        DSW(alY.qsH);
        eT(alY.NjR);
        YoT(alY.f10647nc);
        qsH(alY.eT);
        NjR(alY.YoT);
    }
}
