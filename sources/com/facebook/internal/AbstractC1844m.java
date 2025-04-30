package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import u7.AbstractC2816g;

/* renamed from: com.facebook.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1844m {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f13621a = com.bumptech.glide.d.N("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String str) {
        G7.j.e(context, "context");
        String str2 = Build.BRAND;
        int i9 = context.getApplicationInfo().flags;
        G7.j.d(str2, "brand");
        if (O7.o.C(str2, "generic", false) && (i9 & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                G7.j.d(signatureArr, "packageInfo.signatures");
                for (Signature signature : signatureArr) {
                    HashSet hashSet = f13621a;
                    byte[] byteArray = signature.toByteArray();
                    G7.j.d(byteArray, "it.toByteArray()");
                    if (!AbstractC2816g.I(hashSet, H.v("SHA-1", byteArray))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
