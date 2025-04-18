package com.bytedance.sdk.openadsdk.activity;

/* loaded from: classes.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean Wwa() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean YFl(long r10, boolean r12) {
        /*
            r9 = this;
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r9.Sg
            com.bytedance.sdk.openadsdk.component.reward.view.qsH r0 = r0.YI
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.view.Sg r0 = r0.YFl()
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r9.Sg
            com.bytedance.sdk.openadsdk.component.reward.view.qsH r0 = r0.YI
            com.bytedance.sdk.openadsdk.component.reward.view.Sg r0 = r0.YFl()
            com.bytedance.sdk.openadsdk.AlY.DSW r0 = r0.getAdShowTime()
            goto L1e
        L19:
            com.bytedance.sdk.openadsdk.AlY.DSW r0 = new com.bytedance.sdk.openadsdk.AlY.DSW
            r0.<init>()
        L1e:
            com.bytedance.sdk.openadsdk.component.reward.Sg.Sg r1 = r9.tN
            if (r1 == 0) goto L38
            boolean r2 = r1 instanceof com.bytedance.sdk.openadsdk.component.reward.Sg.qsH
            if (r2 == 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r2 = r9.Sg
            boolean r3 = r2.Ld
            if (r3 != 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r2 = r2.VOe
            com.bytedance.sdk.openadsdk.component.reward.Sg.qsH r1 = (com.bytedance.sdk.openadsdk.component.reward.Sg.qsH) r1
            android.widget.FrameLayout r1 = r1.Cfr()
            r2.YFl(r1, r0)
            goto L45
        L38:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r9.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r2 = r1.VOe
            com.bytedance.sdk.openadsdk.component.reward.view.qsH r1 = r1.YI
            android.widget.FrameLayout r1 = r1.Sg()
            r2.YFl(r1, r0)
        L45:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r9.Sg
            com.bytedance.sdk.openadsdk.component.reward.view.qsH r0 = r0.YI
            if (r0 == 0) goto L80
            int r0 = r0.NjR()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "dynamic_show_type"
            r7.put(r1, r0)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r9.Sg
            com.bytedance.sdk.openadsdk.component.reward.view.qsH r0 = r0.YI
            r1 = 0
            org.json.JSONObject r0 = r0.YFl(r1)
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
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r9.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r0 = r0.VOe
            com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1 r1 = new com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1
            r1.<init>()
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r9.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r3 = r0.VOe
            com.bytedance.sdk.openadsdk.component.reward.Sg.Sg r8 = r9.tN
            r4 = r10
            r6 = r12
            boolean r10 = r3.YFl(r4, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.YFl(long, boolean):boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void tN() {
    }
}
