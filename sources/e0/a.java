package e0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class a {
    @Nullable
    public static Signature[] a(@NonNull SigningInfo signingInfo) {
        Signature[] apkContentsSigners;
        apkContentsSigners = signingInfo.getApkContentsSigners();
        return apkContentsSigners;
    }

    public static long b(PackageInfo packageInfo) {
        long longVersionCode;
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    @Nullable
    public static Signature[] c(@NonNull SigningInfo signingInfo) {
        Signature[] signingCertificateHistory;
        signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        return signingCertificateHistory;
    }

    public static boolean d(@NonNull SigningInfo signingInfo) {
        boolean hasMultipleSigners;
        hasMultipleSigners = signingInfo.hasMultipleSigners();
        return hasMultipleSigners;
    }

    public static boolean e(@NonNull PackageManager packageManager, @NonNull String str, @NonNull byte[] bArr, int i10) {
        boolean hasSigningCertificate;
        hasSigningCertificate = packageManager.hasSigningCertificate(str, bArr, i10);
        return hasSigningCertificate;
    }
}
