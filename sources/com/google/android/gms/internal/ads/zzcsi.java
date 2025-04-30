package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcsi extends zzcsf {
    private final Context zzc;
    private final View zzd;

    @Nullable
    private final zzchd zze;
    private final zzfgu zzf;
    private final zzcun zzg;
    private final zzdme zzh;
    private final zzdhk zzi;
    private final zzhkj zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    public zzcsi(zzcuo zzcuoVar, Context context, zzfgu zzfguVar, View view, @Nullable zzchd zzchdVar, zzcun zzcunVar, zzdme zzdmeVar, zzdhk zzdhkVar, zzhkj zzhkjVar, Executor executor) {
        super(zzcuoVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzchdVar;
        this.zzf = zzfguVar;
        this.zzg = zzcunVar;
        this.zzh = zzdmeVar;
        this.zzi = zzdhkVar;
        this.zzj = zzhkjVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcsi zzcsiVar) {
        zzdme zzdmeVar = zzcsiVar.zzh;
        if (zzdmeVar.zze() == null) {
            return;
        }
        try {
            zzdmeVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzcsiVar.zzj.zzb(), ObjectWrapper.wrap(zzcsiVar.zzc));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhU)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhV)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfhv unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final zzfgu zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfhu.zzb(zzqVar);
        }
        zzfgt zzfgtVar = this.zzb;
        if (zzfgtVar.zzad) {
            for (String str : zzfgtVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfgu(view.getWidth(), view.getHeight(), false);
        }
        return (zzfgu) this.zzb.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final zzfgu zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcsf
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzchd zzchdVar;
        if (viewGroup != null && (zzchdVar = this.zze) != null) {
            zzchdVar.zzaj(zzcix.zzc(zzqVar));
            viewGroup.setMinimumHeight(zzqVar.zzc);
            viewGroup.setMinimumWidth(zzqVar.zzf);
            this.zzl = zzqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsh
            @Override // java.lang.Runnable
            public final void run() {
                zzcsi.zzi(zzcsi.this);
            }
        });
        super.zzj();
    }
}
