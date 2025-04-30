package j0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import q4.C2645d;

/* loaded from: classes.dex */
public final class c extends C2645d {
    @Override // q4.C2645d
    public final Signature[] w(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
