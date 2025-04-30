package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzene implements zzehl {
    private final Context zza;
    private final zzctg zzb;

    @Nullable
    private final zzbfk zzc;
    private final zzgge zzd;
    private final zzflt zze;

    public zzene(Context context, zzctg zzctgVar, zzflt zzfltVar, zzgge zzggeVar, @Nullable zzbfk zzbfkVar) {
        this.zza = context;
        this.zzb = zzctgVar;
        this.zze = zzfltVar;
        this.zzd = zzggeVar;
        this.zzc = zzbfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzenc zzencVar = new zzenc(this, new View(this.zza), null, new zzcun() { // from class: com.google.android.gms.internal.ads.zzena
            @Override // com.google.android.gms.internal.ads.zzcun
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzfgu) zzfgtVar.zzv.get(0));
        zzcsg zza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, null), zzencVar);
        zzend zzl = zza.zzl();
        zzfgy zzfgyVar = zzfgtVar.zzt;
        final zzbff zzbffVar = new zzbff(zzl, zzfgyVar.zzb, zzfgyVar.zza);
        zzfln zzflnVar = zzfln.CUSTOM_RENDER_SYN;
        return zzfld.zzd(new zzfkx() { // from class: com.google.android.gms.internal.ads.zzenb
            @Override // com.google.android.gms.internal.ads.zzfkx
            public final void zza() {
                zzene.this.zzc(zzbffVar);
            }
        }, this.zzd, zzflnVar, this.zze).zzb(zzfln.CUSTOM_RENDER_ACK).zzd(zzgft.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar;
        if (this.zzc != null && (zzfgyVar = zzfgtVar.zzt) != null && zzfgyVar.zza != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void zzc(zzbff zzbffVar) throws Exception {
        this.zzc.zze(zzbffVar);
    }
}
