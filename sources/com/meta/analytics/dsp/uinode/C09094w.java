package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09094w {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public int A00;
    public C4v A01;
    public ArrayList<AnonymousClass56> A02;
    public int A03;
    public AnonymousClass54 A04;
    public final ArrayList<AnonymousClass56> A05;
    public final ArrayList<AnonymousClass56> A06;
    public final List<AnonymousClass56> A07;
    public final /* synthetic */ C1119Eb A08;

    public static String A04(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, Ascii.RS, Ascii.RS, 43, Ascii.GS, 44, -14, -53, -48, -62, -21, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, Ascii.DLE, Ascii.SYN, -36, -38, -33, 36, 37, Ascii.DC2, 37, Ascii.SYN, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, Ascii.RS, 19, Ascii.US, Ascii.RS, 35, Ascii.EM, 35, 36, Ascii.NAK, Ascii.RS, 19, 41, -48, Ascii.DC4, Ascii.NAK, 36, Ascii.NAK, 19, 36, Ascii.NAK, Ascii.DC4, -34, -48, -7, Ascii.RS, 38, 17, Ascii.FS, Ascii.EM, Ascii.DC4, -48, Ascii.EM, 36, Ascii.NAK, Ascii.GS, -48, 32, Ascii.US, 35, Ascii.EM, 36, Ascii.EM, Ascii.US, Ascii.RS, -48, -13, Ascii.CAN, Ascii.CR, Ascii.EM, Ascii.CAN, Ascii.GS, 19, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CR, 35, -54, Ascii.SO, Ascii.SI, Ascii.RS, Ascii.SI, Ascii.CR, Ascii.RS, Ascii.SI, Ascii.SO, -40, -54, -13, Ascii.CAN, 32, Ascii.VT, Ascii.SYN, 19, Ascii.SO, -54, 32, 19, Ascii.SI, 33, -54, Ascii.DC2, Ascii.EM, Ascii.SYN, Ascii.SO, Ascii.SI, Ascii.FS, -54, Ascii.VT, Ascii.SO, Ascii.VT, Ascii.SUB, Ascii.RS, Ascii.SI, Ascii.FS, -54, Ascii.SUB, Ascii.EM, Ascii.GS, 19, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -73, -84, -60, -70, -64, -65, 107, -76, -71, -81, -80, -61, 107, -66, -77, -70, -64, -73, -81, 107, -71, -70, -65, 107, -83, -80, 107, 120, 124, 107, -84, -79, -65, -80, -67, 107, -64, -71, -77, -76, -81, -76, -71, -78, 107, -84, 107, -63, -76, -80, -62, -123, -60, -61, -85, -66, -70, -52, -89, -70, -72, -50, -72, -63, -70, -71};
    }

    static {
        A05();
    }

    public C09094w(C1119Eb c1119Eb) {
        this.A08 = c1119Eb;
        ArrayList<AnonymousClass56> arrayList = new ArrayList<>();
        this.A05 = arrayList;
        this.A02 = null;
        this.A06 = new ArrayList<>();
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A03 = 2;
        this.A00 = 2;
    }

    private final View A00(int i9, boolean z8) {
        return A0I(i9, z8, Long.MAX_VALUE).A0H;
    }

    private final AnonymousClass56 A01(int i9) {
        int size;
        int A04;
        ArrayList<AnonymousClass56> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i10 = 0; i10 < size; i10++) {
            AnonymousClass56 anonymousClass56 = this.A02.get(i10);
            if (!anonymousClass56.A0g()) {
                int i11 = anonymousClass56.A0I();
                if (i11 == i9) {
                    anonymousClass56.A0T(32);
                    return anonymousClass56;
                }
            }
        }
        if (this.A08.A04.A0A() && (A04 = this.A08.A00.A04(i9)) > 0) {
            int offsetPosition = this.A08.A04.A0E();
            if (A04 < offsetPosition) {
                long A042 = this.A08.A04.A04(A04);
                for (int i12 = 0; i12 < size; i12++) {
                    AnonymousClass56 anonymousClass562 = this.A02.get(i12);
                    if (!anonymousClass562.A0g() && anonymousClass562.A0K() == A042) {
                        anonymousClass562.A0T(32);
                        return anonymousClass562;
                    }
                }
            }
        }
        return null;
    }

    private final AnonymousClass56 A02(int i9, boolean z8) {
        View A08;
        int size = this.A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnonymousClass56 anonymousClass56 = this.A05.get(i10);
            if (!anonymousClass56.A0g()) {
                int scrapCount = anonymousClass56.A0I();
                if (scrapCount == i9 && !anonymousClass56.A0Z() && (this.A08.A0s.A09 || !anonymousClass56.A0a())) {
                    anonymousClass56.A0T(32);
                    return anonymousClass56;
                }
            }
        }
        if (!z8 && (A08 = this.A08.A01.A08(i9)) != null) {
            AnonymousClass56 A0F = C1119Eb.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0S(A08);
                A0F.A0T(8224);
                return A0F;
            }
            throw new IllegalStateException(A04(565, 52, 17) + A0F + this.A08.A1H());
        }
        int size2 = this.A06.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnonymousClass56 anonymousClass562 = this.A06.get(i11);
            if (!anonymousClass562.A0Z()) {
                int scrapCount2 = anonymousClass562.A0I();
                if (scrapCount2 == i9) {
                    if (!z8) {
                        this.A06.remove(i11);
                    }
                    return anonymousClass562;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.meta.analytics.dsp.uinode.AnonymousClass56 A03(long r8, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C09094w.A03(long, int, boolean):com.facebook.ads.redexgen.X.56");
    }

    private final void A06() {
        boolean z8;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z8 = C1119Eb.A1E;
        if (z8) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i9) {
        A0Z(this.A06.get(i9), true);
        this.A06.remove(i9);
    }

    private void A08(ViewGroup viewGroup, boolean z8) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                String str = strArr[7];
                String str2 = strArr[6];
                int charAt = str.charAt(8);
                int i9 = str2.charAt(8);
                if (charAt == i9) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z8) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AnonymousClass56 anonymousClass56) {
        if (this.A08.A1o()) {
            View view = anonymousClass56.A0H;
            if (C3T.A00(view) == 0) {
                C3T.A09(view, 1);
            }
            if (!C3T.A0F(view)) {
                anonymousClass56.A0T(16384);
                C3T.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0H instanceof ViewGroup) {
            A08((ViewGroup) anonymousClass56.A0H, false);
        }
    }

    private final void A0B(AnonymousClass56 anonymousClass56) {
        if (0 != 0) {
            throw new NullPointerException(A04(617, 14, 27));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(anonymousClass56);
        }
    }

    private final boolean A0C(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0a()) {
            return this.A08.A0s.A07();
        }
        if (anonymousClass56.A03 >= 0 && anonymousClass56.A03 < this.A08.A04.A0E()) {
            if (!this.A08.A0s.A07()) {
                int A03 = this.A08.A04.A03(anonymousClass56.A03);
                int type = anonymousClass56.A0H();
                if (A03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0A() || anonymousClass56.A0K() == this.A08.A04.A04(anonymousClass56.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + anonymousClass56 + this.A08.A1H());
    }

    private boolean A0D(AnonymousClass56 anonymousClass56, int i9, int i10, long startBindNs) {
        anonymousClass56.A08 = this.A08;
        int A0H = anonymousClass56.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (startBindNs != Long.MAX_VALUE) {
            C4v c4v = this.A01;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int charAt = str.charAt(0);
            int viewType = str2.charAt(0);
            if (charAt == viewType) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4v.A0A(A0H, nanoTime, startBindNs)) {
                return false;
            }
        }
        this.A08.A04.A09(anonymousClass56, i9);
        this.A01.A05(anonymousClass56.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(anonymousClass56);
        if (this.A08.A0s.A07()) {
            anonymousClass56.A04 = i10;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i9) {
        return this.A05.get(i9).A0H;
    }

    public final View A0G(int i9) {
        return A00(i9, false);
    }

    public final C4v A0H() {
        if (this.A01 == null) {
            this.A01 = new C4v();
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x026b, code lost:
    
        if (r5 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0271, code lost:
    
        if (r9.A0Z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a1, code lost:
    
        if (r5 == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.meta.analytics.dsp.uinode.AnonymousClass56 A0I(int r21, boolean r22, long r23) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C09094w.A0I(int, boolean, long):com.facebook.ads.redexgen.X.56");
    }

    public final List<AnonymousClass56> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.A06.get(i9).A0M();
        }
        int i10 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i10; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        ArrayList<AnonymousClass56> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int scrapCount2 = str.charAt(0);
        int cachedCount = str2.charAt(0);
        if (scrapCount2 != cachedCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int scrapCount3 = 0; scrapCount3 < changedScrapCount; scrapCount3++) {
                this.A02.get(scrapCount3).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AnonymousClass56> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i9 = 0; i9 < size; i9++) {
            C09034p c09034p = (C09034p) this.A06.get(i9).A0H.getLayoutParams();
            if (c09034p != null) {
                c09034p.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0A()) {
            int size = this.A06.size();
            for (int i9 = 0; i9 < size; i9++) {
                AnonymousClass56 anonymousClass56 = this.A06.get(i9);
                int i10 = A0A[0].length();
                if (i10 != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (anonymousClass56 != null) {
                    anonymousClass56.A0T(6);
                    anonymousClass56.A0W(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int extraCache;
        if (this.A08.A06 != null) {
            AbstractC09024o abstractC09024o = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                extraCache = abstractC09024o.A00;
            }
            throw new RuntimeException();
        }
        extraCache = 0;
        this.A00 = this.A03 + extraCache;
        int extraCache2 = this.A06.size();
        for (int i9 = extraCache2 - 1; i9 >= 0; i9--) {
            int size = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int i10 = str.charAt(0);
            int extraCache3 = str2.charAt(0);
            if (i10 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int extraCache4 = this.A00;
            if (size > extraCache4) {
                A07(i9);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i9) {
        this.A03 = i9;
        A0O();
    }

    public final void A0R(View view) {
        AnonymousClass56 A0F = C1119Eb.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0O();
        A0X(A0F);
    }

    public final void A0S(View view) {
        AnonymousClass56 A0F = C1119Eb.A0F(view);
        if (A0F.A0i(12) || !A0F.A0d() || this.A08.A1w(A0F)) {
            boolean A0Z = A0F.A0Z();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!A0Z || A0F.A0a() || this.A08.A04.A0A()) {
                A0F.A0V(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1H());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0F.A0V(this, true);
        this.A02.add(A0F);
    }

    public final void A0T(View view) {
        AnonymousClass56 A0F = C1119Eb.A0F(view);
        if (A0F.A0c()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0b()) {
            A0F.A0S();
        } else if (A0F.A0g()) {
            A0F.A0O();
        }
        A0X(A0F);
    }

    public final void A0U(AbstractC08904c abstractC08904c, AbstractC08904c abstractC08904c2, boolean z8) {
        A0P();
        A0H().A08(abstractC08904c, abstractC08904c2, z8);
    }

    public final void A0V(C4v c4v) {
        C4v c4v2 = this.A01;
        if (c4v2 != null) {
            c4v2.A04();
        }
        this.A01 = c4v;
        if (c4v != null) {
            c4v.A07(this.A08.getAdapter());
        }
    }

    public final void A0W(AnonymousClass54 anonymousClass54) {
        this.A04 = anonymousClass54;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r0 = r10.A0i(526);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        r2 = r9.A06.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r2 < r9.A00) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r2 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        A07(0);
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        r0 = com.meta.analytics.dsp.uinode.C1119Eb.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        if (r2 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        r0 = r9.A08.A02.A05(r10.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (r0 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if (r2 < 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r1 = r9.A06.get(r2).A03;
        r0 = r9.A08.A02.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r9.A06.add(r2, r10);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        if (r7 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        A0Z(r10, true);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0X(com.meta.analytics.dsp.uinode.AnonymousClass56 r10) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C09094w.A0X(com.facebook.ads.redexgen.X.56):void");
    }

    public final void A0Y(AnonymousClass56 anonymousClass56) {
        boolean z8;
        z8 = anonymousClass56.A0G;
        if (z8) {
            this.A02.remove(anonymousClass56);
        } else {
            this.A05.remove(anonymousClass56);
        }
        anonymousClass56.A0F = null;
        anonymousClass56.A0G = false;
        anonymousClass56.A0O();
    }

    public final void A0Z(AnonymousClass56 anonymousClass56, boolean z8) {
        C1119Eb.A0s(anonymousClass56);
        if (anonymousClass56.A0i(16384)) {
            anonymousClass56.A0U(0, 16384);
            C3T.A0B(anonymousClass56.A0H, null);
        }
        if (z8) {
            A0B(anonymousClass56);
        }
        anonymousClass56.A08 = null;
        A0H().A09(anonymousClass56);
    }
}
