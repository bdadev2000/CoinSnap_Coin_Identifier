package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzavd implements zzfsu {
    final /* synthetic */ zzfqu zza;

    public zzavd(zzavf zzavfVar, zzfqu zzfquVar) {
        this.zza = zzfquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsu
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
