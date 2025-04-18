package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcnb {
    zzbul zza;
    zzbul zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzeex zze;
    private final zzdps zzf;
    private final zzges zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcnb(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzeex zzeexVar, zzdps zzdpsVar, zzges zzgesVar, zzges zzgesVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzeexVar;
        this.zzf = zzdpsVar;
        this.zzg = zzgesVar;
        this.zzh = zzgesVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjP));
    }

    private final ua.b zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjP)) && !this.zzd.zzN()) {
                final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjQ), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                if (inputEvent == null) {
                    buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjR), "11");
                    return zzgei.zzh(buildUpon.toString());
                }
                return (zzgdz) zzgei.zzf((zzgdz) zzgei.zzn(zzgdz.zzu(this.zze.zza()), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcmv
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        return zzcnb.this.zzd(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcmw
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        return zzcnb.this.zze(buildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            return zzgei.zzh(str);
        } catch (Exception e2) {
            return zzgei.zzg(e2);
        }
    }

    public final ua.b zzb(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgei.zzh(str);
        }
        return zzgei.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcms
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzcnb.this.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ ua.b zzc(String str, final Throwable th2) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmu
            @Override // java.lang.Runnable
            public final void run() {
                zzcnb.this.zzg(th2);
            }
        });
        return zzgei.zzh(str);
    }

    public final /* synthetic */ ua.b zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjS), "1");
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjR), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjT))) {
                buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjU));
            }
            return (zzgdz) zzgei.zzn(zzgdz.zzu(this.zze.zzb(buildUpon.build(), inputEvent)), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcmx
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjR);
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter(str2, "12");
                    return zzgei.zzh(builder2.toString());
                }
            }, this.zzh);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjR), "10");
        return zzgei.zzh(builder.toString());
    }

    public final /* synthetic */ ua.b zze(Uri.Builder builder, final Throwable th2) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
            @Override // java.lang.Runnable
            public final void run() {
                zzcnb.this.zzh(th2);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjR), "9");
        return zzgei.zzh(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjW)).booleanValue()) {
            zzbul zzc = zzbuj.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th2, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbul zza = zzbuj.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th2, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ void zzh(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjW)).booleanValue()) {
            zzbul zzc = zzbuj.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th2, "AttributionReporting");
        } else {
            zzbul zza = zzbuj.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th2, "AttributionReportingSampled");
        }
    }

    public final void zzi(String str, zzflr zzflrVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgei.zzr(zzgei.zzo(zzk(str, this.zzf.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjV)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcna(this, zzflrVar, str), this.zzg);
    }
}
