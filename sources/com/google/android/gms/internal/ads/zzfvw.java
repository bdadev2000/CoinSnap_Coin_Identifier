package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfvw extends zzfwp {
    private final IBinder zza;

    @Nullable
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;

    @Nullable
    private final String zzf;

    public /* synthetic */ zzfvw(IBinder iBinder, String str, int i9, float f9, int i10, int i11, String str2, int i12, String str3, String str4, String str5, zzfvv zzfvvVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i9;
        this.zzd = f9;
        this.zze = i12;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwp) {
            zzfwp zzfwpVar = (zzfwp) obj;
            if (this.zza.equals(zzfwpVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfwpVar.zzh()) : zzfwpVar.zzh() == null) && this.zzc == zzfwpVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfwpVar.zza())) {
                zzfwpVar.zzb();
                zzfwpVar.zzd();
                zzfwpVar.zzj();
                if (this.zze == zzfwpVar.zze()) {
                    zzfwpVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfwpVar.zzg()) : zzfwpVar.zzg() == null) {
                        zzfwpVar.zzk();
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
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i10 = this.zze;
        String str2 = this.zzf;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return ((((floatToIntBits * 1525764945) ^ i10) * (-721379959)) ^ i9) * 1000003;
    }

    public final String toString() {
        StringBuilder n2 = o.n("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        n2.append(this.zzb);
        n2.append(", layoutGravity=");
        n2.append(this.zzc);
        n2.append(", layoutVerticalMargin=");
        n2.append(this.zzd);
        n2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        n2.append(this.zze);
        n2.append(", deeplinkUrl=null, adFieldEnifd=");
        return AbstractC2914a.h(n2, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    @Nullable
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    @Nullable
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    @Nullable
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    @Nullable
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    @Nullable
    public final String zzk() {
        return null;
    }
}
