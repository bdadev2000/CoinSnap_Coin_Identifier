package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzenj implements zzehl {

    @Nullable
    private final zzbfk zza;
    private final zzgge zzb;
    private final zzflt zzc;
    private final zzens zzd;

    public zzenj(zzflt zzfltVar, zzgge zzggeVar, @Nullable zzbfk zzbfkVar, zzens zzensVar) {
        this.zzc = zzfltVar;
        this.zzb = zzggeVar;
        this.zza = zzbfkVar;
        this.zzd = zzensVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzccn zzccnVar = new zzccn();
        zzeno zzenoVar = new zzeno();
        zzenoVar.zzd(new zzeni(this, zzccnVar, zzfhfVar, zzfgtVar, zzenoVar));
        zzfgy zzfgyVar = zzfgtVar.zzt;
        final zzbff zzbffVar = new zzbff(zzenoVar, zzfgyVar.zzb, zzfgyVar.zza);
        zzfln zzflnVar = zzfln.CUSTOM_RENDER_SYN;
        return zzfld.zzd(new zzfkx() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // com.google.android.gms.internal.ads.zzfkx
            public final void zza() {
                zzenj.this.zzc(zzbffVar);
            }
        }, this.zzb, zzflnVar, this.zzc).zzb(zzfln.CUSTOM_RENDER_ACK).zzd(zzccnVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar;
        if (this.zza != null && (zzfgyVar = zzfgtVar.zzt) != null && zzfgyVar.zza != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void zzc(zzbff zzbffVar) throws Exception {
        this.zza.zze(zzbffVar);
    }
}
