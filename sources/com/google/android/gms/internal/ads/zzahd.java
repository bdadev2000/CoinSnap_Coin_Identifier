package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzahd implements zzbc {
    public static final Parcelable.Creator<zzahd> CREATOR = new zzaha();
    public final List zza;

    public zzahd(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j3 = ((zzahc) list.get(0)).zzb;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((zzahc) list.get(i10)).zza < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((zzahc) list.get(i10)).zzb;
                    i10++;
                }
            }
        }
        zzdb.zzd(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahd.class == obj.getClass()) {
            return this.zza.equals(((zzahd) obj).zza);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }
}
