package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class zzemi implements zzegk {

    @Nullable
    private final zzbdq zza;
    private final zzgfz zzb;
    private final zzflg zzc;
    private final zzemr zzd;

    public zzemi(zzflg zzflgVar, zzgfz zzgfzVar, @Nullable zzbdq zzbdqVar, zzemr zzemrVar) {
        this.zzc = zzflgVar;
        this.zzb = zzgfzVar;
        this.zza = zzbdqVar;
        this.zzd = zzemrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(zzfgt zzfgtVar, zzfgh zzfghVar) {
        zzcas zzcasVar = new zzcas();
        zzemn zzemnVar = new zzemn();
        zzemnVar.zzd(new zzemh(this, zzcasVar, zzfgtVar, zzfghVar, zzemnVar));
        zzfgm zzfgmVar = zzfghVar.zzs;
        final zzbdl zzbdlVar = new zzbdl(zzemnVar, zzfgmVar.zzb, zzfgmVar.zza);
        zzfla zzflaVar = zzfla.CUSTOM_RENDER_SYN;
        return zzfkq.zzd(new zzfkk() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // com.google.android.gms.internal.ads.zzfkk
            public final void zza() {
                zzemi.this.zzc(zzbdlVar);
            }
        }, this.zzb, zzflaVar, this.zzc).zzb(zzfla.CUSTOM_RENDER_ACK).zzd(zzcasVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        zzfgm zzfgmVar;
        return (this.zza == null || (zzfgmVar = zzfghVar.zzs) == null || zzfgmVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbdl zzbdlVar) throws Exception {
        this.zza.zze(zzbdlVar);
    }
}
