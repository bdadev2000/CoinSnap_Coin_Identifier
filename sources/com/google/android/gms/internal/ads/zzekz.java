package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzekz implements zzefb {

    @Nullable
    private final zzbdi zza;
    private final zzges zzb;
    private final zzfjr zzc;
    private final zzeli zzd;

    public zzekz(zzfjr zzfjrVar, zzges zzgesVar, @Nullable zzbdi zzbdiVar, zzeli zzeliVar) {
        this.zzc = zzfjrVar;
        this.zzb = zzgesVar;
        this.zza = zzbdiVar;
        this.zzd = zzeliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(zzfff zzfffVar, zzfet zzfetVar) {
        zzcao zzcaoVar = new zzcao();
        zzele zzeleVar = new zzele();
        zzeleVar.zzd(new zzeky(this, zzcaoVar, zzfffVar, zzfetVar, zzeleVar));
        zzfey zzfeyVar = zzfetVar.zzs;
        final zzbdd zzbddVar = new zzbdd(zzeleVar, zzfeyVar.zzb, zzfeyVar.zza);
        zzfjl zzfjlVar = zzfjl.CUSTOM_RENDER_SYN;
        return zzfjb.zzd(new zzfiw() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // com.google.android.gms.internal.ads.zzfiw
            public final void zza() {
                zzekz.this.zzc(zzbddVar);
            }
        }, this.zzb, zzfjlVar, this.zzc).zzb(zzfjl.CUSTOM_RENDER_ACK).zzd(zzcaoVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar;
        return (this.zza == null || (zzfeyVar = zzfetVar.zzs) == null || zzfeyVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbdd zzbddVar) throws Exception {
        this.zza.zze(zzbddVar);
    }
}
