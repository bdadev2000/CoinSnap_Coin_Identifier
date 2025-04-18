package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class YFl {
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.adsdk.Sg.tN.YFl.GA<android.graphics.PointF, android.graphics.PointF> Sg(android.util.JsonReader r9, com.bytedance.adsdk.Sg.DSW r10) throws java.io.IOException {
        /*
            r9.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r1
        L8:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.END_OBJECT
            if (r5 == r6) goto L6a
            java.lang.String r5 = r9.nextName()
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = 1
            r8 = -1
            switch(r6) {
                case 107: goto L37;
                case 120: goto L2c;
                case 121: goto L21;
                default: goto L20;
            }
        L20:
            goto L41
        L21:
            java.lang.String r6 = "y"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2a
            goto L41
        L2a:
            r8 = 2
            goto L41
        L2c:
            java.lang.String r6 = "x"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L35
            goto L41
        L35:
            r8 = r7
            goto L41
        L37:
            java.lang.String r6 = "k"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L40
            goto L41
        L40:
            r8 = r1
        L41:
            switch(r8) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L45;
                default: goto L44;
            }
        L44:
            goto L5c
        L45:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L4e
            goto L5b
        L4e:
            com.bytedance.adsdk.Sg.tN.YFl.Sg r3 = com.bytedance.adsdk.Sg.wN.AlY.YFl(r9, r10)
            goto L8
        L53:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L60
        L5b:
            r4 = r7
        L5c:
            r9.skipValue()
            goto L8
        L60:
            com.bytedance.adsdk.Sg.tN.YFl.Sg r2 = com.bytedance.adsdk.Sg.wN.AlY.YFl(r9, r10)
            goto L8
        L65:
            com.bytedance.adsdk.Sg.tN.YFl.wN r0 = YFl(r9, r10)
            goto L8
        L6a:
            r9.endObject()
            if (r4 == 0) goto L74
            java.lang.String r9 = "Lottie doesn't support expressions."
            r10.YFl(r9)
        L74:
            if (r0 == 0) goto L77
            return r0
        L77:
            com.bytedance.adsdk.Sg.tN.YFl.NjR r9 = new com.bytedance.adsdk.Sg.tN.YFl.NjR
            r9.<init>(r2, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.YFl.Sg(android.util.JsonReader, com.bytedance.adsdk.Sg.DSW):com.bytedance.adsdk.Sg.tN.YFl.GA");
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.wN YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(YI.YFl(jsonReader, dsw));
            }
            jsonReader.endArray();
            wXo.YFl(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.Sg.DSW.YFl(qO.Sg(jsonReader, com.bytedance.adsdk.Sg.vc.vc.YFl())));
        }
        return new com.bytedance.adsdk.Sg.tN.YFl.wN(arrayList);
    }
}
