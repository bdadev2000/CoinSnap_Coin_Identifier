package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdExperienceType;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.2G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2G {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-126, -123, ByteCompanionObject.MIN_VALUE, -122, -103, -111, -122, -109, -118, -122, -113, -124, -122, ByteCompanionObject.MIN_VALUE, -124, -112, -113, -121, -118, -120, ByteCompanionObject.MIN_VALUE, -118, -113, -107, -122, -109, -108, -107, -118, -107, -118, -126, -115, -39, -36, -41, -35, -16, -24, -35, -22, -31, -35, -26, -37, -35, -41, -37, -25, -26, -34, -31, -33, -41, -22, -35, -17, -39, -22, -36, -35, -36, -41, -31, -26, -20, -35, -22, -21, -20, -31, -20, -31, -39, -28};
    }

    public static AdExperienceType A00(String str) {
        if (str == null) {
            return null;
        }
        if (A01(0, 33, 10).equals(str)) {
            return AdExperienceType.AD_EXPERIENCE_TYPE_INTERSTITIAL;
        }
        if (A01(33, 42, 97).equals(str)) {
            return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
        }
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public static String A02(AdExperienceType adExperienceType) {
        return adExperienceType.getAdExperienceType();
    }
}
