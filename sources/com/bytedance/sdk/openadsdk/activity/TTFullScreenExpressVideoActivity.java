package com.bytedance.sdk.openadsdk.activity;

/* loaded from: classes.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void HWF() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean KVG() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean woN() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.video.KS.lMd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean zp(long r10, boolean r12) {
        /*
            r9 = this;
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r9.lMd
            com.bytedance.sdk.openadsdk.component.reward.view.KS r0 = r0.eWG
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView r0 = r0.zp()
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r9.lMd
            com.bytedance.sdk.openadsdk.component.reward.view.KS r0 = r0.eWG
            com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView r0 = r0.zp()
            com.bytedance.sdk.openadsdk.lMd.QR r0 = r0.getAdShowTime()
            goto L1e
        L19:
            com.bytedance.sdk.openadsdk.lMd.QR r0 = new com.bytedance.sdk.openadsdk.lMd.QR
            r0.<init>()
        L1e:
            com.bytedance.sdk.openadsdk.component.reward.lMd.lMd r1 = r9.KS
            if (r1 == 0) goto L38
            boolean r2 = r1 instanceof com.bytedance.sdk.openadsdk.component.reward.lMd.ku
            if (r2 == 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r2 = r9.lMd
            boolean r3 = r2.YW
            if (r3 != 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r2 = r2.UPs
            com.bytedance.sdk.openadsdk.component.reward.lMd.ku r1 = (com.bytedance.sdk.openadsdk.component.reward.lMd.ku) r1
            android.widget.FrameLayout r1 = r1.cW()
            r2.zp(r1, r0)
            goto L45
        L38:
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r9.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r2 = r1.UPs
            com.bytedance.sdk.openadsdk.component.reward.view.KS r1 = r1.eWG
            android.widget.FrameLayout r1 = r1.lMd()
            r2.zp(r1, r0)
        L45:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r9.lMd
            com.bytedance.sdk.openadsdk.component.reward.view.KS r0 = r0.eWG
            if (r0 == 0) goto L80
            int r0 = r0.YW()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "dynamic_show_type"
            r7.put(r1, r0)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r9.lMd
            com.bytedance.sdk.openadsdk.component.reward.view.KS r0 = r0.eWG
            r1 = 0
            org.json.JSONObject r0 = r0.zp(r1)
            if (r0 == 0) goto L80
            java.util.Iterator r1 = r0.keys()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)     // Catch: org.json.JSONException -> L6c
            r7.put(r2, r3)     // Catch: org.json.JSONException -> L6c
            goto L6c
        L80:
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r9.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r0 = r0.UPs
            com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1 r1 = new com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1
            r1.<init>()
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r9.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r3 = r0.UPs
            com.bytedance.sdk.openadsdk.component.reward.lMd.lMd r8 = r9.KS
            r4 = r10
            r6 = r12
            boolean r10 = r3.zp(r4, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.zp(long, boolean):boolean");
    }
}
