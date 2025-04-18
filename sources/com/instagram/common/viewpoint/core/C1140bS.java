package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdSettings;
import java.util.Arrays;
import java.util.Set;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1140bS implements InterfaceC03608d {
    public static byte[] A03;
    public final Bundle A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{83, 94, 94, 93, 78, 84, 73, 65, 93, 88, 82, 88, 69, 78, 69, 84, 66, 69, 78, 92, 94, 85, 84, 78, 90, 84, 72, 67, 78, 78, 77, 94, 72, 82, 94, 84, 79, 72, 85, 88, 12, 1, 1, 2, 17, 3, 7, 22, 11, 10, 17, 15, 27, 10, 7, 11, 0, 13, 11, 17, 5, 11, 23, 32, 37, 48, 37, 59, 52, 54, 43, 39, 33, 55, 55, 45, 42, 35, 59, 43, 52, 48, 45, 43, 42, 55, 59, 39, 43, 49, 42, 48, 54, 61, 59, 47, 33, 61, 54, 51, 38, 51, 45, 34, 32, 61, 49, 55, 33, 33, 59, 60, 53, 45, 61, 34, 38, 59, 61, 60, 33, 45, 57, 55, 43, 7, 2, 23, 2, 28, 19, 17, 12, 0, 6, 16, 16, 10, 13, 4, 28, 12, 19, 23, 10, 12, 13, 16, 28, 16, 23, 2, 23, 6, 28, 8, 6, 26, 94, 89, 95, 82, 76, 73, 82, 89, 72, 94, 89, 82, 89, 84, 93, 72, 82, 70, 72, 84, 84, 83, 85, 88, 74, 66, 67, 78, 70, 83, 78, 72, 73, 88, 84, 66, 85, 81, 78, 68, 66, 88, 76, 66, 94};
    }

    public C1140bS(String str, String str2, Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A6c() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A6q() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final C03567x A78(C7j c7j) {
        String[] stringArray = this.A00.getStringArray(A00(98, 27, Opcodes.LSHL));
        Integer valueOf = Integer.valueOf(this.A00.getInt(A00(63, 35, 111), -1));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        Integer country = Integer.valueOf(this.A00.getInt(A00(Opcodes.LUSHR, 33, 72), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new C03567x(stringArray, valueOf, country);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A7o() {
        return this.A00.getString(A00(Opcodes.GETSTATIC, 25, 12));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A8V() {
        String string = this.A00.getString(A00(158, 20, 6));
        String adTestTypeStr = AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (AdSettings.TestAdType testAdType : AdSettings.TestAdType.values()) {
            String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                String adTestTypeStr3 = testAdType.getAdTypeString();
                return adTestTypeStr3;
            }
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final boolean A9Y() {
        return this.A00.getBoolean(A00(40, 23, 69));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final boolean A9d() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final Boolean A9i() {
        Set<String> keySet = this.A00.keySet();
        String A00 = A00(27, 13, 10);
        if (keySet.contains(A00)) {
            return Boolean.valueOf(this.A00.getBoolean(A00));
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final boolean isTestMode(Context context) {
        return this.A00.getBoolean(A00(0, 27, 26)) || AdSettings.isTestMode(context);
    }
}
