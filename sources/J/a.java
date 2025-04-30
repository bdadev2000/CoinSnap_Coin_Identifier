package J;

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
        return signingInfo.getApkContentsSigners();
    }

    public static long b(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    @Nullable
    public static Signature[] c(@NonNull SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }

    public static boolean d(@NonNull SigningInfo signingInfo) {
        return signingInfo.hasMultipleSigners();
    }

    public static boolean e(@NonNull PackageManager packageManager, @NonNull String str, @NonNull byte[] bArr, int i9) {
        return packageManager.hasSigningCertificate(str, bArr, i9);
    }
}
