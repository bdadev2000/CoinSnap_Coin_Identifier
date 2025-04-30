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

/* loaded from: classes2.dex */
public final class zzcef {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzbfb zze;

    @Nullable
    private final zzbfe zzf;
    private final com.google.android.gms.ads.internal.util.zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcdk zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        boolean z8;
        if (com.google.android.gms.ads.internal.client.zzay.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmF)).intValue()) {
            z8 = true;
        } else {
            z8 = false;
        }
        zza = z8;
    }

    public zzcef(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzbfe zzbfeVar, @Nullable zzbfb zzbfbVar) {
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
        this.zzf = zzbfeVar;
        this.zze = zzbfbVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzA);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i9 = 0; i9 < split.length; i9++) {
            try {
                this.zzh[i9] = Long.parseLong(split[i9]);
            } catch (NumberFormatException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse frame hash target time number.", e4);
                this.zzh[i9] = -1;
            }
        }
    }

    public final void zza(zzcdk zzcdkVar) {
        zzbew.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcdkVar.zzj());
        this.zzo = zzcdkVar;
    }

    public final void zzb() {
        if (this.zzj && !this.zzk) {
            zzbew.zza(this.zzf, this.zze, "vfr2");
            this.zzk = true;
        }
    }

    public final void zzc() {
        this.zzn = true;
        if (this.zzk && !this.zzl) {
            zzbew.zza(this.zzf, this.zze, "vfp2");
            this.zzl = true;
        }
    }

    public final void zzd() {
        if (zza && !this.zzp) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString(i.REQUEST_KEY_EXTRA, this.zzc);
            bundle.putString("player", this.zzo.zzj());
            for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.zzg.zza()) {
                String valueOf = String.valueOf(zzbeVar.zza);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbeVar.zze));
                String valueOf2 = String.valueOf(zzbeVar.zza);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbeVar.zzd));
            }
            int i9 = 0;
            while (true) {
                long[] jArr = this.zzh;
                if (i9 < jArr.length) {
                    String str = this.zzi[i9];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i9]).toString()), str);
                    }
                    i9++;
                } else {
                    com.google.android.gms.ads.internal.zzu.zzp().zzh(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                    this.zzp = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcdk zzcdkVar) {
        long j7;
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbew.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzu.zzB().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzB)).longValue();
        long zza2 = zzcdkVar.zza();
        int i9 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i9 < strArr.length) {
                if (strArr[i9] == null && longValue > Math.abs(zza2 - this.zzh[i9])) {
                    String[] strArr2 = this.zzi;
                    int i10 = 8;
                    Bitmap bitmap = zzcdkVar.getBitmap(8, 8);
                    long j9 = 63;
                    long j10 = 0;
                    int i11 = 0;
                    while (i11 < i10) {
                        int i12 = 0;
                        while (i12 < i10) {
                            int pixel = bitmap.getPixel(i12, i11);
                            if (Color.green(pixel) + Color.red(pixel) + Color.blue(pixel) > 128) {
                                j7 = 1;
                            } else {
                                j7 = 0;
                            }
                            j10 |= j7 << ((int) j9);
                            j9--;
                            i12++;
                            i10 = 8;
                        }
                        i11++;
                        i10 = 8;
                    }
                    strArr2[i9] = String.format("%016X", Long.valueOf(j10));
                    return;
                }
                i9++;
            } else {
                return;
            }
        }
    }
}
