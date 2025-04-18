package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzeku implements zzefb {
    private final Context zza;
    private final zzcqh zzb;

    @Nullable
    private final zzbdi zzc;
    private final zzges zzd;
    private final zzfjr zze;

    public zzeku(Context context, zzcqh zzcqhVar, zzfjr zzfjrVar, zzges zzgesVar, @Nullable zzbdi zzbdiVar) {
        this.zza = context;
        this.zzb = zzcqhVar;
        this.zze = zzfjrVar;
        this.zzd = zzgesVar;
        this.zzc = zzbdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(zzfff zzfffVar, zzfet zzfetVar) {
        zzeks zzeksVar = new zzeks(this, new View(this.zza), null, new zzcro() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzcro
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return null;
            }
        }, (zzfeu) zzfetVar.zzu.get(0));
        zzcpe zza = this.zzb.zza(new zzcsg(zzfffVar, zzfetVar, null), zzeksVar);
        zzekt zzl = zza.zzl();
        zzfey zzfeyVar = zzfetVar.zzs;
        final zzbdd zzbddVar = new zzbdd(zzl, zzfeyVar.zzb, zzfeyVar.zza);
        zzfjl zzfjlVar = zzfjl.CUSTOM_RENDER_SYN;
        return zzfjb.zzd(new zzfiw() { // from class: com.google.android.gms.internal.ads.zzekr
            @Override // com.google.android.gms.internal.ads.zzfiw
            public final void zza() {
                zzeku.this.zzc(zzbddVar);
            }
        }, this.zzd, zzfjlVar, this.zze).zzb(zzfjl.CUSTOM_RENDER_ACK).zzd(zzgei.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar;
        return (this.zzc == null || (zzfeyVar = zzfetVar.zzs) == null || zzfeyVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbdd zzbddVar) throws Exception {
        this.zzc.zze(zzbddVar);
    }
}
