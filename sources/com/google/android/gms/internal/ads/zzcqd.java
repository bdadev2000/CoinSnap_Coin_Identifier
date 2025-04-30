package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcqd {
    zzbwl zza;
    zzbwl zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzehh zze;
    private final zzdsi zzf;
    private final zzgge zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcqd(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzehh zzehhVar, zzdsi zzdsiVar, zzgge zzggeVar, zzgge zzggeVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzehhVar;
        this.zzf = zzdsiVar;
        this.zzg = zzggeVar;
        this.zzh = zzggeVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkh));
    }

    private final f4.c zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkh)) && !this.zzd.zzS()) {
                final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzki), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                if (inputEvent == null) {
                    buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "11");
                    return zzgft.zzh(buildUpon.toString());
                }
                return zzgft.zzf(zzgft.zzn(zzgfk.zzu(this.zze.zza()), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpx
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        return zzcqd.this.zzd(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpy
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        return zzcqd.this.zze(buildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            return zzgft.zzh(str);
        } catch (Exception e4) {
            return zzgft.zzg(e4);
        }
    }

    public final f4.c zzb(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgft.zzh(str);
        }
        return zzgft.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpu
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzcqd.this.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ f4.c zzc(String str, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpw
            @Override // java.lang.Runnable
            public final void run() {
                zzcqd.this.zzg(th);
            }
        });
        return zzgft.zzh(str);
    }

    public final /* synthetic */ f4.c zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkk), "1");
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkl))) {
                buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkm));
            }
            return zzgft.zzn(zzgfk.zzu(this.zze.zzb(buildUpon.build(), inputEvent)), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpz
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj);
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter(str2, "12");
                    return zzgft.zzh(builder2.toString());
                }
            }, this.zzh);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "10");
        return zzgft.zzh(builder.toString());
    }

    public final /* synthetic */ f4.c zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpv
            @Override // java.lang.Runnable
            public final void run() {
                zzcqd.this.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkj), "9");
        return zzgft.zzh(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzko)).booleanValue()) {
            zzbwl zzc = zzbwj.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbwl zza = zzbwj.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzko)).booleanValue()) {
            zzbwl zzc = zzbwj.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
        } else {
            zzbwl zza = zzbwj.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final void zzi(String str, zzfoe zzfoeVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgft.zzr(zzgft.zzo(zzk(str, this.zzf.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkn)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcqc(this, zzfoeVar, str), this.zzg);
    }
}
