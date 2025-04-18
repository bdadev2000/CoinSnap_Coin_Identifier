package com.google.android.gms.internal.ads;

import a4.j;
import android.os.IBinder;
import androidx.annotation.Nullable;
import vd.e;

/* loaded from: classes3.dex */
final class zzfuc extends zzfvf {
    private final IBinder zza;

    @Nullable
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;

    @Nullable
    private final String zzf;

    public /* synthetic */ zzfuc(IBinder iBinder, String str, int i10, float f10, int i11, int i12, String str2, int i13, String str3, String str4, String str5, zzfub zzfubVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i13;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvf) {
            zzfvf zzfvfVar = (zzfvf) obj;
            if (this.zza.equals(zzfvfVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfvfVar.zzh()) : zzfvfVar.zzh() == null) && this.zzc == zzfvfVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfvfVar.zza())) {
                zzfvfVar.zzb();
                zzfvfVar.zzd();
                zzfvfVar.zzj();
                if (this.zze == zzfvfVar.zze()) {
                    zzfvfVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfvfVar.zzg()) : zzfvfVar.zzg() == null) {
                        zzfvfVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i11 = this.zze;
        String str2 = this.zzf;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((floatToIntBits * 1525764945) ^ i11) * (-721379959)) ^ i10) * 1000003;
    }

    public final String toString() {
        StringBuilder o10 = j.o("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        o10.append(this.zzb);
        o10.append(", layoutGravity=");
        o10.append(this.zzc);
        o10.append(", layoutVerticalMargin=");
        o10.append(this.zzd);
        o10.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        o10.append(this.zze);
        o10.append(", deeplinkUrl=null, adFieldEnifd=");
        return e.h(o10, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    @Nullable
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    @Nullable
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    @Nullable
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    @Nullable
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    @Nullable
    public final String zzk() {
        return null;
    }
}
