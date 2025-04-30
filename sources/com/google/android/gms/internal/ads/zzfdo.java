package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfdo implements zzfjw {
    private final zzfek zza;

    public zzfdo(zzfek zzfekVar) {
        this.zza = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final f4.c zza(zzfjx zzfjxVar) {
        zzfdp zzfdpVar = (zzfdp) zzfjxVar;
        return ((zzfdl) this.zza).zzb(zzfdpVar.zzb, zzfdpVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final void zzb(zzfjl zzfjlVar) {
        zzfjlVar.zza = ((zzfdl) this.zza).zza();
    }
}
