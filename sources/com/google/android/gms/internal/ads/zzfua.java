package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes3.dex */
final class zzfua extends zzfve {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zza(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zzc(int i10) {
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zzd(int i10) {
        this.zzc = i10;
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zze(float f10) {
        this.zzd = f10;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zzf(int i10) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zzg(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.zza = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zzh(int i10) {
        this.zze = i10;
        this.zzg = (byte) (this.zzg | Ascii.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfvf zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzfuc(iBinder, this.zzb, this.zzc, this.zzd, 0, 0, null, this.zze, null, this.zzf, null, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.zzg & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.zzg & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.zzg & Ascii.DLE) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
