package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import y.AbstractC2933a;

/* loaded from: classes2.dex */
public final class zzaii implements Parcelable {
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaig
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzaii zzaiiVar = (zzaii) obj;
            zzaii zzaiiVar2 = (zzaii) obj2;
            return zzgar.zzk().zzc(zzaiiVar.zzb, zzaiiVar2.zzb).zzc(zzaiiVar.zzc, zzaiiVar2.zzc).zzb(zzaiiVar.zzd, zzaiiVar2.zzd).zza();
        }
    };
    public static final Parcelable.Creator<zzaii> CREATOR = new zzaih();

    public zzaii(long j7, long j9, int i9) {
        boolean z8;
        if (j7 < j9) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zzb = j7;
        this.zzc = j9;
        this.zzd = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaii.class == obj.getClass()) {
            zzaii zzaiiVar = (zzaii) obj;
            if (this.zzb == zzaiiVar.zzb && this.zzc == zzaiiVar.zzc && this.zzd == zzaiiVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        long j7 = this.zzb;
        long j9 = this.zzc;
        int i9 = this.zzd;
        Locale locale = Locale.US;
        StringBuilder a6 = AbstractC2933a.a("Segment: startTimeMs=", j7, ", endTimeMs=");
        a6.append(j9);
        a6.append(", speedDivisor=");
        a6.append(i9);
        return a6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeInt(this.zzd);
    }
}
