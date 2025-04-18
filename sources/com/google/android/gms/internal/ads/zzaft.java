package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public class zzaft implements zzbc {
    public static final Parcelable.Creator<zzaft> CREATOR = new zzafs();
    public final String zza;
    public final String zzb;

    public zzaft(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzen.zza;
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
            zzaft zzaftVar = (zzaft) obj;
            if (this.zza.equals(zzaftVar.zza) && this.zzb.equals(zzaftVar.zzb)) {
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbc
    public final void zza(zzay zzayVar) {
        char c10;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            return;
                        }
                        zzayVar.zzh(this.zzb);
                        return;
                    }
                    zzayVar.zzc(this.zzb);
                    return;
                }
                zzayVar.zzd(this.zzb);
                return;
            }
            zzayVar.zze(this.zzb);
            return;
        }
        zzayVar.zzq(this.zzb);
    }

    public zzaft(String str, String str2) {
        this.zza = zzfwa.zzb(str);
        this.zzb = str2;
    }
}
