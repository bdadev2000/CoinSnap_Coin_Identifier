package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.support.v4.media.d;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzfvk extends zzfwn {
    private final IBinder zza;

    @Nullable
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;

    @Nullable
    private final String zzf;

    public /* synthetic */ zzfvk(IBinder iBinder, String str, int i2, float f2, int i3, int i4, String str2, int i5, String str3, String str4, String str5, zzfvj zzfvjVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = f2;
        this.zze = i5;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwn) {
            zzfwn zzfwnVar = (zzfwn) obj;
            if (this.zza.equals(zzfwnVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfwnVar.zzh()) : zzfwnVar.zzh() == null) && this.zzc == zzfwnVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfwnVar.zza())) {
                zzfwnVar.zzb();
                zzfwnVar.zzd();
                zzfwnVar.zzj();
                if (this.zze == zzfwnVar.zze()) {
                    zzfwnVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfwnVar.zzg()) : zzfwnVar.zzg() == null) {
                        zzfwnVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i2 = this.zze;
        String str2 = this.zzf;
        return ((((hashCode2 * 1525764945) ^ i2) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        StringBuilder v2 = d.v("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        v2.append(this.zzb);
        v2.append(", layoutGravity=");
        v2.append(this.zzc);
        v2.append(", layoutVerticalMargin=");
        v2.append(this.zzd);
        v2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        v2.append(this.zze);
        v2.append(", deeplinkUrl=null, adFieldEnifd=");
        return d.r(v2, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    @Nullable
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    @Nullable
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    @Nullable
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    @Nullable
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    @Nullable
    public final String zzk() {
        return null;
    }
}
