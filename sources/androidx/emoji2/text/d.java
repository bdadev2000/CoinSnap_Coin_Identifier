package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public final class d extends c {
    @Override // ac.e
    public final Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
