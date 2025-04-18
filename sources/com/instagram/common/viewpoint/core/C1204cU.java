package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okio.Utf8;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1204cU implements InterfaceC01740k, InterfaceC01780p {
    public static byte[] A0C;
    public static String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final String A0E;
    public int A00;
    public C1192cI A01;
    public AnonymousClass14 A02;
    public AnonymousClass15 A03;
    public JT A04;
    public List<W7> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1045Zs A0A;
    public final String A0B;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 27);
            if (A0D[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{55, 18, 23, 6, 2, 19, 4, 86, 23, 26, 4, 19, 23, 18, 15, 86, 26, 25, 23, 18, 19, 18, 86, 18, 23, 2, 23, 2, 45, 40, 34, 42, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, 42, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 46, 44, Utf8.REPLACEMENT_BYTE, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 50, 61, 56, 32, 49, 38, 49, 48, 11, 55, 56, 61, 55, Utf8.REPLACEMENT_BYTE, 11, 48, 49, 56, 53, 45, 11, 57, 39, 22, 12, 32, 28, 13, 26, 30, 11, 22, 9, 26, 32, 30, 12, 32, 28, 11, 30, 32, 9, 77, Byte.MAX_VALUE, 112, 101, 120, 103, 116, 36, 57, 54, 39, 36, Utf8.REPLACEMENT_BYTE, 56, 35, 106, 113, 118, 110, 106, 122, 86, 123, 10, 21, 25, 11};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C1205cV(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0M(Map<String, String> map) {
        boolean z2;
        if (A0R()) {
            if (C0608Im.A1w(this.A0A) && M4.A03(map)) {
                Log.e(A0E, A02(27, 31, 90));
                return;
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.A01.A0e()) {
                hashMap.put(A02(87, 7, 45), String.valueOf(A0E().A04()));
                hashMap.put(A02(80, 7, 86), String.valueOf(A0E().A03()));
            }
            hashMap.put(A02(70, 10, 15), AdPlacementType.NATIVE.name());
            hashMap.put(A02(154, 8, 4), this.A0B);
            if (this.A01.A0C() != null) {
                hashMap.put(A02(Opcodes.DNEG, 21, 100), String.valueOf(this.A01.A0C().A17()));
                hashMap.put(A02(96, 23, 79), String.valueOf(this.A01.A0C().A0U()));
            }
            AbstractC01710h A00 = C01720i.A00(this.A0A, this.A0A.A09(), this.A01.A6r(), this.A01.A0B(), hashMap, this.A01.A0C() != null ? this.A01.A0C().A1Q() : null);
            EnumC01700g enumC01700g = EnumC01700g.A09;
            if (A00 != null) {
                enumC01700g = A00.A0C();
            }
            if ((A00 instanceof GQ) || (A00 instanceof C0551Gf)) {
                boolean A0g = M3.A0g(this.A0A, enumC01700g, hashMap);
                String[] strArr = A0D;
                if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                    throw new RuntimeException();
                }
                A0D[5] = "kwfiBSqx7XAKe0021CxmCpt6QDry9hKe";
                if (A0g) {
                    z2 = true;
                    if (!z2 || enumC01700g == EnumC01700g.A06) {
                    }
                    LC.A04(this.A0A, A02(58, 12, 15));
                    if (this.A02 != null) {
                        AnonymousClass14 anonymousClass14 = this.A02;
                        String[] strArr2 = A0D;
                        if (strArr2[4].charAt(16) != strArr2[6].charAt(16)) {
                            anonymousClass14.ACn(this);
                            return;
                        } else {
                            A0D[0] = "IDlncozxZ6Zb4pDO4gSYUoZYwzxF1Fi";
                            anonymousClass14.ACn(this);
                            return;
                        }
                    }
                    return;
                }
            }
            z2 = false;
            if (z2) {
            }
        }
    }

    static {
        A04();
        A0E = C1204cU.class.getSimpleName();
    }

    public C1204cU(C1045Zs c1045Zs) {
        this(c1045Zs, new C1192cI());
    }

    public C1204cU(C1045Zs c1045Zs, C1192cI c1192cI) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c1192cI;
        this.A0A = c1045Zs;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        String A02 = A02(Opcodes.IF_ICMPGE, 4, 103);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        String A022 = A02(Opcodes.I2C, 8, 76);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(C1192cI c1192cI) {
        if (!this.A06) {
            this.A01 = c1192cI;
            List<C1192cI> A0c = this.A01.A0c();
            if (A0c != null && A0c.size() > 0) {
                int size = A0c.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    C1204cU adapter = new C1204cU(this.A0A);
                    adapter.A05(A0c.get(i2));
                    arrayList.add(new W7(this.A0A, adapter, (C8X) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 109));
    }

    private boolean A07() {
        return (!(this.A01.A0e() || TextUtils.isEmpty(this.A01.A0V())) || (!TextUtils.isEmpty(this.A01.A0S()) && this.A01.A0e())) && (this.A01.A0F() != null || this.A01.A0e()) && (this.A01.A0E() != null || A82() == AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A06 = this.A01.A06();
        if (A06 < 0 || A06 > 100) {
            return 0;
        }
        return A06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final C1192cI A0E() {
        return this.A01;
    }

    public final AnonymousClass14 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0Y();
    }

    public final List<W7> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            String A0Z = A0E().A0Z();
            if (A0Z != null) {
                J7 A09 = this.A0A.A09();
                String[] strArr = A0D;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
                strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
                A09.AEU(A0Z);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        if (this.A05 != null && !this.A05.isEmpty()) {
            Iterator<W7> it = this.A05.iterator();
            while (it.hasNext()) {
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(AnonymousClass14 anonymousClass14) {
        this.A02 = anonymousClass14;
    }

    public final void A0L(C1045Zs c1045Zs, AnonymousClass14 anonymousClass14, J7 j7, C02091u c02091u, JT jt) {
        int i2;
        this.A02 = anonymousClass14;
        this.A04 = jt;
        JSONObject A03 = c02091u.A03();
        C8X A01 = c02091u.A01();
        if (A01 != null) {
            i2 = A01.A06();
        } else {
            i2 = 200;
        }
        this.A00 = i2;
        A05(AnonymousClass16.A00(c1045Zs, A03, LV.A02(A03, A02(94, 2, 10))));
        if (AbstractC01750l.A06(c1045Zs, this, j7)) {
            c1045Zs.A0E().A4g();
            anonymousClass14.ACr(this, C0625Jg.A00(AdErrorType.NO_FILL));
        } else {
            if (anonymousClass14 != null) {
                anonymousClass14.ACo(this);
            }
            this.A03 = new AnonymousClass15(c1045Zs, this.A0B, this, anonymousClass14);
            this.A03.A02();
        }
    }

    public final void A0N(Map<String, String> extraData) {
        this.A0A.A09().A9w(this.A01.A6r(), extraData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        if (r4 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0O(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1204cU.A0O(java.util.Map):void");
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0B() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0d();
    }

    public final boolean A0T() {
        return C0608Im.A1R(this.A0A) && A0R() && this.A01.A0f();
    }

    public final boolean A0U() {
        return C0608Im.A1R(this.A0A) && A0R() && this.A01.A0g();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01740k
    public final String A6r() {
        return this.A01.A6r();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01740k
    public final Collection<String> A7B() {
        return A0E().A7B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01740k
    public final EnumC01730j A7c() {
        return A0E().A7c();
    }

    public AdPlacementType A82() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01780p
    public final boolean AH5() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01780p
    public final void onDestroy() {
        if (this.A03 != null) {
            AnonymousClass15 anonymousClass15 = this.A03;
            String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            anonymousClass15.A03();
        }
    }
}
