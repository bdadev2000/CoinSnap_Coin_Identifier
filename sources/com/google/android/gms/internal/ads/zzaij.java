package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaij implements zzcc {
    public static final Parcelable.Creator<zzaij> CREATOR = new zzaif();
    public final List zza;

    public zzaij(List list) {
        this.zza = list;
        boolean z8 = false;
        if (!list.isEmpty()) {
            long j7 = ((zzaii) list.get(0)).zzc;
            int i9 = 1;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (((zzaii) list.get(i9)).zzb < j7) {
                    z8 = true;
                    break;
                } else {
                    j7 = ((zzaii) list.get(i9)).zzc;
                    i9++;
                }
            }
        }
        zzeq.zzd(!z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaij.class == obj.getClass()) {
            return this.zza.equals(((zzaij) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final /* synthetic */ void zza(zzby zzbyVar) {
    }
}
