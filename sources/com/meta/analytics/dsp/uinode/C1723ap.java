package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1723ap implements InterfaceC08080x {
    public static byte[] A02;
    public static String[] A03 = {"iuD1Am5czCa4MMye", "gcECFoZ4kMj", "VbEWHR41ipzNZTdsnzBLSm9KpWNSPO68", "8haroAYsv73J79CcHBMVGUJPSuWBoF", "Cgc02UupeaYRNlOZ7cqHYIvfW0w", "E3EPi8nJQVjxwkGkPUQcK1wsbQ6s5nfw", "JigEA1pPhZ8", "b8nvHckQqbA7NUL6IeY5KDsLLhUs"};
    public final /* synthetic */ FR A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{82, 83, 82, 86, 5, 87, 81, 87, 1, 34, 45, 45, 38, 49, 99, 42, 46, 51, 49, 38, 48, 48, 42, 44, 45, 99, 37, 42, 49, 38, 39, 117, 116, 88, 123, 116, 116, Ascii.DEL, 104, 86, 117, 125, 125, 115, 116, 125, 83, 119, 106, 104, Ascii.DEL, 105, 105, 115, 117, 116};
    }

    static {
        A01();
    }

    public C1723ap(FR fr, Runnable runnable) {
        this.A00 = fr;
        this.A01 = runnable;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08080x
    public final void AAx(C1757bN c1757bN) {
        EQ eq;
        eq = this.A00.A02;
        eq.A0E().A3u();
        this.A00.A06.A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08080x
    public final void AAy(C1757bN c1757bN, View view) {
        EQ eq;
        eq = this.A00.A02;
        eq.A0E().A3t(c1757bN == ((AbstractC1720am) this.A00).A00);
        if (c1757bN != ((AbstractC1720am) this.A00).A00) {
            return;
        }
        this.A00.A0F().removeCallbacks(this.A01);
        InterfaceC08000p interfaceC08000p = ((AbstractC1720am) this.A00).A01;
        ((AbstractC1720am) this.A00).A01 = c1757bN;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A06.A0F(c1757bN);
        } else {
            this.A00.A06.A0E(view);
            this.A00.A0N(interfaceC08000p);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08080x
    public final void AAz(C1757bN c1757bN) {
        EQ eq;
        AbstractC1255Jp.A05(A00(31, 25, 80), A00(8, 23, 9), A00(0, 8, 43));
        eq = this.A00.A02;
        eq.A0E().A3w();
        this.A00.A06.A0D();
        this.A00.A0L();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08080x
    public final void ABw(C1757bN c1757bN, C1242Jb c1242Jb) {
        EQ eq;
        eq = this.A00.A02;
        eq.A0E().A3v(c1757bN == ((AbstractC1720am) this.A00).A00, c1242Jb.A03().getErrorCode());
        if (c1757bN != ((AbstractC1720am) this.A00).A00) {
            return;
        }
        this.A00.A0F().removeCallbacks(this.A01);
        this.A00.A0N(c1757bN);
        if (A03[4].length() != 27) {
            throw new RuntimeException();
        }
        A03[7] = "OPrDohYizjlmSYZvDBsQA2UDfw3b";
        this.A00.ABR(c1242Jb);
    }
}
