package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: classes.dex */
public class c extends ac.e {
    @Override // ac.e
    public final ProviderInfo j(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }

    @Override // ac.e
    public final List q(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }
}
