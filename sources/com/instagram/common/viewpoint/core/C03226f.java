package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03226f {
    public static AnonymousClass00 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", "cv"};
    public static final String A0E;
    public static final Map<String, AnonymousClass06> A0F;
    public static final Map<String, C03246h> A0G;
    public long A00;
    public JF A01;
    public final C03236g A03;
    public final C7j A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 92);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(M8.A02().submit(it.next()));
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        try {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Boolean bool = (Boolean) ((Future) it2.next()).get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e(A0E, A08(86, 42, 126), e);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{122, 122, 121, 125, 125, 112, 124, 122, 93, 86, 93, 92, 13, 90, 87, 15, 34, 38, 116, 39, 46, 46, 34, 35, 11, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, 64, 7, 68, 72, 74, 87, 75, 66, 83, 66, Utf8.REPLACEMENT_BYTE, 29, 31, 20, 21, 18, 27, 92, 26, 29, 21, 16, 25, 24, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, 12, 66, 64, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, Byte.MAX_VALUE, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = C03226f.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C03226f(C7j c7j) {
        this.A04 = c7j;
        this.A03 = C03236g.A06(c7j.A01());
        this.A08 = C0608Im.A2d(c7j);
        this.A09 = C0608Im.A2m(c7j, RS.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized AnonymousClass00 A03(C1044Zr c1044Zr) {
        AnonymousClass00 anonymousClass00;
        synchronized (C03226f.class) {
            if (A0A == null) {
                A0A = AnonymousClass01.A00(c1044Zr, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final AnonymousClass07 A00(int i2) {
                        this.A00 = i2;
                        return this;
                    }

                    public final AnonymousClass07 A01(int i2) {
                        this.A01 = i2;
                        return this;
                    }

                    public final AnonymousClass07 A02(boolean z2) {
                        this.A02 = z2;
                        return this;
                    }

                    public final AnonymousClass07 A03(boolean z2) {
                        this.A03 = z2;
                        return this;
                    }

                    public final AnonymousClass07 A04(boolean z2) {
                        this.A04 = z2;
                        return this;
                    }

                    public final AnonymousClass08 A05() {
                        return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(C0608Im.A06(c1044Zr)).A02(c1044Zr.A04().A9O()).A01(-1).A03(C0608Im.A0m(c1044Zr)).A04(C0608Im.A2l(c1044Zr)).A05(), A05(c1044Zr));
            }
            anonymousClass00 = A0A;
        }
        return anonymousClass00;
    }

    public static AnonymousClass06 A04(C7j c7j, String str) {
        AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (C03256i.A06(c7j) && anonymousClass06 != null) {
            AnonymousClass06 storedCacheData = new AnonymousClass06(anonymousClass06);
            return storedCacheData;
        }
        AnonymousClass06 storedCacheData2 = new AnonymousClass06(str);
        return storedCacheData2;
    }

    public static C1049Zw A05(C1044Zr c1044Zr) {
        return new C1049Zw(c1044Zr);
    }

    public static synchronized List<String> A09(C7j c7j) {
        List<String> list;
        synchronized (C03226f.class) {
            if (A0B == null) {
                A0B = new ArrayList();
                A0J(A0B, c7j);
            }
            list = A0B;
        }
        return list;
    }

    public static /* synthetic */ Map A0A() {
        Map<String, C03246h> map = A0G;
        if (A0D[7].length() == 16) {
            throw new RuntimeException();
        }
        A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
        return map;
    }

    public static void A0H(C7j c7j, String str) {
        if (C03256i.A06(c7j) && !TextUtils.isEmpty(str)) {
            C03246h c03246h = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c03246h != null) {
                c03246h.A00 = A08(Opcodes.INVOKEDYNAMIC, 4, Opcodes.FNEG);
                C1044Zr A01 = c7j.A01();
                RW A05 = RW.A05(A01);
                String A08 = RW.A08(A01, L5.A00(str));
                if (A08 == null) {
                    A08 = str;
                }
                C03256i.A04(c7j, c03246h, A05.A0H(A08));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(JE je) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(Opcodes.FRETURN, 12, 71), C0687Lu.A04(this.A00));
        this.A01.A04(je, hashMap);
    }

    public static void A0J(List<String> cacheDirs, C7j c7j) {
        A0K(cacheDirs, C1236d0.A01(c7j));
        A0K(cacheDirs, C03236g.A07(c7j));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String path2 = A08(0, 0, 103);
        if (path != path2) {
            Locale locale = Locale.getDefault();
            String path3 = A0D[4];
            if (path3.length() == 2) {
                throw new RuntimeException();
            }
            A0D[4] = "BAOa9xP";
            String path4 = path.toLowerCase(locale);
            list.add(path4);
        }
    }

    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0N(String str, int i2, int i3) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, str);
            A04.A03 = A08(Opcodes.INVOKEDYNAMIC, 4, Opcodes.FNEG);
            A04.A01 = i3;
            A04.A00 = i2;
            return A03(this.A04.A01()).AFl(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i2, i3, A08(Opcodes.TABLESWITCH, 4, 85));
    }

    public final File A0O(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(Opcodes.INVOKEDYNAMIC, 4, Opcodes.FNEG);
        return A03(this.A04.A01()).AFm(A04);
    }

    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(Opcodes.INVOKEDYNAMIC, 4, Opcodes.FNEG);
        String AFo = A03(this.A04.A01()).AFo(A04);
        return AFo != null ? AFo : str;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        AbstractC0638Ju.A05(A08(128, 19, Opcodes.LUSHR), A08(38, 16, Opcodes.LSHR), A08(8, 8, 50));
    }

    public final void A0U() {
        AbstractC0638Ju.A05(A08(Opcodes.I2S, 16, 80), A08(54, 14, 32), A08(0, 8, 20));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(C6X c6x, C6Y c6y) {
        AbstractC0638Ju.A05(A08(Opcodes.IF_ICMPGT, 7, 81), A08(68, 18, 90), A08(16, 8, 75));
        this.A00 = System.currentTimeMillis();
        C03256i.A02(this.A04, c6y, C03256i.A07, A08(24, 14, 20), -1L);
        M8.A03().execute(new C1050Zx(this, new ArrayList(this.A05), c6y, c6x, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C03186b c03186b) {
        this.A05.add(new CallableC03196c(this, c03186b));
    }

    public final void A0Y(C03186b c03186b) {
        c03186b.A05 = true;
        this.A06.add(new CallableC03196c(this, c03186b));
    }

    public final void A0Z(C03186b c03186b) {
        c03186b.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC03176a(this, c03186b));
        } else {
            this.A06.add(new CallableC03196c(this, c03186b));
        }
    }

    public final void A0a(C03186b c03186b) {
        if (this.A09) {
            this.A05.add(new CallableC03176a(this, c03186b));
        } else {
            this.A05.add(new CallableC03196c(this, c03186b));
        }
    }

    public final void A0b(final C03206d c03206d) {
        Callable<Boolean> callable = new Callable<Boolean>(c03206d) { // from class: com.facebook.ads.redexgen.X.6e
            public static byte[] A02;
            public final C03206d A00;

            static {
                A02();
            }

            public static String A01(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 2);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A02 = new byte[]{-35, -31, -43, -37, -39};
            }

            {
                this.A00 = c03206d;
            }

            private final Boolean A00() {
                C7j c7j;
                boolean z2;
                C03236g c03236g;
                boolean z3;
                boolean z4;
                C7j c7j2;
                AnonymousClass00 A03;
                Map map;
                if (KQ.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, Opcodes.FREM), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    c7j = C03226f.this.A04;
                    if (C03256i.A06(c7j)) {
                        map = C03226f.A0F;
                        map.put(this.A00.A07, anonymousClass06);
                    }
                    z2 = C03226f.this.A08;
                    boolean precacheResult = false;
                    if (!z2) {
                        c03236g = C03226f.this.A03;
                        if (c03236g.A0D(this.A00) != null) {
                            precacheResult = true;
                        }
                    } else {
                        c7j2 = C03226f.this.A04;
                        A03 = C03226f.A03(c7j2.A01());
                        precacheResult = A03.AFl(anonymousClass06, false).A01();
                    }
                    C6l c6l = this.A00.A00;
                    if (c6l != null && c6l.A02()) {
                        int A00 = c6l.A00();
                        int A01 = c6l.A01();
                        if (A00 <= 0 || A01 <= 0) {
                            z3 = C03226f.this.A08;
                            if (z3) {
                                A04(this.A00.A07, anonymousClass06);
                            } else {
                                A03(this.A00.A03, this.A00.A04);
                            }
                        } else {
                            z4 = C03226f.this.A08;
                            if (z4) {
                                anonymousClass06.A00 = A00;
                                anonymousClass06.A01 = A01;
                                A04(this.A00.A07, anonymousClass06);
                            } else {
                                A03(A00, A01);
                            }
                        }
                    }
                    return Boolean.valueOf(precacheResult);
                } catch (Throwable th) {
                    KQ.A00(th, this);
                    return null;
                }
            }

            private void A03(int i2, int i3) {
                C03236g c03236g;
                C7j c7j;
                Map map;
                c03236g = C03226f.this.A03;
                c7j = C03226f.this.A04;
                Bitmap A0E2 = c03236g.A0E(c7j, this.A00.A07, i2, i3, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C03226f.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                C7j c7j;
                AnonymousClass00 A03;
                Map map;
                c7j = C03226f.this.A04;
                A03 = C03226f.A03(c7j.A01());
                Bitmap A00 = A03.AFl(anonymousClass06, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C03226f.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (KQ.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    KQ.A00(th, this);
                    return null;
                }
            }
        };
        if (!c03206d.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C03206d c03206d) {
        c03206d.A02 = true;
        A0b(c03206d);
    }

    public final void A0d(JF jf) {
        this.A01 = jf;
    }
}
