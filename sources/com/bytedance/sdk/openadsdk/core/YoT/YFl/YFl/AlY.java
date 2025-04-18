package com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl;

/* loaded from: classes.dex */
public class AlY {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        switch(r14) {
            case 0: goto L67;
            case 1: goto L66;
            case 2: goto L65;
            default: goto L72;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
    
        r6 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.Sg(r15, "VerificationParameters");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        if (com.mbridge.msdk.foundation.entity.CampaignEx.KEY_OMID.equals(r15.getAttributeValue(com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.DSW, "apiFramework")) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
    
        r5 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.Sg(r15, "JavaScriptResource");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b8, code lost:
    
        if ("verificationNotExecuted".equals(r15.getAttributeValue(com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.DSW, androidx.core.app.NotificationCompat.CATEGORY_EVENT)) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        r7 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.Sg(r15, "Tracking");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Set<com.bytedance.sdk.openadsdk.core.YoT.nc> YFl(org.xmlpull.v1.XmlPullParser r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            if (r15 != 0) goto L8
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            return r15
        L8:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        Ld:
            int r1 = r15.next()
            r2 = 3
            if (r1 == r2) goto Lc5
            int r1 = r15.getEventType()
            r3 = 2
            if (r1 != r3) goto Ld
            java.lang.String r1 = r15.getName()
            java.lang.String r4 = "Verification"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto Lc0
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.DSW
            java.lang.String r5 = "vendor"
            java.lang.String r1 = r15.getAttributeValue(r1, r5)
            r5 = 0
            r6 = r5
            r7 = r6
        L32:
            int r8 = r15.getEventType()
            java.lang.String r9 = "omid"
            if (r8 != r2) goto L55
            java.lang.String r8 = r15.getName()
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L45
            goto L55
        L45:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto Ld
            com.bytedance.sdk.openadsdk.core.YoT.nc r1 = com.bytedance.sdk.openadsdk.core.YoT.nc.YFl(r9, r5, r1, r6, r7)
            if (r1 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L55:
            r15.next()
            int r8 = r15.getEventType()
            if (r8 != r3) goto L32
            java.lang.String r8 = r15.getName()
            r8.getClass()
            int r10 = r8.hashCode()
            java.lang.String r11 = "VerificationParameters"
            java.lang.String r12 = "JavaScriptResource"
            java.lang.String r13 = "Tracking"
            r14 = -1
            switch(r10) {
                case 1335132887: goto L86;
                case 1561251035: goto L7d;
                case 1749252741: goto L74;
                default: goto L73;
            }
        L73:
            goto L8e
        L74:
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L7b
            goto L8e
        L7b:
            r14 = r3
            goto L8e
        L7d:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L84
            goto L8e
        L84:
            r14 = 1
            goto L8e
        L86:
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L8d
            goto L8e
        L8d:
            r14 = 0
        L8e:
            switch(r14) {
                case 0: goto Laa;
                case 1: goto L97;
                case 2: goto L92;
                default: goto L91;
            }
        L91:
            goto L32
        L92:
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.Sg(r15, r11)
            goto L32
        L97:
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.DSW
            java.lang.String r10 = "apiFramework"
            java.lang.String r8 = r15.getAttributeValue(r8, r10)
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L32
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.Sg(r15, r12)
            goto L32
        Laa:
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.DSW
            java.lang.String r9 = "event"
            java.lang.String r8 = r15.getAttributeValue(r8, r9)
            java.lang.String r9 = "verificationNotExecuted"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L32
            java.lang.String r7 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.Sg(r15, r13)
            goto L32
        Lc0:
            com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.YFl(r15)
            goto Ld
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.AlY.YFl(org.xmlpull.v1.XmlPullParser):java.util.Set");
    }
}
