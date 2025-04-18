package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1166bs implements AnonymousClass10 {
    public static byte[] A02;
    public final /* synthetic */ C0531Fi A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{69, 20, 78, 64, 19, 79, 78, 18, 77, 104, 109, 124, 120, 105, 126, 44, 101, Byte.MAX_VALUE, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, Byte.MAX_VALUE, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, Utf8.REPLACEMENT_BYTE, 48, 1, Utf8.REPLACEMENT_BYTE, 61, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1166bs(C0531Fi c0531Fi, Runnable runnable) {
        this.A00 = c0531Fi;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACC(C1209cZ c1209cZ, String str, boolean z2) {
        this.A00.A07.A0C();
        boolean z3 = !TextUtils.isEmpty(str);
        if (z2 && z3) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(L5.A00(str));
                C0659Kq.A0C(this.A00.A0B, intent);
            } catch (C0657Ko e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A0B.A07().AA0(A00(74, 11, 100), C8E.A04, new C8F(th));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACD(C1209cZ c1209cZ) {
        this.A00.A07.A04();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACE(C1209cZ c1209cZ) {
        this.A00.A07.A05();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACF(C1209cZ c1209cZ) {
        if (c1209cZ != this.A00.A00) {
            return;
        }
        if (c1209cZ == null) {
            this.A00.A0B.A07().AA0(A00(111, 3, Opcodes.LSHL), C8E.A0X, new C8F(A00(8, 37, 54)));
            ACG(c1209cZ, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A01 = c1209cZ;
        this.A00.A0K();
        this.A00.A07.A0F(c1209cZ);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACG(C1209cZ c1209cZ, AdError adError) {
        if (c1209cZ != this.A00.A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(c1209cZ);
        this.A00.A0B.A0E().A5F(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C0625Jg(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACH(C1209cZ c1209cZ) {
        AbstractC0638Ju.A05(A00(Opcodes.FREM, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0N();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACI() {
        this.A00.A07.A08();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACJ() {
        this.A00.A07.A06();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void ACK() {
        this.A00.A07.A07();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass10
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
