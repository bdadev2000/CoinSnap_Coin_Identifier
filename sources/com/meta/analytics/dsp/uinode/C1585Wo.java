package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1585Wo implements InterfaceC1074Bs {
    public static byte[] A0C;
    public static String[] A0D = {"1uxTk9uu8NGqb4bRD7SiE7", "Ssi3SEW4IwUGp9bqpG4lGM81x4BmU482", "xmiG4gye91jMk16VeYAf2JsNYB9ZLAXn", "P3M63oXZ4RlItM7d6tCP0FhU4UJB0VVm", "pvrI0I2hPgkxZ7mKqcVNCE", "IViSy7bNMMRqTObQqgQHZJ03ioQVAxI3", "AKSfxMAYbymYkKmkIHXjHayRWnu0Srjs", "XaZNcJans0E3GSdApjoK7oUba6xaED3H"};
    public static final InterfaceC1077Bv A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public InterfaceC1076Bu A02;
    public DD A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<DD> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final DB A09;
    public final C1217Hz A0A;
    public final List<IB> A0B;

    public static String A0D(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-64, -62, -84, -78, -106, -76, -63, -63, -62, -57, 115, -71, -68, -63, -73, 115, -58, -52, -63, -74, 115, -75, -52, -57, -72, -127, 115, -96, -62, -58, -57, 115, -65, -68, -66, -72, -65, -52, 115, -63, -62, -57, 115, -76, 115, -89, -59, -76, -63, -58, -61, -62, -59, -57, 115, -90, -57, -59, -72, -76, -64, -127, 115, 111, 113, 97, -53, -56, -39, -58};
    }

    static {
        A0G();
        A0E = new C1588Wr();
        A0F = IF.A08(A0D(0, 4, 102));
        A0G = IF.A08(A0D(62, 4, 21));
        A0H = IF.A08(A0D(66, 4, 106));
    }

    public C1585Wo() {
        this(0);
    }

    public C1585Wo(int i9) {
        this(1, i9);
    }

    public C1585Wo(int i9, int i10) {
        this(i9, new IB(0L), new X5(i10));
    }

    public C1585Wo(int i9, IB ib, DB db) {
        this.A09 = (DB) AbstractC1192Ha.A01(db);
        this.A05 = i9;
        if (i9 == 1 || i9 == 2) {
            this.A0B = Collections.singletonList(ib);
        } else {
            ArrayList arrayList = new ArrayList();
            this.A0B = arrayList;
            arrayList.add(ib);
        }
        this.A0A = new C1217Hz(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(C1585Wo c1585Wo) {
        int i9 = c1585Wo.A01;
        c1585Wo.A01 = i9 + 1;
        return i9;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<DD> A4d = this.A09.A4d();
        int size = A4d.size();
        for (int i9 = 0; i9 < size; i9++) {
            SparseArray<DD> sparseArray = this.A06;
            int initialPayloadReadersSize = A4d.keyAt(i9);
            sparseArray.put(initialPayloadReadersSize, A4d.valueAt(i9));
        }
        this.A06.put(0, new C1590Wt(new C1587Wq(this)));
        this.A03 = null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A02 = interfaceC1076Bu;
        interfaceC1076Bu.AFi(new C1606Xj(C.TIME_UNSET));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if ((r12 & 32) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0167, code lost:
    
        if ((r12 & 32) != 0) goto L54;
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AEH(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r14, com.meta.analytics.dsp.uinode.C1079Bz r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1585Wo.AEH(com.facebook.ads.redexgen.X.Bt, com.facebook.ads.redexgen.X.Bz):int");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void AFh(long j7, long j9) {
        int size = this.A0B.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.A0B.get(i9).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 1;
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AGR(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r7) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Hz r0 = r6.A0A
            byte[] r5 = r0.A00
            r0 = 940(0x3ac, float:1.317E-42)
            r4 = 0
            r7.ADv(r5, r4, r0)
            r3 = 0
        Lb:
            r0 = 188(0xbc, float:2.63E-43)
            if (r3 >= r0) goto L27
            r2 = 0
        L10:
            r0 = 5
            if (r2 != r0) goto L18
            r7.AGP(r3)
            r0 = 1
            return r0
        L18:
            int r0 = r2 * 188
            int r0 = r0 + r3
            r1 = r5[r0]
            r0 = 71
            if (r1 == r0) goto L24
            int r3 = r3 + 1
            goto Lb
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1585Wo.AGR(com.facebook.ads.redexgen.X.Bt):boolean");
    }
}
