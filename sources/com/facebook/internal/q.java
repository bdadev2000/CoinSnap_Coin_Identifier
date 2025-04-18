package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public abstract class q {
    public static final HashSet a = SetsKt.hashSetOf("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String packageName) {
        boolean startsWith$default;
        boolean z10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        Intrinsics.checkNotNullExpressionValue(brand, "brand");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(brand, "generic", false, 2, null);
        if (startsWith$default && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
                if (signatureArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Signature[] signatureArr2 = packageInfo.signatures;
                    Intrinsics.checkNotNullExpressionValue(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        HashSet hashSet = a;
                        byte[] bytes = signature.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(bytes, "it.toByteArray()");
                        Intrinsics.checkNotNullParameter(bytes, "bytes");
                        if (CollectionsKt.contains(hashSet, m0.t("SHA-1", bytes))) {
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
