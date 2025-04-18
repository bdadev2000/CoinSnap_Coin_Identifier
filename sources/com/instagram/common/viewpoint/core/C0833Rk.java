package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.common.primitives.UnsignedBytes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Rk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0833Rk {
    public static byte[] A0G;
    public static String[] A0H = {"YuGvtiviQVR", "ZhJp0z4dUN", "YWv4zGcwogafSGFsXYmLIXL4tbjSTGT", "UM7SABu2ufM", "2gPy2hJr9M", "yZRmnvTn4zHntgpYIACfXRb3ExDVKnv", "qUSRIBeTtwG", "WSvVNugGHbUgKJE0aBRLXmETVgvdQ"};
    public static final String A0I;
    public int A00;
    public int A01;
    public int A02;
    public long A03;

    @Nullable
    public KY A04;
    public C0834Rl A05;
    public Map<String, Integer> A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final Handler A0B;
    public final View A0C;
    public final C1045Zs A0D;
    public final WeakReference<AbstractC0832Rj> A0E;
    public final boolean A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static int A08(Vector<Rect> vector) {
        int size = vector.size();
        int[] iArr = new int[size * 2];
        int[] iArr2 = new int[size * 2];
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, size * 2, size * 2);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Rect elementAt = vector.elementAt(i4);
            int i5 = i2 + 1;
            iArr[i2] = elementAt.left;
            int i6 = i3 + 1;
            iArr2[i3] = elementAt.bottom;
            i2 = i5 + 1;
            iArr[i5] = elementAt.right;
            i3 = i6 + 1;
            iArr2[i6] = elementAt.top;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i7 = 0; i7 < size; i7++) {
            Rect elementAt2 = vector.elementAt(i7);
            int A09 = A09(iArr, elementAt2.left);
            int A092 = A09(iArr, elementAt2.right);
            int A093 = A09(iArr2, elementAt2.top);
            int A094 = A09(iArr2, elementAt2.bottom);
            for (int i8 = A09 + 1; i8 <= A092; i8++) {
                for (int i9 = A093 + 1; i9 <= A094; i9++) {
                    zArr[i8][i9] = true;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size * 2; i11++) {
            for (int i12 = 0; i12 < size * 2; i12++) {
                i10 += zArr[i11][i12] ? (iArr[i11] - iArr[i11 - 1]) * (iArr2[i12] - iArr2[i12 - 1]) : 0;
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x022e, code lost:
    
        if (com.instagram.common.viewpoint.core.MK.A03(r8) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0230, code lost:
    
        A0N(r6, false, A0H(org.objectweb.asm.Opcodes.INVOKEINTERFACE, 26, 71));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0244, code lost:
    
        return new com.instagram.common.viewpoint.core.C0834Rl(com.instagram.common.viewpoint.core.C0Q.A0K, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0253, code lost:
    
        r3 = com.instagram.common.viewpoint.core.ML.A01(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025b, code lost:
    
        if (com.instagram.common.viewpoint.core.M4.A04(r3) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x025d, code lost:
    
        A0N(r6, false, A0H(156, 29, 89));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0272, code lost:
    
        return new com.instagram.common.viewpoint.core.C0834Rl(com.instagram.common.viewpoint.core.C0Q.A09, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0277, code lost:
    
        if (com.instagram.common.viewpoint.core.C0608Im.A1w(r8) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        if (com.instagram.common.viewpoint.core.M4.A03(r3) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027f, code lost:
    
        A0N(r6, false, A0H(31, 31, 29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0294, code lost:
    
        return new com.instagram.common.viewpoint.core.C0834Rl(com.instagram.common.viewpoint.core.C0Q.A04, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0295, code lost:
    
        A0N(r6, true, A0H(396, 19, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02aa, code lost:
    
        return new com.instagram.common.viewpoint.core.C0834Rl(com.instagram.common.viewpoint.core.C0Q.A0I, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0250, code lost:
    
        if (com.instagram.common.viewpoint.core.MK.A03(r8) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009d, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x009f, code lost:
    
        A0N(r6, false, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a9, code lost:
    
        return new com.instagram.common.viewpoint.core.C0834Rl(com.instagram.common.viewpoint.core.C0Q.A0G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00b6, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.C0834Rl A0E(android.view.View r6, int r7, com.instagram.common.viewpoint.core.C1045Zs r8) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0833Rk.A0E(android.view.View, int, com.facebook.ads.redexgen.X.Zs):com.facebook.ads.redexgen.X.Rl");
    }

    public static String A0H(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A0G = new byte[]{110, 118, 115, 124, Byte.MAX_VALUE, -76, 115, 115, 119, 110, -73, -63, 110, -121, -34, -48, -37, -49, -121, -39, -52, -56, -38, -42, -43, -95, -121, -69, -81, -9, -52, 126, -95, 93, -90, -80, 93, -84, -85, 93, -79, -84, -83, 93, -84, -93, 93, -79, -91, -94, 93, -119, -84, -96, -88, -80, -96, -81, -94, -94, -85, 107, -54, -24, -11, -11, -10, -5, -89, -18, -20, -5, -89, -13, -10, -22, -24, -5, -16, -10, -11, -89, -10, -11, -89, -6, -22, -7, -20, -20, -11, -75, -46, -3, -13, 1, -4, -75, 2, -82, -5, -17, -7, -13, -82, 1, -13, -4, 1, -13, -82, 2, -3, -82, 1, -13, 2, -82, -15, -10, -13, -15, -7, -82, -9, -4, 2, -13, 0, 4, -17, -6, -82, -12, -3, 0, -82, -4, -3, -4, -69, 0, -13, -2, -13, -17, 2, -82, -15, -10, -13, -15, -7, -13, 0, -68, -60, -34, -14, -32, -18, -38, -21, -35, -103, -30, -20, -103, -24, -37, -20, -19, -21, -18, -36, -19, -30, -25, -32, -103, -17, -30, -34, -16, -89, -70, -54, -39, -52, -52, -43, -121, -48, -38, -121, -43, -42, -37, -121, -48, -43, -37, -52, -39, -56, -54, -37, -48, -35, -52, -107, -120, -100, -103, 84, -88, -99, -105, -97, -103, -90, 84, -105, -107, -94, -94, -93, -88, 84, -106, -103, 84, -94, -103, -101, -107, -88, -99, -86, -103, -103, -84, -88, -70, 99, -16, -4, -6, -69, -13, -18, -16, -14, -17, -4, -4, -8, -69, -18, -15, 0, -69, -10, -5, 1, -14, -1, -5, -18, -7, -69, 3, -10, -14, 4, -69, -45, 2, -7, -7, -32, -16, -1, -14, -14, -5, -50, -15, -31, -4, -4, -7, -17, -18, -1, -3, -47, -12, -26, -7, -11, 7, -80, -8, -15, 3, -80, -7, -2, 6, -7, 3, -7, -14, -4, -11, -80, -12, -7, -3, -11, -2, 3, -7, -1, -2, 3, -80, -72, 7, -51, -40, -84, -49, -63, -44, -48, -30, -117, -45, -52, -34, -117, -39, -38, -117, -37, -52, -35, -48, -39, -33, -103, -86, 126, -95, -109, -90, -94, -76, 93, -90, -80, 93, -85, -78, -87, -87, 107, -87, 125, -96, -110, -91, -95, -77, 92, -91, -81, 92, -80, -85, -85, 92, -80, -82, -99, -86, -81, -84, -99, -82, -95, -86, -80, 106, -67, -111, -76, -90, -71, -75, -57, 112, -71, -61, 112, -58, -71, -61, -71, -78, -68, -75, 126, 10, -34, 1, -13, 6, 2, 20, -67, 13, -2, 15, 2, 11, 17, -67, 6, 16, -67, 11, 12, 17, -67, 16, 2, 17, -67, 17, 12, -67, -13, -26, -16, -26, -33, -23, -30, -53, -84, UnsignedBytes.MAX_POWER_OF_TWO, -93, -107, -88, -92, -74, 95, -75, -88, -78, -88, -95, -85, -92, 95, -96, -79, -92, -96, 95, -88, -78, 95, -77, -82, -82, 95, -78, -84, -96, -85, -85, 95, -102, 100, 109, 113, -91, 100, 100, 95, -75, -88, -78, -88, -95, -85, -92, 107, 95, -94, -76, -79, -79, -92, -83, -77, 95, -77, -89, -79, -92, -78, -89, -82, -85, -93, 95, 100, 109, 113, -91, 100, 100, -100, -94, 118, -103, -117, -98, -102, -84, 85, -84, -98, -93, -103, -92, -84, 85, -98, -88, 85, -93, -92, -87, 85, -88, -102, -87, 85, -87, -92, 85, -117, 126, -120, 126, 119, -127, 122, 99, -110, -109, -104, 68, -102, -115, -119, -101, -123, -122, -112, -119, -32, -46, -96, -109, -113, -95, -117, -116, -106, -113, -13, -19, 21, 17, 2, -93, -95, -56, -70, -65, -75, -64, -56};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized String A0R() {
        return C0Q.values()[this.A05.A01()].toString() + String.format(Locale.US, A0H(0, 9, 46), Float.valueOf(this.A05.A00() * 100.0f));
    }

    static {
        A0M();
        A0I = C0833Rk.class.getSimpleName();
    }

    public C0833Rk(View view, int i2, int i3, boolean z2, WeakReference<AbstractC0832Rj> weakReference, C1045Zs c1045Zs) {
        this.A0B = new Handler();
        this.A01 = 0;
        this.A02 = 1000;
        this.A08 = true;
        this.A05 = new C0834Rl(C0Q.A0L);
        this.A06 = new HashMap();
        this.A03 = 0L;
        this.A00 = 0;
        this.A07 = true;
        this.A0D = c1045Zs;
        this.A0C = view;
        if (this.A0C.getId() == -1) {
            M3.A0K(this.A0C);
        }
        this.A0A = i2;
        this.A0E = weakReference;
        this.A0F = z2;
        if (i3 < 0) {
            if (BuildConfigApi.isDebug()) {
                Log.w(A0I, A0H(211, 29, 20));
            }
            i3 = 0;
        }
        this.A09 = i3;
    }

    public C0833Rk(View view, int i2, WeakReference<AbstractC0832Rj> weakReference, C1045Zs c1045Zs) {
        this(view, i2, 0, false, weakReference, c1045Zs);
    }

    public C0833Rk(View view, int i2, boolean z2, WeakReference<AbstractC0832Rj> weakReference, C1045Zs c1045Zs) {
        this(view, i2, 0, z2, weakReference, c1045Zs);
    }

    public static float A00(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    public static int A01(int i2, View view) {
        int width = view.getWidth() * view.getHeight();
        float onePixelPercentage = width > 0 ? 100.0f / width : 100.0f;
        int viewArea = (int) Math.max(i2, Math.ceil(onePixelPercentage));
        return viewArea;
    }

    public static /* synthetic */ int A05(C0833Rk c0833Rk) {
        int i2 = c0833Rk.A00;
        c0833Rk.A00 = i2 + 1;
        return i2;
    }

    public static int A09(int[] iArr, int i2) {
        int i3 = 0;
        int mid = iArr.length;
        while (i3 < mid) {
            int low = mid - i3;
            int high = (low / 2) + i3;
            int low2 = iArr[high];
            if (low2 == i2) {
                return high;
            }
            int low3 = iArr[high];
            if (low3 > i2) {
                mid = high;
            } else {
                i3 = high + 1;
            }
        }
        return -1;
    }

    public static Vector<Rect> A0K(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        for (int indexOfChild = viewGroup.indexOfChild(view) + 1; indexOfChild < viewGroup.getChildCount(); indexOfChild++) {
            View childAt = viewGroup.getChildAt(indexOfChild);
            if (A0H[0].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[5] = "k1JcZ1wpbQO9ikEolBidSsMChjYk4Sl";
            strArr[2] = "tjbQFFO1F8PkdaxFL56rw4qlI30x63G";
            int childIndex = 1;
            boolean z2 = !(childAt instanceof QS);
            if ((childAt instanceof UA) && AbstractC0835Rm.A00(childAt)) {
                childIndex = 0;
            }
            if (z2 && childIndex != 0) {
                Vector<Rect> rectVector = A0L(childAt);
                vector.addAll(rectVector);
            }
        }
        Vector<Rect> rectVector2 = A0K(viewGroup);
        vector.addAll(rectVector2);
        return vector;
    }

    public static Vector<Rect> A0L(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!view.isShown() || (Build.VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        String name = view.getClass().getName();
        if (A0H[7].length() == 13) {
            throw new RuntimeException();
        }
        A0H[7] = "IkE0lymuYwIsZPrnhjlWmNJdNq4n";
        boolean isTransparentToolbar = name.equals(A0H(245, 50, 109)) && view.getBackground() != null && (view.getBackground() instanceof GradientDrawable);
        if ((view instanceof ViewGroup) && (AbstractC0835Rm.A00(view) || isTransparentToolbar)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                Vector<Rect> visibleRectInView = A0L(viewGroup.getChildAt(i2));
                vector.addAll(visibleRectInView);
            }
            return vector;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            vector.add(rect);
        }
        return vector;
    }

    public static void A0N(View view, boolean z2, String str) {
        if (BuildConfigApi.isDebug()) {
            String str2 = A0H(240, 5, 35) + view + A0H(9, 4, 46) + (z2 ? A0H(579, 8, 10) : A0H(565, 12, 4)) + A0H(13, 14, 71) + str;
        }
    }

    public final synchronized Map<String, String> A0S() {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.put(A0H(589, 3, 127), String.valueOf(this.A05.A01()));
        hashMap.put(A0H(587, 2, 93), String.valueOf(this.A05.A00()));
        hashMap.put(A0H(577, 2, 74), new JSONObject(this.A06).toString());
        hashMap.put(A0H(592, 2, 13), C0687Lu.A05(this.A03));
        Map<String, String> viewabilityData = this.A05.A03();
        hashMap.putAll(viewabilityData);
        return hashMap;
    }

    public final synchronized void A0T() {
        this.A05 = new C0834Rl(C0Q.A0L);
    }

    public final synchronized void A0U() {
        if (this.A04 != null) {
            A0V();
        }
        if (this.A07) {
            this.A0D.A0E().A3d();
        }
        this.A04 = new C7B(this, this.A0D);
        this.A0B.postDelayed(this.A04, this.A01);
        this.A08 = false;
        this.A00 = 0;
        this.A05 = new C0834Rl(C0Q.A0L);
        this.A06 = new HashMap();
    }

    public final synchronized void A0V() {
        if (this.A07) {
            this.A0D.A0E().A3e();
        }
        this.A0B.removeCallbacks(this.A04);
        this.A04 = null;
        this.A08 = true;
        this.A00 = 0;
    }

    public final void A0W(int i2) {
        this.A01 = i2;
    }

    public final void A0X(int i2) {
        if (BuildConfigApi.isDebug() && !this.A0F) {
            Log.w(A0I, A0H(92, 64, 110));
        }
        this.A02 = i2;
    }

    public final void A0Y(boolean z2) {
        this.A07 = z2;
    }

    public final synchronized boolean A0Z() {
        return this.A08;
    }
}
