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

/* loaded from: classes2.dex */
public final class zzcqp implements zzczl, zzdaz, zzdaf, com.google.android.gms.ads.internal.client.zza, zzdab, zzdgz {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfhf zze;
    private final zzfgt zzf;
    private final zzfoa zzg;
    private final zzfia zzh;
    private final zzaxd zzi;
    private final zzbfs zzj;
    private final zzfmn zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;

    @Nullable
    private final zzcyn zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbfu zzq;

    public zzcqp(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfhf zzfhfVar, zzfgt zzfgtVar, zzfoa zzfoaVar, zzfia zzfiaVar, @Nullable View view, @Nullable zzchd zzchdVar, zzaxd zzaxdVar, zzbfs zzbfsVar, zzbfu zzbfuVar, zzfmn zzfmnVar, @Nullable zzcyn zzcynVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfhfVar;
        this.zzf = zzfgtVar;
        this.zzg = zzfoaVar;
        this.zzh = zzfiaVar;
        this.zzi = zzaxdVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzchdVar);
        this.zzj = zzbfsVar;
        this.zzq = zzbfuVar;
        this.zzk = zzfmnVar;
        this.zzn = zzcynVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzls)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzB(this.zza)) {
                com.google.android.gms.ads.internal.zzu.zzp();
                Integer zzs = com.google.android.gms.ads.internal.util.zzt.zzs(this.zza);
                if (zzs != null) {
                    int min = Math.min(zzs.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
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
        int i9;
        List list = this.zzf.zzd;
        if (list != null && !list.isEmpty()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdx)).booleanValue()) {
                str = this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null);
            } else {
                str = null;
            }
            if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbgj.zzh.zze()).booleanValue()) {
                this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, str, null, zzu()));
                return;
            }
            if (((Boolean) zzbgj.zzg.zze()).booleanValue() && ((i9 = this.zzf.zzb) == 1 || i9 == 2 || i9 == 5)) {
            }
            zzgft.zzr((zzgfk) zzgft.zzo(zzgfk.zzu(zzgft.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaW)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcqo(this, str), this.zzb);
        }
    }

    private final void zzw(final int i9, final int i10) {
        View view;
        if (i9 > 0 && ((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqm
                @Override // java.lang.Runnable
                public final void run() {
                    zzcqp.this.zzp(i9, i10);
                }
            }, i10, TimeUnit.MILLISECONDS);
        } else {
            zzv();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzao)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbgj.zzd.zze()).booleanValue()) {
            zzgft.zzr(zzgft.zze(zzgfk.zzu(this.zzj.zza()), Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcqj
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcci.zzf), new zzcqn(this), this.zzb);
            return;
        }
        zzfia zzfiaVar = this.zzh;
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        Context context = this.zza;
        List zzc = zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzc);
        int i9 = 1;
        if (true == com.google.android.gms.ads.internal.zzu.zzo().zzA(context)) {
            i9 = 2;
        }
        zzfiaVar.zzc(zzc, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(zzbyh zzbyhVar, String str, String str2) {
        zzfoa zzfoaVar = this.zzg;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zze(zzfgtVar, zzfgtVar.zzi, zzbyhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzh));
    }

    public final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcql
            @Override // java.lang.Runnable
            public final void run() {
                zzcqp.this.zzv();
            }
        });
    }

    public final /* synthetic */ void zzo(int i9, int i10) {
        zzw(i9 - 1, i10);
    }

    public final /* synthetic */ void zzp(final int i9, final int i10) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqk
            @Override // java.lang.Runnable
            public final void run() {
                zzcqp.this.zzo(i9, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdab
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbw)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfoa.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (!this.zzp.compareAndSet(false, true)) {
            return;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdG)).intValue();
        if (intValue > 0) {
            zzw(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdH)).intValue());
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdF)).booleanValue()) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqi
                @Override // java.lang.Runnable
                public final void run() {
                    zzcqp.this.zzn();
                }
            });
        } else {
            zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final synchronized void zzs() {
        zzcyn zzcynVar;
        try {
            if (this.zzo) {
                ArrayList arrayList = new ArrayList(zzu());
                arrayList.addAll(this.zzf.zzg);
                this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
            } else {
                zzfia zzfiaVar = this.zzh;
                zzfoa zzfoaVar = this.zzg;
                zzfhf zzfhfVar = this.zze;
                zzfgt zzfgtVar = this.zzf;
                zzfiaVar.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzn));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdC)).booleanValue() && (zzcynVar = this.zzn) != null) {
                    List zzh = zzfoa.zzh(zzfoa.zzg(zzcynVar.zzb().zzn, zzcynVar.zza().zzg()), this.zzn.zza().zza());
                    zzfia zzfiaVar2 = this.zzh;
                    zzfoa zzfoaVar2 = this.zzg;
                    zzcyn zzcynVar2 = this.zzn;
                    zzfiaVar2.zza(zzfoaVar2.zzc(zzcynVar2.zzc(), zzcynVar2.zzb(), zzh));
                }
                zzfia zzfiaVar3 = this.zzh;
                zzfoa zzfoaVar3 = this.zzg;
                zzfhf zzfhfVar2 = this.zze;
                zzfgt zzfgtVar2 = this.zzf;
                zzfiaVar3.zza(zzfoaVar3.zzc(zzfhfVar2, zzfgtVar2, zzfgtVar2.zzg));
            }
            this.zzo = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzt() {
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzav));
    }
}
