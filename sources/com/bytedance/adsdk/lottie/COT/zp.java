package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class zp {
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.adsdk.lottie.KS.zp.tG<android.graphics.PointF, android.graphics.PointF> lMd(android.util.JsonReader r9, com.bytedance.adsdk.lottie.HWF r10) throws java.io.IOException {
        /*
            r0 = 1
            r9.beginObject()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
        L9:
            android.util.JsonToken r6 = r9.peek()
            android.util.JsonToken r7 = android.util.JsonToken.END_OBJECT
            if (r6 == r7) goto L6b
            java.lang.String r6 = r9.nextName()
            r6.getClass()
            r7 = -1
            int r8 = r6.hashCode()
            switch(r8) {
                case 107: goto L37;
                case 120: goto L2c;
                case 121: goto L21;
                default: goto L20;
            }
        L20:
            goto L41
        L21:
            java.lang.String r8 = "y"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L2a
            goto L41
        L2a:
            r7 = 2
            goto L41
        L2c:
            java.lang.String r8 = "x"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L35
            goto L41
        L35:
            r7 = r0
            goto L41
        L37:
            java.lang.String r8 = "k"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L40
            goto L41
        L40:
            r7 = r2
        L41:
            switch(r7) {
                case 0: goto L66;
                case 1: goto L54;
                case 2: goto L45;
                default: goto L44;
            }
        L44:
            goto L5d
        L45:
            android.util.JsonToken r6 = r9.peek()
            android.util.JsonToken r7 = android.util.JsonToken.STRING
            if (r6 != r7) goto L4f
        L4d:
            r5 = r0
            goto L5d
        L4f:
            com.bytedance.adsdk.lottie.KS.zp.lMd r4 = com.bytedance.adsdk.lottie.COT.jU.zp(r9, r10)
            goto L9
        L54:
            android.util.JsonToken r6 = r9.peek()
            android.util.JsonToken r7 = android.util.JsonToken.STRING
            if (r6 != r7) goto L61
            goto L4d
        L5d:
            r9.skipValue()
            goto L9
        L61:
            com.bytedance.adsdk.lottie.KS.zp.lMd r3 = com.bytedance.adsdk.lottie.COT.jU.zp(r9, r10)
            goto L9
        L66:
            com.bytedance.adsdk.lottie.KS.zp.COT r1 = zp(r9, r10)
            goto L9
        L6b:
            r9.endObject()
            if (r5 == 0) goto L75
            java.lang.String r9 = "Lottie doesn't support expressions."
            r10.zp(r9)
        L75:
            if (r1 == 0) goto L78
            return r1
        L78:
            com.bytedance.adsdk.lottie.KS.zp.YW r9 = new com.bytedance.adsdk.lottie.KS.zp.YW
            r9.<init>(r3, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.COT.zp.lMd(android.util.JsonReader, com.bytedance.adsdk.lottie.HWF):com.bytedance.adsdk.lottie.KS.zp.tG");
    }

    public static com.bytedance.adsdk.lottie.KS.zp.COT zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Lij.zp(jsonReader, hwf));
            }
            jsonReader.endArray();
            FP.zp(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.lottie.QR.zp(pvr.lMd(jsonReader, com.bytedance.adsdk.lottie.HWF.HWF.zp())));
        }
        return new com.bytedance.adsdk.lottie.KS.zp.COT(arrayList);
    }
}
