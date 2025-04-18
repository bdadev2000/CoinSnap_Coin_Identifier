package com.facebook.ads.redexgen.uinode;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ST extends AbstractC03244c<SN> {
    public static String[] A0H = {"U2dBX20JaeRgS8KUkn4U", "4wbYdEjd6EY1wYpAHERmBQ5UbLFk3rIE", "poCzv8x7tLJqIV5ZIWq", "9iyDRDGf0xWQ70I4mtfqA0IQycZfZ47C", "v2glKkwlOEfR0MfsI3TqmdNecXONmhZ3", "6XdF3RdtkhprEZiVEVCq65KOMzsBziM7", "2OiOSmaAlP7OTnmHwLOjTjXlL7jeDPuL", "nkMLdycTxYcJ5galJfvG8bjM9rVBse8i"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MB A04;
    public MC A05;
    public String A06;
    public List<C0842Pp> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1173b5 A0A;
    public final C03756c A0B;
    public final C1070Yn A0C;
    public final J2 A0D;
    public final C0729Lg A0E;
    public final C0906Sb A0F;
    public final RE A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public ST(C1070Yn c1070Yn, List<C0842Pp> list, AbstractC1173b5 abstractC1173b5, J2 j22, C03756c c03756c, RE re2, C0729Lg c0729Lg, MC mc2, String str, int i10, int i11, int i12, int i13, C0906Sb c0906Sb, MB mb2) {
        this.A0C = c1070Yn;
        this.A0D = j22;
        this.A0B = c03756c;
        this.A0G = re2;
        this.A0E = c0729Lg;
        this.A05 = mc2;
        this.A0A = abstractC1173b5;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = c0906Sb;
        this.A04 = mb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SN A0C(ViewGroup viewGroup, int i10) {
        return new SN(AbstractC0824Ox.A00(new OO(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0H(this.A04).A0K(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A0y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(SN sn, int i10) {
        sn.A0j(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            sn.AFr();
            String[] strArr = A0H;
            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            A0H[1] = "f5MkbcX2dFxcVTBDK6f4VKhLC7wzzoeI";
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    public final int A0E() {
        return this.A07.size();
    }
}
