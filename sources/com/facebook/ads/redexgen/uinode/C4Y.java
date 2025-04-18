package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4Y {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC03364o A02;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, Ascii.GS, 82, 79, 84, 88, 83, 73, 92, 73, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i10);

    public C4Y(AbstractC03364o abstractC03364o) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = abstractC03364o;
    }

    public /* synthetic */ C4Y(AbstractC03364o abstractC03364o, C1094Zm c1094Zm) {
        this(abstractC03364o);
    }

    public static C1094Zm A00(AbstractC03364o abstractC03364o) {
        return new C1094Zm(abstractC03364o);
    }

    public static C1093Zl A01(AbstractC03364o abstractC03364o) {
        return new C1093Zl(abstractC03364o);
    }

    public static C4Y A02(AbstractC03364o abstractC03364o, int i10) {
        switch (i10) {
            case 0:
                return A00(abstractC03364o);
            case 1:
                return A01(abstractC03364o);
            default:
                throw new IllegalArgumentException(A03(0, 19, 11));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
