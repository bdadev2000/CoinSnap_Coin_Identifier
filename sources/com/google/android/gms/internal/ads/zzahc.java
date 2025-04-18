package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzahc implements Parcelable {
    public static final Parcelable.Creator<zzahc> CREATOR = new zzahb();
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzahc(long j3, long j10, int i10) {
        zzdb.zzd(j3 < j10);
        this.zza = j3;
        this.zzb = j10;
        this.zzc = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahc.class == obj.getClass()) {
            zzahc zzahcVar = (zzahc) obj;
            if (this.zza == zzahcVar.zza && this.zzb == zzahcVar.zzb && this.zzc == zzahcVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeInt(this.zzc);
    }
}
