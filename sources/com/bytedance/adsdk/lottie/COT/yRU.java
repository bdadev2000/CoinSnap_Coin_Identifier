package com.bytedance.adsdk.lottie.COT;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.lottie.KS.KS.jU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class yRU {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x004d. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.HWF zp(JsonReader jsonReader) throws IOException {
        float zp = com.bytedance.adsdk.lottie.HWF.HWF.zp();
        LongSparseArray<com.bytedance.adsdk.lottie.KS.KS.jU> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.lottie.KS.jU> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.lottie.HWF hwf = new com.bytedance.adsdk.lottie.HWF();
        jsonReader.beginObject();
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    if (nextName.equals("assets")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    if (nextName.equals("layers")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 118:
                    if (nextName.equals("v")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 3276:
                    if (nextName.equals("fr")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 94623709:
                    if (nextName.equals("chars")) {
                        c9 = '\b';
                        break;
                    }
                    break;
                case 97615364:
                    if (nextName.equals("fonts")) {
                        c9 = '\t';
                        break;
                    }
                    break;
                case 839250809:
                    if (nextName.equals("markers")) {
                        c9 = '\n';
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    zp(jsonReader, hwf, hashMap, hashMap2);
                    continue;
                case 1:
                    zp(jsonReader, hwf, arrayList, longSparseArray);
                    continue;
                case 2:
                    i10 = jsonReader.nextInt();
                    continue;
                case 3:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.lottie.HWF.HWF.zp(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        hwf.zp("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i9 = jsonReader.nextInt();
                    continue;
                case 5:
                    f11 = (float) jsonReader.nextDouble();
                    continue;
                case 6:
                    f9 = (float) jsonReader.nextDouble();
                    continue;
                case 7:
                    f10 = ((float) jsonReader.nextDouble()) - 0.01f;
                    continue;
                case '\b':
                    zp(jsonReader, hwf, sparseArray);
                    break;
                case '\t':
                    zp(jsonReader, hashMap3);
                    break;
                case '\n':
                    zp(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        hwf.zp(new Rect(0, 0, (int) (i9 * zp), (int) (i10 * zp)), f9, f10, f11, arrayList, longSparseArray, hashMap, hashMap2, sparseArray, hashMap3, arrayList2);
        return hwf;
    }

    private static void zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, List<com.bytedance.adsdk.lottie.KS.KS.jU> list, LongSparseArray<com.bytedance.adsdk.lottie.KS.KS.jU> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.KS.KS.jU zp = ot.zp(jsonReader, hwf);
            zp.Bj();
            jU.zp zpVar = jU.zp.PRE_COMP;
            list.add(zp);
            longSparseArray.put(zp.COT(), zp);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        switch(r4) {
            case 0: goto L65;
            case 1: goto L64;
            case 2: goto L63;
            case 3: goto L62;
            case 4: goto L61;
            case 5: goto L60;
            default: goto L66;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r7 = r12.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r5 = r12.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r9 = r12.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        r8 = r12.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        r6 = r12.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        r12.beginArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        if (r12.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        r3 = com.bytedance.adsdk.lottie.COT.ot.zp(r12, r13);
        r2.put(r3.COT(), r3);
        r1.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        r12.endArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0077, code lost:
    
        r12.skipValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zp(android.util.JsonReader r12, com.bytedance.adsdk.lottie.HWF r13, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.lottie.KS.KS.jU>> r14, java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.YW> r15) throws java.io.IOException {
        /*
            r0 = 0
            r12.beginArray()
        L4:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Lca
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.util.LongSparseArray r2 = new android.util.LongSparseArray
            r2.<init>()
            r12.beginObject()
            r3 = 0
            r5 = r0
            r6 = r5
            r7 = r3
            r8 = r7
            r9 = r8
        L1d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.String r3 = r12.nextName()
            r3.getClass()
            r4 = -1
            int r10 = r3.hashCode()
            switch(r10) {
                case -1109732030: goto L6a;
                case 104: goto L5f;
                case 112: goto L54;
                case 117: goto L49;
                case 119: goto L3e;
                case 3355: goto L33;
                default: goto L32;
            }
        L32:
            goto L74
        L33:
            java.lang.String r10 = "id"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L3c
            goto L74
        L3c:
            r4 = 5
            goto L74
        L3e:
            java.lang.String r10 = "w"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L47
            goto L74
        L47:
            r4 = 4
            goto L74
        L49:
            java.lang.String r10 = "u"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L52
            goto L74
        L52:
            r4 = 3
            goto L74
        L54:
            java.lang.String r10 = "p"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L5d
            goto L74
        L5d:
            r4 = 2
            goto L74
        L5f:
            java.lang.String r10 = "h"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L68
            goto L74
        L68:
            r4 = 1
            goto L74
        L6a:
            java.lang.String r10 = "layers"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L73
            goto L74
        L73:
            r4 = r0
        L74:
            switch(r4) {
                case 0: goto L94;
                case 1: goto L8f;
                case 2: goto L8a;
                case 3: goto L85;
                case 4: goto L80;
                case 5: goto L7b;
                default: goto L77;
            }
        L77:
            r12.skipValue()
            goto L1d
        L7b:
            java.lang.String r7 = r12.nextString()
            goto L1d
        L80:
            int r5 = r12.nextInt()
            goto L1d
        L85:
            java.lang.String r9 = r12.nextString()
            goto L1d
        L8a:
            java.lang.String r8 = r12.nextString()
            goto L1d
        L8f:
            int r6 = r12.nextInt()
            goto L1d
        L94:
            r12.beginArray()
        L97:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Lac
            com.bytedance.adsdk.lottie.KS.KS.jU r3 = com.bytedance.adsdk.lottie.COT.ot.zp(r12, r13)
            long r10 = r3.COT()
            r2.put(r10, r3)
            r1.add(r3)
            goto L97
        Lac:
            r12.endArray()
            goto L1d
        Lb1:
            r12.endObject()
            if (r8 == 0) goto Lc5
            com.bytedance.adsdk.lottie.YW r1 = new com.bytedance.adsdk.lottie.YW
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r2 = r1.KS()
            r15.put(r2, r1)
            goto L4
        Lc5:
            r14.put(r7, r1)
            goto L4
        Lca:
            r12.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.COT.yRU.zp(android.util.JsonReader, com.bytedance.adsdk.lottie.HWF, java.util.Map, java.util.Map):void");
    }

    private static void zp(JsonReader jsonReader, Map<String, com.bytedance.adsdk.lottie.KS.KS> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.KS.KS zp = rV.zp(jsonReader);
                    map.put(zp.lMd(), zp);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, SparseArray<com.bytedance.adsdk.lottie.KS.jU> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.KS.jU zp = tG.zp(jsonReader, hwf);
            sparseArray.put(zp.hashCode(), zp);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        switch(r4) {
            case 0: goto L34;
            case 1: goto L33;
            case 2: goto L32;
            default: goto L36;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        r0 = (float) r6.nextDouble();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        r1 = (float) r6.nextDouble();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r2 = r6.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        r6.skipValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zp(android.util.JsonReader r6, java.util.List<com.bytedance.adsdk.lottie.KS.HWF> r7) throws java.io.IOException {
        /*
            r6.beginArray()
        L3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            r6.beginObject()
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L10:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5e
            java.lang.String r3 = r6.nextName()
            r3.getClass()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3178: goto L3c;
                case 3214: goto L31;
                case 3705: goto L26;
                default: goto L25;
            }
        L25:
            goto L46
        L26:
            java.lang.String r5 = "tm"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L2f
            goto L46
        L2f:
            r4 = 2
            goto L46
        L31:
            java.lang.String r5 = "dr"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L3a
            goto L46
        L3a:
            r4 = 1
            goto L46
        L3c:
            java.lang.String r5 = "cm"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L45
            goto L46
        L45:
            r4 = 0
        L46:
            switch(r4) {
                case 0: goto L59;
                case 1: goto L53;
                case 2: goto L4d;
                default: goto L49;
            }
        L49:
            r6.skipValue()
            goto L10
        L4d:
            double r3 = r6.nextDouble()
            float r0 = (float) r3
            goto L10
        L53:
            double r3 = r6.nextDouble()
            float r1 = (float) r3
            goto L10
        L59:
            java.lang.String r2 = r6.nextString()
            goto L10
        L5e:
            r6.endObject()
            com.bytedance.adsdk.lottie.KS.HWF r3 = new com.bytedance.adsdk.lottie.KS.HWF
            r3.<init>(r2, r0, r1)
            r7.add(r3)
            goto L3
        L6a:
            r6.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.COT.yRU.zp(android.util.JsonReader, java.util.List):void");
    }
}
