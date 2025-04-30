package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzawu implements zzftd {
    final /* synthetic */ zzfqx zza;

    public zzawu(zzaww zzawwVar, zzfqx zzfqxVar) {
        this.zza = zzfqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
