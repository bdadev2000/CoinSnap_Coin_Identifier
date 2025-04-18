package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1159bl implements AnonymousClass20 {
    public static byte[] A05;
    public static String[] A06 = {"LqS4Vpkhy9E", "ge1EwIuJY0TovlYE8lSK4ibgoBpAWn9a", "g9aMV", "tM0yo6k6wg7fwB8A5Xyw1gAw", "QSFbFVun0ml7C8TY77Vqi1TYUccnWCEL", "t0vPMbYvCUeZJjWwsMbVoEbKc6G6LcPD", "iAyfyMUWIOpY9gjOpihEXzDIF", "NOfvqhzewpei8jQqPEPmMqHVwiKNDwof"};
    public AdError A00;
    public EnumC02141z A01 = EnumC02141z.A02;
    public EnumC02141z A02 = EnumC02141z.A02;
    public final AbstractC1156bi A03;
    public final C1045Zs A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {125, 41, 50, 125, 12, 2, 123, 77, 87, 2, 65, 67, 76, 2, 65, 74, 67, 76, 69, 71, 2, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 2, 103, 80, 80, 77, 80, 2, 79, 77, 70, 71, 2, 64, 91, 2, 81, 71, 86, 86, 75, 76, 69, 2, 99, 70, 113, 71, 86, 86, 75, 76, 69, 81, 12, 81, 71, 86, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 103, 80, 80, 77, 80, 111, 77, 70, 71, 10, 11, 37, 33, 34, 22, 7, 10, 6, 13, 0, 6, 45, 6, 23, 20, 12, 17, 8, 65, 117, 104, 106, 39, 90, Byte.MAX_VALUE, 98, 99, 106, 45, 100, 99, 121, 104, Byte.MAX_VALUE, 99, 108, 97, 45, 121, Byte.MAX_VALUE, 108, 99, 126, 100, 121, 100, 98, 99, 35, 125, 108, 117, 106, 105, 103, 98, 46, 47, 121, 98, 101, 125, 34, 35, 120, 100, 109, 120, 44, 101, Byte.MAX_VALUE, 44, 109, 96, 126, 105, 109, 104, 117, 44, 64, 67, 77, 72, 69, 66, 75, 32, 44, 64, 67, 77, 72, 73, 72, 44, 99, 126, 44, 95, 68, 67, 91, 69, 66, 75, 123, 103, 110, 123, 47, 102, 124, 47, 110, 99, 125, 106, 110, 107, 118, 47, 92, 71, 64, 88, 70, 65, 72, 121, 101, 108, 121, 45, 100, 126, 45, 99, 98, 121, 45, 65, 66, 76, 73, 72, 73};
        String[] strArr = A06;
        if (strArr[1].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "uHXyGv91YS5AZybwuzmh7pK9ZkTxCxly";
        strArr2[5] = "aSclBZwoH94XlBt4xX3FAXD0bzJVnGEs";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C1159bl(C1045Zs c1045Zs, AbstractC1156bi abstractC1156bi) {
        this.A04 = c1045Zs;
        this.A03 = abstractC1156bi;
    }

    private void A02(EnumC02141z enumC02141z, EnumC02141z enumC02141z2) {
        String A00 = A00(Opcodes.LREM, 26, 44);
        StringBuilder sb = new StringBuilder();
        String errorTitle = A00(108, 5, 38);
        StringBuilder append = sb.append(errorTitle).append(enumC02141z);
        String errorTitle2 = A00(0, 4, 124);
        String sb2 = append.append(errorTitle2).append(enumC02141z2).toString();
        C8D A07 = this.A04.A07();
        int i2 = C8E.A0e;
        C8F c8f = new C8F(A00, sb2);
        String errorTitle3 = A00(Opcodes.F2I, 3, 61);
        A07.AA0(errorTitle3, i2, c8f);
        String errorTitle4 = A00 + ' ' + sb2;
        this.A04.A0E().AHl(errorTitle4);
    }

    private void A03(String str, String str2, boolean z2) {
        AdSettings.IntegrationErrorMode A00 = AbstractC02111w.A00(this.A04);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(Opcodes.F2I, 3, 61);
        String A003 = A00(91, 17, 66);
        if (!z2) {
            Log.e(A003, format);
            this.A04.A07().AA0(A002, C8E.A0c, new C8F(format));
            this.A04.A0E().AHk(format);
            return;
        }
        switch (C02131y.A00[A00.ordinal()]) {
            case 1:
                String errorMessage = format + A00(4, 87, 3);
                throw new AnonymousClass21(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A04.A0E().AHk(format);
                Log.e(A003, format);
                this.A04.A07().AA0(A002, C8E.A0c, new C8F(format));
                break;
        }
        Log.e(A003, format);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final boolean A5z() {
        boolean z2 = (this.A01 == EnumC02141z.A02 || this.A01 == EnumC02141z.A04) && this.A02 != EnumC02141z.A07;
        if (z2) {
            this.A01 = EnumC02141z.A06;
        } else {
            A03(A00(Opcodes.D2I, 6, 39), A00(154, 42, 45), false);
        }
        return !z2;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final boolean A60() {
        if (this.A01 == EnumC02141z.A04 && this.A00 != null && this.A00.getErrorCode() == 2008) {
            this.A04.A0E().AFM();
            this.A03.A0B(10, AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        EnumC02141z enumC02141z = this.A01;
        EnumC02141z enumC02141z2 = EnumC02141z.A05;
        String[] strArr = A06;
        if (strArr[6].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "mF60z106z8KVykzxhCmjg96dV72kpnud";
        strArr2[7] = "JHGcNRxcSq72OhujKZnAiyvPQwA3qgql";
        boolean z2 = enumC02141z == enumC02141z2 && (this.A02 != EnumC02141z.A07 || C0608Im.A0g(this.A04));
        if (z2) {
            this.A01 = EnumC02141z.A02;
            this.A02 = EnumC02141z.A07;
        } else {
            EnumC02141z enumC02141z3 = this.A01;
            EnumC02141z enumC02141z4 = EnumC02141z.A05;
            String A00 = A00(Opcodes.LCMP, 6, 43);
            if (enumC02141z3 != enumC02141z4) {
                A03(A00, A00(219, 18, 44), true);
            } else {
                A03(A00, A00(196, 23, 46), false);
            }
        }
        return !z2;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final EnumC02141z A6J() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final EnumC02141z A6K() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final void AGM(EnumC02141z enumC02141z) {
        this.A01 = enumC02141z;
        this.A02 = enumC02141z;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final void AGQ(AdError adError) {
        this.A01 = EnumC02141z.A04;
        this.A02 = EnumC02141z.A04;
        this.A00 = adError;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final void AGV() {
        if (this.A01 != EnumC02141z.A06) {
            A02(this.A01, EnumC02141z.A05);
        }
        EnumC02141z enumC02141z = EnumC02141z.A05;
        String[] strArr = A06;
        if (strArr[4].charAt(13) == strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "0CQ8O9HdNp0eBnIGd0pIqA2Cb";
        strArr2[2] = "A9QPt";
        this.A01 = enumC02141z;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final void AGf() {
        if (this.A02 != EnumC02141z.A07) {
            A02(this.A01, EnumC02141z.A08);
        }
        this.A02 = EnumC02141z.A08;
    }
}
