package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import com.safedk.android.analytics.brandsafety.ImpressionLog;

@Deprecated
/* loaded from: classes.dex */
public class zzagd implements zzbj {
    public static final Parcelable.Creator<zzagd> CREATOR = new zzagc();
    public final String zza;
    public final String zzb;

    public zzagd(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = zzeu.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagd zzagdVar = (zzagd) obj;
            if (this.zza.equals(zzagdVar.zza) && this.zzb.equals(zzagdVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + ImpressionLog.R + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbj
    public final void zza(zzbf zzbfVar) {
        char c2;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 79833656:
                if (str.equals(ShareConstants.TITLE)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 428414940:
                if (str.equals(ShareConstants.DESCRIPTION)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            zzbfVar.zzq(this.zzb);
            return;
        }
        if (c2 == 1) {
            zzbfVar.zze(this.zzb);
            return;
        }
        if (c2 == 2) {
            zzbfVar.zzd(this.zzb);
        } else if (c2 == 3) {
            zzbfVar.zzc(this.zzb);
        } else {
            if (c2 != 4) {
                return;
            }
            zzbfVar.zzh(this.zzb);
        }
    }

    public zzagd(String str, String str2) {
        this.zza = zzfxi.zzb(str);
        this.zzb = str2;
    }
}
