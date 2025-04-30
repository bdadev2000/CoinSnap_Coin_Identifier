package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class zzh implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int i9 = 0;
        int zzb = iVersions.zzb(context, str, false);
        selectionResult.remoteVersion = zzb;
        if (zzb != 0) {
            i9 = 1;
        }
        selectionResult.selection = i9;
        return selectionResult;
    }
}
