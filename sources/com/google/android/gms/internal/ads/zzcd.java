package com.google.android.gms.internal.ads;

import Q7.n0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzcd implements Parcelable {
    public static final Parcelable.Creator<zzcd> CREATOR = new zzcb();
    public final long zza;
    private final zzcc[] zzb;

    public zzcd(long j7, zzcc... zzccVarArr) {
        this.zza = j7;
        this.zzb = zzccVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcd.class == obj.getClass()) {
            zzcd zzcdVar = (zzcd) obj;
            if (Arrays.equals(this.zzb, zzcdVar.zzb) && this.zza == zzcdVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzb) * 31;
        long j7 = this.zza;
        return hashCode + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        String g9;
        long j7 = this.zza;
        String arrays = Arrays.toString(this.zzb);
        if (j7 == C.TIME_UNSET) {
            g9 = "";
        } else {
            g9 = n0.g(j7, ", presentationTimeUs=");
        }
        return AbstractC2914a.e("entries=", arrays, g9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.zzb.length);
        for (zzcc zzccVar : this.zzb) {
            parcel.writeParcelable(zzccVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzcc zzb(int i9) {
        return this.zzb[i9];
    }

    public final zzcd zzc(zzcc... zzccVarArr) {
        int length = zzccVarArr.length;
        if (length == 0) {
            return this;
        }
        long j7 = this.zza;
        zzcc[] zzccVarArr2 = this.zzb;
        int i9 = zzgd.zza;
        int length2 = zzccVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzccVarArr2, length2 + length);
        System.arraycopy(zzccVarArr, 0, copyOf, length2, length);
        return new zzcd(j7, (zzcc[]) copyOf);
    }

    public final zzcd zzd(@Nullable zzcd zzcdVar) {
        if (zzcdVar == null) {
            return this;
        }
        return zzc(zzcdVar.zzb);
    }

    public zzcd(Parcel parcel) {
        this.zzb = new zzcc[parcel.readInt()];
        int i9 = 0;
        while (true) {
            zzcc[] zzccVarArr = this.zzb;
            if (i9 < zzccVarArr.length) {
                zzccVarArr[i9] = (zzcc) parcel.readParcelable(zzcc.class.getClassLoader());
                i9++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public zzcd(List list) {
        this(C.TIME_UNSET, (zzcc[]) list.toArray(new zzcc[0]));
    }
}
