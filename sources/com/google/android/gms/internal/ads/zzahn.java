package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes.dex */
public final class zzahn implements zzbj {
    public static final Parcelable.Creator<zzahn> CREATOR = new zzahk();
    public final List zza;

    public zzahn(List list) {
        this.zza = list;
        boolean z2 = false;
        if (!list.isEmpty()) {
            long j2 = ((zzahm) list.get(0)).zzb;
            int i2 = 1;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((zzahm) list.get(i2)).zza < j2) {
                    z2 = true;
                    break;
                } else {
                    j2 = ((zzahm) list.get(i2)).zzb;
                    i2++;
                }
            }
        }
        zzdi.zzd(!z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahn.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzahn) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
