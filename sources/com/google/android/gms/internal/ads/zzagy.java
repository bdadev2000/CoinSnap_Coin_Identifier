package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes2.dex */
public class zzagy implements zzcc {
    public static final Parcelable.Creator<zzagy> CREATOR = new zzagx();
    public final String zza;
    public final String zzb;

    public zzagy(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = zzgd.zza;
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
            zzagy zzagyVar = (zzagy) obj;
            if (this.zza.equals(zzagyVar.zza) && this.zzb.equals(zzagyVar.zzb)) {
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
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(zzby zzbyVar) {
        char c9;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    if (c9 != 3) {
                        if (c9 != 4) {
                            return;
                        }
                        zzbyVar.zzh(this.zzb);
                        return;
                    }
                    zzbyVar.zzc(this.zzb);
                    return;
                }
                zzbyVar.zzd(this.zzb);
                return;
            }
            zzbyVar.zze(this.zzb);
            return;
        }
        zzbyVar.zzq(this.zzb);
    }

    public zzagy(String str, String str2) {
        this.zza = zzfxm.zzb(str);
        this.zzb = str2;
    }
}
