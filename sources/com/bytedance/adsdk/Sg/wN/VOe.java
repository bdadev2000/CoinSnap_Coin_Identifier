package com.bytedance.adsdk.Sg.wN;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.Sg.DSW;
import com.bytedance.adsdk.Sg.tN.tN.wN;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class VOe {
    private static Map<String, Object> Sg(JsonReader jsonReader) throws IOException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap.put("lottie_back", hashMap2);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("hd")) {
                        jsonReader.skipValue();
                    } else {
                        hashMap2.put("hd", Integer.valueOf(jsonReader.nextInt()));
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static com.bytedance.adsdk.Sg.DSW YFl(JsonReader jsonReader) throws IOException {
        int i10;
        char c10;
        float YFl = com.bytedance.adsdk.Sg.vc.vc.YFl();
        LongSparseArray<com.bytedance.adsdk.Sg.tN.tN.wN> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.Sg.tN.AlY> sparseArray = new SparseArray<>();
        DSW.tN tNVar = new DSW.tN();
        DSW.YFl yFl = new DSW.YFl();
        DSW.Sg sg2 = new DSW.Sg();
        com.bytedance.adsdk.Sg.DSW dsw = new com.bytedance.adsdk.Sg.DSW();
        jsonReader.beginObject();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        String str = null;
        int i11 = 0;
        int i12 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    i10 = i12;
                    if (nextName.equals("assets")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    i10 = i12;
                    if (nextName.equals("layers")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -865448777:
                    i10 = i12;
                    if (nextName.equals("globalEvent")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 104:
                    i10 = i12;
                    if (nextName.equals("h")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 118:
                    i10 = i12;
                    if (nextName.equals("v")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 119:
                    i10 = i12;
                    if (nextName.equals("w")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3208:
                    i10 = i12;
                    if (nextName.equals("dl")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3276:
                    i10 = i12;
                    if (nextName.equals("fr")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3292:
                    i10 = i12;
                    if (nextName.equals("gc")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 3367:
                    i10 = i12;
                    if (nextName.equals("ip")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 3553:
                    i10 = i12;
                    if (nextName.equals("op")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 94623709:
                    i10 = i12;
                    if (nextName.equals("chars")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 97615364:
                    i10 = i12;
                    if (nextName.equals("fonts")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 110364485:
                    i10 = i12;
                    if (nextName.equals("timer")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 839250809:
                    i10 = i12;
                    if (nextName.equals("markers")) {
                        c10 = 14;
                        break;
                    }
                    break;
                default:
                    i10 = i12;
                    break;
            }
            c11 = c10;
            switch (c11) {
                case 0:
                    YFl(jsonReader, dsw, hashMap, hashMap2);
                    break;
                case 1:
                    YFl(jsonReader, dsw, arrayList, longSparseArray);
                    break;
                case 2:
                    YFl(jsonReader, sg2);
                    break;
                case 3:
                    i12 = jsonReader.nextInt();
                    continue;
                case 4:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.Sg.vc.vc.YFl(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dsw.YFl("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 5:
                    i11 = jsonReader.nextInt();
                    break;
                case 6:
                    str = jsonReader.nextString();
                    break;
                case 7:
                    f12 = (float) jsonReader.nextDouble();
                    break;
                case '\b':
                    YFl(jsonReader, yFl);
                    break;
                case '\t':
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case '\n':
                    f11 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 11:
                    YFl(jsonReader, dsw, sparseArray);
                    break;
                case '\f':
                    YFl(jsonReader, hashMap3);
                    break;
                case '\r':
                    YFl(jsonReader, tNVar);
                    break;
                case 14:
                    YFl(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            i12 = i10;
        }
        jsonReader.endObject();
        dsw.YFl(new Rect(0, 0, (int) (i11 * YFl), (int) (i12 * YFl)), f10, f11, f12, arrayList, longSparseArray, hashMap, hashMap2, sparseArray, hashMap3, arrayList2, tNVar, str, yFl, sg2);
        return dsw;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.bytedance.adsdk.Sg.nc.YFl> tN(android.util.JsonReader r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc4
            r0.<init>()     // Catch: java.lang.Exception -> Lc4
        L5:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r1 == 0) goto Lc3
            com.bytedance.adsdk.Sg.nc$YFl r1 = new com.bytedance.adsdk.Sg.nc$YFl     // Catch: java.lang.Exception -> Lc4
            r1.<init>()     // Catch: java.lang.Exception -> Lc4
            r10.beginObject()     // Catch: java.lang.Exception -> Lc4
        L13:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto Lbb
            java.lang.String r2 = r10.nextName()     // Catch: java.lang.Exception -> Lc4
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> Lc4
            r4 = 99
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r3 == r4) goto L71
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto L67
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L5d
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L53
            r4 = 3153(0xc51, float:4.418E-42)
            if (r3 == r4) goto L49
            r4 = 3449(0xd79, float:4.833E-42)
            if (r3 == r4) goto L3f
            goto L7b
        L3f:
            java.lang.String r3 = "le"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r9
            goto L7c
        L49:
            java.lang.String r3 = "bs"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r5
            goto L7c
        L53:
            java.lang.String r3 = "s"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r8
            goto L7c
        L5d:
            java.lang.String r3 = "l"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = 0
            goto L7c
        L67:
            java.lang.String r3 = "f"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r6
            goto L7c
        L71:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r7
            goto L7c
        L7b:
            r2 = -1
        L7c:
            if (r2 == 0) goto Lb3
            if (r2 == r9) goto Lab
            if (r2 == r8) goto La3
            if (r2 == r7) goto L9b
            if (r2 == r6) goto L93
            if (r2 == r5) goto L8c
            r10.skipValue()     // Catch: java.lang.Exception -> Lc4
            goto L13
        L8c:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.f10186vc = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        L93:
            java.lang.String r2 = r10.nextString()     // Catch: java.lang.Exception -> Lc4
            r1.AlY = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        L9b:
            java.lang.String r2 = r10.nextString()     // Catch: java.lang.Exception -> Lc4
            r1.tN = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        La3:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.wN = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        Lab:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.Sg = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        Lb3:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.YFl = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        Lbb:
            r10.endObject()     // Catch: java.lang.Exception -> Lc4
            r0.add(r1)     // Catch: java.lang.Exception -> Lc4
            goto L5
        Lc3:
            return r0
        Lc4:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.VOe.tN(android.util.JsonReader):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void YFl(android.util.JsonReader r6, com.bytedance.adsdk.Sg.DSW.Sg r7) {
        /*
            r6.beginObject()     // Catch: java.lang.Exception -> L7b
        L3:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L78
            java.lang.String r0 = r6.nextName()     // Catch: java.lang.Exception -> L7b
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L7b
            r2 = 3239(0xca7, float:4.539E-42)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L28
            r2 = 3237004(0x31648c, float:4.536009E-39)
            if (r1 == r2) goto L1e
            goto L32
        L1e:
            java.lang.String r1 = "inel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L32
            r0 = r4
            goto L33
        L28:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L32
            r0 = r5
            goto L33
        L32:
            r0 = r3
        L33:
            if (r0 == 0) goto L42
            if (r0 == r5) goto L3b
            r6.skipValue()     // Catch: java.lang.Exception -> L7b
            goto L3
        L3b:
            java.lang.String r0 = r6.nextString()     // Catch: java.lang.Exception -> L7b
            r7.YFl = r0     // Catch: java.lang.Exception -> L7b
            goto L3
        L42:
            int[][] r0 = new int[r5]     // Catch: java.lang.Exception -> L7b
            r1 = 2
            int[] r2 = new int[r1]     // Catch: java.lang.Exception -> L7b
            r2[r4] = r3     // Catch: java.lang.Exception -> L7b
            r2[r5] = r3     // Catch: java.lang.Exception -> L7b
            r0[r4] = r2     // Catch: java.lang.Exception -> L7b
            r7.Sg = r0     // Catch: java.lang.Exception -> L7b
            r6.beginArray()     // Catch: java.lang.Exception -> L7b
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L74
            r6.beginArray()     // Catch: java.lang.Exception -> L7b
            r0 = r4
        L5c:
            if (r0 >= r1) goto L71
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L7b
            if (r2 == 0) goto L6e
            int[][] r2 = r7.Sg     // Catch: java.lang.Exception -> L7b
            r2 = r2[r4]     // Catch: java.lang.Exception -> L7b
            int r3 = r6.nextInt()     // Catch: java.lang.Exception -> L7b
            r2[r0] = r3     // Catch: java.lang.Exception -> L7b
        L6e:
            int r0 = r0 + 1
            goto L5c
        L71:
            r6.endArray()     // Catch: java.lang.Exception -> L7b
        L74:
            r6.endArray()     // Catch: java.lang.Exception -> L7b
            goto L3
        L78:
            r6.endObject()     // Catch: java.lang.Exception -> L7b
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.VOe.YFl(android.util.JsonReader, com.bytedance.adsdk.Sg.DSW$Sg):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void YFl(android.util.JsonReader r5, com.bytedance.adsdk.Sg.DSW.YFl r6) {
        /*
            r5.beginObject()     // Catch: java.lang.Exception -> L61
        L3:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L5e
            java.lang.String r0 = r5.nextName()     // Catch: java.lang.Exception -> L61
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L61
            r2 = 3139(0xc43, float:4.399E-42)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L34
            r2 = 3232(0xca0, float:4.529E-42)
            if (r1 == r2) goto L2a
            r2 = 3666(0xe52, float:5.137E-42)
            if (r1 == r2) goto L20
            goto L3e
        L20:
            java.lang.String r1 = "se"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L3e
            r0 = 0
            goto L3f
        L2a:
            java.lang.String r1 = "ee"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L3e
            r0 = r3
            goto L3f
        L34:
            java.lang.String r1 = "be"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L3e
            r0 = r4
            goto L3f
        L3e:
            r0 = -1
        L3f:
            if (r0 == 0) goto L57
            if (r0 == r4) goto L50
            if (r0 == r3) goto L49
            r5.skipValue()     // Catch: java.lang.Exception -> L61
            goto L3
        L49:
            java.util.Map r0 = Sg(r5)     // Catch: java.lang.Exception -> L61
            r6.tN = r0     // Catch: java.lang.Exception -> L61
            goto L3
        L50:
            java.util.Map r0 = Sg(r5)     // Catch: java.lang.Exception -> L61
            r6.Sg = r0     // Catch: java.lang.Exception -> L61
            goto L3
        L57:
            int r0 = r5.nextInt()     // Catch: java.lang.Exception -> L61
            r6.YFl = r0     // Catch: java.lang.Exception -> L61
            goto L3
        L5e:
            r5.endObject()     // Catch: java.lang.Exception -> L61
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.VOe.YFl(android.util.JsonReader, com.bytedance.adsdk.Sg.DSW$YFl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void YFl(android.util.JsonReader r10, com.bytedance.adsdk.Sg.DSW.tN r11) {
        /*
            r10.beginObject()     // Catch: java.lang.Exception -> Lcd
        L3:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto Lca
            java.lang.String r0 = r10.nextName()     // Catch: java.lang.Exception -> Lcd
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> Lcd
            r2 = 3123(0xc33, float:4.376E-42)
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 0
            r7 = -1
            r8 = 2
            r9 = 1
            if (r1 == r2) goto L64
            r2 = 3239(0xca7, float:4.539E-42)
            if (r1 == r2) goto L5a
            r2 = 3355(0xd1b, float:4.701E-42)
            if (r1 == r2) goto L50
            r2 = 3418(0xd5a, float:4.79E-42)
            if (r1 == r2) goto L46
            r2 = 3704(0xe78, float:5.19E-42)
            if (r1 == r2) goto L3c
            r2 = 3237004(0x31648c, float:4.536009E-39)
            if (r1 == r2) goto L32
            goto L6e
        L32:
            java.lang.String r1 = "inel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L6e
            r0 = r4
            goto L6f
        L3c:
            java.lang.String r1 = "tl"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L6e
            r0 = r8
            goto L6f
        L46:
            java.lang.String r1 = "ke"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L6e
            r0 = r6
            goto L6f
        L50:
            java.lang.String r1 = "id"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L6e
            r0 = r9
            goto L6f
        L5a:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L6e
            r0 = r3
            goto L6f
        L64:
            java.lang.String r1 = "at"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto L6e
            r0 = r5
            goto L6f
        L6e:
            r0 = r7
        L6f:
            if (r0 == 0) goto Lc2
            if (r0 == r9) goto Lba
            if (r0 == r8) goto Lb2
            if (r0 == r5) goto Laa
            if (r0 == r4) goto L87
            if (r0 == r3) goto L7f
            r10.skipValue()     // Catch: java.lang.Exception -> Lcd
            goto L3
        L7f:
            java.lang.String r0 = r10.nextString()     // Catch: java.lang.Exception -> Lcd
            r11.f10149vc = r0     // Catch: java.lang.Exception -> Lcd
            goto L3
        L87:
            int[] r0 = new int[r8]     // Catch: java.lang.Exception -> Lcd
            r0[r6] = r7     // Catch: java.lang.Exception -> Lcd
            r0[r9] = r7     // Catch: java.lang.Exception -> Lcd
            r11.wN = r0     // Catch: java.lang.Exception -> Lcd
            r10.beginArray()     // Catch: java.lang.Exception -> Lcd
        L92:
            if (r6 >= r8) goto La5
            boolean r0 = r10.hasNext()     // Catch: java.lang.Exception -> Lcd
            if (r0 == 0) goto La2
            int[] r0 = r11.wN     // Catch: java.lang.Exception -> Lcd
            int r1 = r10.nextInt()     // Catch: java.lang.Exception -> Lcd
            r0[r6] = r1     // Catch: java.lang.Exception -> Lcd
        La2:
            int r6 = r6 + 1
            goto L92
        La5:
            r10.endArray()     // Catch: java.lang.Exception -> Lcd
            goto L3
        Laa:
            java.lang.String r0 = r10.nextString()     // Catch: java.lang.Exception -> Lcd
            r11.AlY = r0     // Catch: java.lang.Exception -> Lcd
            goto L3
        Lb2:
            java.lang.String r0 = r10.nextString()     // Catch: java.lang.Exception -> Lcd
            r11.tN = r0     // Catch: java.lang.Exception -> Lcd
            goto L3
        Lba:
            java.lang.String r0 = r10.nextString()     // Catch: java.lang.Exception -> Lcd
            r11.Sg = r0     // Catch: java.lang.Exception -> Lcd
            goto L3
        Lc2:
            int r0 = r10.nextInt()     // Catch: java.lang.Exception -> Lcd
            r11.YFl = r0     // Catch: java.lang.Exception -> Lcd
            goto L3
        Lca:
            r10.endObject()     // Catch: java.lang.Exception -> Lcd
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.VOe.YFl(android.util.JsonReader, com.bytedance.adsdk.Sg.DSW$tN):void");
    }

    private static void YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, List<com.bytedance.adsdk.Sg.tN.tN.wN> list, LongSparseArray<com.bytedance.adsdk.Sg.tN.tN.wN> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.Sg.tN.tN.wN YFl = Ne.YFl(jsonReader, dsw);
            YFl.eT();
            wN.YFl yFl = wN.YFl.PRE_COMP;
            list.add(YFl);
            longSparseArray.put(YFl.wN(), YFl);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        switch(r16) {
            case 0: goto L98;
            case 1: goto L97;
            case 2: goto L96;
            case 3: goto L95;
            case 4: goto L94;
            case 5: goto L93;
            case 6: goto L92;
            case 7: goto L91;
            case 8: goto L90;
            case 9: goto L89;
            default: goto L99;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        r13 = new int[][]{new int[]{-1, -1}};
        r17.beginArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        if (r17.hasNext() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
    
        r17.beginArray();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r3 >= 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r17.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        r13[0][r3] = r17.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
    
        r17.endArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        r17.endArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        r10 = r17.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f5, code lost:
    
        r17.beginArray();
        r11 = tN(r17);
        r17.endArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        r7 = r17.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0107, code lost:
    
        r12 = r17.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010d, code lost:
    
        r5 = r17.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        r9 = r17.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0119, code lost:
    
        r8 = r17.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        r6 = r17.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0125, code lost:
    
        r17.beginArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012c, code lost:
    
        if (r17.hasNext() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012e, code lost:
    
        r3 = com.bytedance.adsdk.Sg.wN.Ne.YFl(r17, r18);
        r1.put(r3.wN(), r3);
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        r17.endArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b9, code lost:
    
        r17.skipValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void YFl(android.util.JsonReader r17, com.bytedance.adsdk.Sg.DSW r18, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.Sg.tN.tN.wN>> r19, java.util.Map<java.lang.String, com.bytedance.adsdk.Sg.nc> r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.VOe.YFl(android.util.JsonReader, com.bytedance.adsdk.Sg.DSW, java.util.Map, java.util.Map):void");
    }

    private static void YFl(JsonReader jsonReader, Map<String, com.bytedance.adsdk.Sg.tN.tN> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.Sg.tN.tN YFl = pDU.YFl(jsonReader);
                    map.put(YFl.Sg(), YFl);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, SparseArray<com.bytedance.adsdk.Sg.tN.AlY> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.Sg.tN.AlY YFl = GA.YFl(jsonReader, dsw);
            sparseArray.put(YFl.hashCode(), YFl);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        switch(r5) {
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
    private static void YFl(android.util.JsonReader r6, java.util.List<com.bytedance.adsdk.Sg.tN.vc> r7) throws java.io.IOException {
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
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3178: goto L3c;
                case 3214: goto L31;
                case 3705: goto L26;
                default: goto L25;
            }
        L25:
            goto L46
        L26:
            java.lang.String r4 = "tm"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2f
            goto L46
        L2f:
            r5 = 2
            goto L46
        L31:
            java.lang.String r4 = "dr"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3a
            goto L46
        L3a:
            r5 = 1
            goto L46
        L3c:
            java.lang.String r4 = "cm"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L45
            goto L46
        L45:
            r5 = 0
        L46:
            switch(r5) {
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
            com.bytedance.adsdk.Sg.tN.vc r3 = new com.bytedance.adsdk.Sg.tN.vc
            r3.<init>(r2, r0, r1)
            r7.add(r3)
            goto L3
        L6a:
            r6.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.VOe.YFl(android.util.JsonReader, java.util.List):void");
    }
}
