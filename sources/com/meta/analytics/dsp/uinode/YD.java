package com.meta.analytics.dsp.uinode;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.util.common.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YD implements C8w {
    public static byte[] A03;
    public static final String A04;
    public final C1635Ym A00;
    public final AnonymousClass97<C1241Iz> A01;
    public final AnonymousClass97<C1241Iz> A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, Ascii.CAN, 61, Ascii.FS, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, Ascii.VT, 60, 58, 54, 43, 61, Ascii.GS, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, Ascii.CR, 72, 91, 72, 67, 89, Ascii.ETB, Ascii.CR, Ascii.SI, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, Ascii.CR, 89, 66, Ascii.CR, 64, 66, 91, 72, Ascii.CR, 72, 91, 72, 67, 89, 94, Ascii.CR, 75, 95, 66, 64, Ascii.CR, 68, 67, 0, 75, 65, 68, 74, 69, 89, Ascii.CR, 94, 89, 66, 95, 76, 74, 72, Ascii.CR, 79, 76, 78, 70, Ascii.CR, 89, 66, Ascii.CR, 72, 91, 72, 67, 89, 94, Ascii.CR, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, Ascii.DLE, 68, 95, Ascii.DLE, 64, 81, 66, 67, 85, Ascii.DLE, 81, 94, Ascii.DLE, 85, 70, 85, 94, 68, Ascii.DLE, 86, 66, 95, 93, Ascii.DLE, 89, 94, Ascii.GS, 86, 92, 89, 87, 88, 68, Ascii.DLE, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, Ascii.GS, 73, 82, Ascii.GS, 79, 88, 92, 89, Ascii.GS, 73, 85, 88, Ascii.GS, 83, 72, 80, 95, 88, 79, Ascii.GS, 82, 91, Ascii.GS, 88, 75, 88, 83, 73, 78, Ascii.GS, 91, 79, 82, 80, Ascii.GS, 89, 92, 73, 92, 95, 92, 78, 88, Ascii.FF, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, Ascii.CR, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, Ascii.SI, 9, 5, Ascii.CAN, Ascii.SO, 74, Ascii.SO, Ascii.VT, Ascii.RS, Ascii.VT, 8, Ascii.VT, Ascii.EM, Ascii.SI, 74, Ascii.FF, Ascii.VT, 3, 6, Ascii.US, Ascii.CAN, Ascii.SI, 74, 5, 9, 9, Ascii.US, Ascii.CAN, Ascii.CAN, Ascii.SI, Ascii.SO, 74, Ascii.GS, 2, Ascii.SI, 4, 74, Ascii.CAN, Ascii.SI, Ascii.VT, Ascii.SO, 3, 4, Ascii.CR, 74, Ascii.SI, Ascii.FS, Ascii.SI, 4, Ascii.RS, Ascii.EM, 68, 61, 40, 40, 57, 49, 44, 40, Ascii.FS, Ascii.EM, Ascii.FF, Ascii.EM, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, Ascii.FF, Ascii.ETB, Ascii.DC2, Ascii.ETB, Ascii.SYN, Ascii.SO, Ascii.ETB};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0 A[Catch: 9G -> 0x0136, TryCatch #6 {9G -> 0x0136, blocks: (B:33:0x00e4, B:35:0x00f0, B:36:0x00ff, B:19:0x0088, B:24:0x008e, B:26:0x009a, B:27:0x00da, B:62:0x0108, B:63:0x010c, B:65:0x0112, B:67:0x0122, B:68:0x0126, B:70:0x012c), top: B:32:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.YD.A0B(int, java.util.Set, java.util.Set):int");
    }

    static {
        A03();
        A04 = YD.class.getSimpleName();
    }

    public YD(C1635Ym c1635Ym) throws IOException {
        this.A00 = c1635Ym;
        this.A01 = new YA(AnonymousClass94.A00(A00(11, 28, 31), c1635Ym), new YF(this));
        this.A02 = new YA(AnonymousClass94.A00(A00(322, 37, 102), c1635Ym), new YE(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i9 = 0;
        for (int i10 : iArr) {
            if (i10 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i9, i10));
            } catch (JSONException jsone) {
                if (this.A00.A04().A8z()) {
                    Log.e(A04, A00(85, 45, 97), jsone);
                }
                int start = C8A.A2P;
                A05(start, jsone);
            }
            i9 += i10;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i9, int i10) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i9, i9 + i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i9, String str) {
        C8B c8b = new C8B(str);
        c8b.A05(1);
        this.A00.A07().A9b(A00(425, 15, 107), i9, c8b);
    }

    private void A05(int i9, Throwable th) {
        this.A00.A07().A9a(A00(425, 15, 107), i9, new C8B(th));
    }

    public static byte[] A07(C09647f c09647f, String str, C1241Iz c1241Iz) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), c1241Iz.A08());
            jSONObject.put(A00(471, 4, 106), c1241Iz.A06().toString());
            jSONObject.put(A00(462, 4, 86), C1294Lf.A02(c1241Iz.A04()));
            jSONObject.put(A00(450, 12, 27), C1294Lf.A02(c1241Iz.A03()));
            jSONObject.put(A00(440, 10, 116), c1241Iz.A07());
            jSONObject.put(A00(419, 4, 62), new JSONObject(c1241Iz.A09()));
            jSONObject.put(A00(TTAdConstant.IMAGE_URL_CODE, 7, 26), 0);
        } catch (JSONException e4) {
            if (c09647f.A04().A8z()) {
                Log.e(A04, A00(294, 28, 12), e4);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7n();
        } catch (C9G e4) {
            if (this.A00.A04().A8z()) {
                Log.e(A04, A00(245, 49, 123), e4);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:14:0x0053 */
    /* JADX WARN: Incorrect condition in loop: B:19:0x006d */
    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<org.json.JSONObject> A0C(int r8) {
        /*
            r7 = this;
            r6 = 0
            r0 = -1
            if (r8 != r0) goto L7
            r6 = 1
            r8 = 30
        L7:
            int[] r1 = new int[r8]
            int r0 = r8 * 1000
            byte[] r4 = new byte[r0]
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.facebook.ads.redexgen.X.97<com.facebook.ads.redexgen.X.Iz> r0 = r7.A01     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            com.facebook.ads.redexgen.X.96 r0 = r0.A5f(r4, r1)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            r3.add(r0)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            int r2 = r0.A5g()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
        L28:
            boolean r0 = r0.AAK()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            if (r0 == 0) goto L4b
            if (r2 < r8) goto L32
            if (r6 == 0) goto L4b
        L32:
            if (r6 == 0) goto L39
            r0 = 0
            java.util.Arrays.fill(r1, r0)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            goto L3d
        L39:
            int r0 = r8 - r2
            int[] r1 = new int[r0]     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
        L3d:
            com.facebook.ads.redexgen.X.97<com.facebook.ads.redexgen.X.Iz> r0 = r7.A01     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            com.facebook.ads.redexgen.X.96 r0 = r0.A5f(r4, r1)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            r3.add(r0)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            goto L28
        L4b:
            java.util.Iterator r2 = r5.iterator()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
        L4f:
            boolean r0 = r2.hasNext()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            if (r0 == 0) goto L65
            java.lang.Object r0 = r2.next()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            com.facebook.ads.redexgen.X.97<com.facebook.ads.redexgen.X.Iz> r1 = r7.A02     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            byte[] r0 = A09(r0)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            r1.AGb(r0)     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            goto L4f
        L65:
            java.util.Iterator r1 = r3.iterator()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
        L69:
            boolean r0 = r1.hasNext()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r1.next()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            com.facebook.ads.redexgen.X.96 r0 = (com.meta.analytics.dsp.uinode.AnonymousClass96) r0     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            r0.A52()     // Catch: com.meta.analytics.dsp.uinode.C9G -> L79
            goto L69
        L79:
            r4 = move-exception
            com.facebook.ads.redexgen.X.Ym r0 = r7.A00
            com.facebook.ads.redexgen.X.7k r0 = r0.A04()
            boolean r0 = r0.A8z()
            if (r0 == 0) goto L95
            java.lang.String r3 = com.meta.analytics.dsp.uinode.YD.A04
            r2 = 359(0x167, float:5.03E-43)
            r1 = 53
            r0 = 44
            java.lang.String r0 = A00(r2, r1, r0)
            android.util.Log.e(r3, r0, r4)
        L95:
            int r0 = com.meta.analytics.dsp.uinode.C8A.A2M
            r7.A05(r0, r4)
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.YD.A0C(int):java.util.List");
    }

    @Override // com.meta.analytics.dsp.uinode.C8w
    public final void A4J() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C9G e4) {
            if (this.A00.A04().A8z()) {
                Log.e(A04, A00(55, 30, 66), e4);
            }
            A05(C8A.A2J, e4);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.meta.analytics.dsp.uinode.C8w
    public final void AHE(final C1241Iz c1241Iz, final AbstractC09998t<String> abstractC09998t) {
        Executor executor = ExecutorC1308Lt.A07;
        final AnonymousClass97<C1241Iz> anonymousClass97 = this.A01;
        final C1635Ym c1635Ym = this.A00;
        AbstractC1305Lq.A00(executor, new AsyncTask<Void, Void, String>(c1241Iz, abstractC09998t, anonymousClass97, c1635Ym) { // from class: com.facebook.ads.redexgen.X.8x
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            public C9G A00;
            public final C09647f A01;
            public final AbstractC09998t<String> A02;
            public final AnonymousClass97<C1241Iz> A03;
            public final C1241Iz A04;

            public static String A00(int i9, int i10, int i11) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
                for (int i12 = 0; i12 < copyOfRange.length; i12++) {
                    copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 55);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{Ascii.SUB, 40, Ascii.US, Ascii.US, 2, Ascii.US, 77, 0, 8, Ascii.RS, Ascii.RS, Ascii.FF, 10, 8, 77, Ascii.SO, Ascii.FF, 3, 3, 2, Ascii.EM, 77, Ascii.SI, 8, 77, 3, Ascii.CAN, 1, 1, Ascii.CR, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, Ascii.RS, Ascii.CAN, Ascii.DC4, 9, Ascii.US, 36, Ascii.US, Ascii.SUB, Ascii.SI, Ascii.SUB, Ascii.EM, Ascii.SUB, 8, Ascii.RS};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.97 != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c1241Iz;
                this.A03 = anonymousClass97;
                this.A02 = abstractC09998t;
                this.A01 = c1635Ym;
            }

            private final String A01(Void... voidArr) {
                byte[] A07;
                if (KL.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        this.A01.A07().A8l(this.A04.A06().toString());
                    } catch (C9G e4) {
                        this.A00 = e4;
                        this.A01.A07().A9a(A00(44, 15, 76), C8A.A2N, new C8B(e4));
                    }
                    if (TextUtils.isEmpty(this.A04.A08())) {
                        return null;
                    }
                    if (this.A01.A04().A8z()) {
                        String str2 = A00(29, 15, 118) + this.A04.A06().toString() + A00(0, 1, 13) + this.A04.A09().toString();
                    }
                    AnonymousClass97<C1241Iz> anonymousClass972 = this.A03;
                    A07 = YD.A07(this.A01, str, this.A04);
                    anonymousClass972.AGb(A07);
                    return str;
                } catch (Throwable th) {
                    KL.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    C9G c9g = this.A00;
                    if (c9g == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(c9g.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    KL.A00(th, this);
                    String[] strArr = A06;
                    if (strArr[5].length() != strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    A06[1] = "UcJj";
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (KL.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    KL.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    KL.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
