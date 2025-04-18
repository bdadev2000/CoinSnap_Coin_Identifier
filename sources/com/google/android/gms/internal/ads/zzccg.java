package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.vungle.ads.internal.ui.i;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzccg {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzbcz zze;

    @Nullable
    private final zzbdc zzf;
    private final com.google.android.gms.ads.internal.util.zzbg zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcbl zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        boolean z10;
        if (com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmr)).intValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zza = z10;
    }

    public zzccg(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzbdc zzbdcVar, @Nullable zzbcz zzbczVar) {
        com.google.android.gms.ads.internal.util.zzbe zzbeVar = new com.google.android.gms.ads.internal.util.zzbe();
        zzbeVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbeVar.zza("1_5", 1.0d, 5.0d);
        zzbeVar.zza("5_10", 5.0d, 10.0d);
        zzbeVar.zza("10_20", 10.0d, 20.0d);
        zzbeVar.zza("20_30", 20.0d, 30.0d);
        zzbeVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbeVar.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbdcVar;
        this.zze = zzbczVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzK);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzh[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse frame hash target time number.", e2);
                this.zzh[i10] = -1;
            }
        }
    }

    public final void zza(zzcbl zzcblVar) {
        zzbcu.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcblVar.zzj());
        this.zzo = zzcblVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbcu.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbcu.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        if (zza && !this.zzp) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString(i.REQUEST_KEY_EXTRA, this.zzc);
            bundle.putString("player", this.zzo.zzj());
            for (com.google.android.gms.ads.internal.util.zzbd zzbdVar : this.zzg.zza()) {
                String valueOf = String.valueOf(zzbdVar.zza);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbdVar.zze));
                String valueOf2 = String.valueOf(zzbdVar.zza);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbdVar.zzd));
            }
            int i10 = 0;
            while (true) {
                long[] jArr = this.zzh;
                if (i10 < jArr.length) {
                    String str = this.zzi[i10];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                    }
                    i10++;
                } else {
                    com.google.android.gms.ads.internal.zzv.zzq().zzh(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                    this.zzp = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcbl zzcblVar) {
        long j3;
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbcu.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzv.zzC().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzL)).longValue();
        long zza2 = zzcblVar.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i10 < strArr.length) {
                if (strArr[i10] == null && longValue > Math.abs(zza2 - this.zzh[i10])) {
                    String[] strArr2 = this.zzi;
                    int i11 = 8;
                    Bitmap bitmap = zzcblVar.getBitmap(8, 8);
                    long j10 = 63;
                    int i12 = 0;
                    long j11 = 0;
                    while (i12 < i11) {
                        int i13 = 0;
                        while (i13 < i11) {
                            int pixel = bitmap.getPixel(i13, i12);
                            if (Color.green(pixel) + Color.red(pixel) + Color.blue(pixel) > 128) {
                                j3 = 1;
                            } else {
                                j3 = 0;
                            }
                            j11 |= j3 << ((int) j10);
                            j10--;
                            i13++;
                            i11 = 8;
                        }
                        i12++;
                        i11 = 8;
                    }
                    strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
