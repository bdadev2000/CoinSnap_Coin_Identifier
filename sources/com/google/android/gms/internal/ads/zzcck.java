package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcck {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzbdh zze;

    @Nullable
    private final zzbdk zzf;
    private final com.google.android.gms.ads.internal.util.zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcbp zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmm)).intValue();
    }

    public zzcck(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzbdk zzbdkVar, @Nullable zzbdh zzbdhVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbfVar.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbdkVar;
        this.zze = zzbdhVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzH);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.zzh[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse frame hash target time number.", e);
                this.zzh[i2] = -1;
            }
        }
    }

    public final void zza(zzcbp zzcbpVar) {
        zzbdc.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcbpVar.zzj());
        this.zzo = zzcbpVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbdc.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbdc.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        if (!zza || this.zzp) {
            return;
        }
        Bundle c2 = androidx.compose.foundation.text.input.a.c("type", "native-player-metrics");
        c2.putString("request", this.zzc);
        c2.putString("player", this.zzo.zzj());
        for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.zzg.zza()) {
            String valueOf = String.valueOf(zzbeVar.zza);
            c2.putString("fps_c_".concat(valueOf), Integer.toString(zzbeVar.zze));
            String valueOf2 = String.valueOf(zzbeVar.zza);
            c2.putString("fps_p_".concat(valueOf2), Double.toString(zzbeVar.zzd));
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i2 >= jArr.length) {
                com.google.android.gms.ads.internal.zzu.zzp().zzh(this.zzb, this.zzd.afmaVersion, "gmob-apps", c2, true);
                this.zzp = true;
                return;
            }
            String str = this.zzi[i2];
            if (str != null) {
                c2.putString("fh_".concat(Long.valueOf(jArr[i2]).toString()), str);
            }
            i2++;
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcbp zzcbpVar) {
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbdc.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzu.zzB().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzI)).longValue();
        long zza2 = zzcbpVar.zza();
        int i2 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && longValue > Math.abs(zza2 - this.zzh[i2])) {
                String[] strArr2 = this.zzi;
                int i3 = 8;
                Bitmap bitmap = zzcbpVar.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j2);
                        j2--;
                        i5++;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i2++;
        }
    }
}
