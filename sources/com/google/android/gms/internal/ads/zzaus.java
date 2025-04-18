package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class zzaus implements zzfrk {
    final /* synthetic */ zzfpk zza;

    public zzaus(zzauu zzauuVar, zzfpk zzfpkVar) {
        this.zza = zzfpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
