package com.facebook.ads.redexgen.uinode;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Message;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2A {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-120, -101, -108, -118, -110, -117, -91, -117, -98, -102, -104, -121, -103, -91, -111, -117, -97, -53, -52, -54, -41, -53, -67, -54, -50, -63, -69, -67, -41, -67, -48, -52, -54, -71, -53, -121, -120, -122, -109, -121, 121, -122, -118, 125, 119, 121, -109, -121, 120, Byte.MAX_VALUE, -109, -118, 121, -122, -121, 125, -125, -126, -124, -112, -114, 79, -121, -126, -124, -122, -125, -112, -112, -116, 79, -126, -123, -108, 79, -118, -113, -107, -122, -109, -113, -126, -115, 79, -118, -111, -124, 79, 98, -106, -123, -118, -122, -113, -124, -122, 111, -122, -107, -104, -112, -109, -116, 115, -122, -114, -112, -107, -122, 116, -122, -109, -105, -118, -124, -122, -89, -77, -79, 114, -86, -91, -89, -87, -90, -77, -77, -81, 114, -81, -91, -72, -91, -78, -91};
    }

    public static void A02(C1069Ym c1069Ym, Message message) {
        Bundle bundle = message.getData().getBundle(A00(0, 17, 52));
        if (bundle != null) {
            AbstractC04158b.A05(c1069Ym, bundle.getString(A00(35, 23, 34)), bundle.getString(A00(17, 18, 102)));
        }
    }

    public static boolean A03(Context context, String str) {
        PackageManager packageManager;
        if (!A00(116, 19, 50).equals(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            boolean validationPassed = FbValidationUtils.isFbSigningCertificateValid(FbValidationUtils.getSigningCertificate(packageManager.getPackageInfo(str, 64)));
            return validationPassed;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean A04(C1069Ym c1069Ym, boolean z10, ServiceConnection serviceConnection) {
        boolean validationPassed = (c1069Ym.A04().A8z() && z10) || A03(c1069Ym, AbstractC0661Ik.A04(z10));
        if (!validationPassed) {
            return false;
        }
        boolean validationPassed2 = c1069Ym.bindService(new Intent().setComponent(new ComponentName(AbstractC0661Ik.A04(z10), A00(58, 58, 15))), serviceConnection, 1);
        return validationPassed2;
    }
}
