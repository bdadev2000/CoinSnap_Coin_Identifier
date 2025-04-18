package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1137bP implements C2C {
    public static byte[] A05;
    public static String[] A06 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public final AbstractC1156bi A00;
    public final AnonymousClass20 A01;
    public final AnonymousClass27 A02;
    public final C1136bO A03;
    public final C1045Zs A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{87, 114, 54, 121, 116, 124, 115, 117, 98, 54, Byte.MAX_VALUE, 101, 54, 120, 99, 122, 122, 3, 20, 15, 5, 13, 4, 30, 4, 25, 21, 19, 0, 18, 30, 10, 4, 24, 65, 69, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 94, 89, 67, 72, 82, 69, 69, 88, 69, 72, 84, 88, 83, 82, 72, 92, 82, 78, 96, 103, 125, 118, 123, Byte.MAX_VALUE, 118, Byte.MAX_VALUE, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, 67, 64, 65, 72, 80, 70, 65, 89, 78, 67, 70, 75, 78, 91, 70, 64, 65, 80, 91, 70, 66, 74, 80, 68, 74, 86, 34, 10, 28, 28, 14, 8, 10, 85, 79, Byte.MAX_VALUE, 91, 65, 65, 91, 92, 85, 18, 80, 71, 92, 86, 94, 87, 18, 84, 93, 64, 18, 95, 87, 65, 65, 83, 85, 87, 9, 45, 55, 55, 45, 42, 35, 100, 38, 49, 42, 32, 40, 33, 100, 34, 43, 54, 100, 41, 33, 55, 55, 37, 35, 33, 106, 54, 49, 55, 58, 32, 55, 55, 42, 55, 58, 40, 32, 54, 54, 36, 34, 32, 58, 46, 32, 60, 5, 20, 13};
    }

    static {
        A01();
    }

    public C1137bP(C1045Zs c1045Zs, C1136bO c1136bO, AnonymousClass20 anonymousClass20, AbstractC1156bi abstractC1156bi, AnonymousClass27 anonymousClass27) {
        this.A04 = c1045Zs;
        this.A03 = c1136bO;
        this.A01 = anonymousClass20;
        this.A00 = abstractC1156bi;
        this.A02 = anonymousClass27;
    }

    @Override // com.instagram.common.viewpoint.core.C2C
    public final Bundle A50(String str) {
        return C2J.A03(str, this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.C2C
    public final void A5S() {
        this.A02.A0F(AdError.CACHE_ERROR_CODE, null);
        this.A02.A0C();
        this.A03.A02(null);
    }

    @Override // com.instagram.common.viewpoint.core.C2C
    public final int A7h() {
        return AdError.SERVER_ERROR_CODE;
    }

    @Override // com.instagram.common.viewpoint.core.C2C
    public final void A8u(Message message) {
        Ad A6E = this.A03.A6E();
        String A00 = A00(203, 3, 38);
        if (A6E == null) {
            this.A04.A07().AA0(A00, C8E.A0K, new C8F(A00(0, 17, 84)));
            return;
        }
        int i2 = message.what;
        String A002 = A00(120, 9, 45);
        String A003 = A00(17, 17, 3);
        switch (i2) {
            case 10:
            case 2103:
                Bundle bundle = message.getData().getBundle(A003);
                if (bundle != null) {
                    int i3 = bundle.getInt(A00(51, 18, 85));
                    String string = bundle.getString(A00(Opcodes.INVOKEVIRTUAL, 21, 39));
                    AdError adError = new AdError(i3, string);
                    this.A01.AGQ(adError);
                    if (this.A03.A04 != null) {
                        this.A03.A04.onError(A6E, adError);
                    } else {
                        Log.e(A00(34, 17, 69), string);
                    }
                } else {
                    this.A01.AGM(EnumC02141z.A04);
                    String errorMessage = A002 + message;
                    this.A04.A07().AA0(A00, C8E.A0V, new C8F(A00(155, 27, 6), errorMessage));
                }
                this.A03.A02(null);
                return;
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A01.AGV();
                Bundle bundle2 = message.getData().getBundle(A003);
                if (bundle2 != null) {
                    this.A03.A01 = bundle2.getLong(A00(94, 26, 77));
                    this.A03.A00 = bundle2.getInt(A00(69, 25, 107));
                } else {
                    this.A04.A07().AA0(A00, C8E.A0V, new C8F(A00(Opcodes.LOR, 26, 112), A002 + message));
                }
                C1136bO c1136bO = this.A03;
                if (A06[0].length() == 31) {
                    A06[4] = "nZDiJI4iz";
                    c1136bO.A02(null);
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 2106:
                this.A03.A02(null);
                break;
            case 2110:
                this.A01.AGf();
                break;
        }
        if (this.A03.A04 == null) {
            return;
        }
        switch (message.what) {
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                C1136bO c1136bO2 = this.A03;
                if (A06[2].charAt(0) == 'F') {
                    c1136bO2.A04.onAdLoaded(A6E);
                    return;
                } else {
                    A06[6] = "0IooEpc5XoMFwfovHEQu";
                    c1136bO2.A04.onAdLoaded(A6E);
                    return;
                }
            case 2104:
                this.A03.A04.onAdClicked(A6E);
                return;
            case 2105:
                this.A03.A04.onLoggingImpression(A6E);
                return;
            case 2106:
                if (this.A03.A04 instanceof RewardedVideoAdExtendedListener) {
                    ((RewardedVideoAdExtendedListener) this.A03.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case 2110:
                this.A03.A04.onRewardedVideoClosed();
                return;
            case 3000:
                this.A03.A04.onRewardedVideoCompleted();
                return;
            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                if (this.A03.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A03.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case 3002:
                if (this.A03.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A03.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
