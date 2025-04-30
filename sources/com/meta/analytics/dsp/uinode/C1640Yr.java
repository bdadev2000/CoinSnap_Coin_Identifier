package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1640Yr implements C0L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C1635Ym A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            byte b = copyOfRange[i12];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            copyOfRange[i12] = (byte) ((b ^ i11) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, Ascii.CR, Ascii.VT, 9};
    }

    static {
        A01();
    }

    public C1640Yr(C1635Ym c1635Ym) {
        this.A00 = c1635Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.C0L
    public final void A9U(Throwable th) {
        this.A00.A07().A9a(A00(0, 5, 0), C8A.A1e, new C8B(th));
    }

    @Override // com.meta.analytics.dsp.uinode.C0L
    public final void A9f(Throwable th) {
        this.A00.A07().A9a(A00(0, 5, 0), C8A.A1g, new C8B(th));
    }

    @Override // com.meta.analytics.dsp.uinode.C0L
    public final void AEP(String str, int i9, String str2, Long l, Long l2, AnonymousClass06 anonymousClass06) {
        C09446f.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i9, str2, l, l2, null);
    }

    @Override // com.meta.analytics.dsp.uinode.C0L
    public final void AEQ(String str, boolean z8, AnonymousClass06 anonymousClass06) {
        C09446f.A04(this.A00, new C09436e(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z8);
    }
}
