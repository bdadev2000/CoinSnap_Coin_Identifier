package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes2.dex */
final class zzfvu extends zzfwo {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zza(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zzc(int i9) {
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zzd(int i9) {
        this.zzc = i9;
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zze(float f9) {
        this.zzd = f9;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zzf(int i9) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zzg(IBinder iBinder) {
        if (iBinder != null) {
            this.zza = iBinder;
            return this;
        }
        throw new NullPointerException("Null windowToken");
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zzh(int i9) {
        this.zze = i9;
        this.zzg = (byte) (this.zzg | Ascii.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwp zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzfvw(iBinder, this.zzb, this.zzc, this.zzd, 0, 0, null, this.zze, null, this.zzf, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.zzg & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.zzg & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.zzg & Ascii.DLE) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
