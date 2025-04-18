package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import b1.f0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e0.u;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* loaded from: classes3.dex */
public final class FacebookSignatureValidator {

    @NotNull
    public static final FacebookSignatureValidator INSTANCE = new FacebookSignatureValidator();

    @NotNull
    private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";

    @NotNull
    private static final String FBR2_HASH = "cc2751449a350f668590264ed76692694a80308a";

    @NotNull
    private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";

    @NotNull
    private static final String FBL_HASH = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";

    @NotNull
    private static final String MSR_HASH = "9b8f518b086098de3d77736f9458a3d2f6f95a37";

    @NotNull
    private static final String FBF_HASH = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";

    @NotNull
    private static final String IGR_HASH = "c56fb7d591ba6704df047fd98f535372fea00211";

    @NotNull
    private static final HashSet<String> validAppSignatureHashes = f0.q(FBR_HASH, FBR2_HASH, FBI_HASH, FBL_HASH, MSR_HASH, FBF_HASH, IGR_HASH);

    private FacebookSignatureValidator() {
    }

    public static final boolean validateSignature(@NotNull Context context, @NotNull String str) {
        p0.a.s(context, "context");
        p0.a.s(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        String str2 = Build.BRAND;
        int i2 = context.getApplicationInfo().flags;
        p0.a.r(str2, "brand");
        if (m.q1(str2, "generic", false) && (i2 & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                p0.a.r(signatureArr, "packageInfo.signatures");
                for (Signature signature : signatureArr) {
                    HashSet<String> hashSet = validAppSignatureHashes;
                    Utility utility = Utility.INSTANCE;
                    byte[] byteArray = signature.toByteArray();
                    p0.a.r(byteArray, "it.toByteArray()");
                    if (!u.A0(hashSet, Utility.sha1hash(byteArray))) {
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
