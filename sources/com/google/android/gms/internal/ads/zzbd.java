package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbd implements Parcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbb();
    public final long zza;
    private final zzbc[] zzb;

    public zzbd(long j3, zzbc... zzbcVarArr) {
        this.zza = j3;
        this.zzb = zzbcVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class == obj.getClass()) {
            zzbd zzbdVar = (zzbd) obj;
            if (Arrays.equals(this.zzb, zzbdVar.zzb) && this.zza == zzbdVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzb) * 31;
        long j3 = this.zza;
        return hashCode + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        String k10;
        long j3 = this.zza;
        String arrays = Arrays.toString(this.zzb);
        if (j3 == C.TIME_UNSET) {
            k10 = "";
        } else {
            k10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k(", presentationTimeUs=", j3);
        }
        return e.f("entries=", arrays, k10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb.length);
        for (zzbc zzbcVar : this.zzb) {
            parcel.writeParcelable(zzbcVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbc zzb(int i10) {
        return this.zzb[i10];
    }

    public final zzbd zzc(zzbc... zzbcVarArr) {
        int length = zzbcVarArr.length;
        if (length == 0) {
            return this;
        }
        long j3 = this.zza;
        zzbc[] zzbcVarArr2 = this.zzb;
        int i10 = zzen.zza;
        int length2 = zzbcVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzbcVarArr2, length2 + length);
        System.arraycopy(zzbcVarArr, 0, copyOf, length2, length);
        return new zzbd(j3, (zzbc[]) copyOf);
    }

    public final zzbd zzd(@Nullable zzbd zzbdVar) {
        return zzbdVar == null ? this : zzc(zzbdVar.zzb);
    }

    public zzbd(Parcel parcel) {
        this.zzb = new zzbc[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzbc[] zzbcVarArr = this.zzb;
            if (i10 < zzbcVarArr.length) {
                zzbcVarArr[i10] = (zzbc) parcel.readParcelable(zzbc.class.getClassLoader());
                i10++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public zzbd(List list) {
        this(C.TIME_UNSET, (zzbc[]) list.toArray(new zzbc[0]));
    }
}
