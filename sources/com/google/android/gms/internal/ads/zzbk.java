package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbk implements Parcelable {
    public static final Parcelable.Creator<zzbk> CREATOR = new zzbi();
    public final long zza;
    private final zzbj[] zzb;

    public zzbk(long j2, zzbj... zzbjVarArr) {
        this.zza = j2;
        this.zzb = zzbjVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbk.class == obj.getClass()) {
            zzbk zzbkVar = (zzbk) obj;
            if (Arrays.equals(this.zzb, zzbkVar.zzb) && this.zza == zzbkVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzb) * 31;
        long j2 = this.zza;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        long j2 = this.zza;
        return androidx.compose.foundation.text.input.a.A("entries=", Arrays.toString(this.zzb), j2 == -9223372036854775807L ? "" : d.m(", presentationTimeUs=", j2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zzb.length);
        for (zzbj zzbjVar : this.zzb) {
            parcel.writeParcelable(zzbjVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbj zzb(int i2) {
        return this.zzb[i2];
    }

    public final zzbk zzc(zzbj... zzbjVarArr) {
        int length = zzbjVarArr.length;
        if (length == 0) {
            return this;
        }
        long j2 = this.zza;
        zzbj[] zzbjVarArr2 = this.zzb;
        int i2 = zzeu.zza;
        int length2 = zzbjVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzbjVarArr2, length2 + length);
        System.arraycopy(zzbjVarArr, 0, copyOf, length2, length);
        return new zzbk(j2, (zzbj[]) copyOf);
    }

    public final zzbk zzd(@Nullable zzbk zzbkVar) {
        return zzbkVar == null ? this : zzc(zzbkVar.zzb);
    }

    public zzbk(Parcel parcel) {
        this.zzb = new zzbj[parcel.readInt()];
        int i2 = 0;
        while (true) {
            zzbj[] zzbjVarArr = this.zzb;
            if (i2 < zzbjVarArr.length) {
                zzbjVarArr[i2] = (zzbj) parcel.readParcelable(zzbj.class.getClassLoader());
                i2++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public zzbk(List list) {
        this(-9223372036854775807L, (zzbj[]) list.toArray(new zzbj[0]));
    }
}
