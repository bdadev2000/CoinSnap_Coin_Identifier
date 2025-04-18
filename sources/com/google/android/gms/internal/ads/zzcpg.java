package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcpg extends zzcpd {
    private final Context zzc;
    private final View zzd;

    @Nullable
    private final zzcfk zze;
    private final zzfeu zzf;
    private final zzcro zzg;
    private final zzdjj zzh;
    private final zzden zzi;
    private final zzhfr zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzs zzl;

    public zzcpg(zzcrp zzcrpVar, Context context, zzfeu zzfeuVar, View view, @Nullable zzcfk zzcfkVar, zzcro zzcroVar, zzdjj zzdjjVar, zzden zzdenVar, zzhfr zzhfrVar, Executor executor) {
        super(zzcrpVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcfkVar;
        this.zzf = zzfeuVar;
        this.zzg = zzcroVar;
        this.zzh = zzdjjVar;
        this.zzi = zzdenVar;
        this.zzj = zzhfrVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzj(zzcpg zzcpgVar) {
        zzdjj zzdjjVar = zzcpgVar.zzh;
        if (zzdjjVar.zze() == null) {
            return;
        }
        try {
            zzdjjVar.zze().zze((com.google.android.gms.ads.internal.client.zzby) zzcpgVar.zzj.zzb(), ObjectWrapper.wrap(zzcpgVar.zzc));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhy)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhz)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        try {
            return this.zzg.zza();
        } catch (zzffv unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzf() {
        com.google.android.gms.ads.internal.client.zzs zzsVar = this.zzl;
        if (zzsVar != null) {
            return zzffu.zzb(zzsVar);
        }
        zzfet zzfetVar = this.zzb;
        if (zzfetVar.zzac) {
            for (String str : zzfetVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfeu(view.getWidth(), view.getHeight(), false);
        }
        return (zzfeu) this.zzb.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzcfk zzcfkVar;
        if (viewGroup != null && (zzcfkVar = this.zze) != null) {
            zzcfkVar.zzaj(zzche.zzc(zzsVar));
            viewGroup.setMinimumHeight(zzsVar.zzc);
            viewGroup.setMinimumWidth(zzsVar.zzf);
            this.zzl = zzsVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpf
            @Override // java.lang.Runnable
            public final void run() {
                zzcpg.zzj(zzcpg.this);
            }
        });
        super.zzk();
    }
}
