package com.google.android.gms.tflite.dynamite.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
final class zza implements DynamiteModule.VersionPolicy {
    private final DynamiteModule.VersionPolicy zza;
    private Integer zzb = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(DynamiteModule.VersionPolicy versionPolicy) {
        this.zza = versionPolicy;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int i = 0;
        Preconditions.checkState(this.zzb == null);
        DynamiteModule.VersionPolicy.SelectionResult selectModule = this.zza.selectModule(context, str, iVersions);
        int i2 = selectModule.selection;
        if (i2 == -1) {
            i = selectModule.localVersion;
        } else if (i2 == 1) {
            i = selectModule.remoteVersion;
        }
        this.zzb = Integer.valueOf(i);
        return selectModule;
    }

    public final int zza() {
        return ((Integer) Preconditions.checkNotNull(this.zzb)).intValue();
    }
}
