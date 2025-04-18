package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0875Qw {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final EH A00;
    public final W1 A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public C0875Qw(C1070Yn c1070Yn) {
        W1 w12 = new W1();
        this.A01 = w12;
        InterfaceC0606Gf trackSelectionFactory = new W8(w12);
        this.A00 = AbstractC04439e.A00(new Y7(c1070Yn), new C0504Bo(trackSelectionFactory), new Y9());
    }

    public static String A01(C04419c c04419c) {
        return A00(41, 11, 55) + c04419c.A01 + A00(14, 22, 116) + c04419c.A00 + A00(0, 14, 98) + c04419c.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A6B();
    }

    public final long A06() {
        return this.A00.A6d();
    }

    public final long A07() {
        return this.A00.A6q();
    }

    public final C0873Qu A08() {
        Format vf2 = this.A00.A0L();
        if (vf2 == null) {
            return null;
        }
        return new C0873Qu(vf2.A0F, vf2.A08);
    }

    public final void A09() {
        this.A00.AEV();
    }

    public final void A0A() {
        this.A00.AFk();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f10) {
        this.A00.A0N(f10);
    }

    public final void A0D(long j3) {
        this.A00.AFj(j3);
    }

    public final void A0E(Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C1069Ym c1069Ym, Uri uri) {
        if (C0659Ih.A2Q(c1069Ym, A03())) {
            R0 cacheManager = R0.A05(c1069Ym);
            WR wr = new WR(cacheManager.A0F(c1069Ym));
            String A08 = R0.A08(c1069Ym, uri);
            if (A08 != null) {
                wr.A00(A08);
            }
            this.A00.A0P(wr.A01(uri));
            return;
        }
        InterfaceC0568Eq mediaSource = new WR(new C1007Vz(c1069Ym, IF.A0K(c1069Ym, A00(38, 3, 4)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(InterfaceC0872Qt interfaceC0872Qt) {
        this.A00.A3Q(new C0697Jx(this, interfaceC0872Qt));
    }

    public final void A0H(InterfaceC0874Qv interfaceC0874Qv) {
        this.A00.A0Q(new C0698Jy(this, interfaceC0874Qv));
    }

    public final void A0I(boolean z10) {
        this.A00.AG9(z10);
    }

    public final boolean A0J() {
        return this.A00.A7g();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
