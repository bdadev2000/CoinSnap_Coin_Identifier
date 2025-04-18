package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzcph implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;
    private final zzhgp zzg;
    private final zzhgp zzh;
    private final zzhgp zzi;
    private final zzhgp zzj;

    public zzcph(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7, zzhgp zzhgpVar8, zzhgp zzhgpVar9, zzhgp zzhgpVar10) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
        this.zzf = zzhgpVar6;
        this.zzg = zzhgpVar7;
        this.zzh = zzhgpVar8;
        this.zzi = zzhgpVar9;
        this.zzj = zzhgpVar10;
    }

    public static zzcpg zzc(zzcrp zzcrpVar, Context context, zzfeu zzfeuVar, View view, zzcfk zzcfkVar, zzcro zzcroVar, zzdjj zzdjjVar, zzden zzdenVar, zzhfr zzhfrVar, Executor executor) {
        return new zzcpg(zzcrpVar, context, zzfeuVar, view, zzcfkVar, zzcroVar, zzdjjVar, zzdenVar, zzhfrVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcpg zzb() {
        return new zzcpg(((zzcua) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcpn) this.zzc).zza(), ((zzcpm) this.zzd).zza(), ((zzcqa) this.zze).zza(), ((zzcpo) this.zzf).zza(), ((zzdhh) this.zzg).zza(), (zzden) this.zzh.zzb(), zzhfw.zza(zzhgi.zza(this.zzi)), (Executor) this.zzj.zzb());
    }
}
