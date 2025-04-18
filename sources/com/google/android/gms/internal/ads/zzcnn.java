package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzcnn implements zzcwm, zzcya, zzcxg, com.google.android.gms.ads.internal.client.zza, zzcxc, zzdec {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfff zze;
    private final zzfet zzf;
    private final zzfln zzg;
    private final zzfga zzh;
    private final zzavc zzi;
    private final zzbdu zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;

    @Nullable
    private final zzcvo zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    public zzcnn(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfff zzfffVar, zzfet zzfetVar, zzfln zzflnVar, zzfga zzfgaVar, @Nullable View view, @Nullable zzcfk zzcfkVar, zzavc zzavcVar, zzbdu zzbduVar, zzbdw zzbdwVar, zzfkl zzfklVar, @Nullable zzcvo zzcvoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfffVar;
        this.zzf = zzfetVar;
        this.zzg = zzflnVar;
        this.zzh = zzfgaVar;
        this.zzi = zzavcVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcfkVar);
        this.zzj = zzbduVar;
        this.zzm = zzcvoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzla)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzB(this.zza)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                Integer zzs = com.google.android.gms.ads.internal.util.zzs.zzs(this.zza);
                if (zzs != null) {
                    Integer valueOf = Integer.valueOf(Math.min(zzs.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(valueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String str;
        int i10;
        List list = this.zzf.zzd;
        if (list != null && !list.isEmpty()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdD)).booleanValue()) {
                str = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
            } else {
                str = null;
            }
            if ((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzay)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbem.zzh.zze()).booleanValue()) {
                this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, str, null, zzu()));
                return;
            }
            if (((Boolean) zzbem.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
            }
            zzgei.zzr((zzgdz) zzgei.zzo(zzgdz.zzu(zzgei.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbc)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnm(this, str), this.zzb);
        }
    }

    private final void zzw(final int i10, final int i11) {
        View view;
        if (i10 > 0 && ((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnk
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnn.this.zzp(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        } else {
            zzv();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzay)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean) zzbem.zzd.zze()).booleanValue()) {
            zzgei.zzr((zzgdz) zzgei.zze(zzgdz.zzu(this.zzj.zza()), Throwable.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcnh
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcaj.zzf), new zzcnl(this), this.zzb);
            return;
        }
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        Context context = this.zza;
        List zzc = zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzc);
        int i10 = 1;
        if (true == com.google.android.gms.ads.internal.zzv.zzp().zzA(context)) {
            i10 = 2;
        }
        zzfgaVar.zzc(zzc, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zze(zzfetVar, zzfetVar.zzh, zzbwjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzg));
    }

    public final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnj
            @Override // java.lang.Runnable
            public final void run() {
                zzcnn.this.zzv();
            }
        });
    }

    public final /* synthetic */ void zzo(int i10, int i11) {
        zzw(i10 - 1, i11);
    }

    public final /* synthetic */ void zzp(final int i10, final int i11) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcni
            @Override // java.lang.Runnable
            public final void run() {
                zzcnn.this.zzo(i10, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbB)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfln.zzf(2, zzeVar.zza, this.zzf.zzo)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (!this.zzo.compareAndSet(false, true)) {
            return;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdM)).intValue();
        if (intValue > 0) {
            zzw(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdN)).intValue());
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdL)).booleanValue()) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnn.this.zzn();
                }
            });
        } else {
            zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzs() {
        zzcvo zzcvoVar;
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(zzu());
            arrayList.addAll(this.zzf.zzf);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfga zzfgaVar = this.zzh;
            zzfln zzflnVar = this.zzg;
            zzfff zzfffVar = this.zze;
            zzfet zzfetVar = this.zzf;
            zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzm));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdI)).booleanValue() && (zzcvoVar = this.zzm) != null) {
                List zzh = zzfln.zzh(zzfln.zzg(zzcvoVar.zzb().zzm, zzcvoVar.zza().zzg()), this.zzm.zza().zza());
                zzfga zzfgaVar2 = this.zzh;
                zzfln zzflnVar2 = this.zzg;
                zzcvo zzcvoVar2 = this.zzm;
                zzfgaVar2.zza(zzflnVar2.zzc(zzcvoVar2.zzc(), zzcvoVar2.zzb(), zzh));
            }
            zzfga zzfgaVar3 = this.zzh;
            zzfln zzflnVar3 = this.zzg;
            zzfff zzfffVar2 = this.zze;
            zzfet zzfetVar2 = this.zzf;
            zzfgaVar3.zza(zzflnVar3.zzc(zzfffVar2, zzfetVar2, zzfetVar2.zzf));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzt() {
        zzfga zzfgaVar = this.zzh;
        zzfln zzflnVar = this.zzg;
        zzfff zzfffVar = this.zze;
        zzfet zzfetVar = this.zzf;
        zzfgaVar.zza(zzflnVar.zzc(zzfffVar, zzfetVar, zzfetVar.zzau));
    }
}
