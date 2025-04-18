package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzagl extends zzagv {
    public static final Parcelable.Creator<zzagl> CREATOR = new zzagk();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagv[] zzg;

    public zzagl(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i2 = zzeu.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzagv[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.zzg[i3] = (zzagv) parcel.readParcelable(zzagv.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagv, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagl.class == obj.getClass()) {
            zzagl zzaglVar = (zzagl) obj;
            if (this.zzb == zzaglVar.zzb && this.zzc == zzaglVar.zzc && this.zzd == zzaglVar.zzd && this.zze == zzaglVar.zze && Objects.equals(this.zza, zzaglVar.zza) && Arrays.equals(this.zzg, zzaglVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzagv zzagvVar : this.zzg) {
            parcel.writeParcelable(zzagvVar, 0);
        }
    }

    public zzagl(String str, int i2, int i3, long j2, long j3, zzagv[] zzagvVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = j3;
        this.zzg = zzagvVarArr;
    }
}
