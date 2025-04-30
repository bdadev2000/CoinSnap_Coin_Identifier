package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zza(context, str);
        int i9 = 1;
        int zzb = iVersions.zzb(context, str, true);
        selectionResult.remoteVersion = zzb;
        int i10 = selectionResult.localVersion;
        if (i10 == 0) {
            i10 = 0;
            if (zzb == 0) {
                i9 = 0;
                selectionResult.selection = i9;
                return selectionResult;
            }
        }
        if (zzb < i10) {
            i9 = -1;
        }
        selectionResult.selection = i9;
        return selectionResult;
    }
}
