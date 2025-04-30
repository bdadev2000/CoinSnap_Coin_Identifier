package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgh implements zzcc {
    public static final Parcelable.Creator<zzgh> CREATOR = new zzgf();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzgh(String str, byte[] bArr, int i9, int i10) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i9;
        this.zzd = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgh.class == obj.getClass()) {
            zzgh zzghVar = (zzgh) obj;
            if (this.zza.equals(zzghVar.zza) && Arrays.equals(this.zzb, zzghVar.zzb) && this.zzc == zzghVar.zzc && this.zzd == zzghVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (hashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String zzA;
        int i9 = this.zzd;
        if (i9 != 1) {
            if (i9 != 23) {
                if (i9 != 67) {
                    byte[] bArr = this.zzb;
                    int length = bArr.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        sb.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
                        sb.append(Character.forDigit(bArr[i10] & Ascii.SI, 16));
                    }
                    zzA = sb.toString();
                } else {
                    zzA = String.valueOf(zzgea.zzd(this.zzb));
                }
            } else {
                zzA = String.valueOf(Float.intBitsToFloat(zzgea.zzd(this.zzb)));
            }
        } else {
            zzA = zzgd.zzA(this.zzb);
        }
        return AbstractC2914a.k("mdta: key=", this.zza, ", value=", zzA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final /* synthetic */ void zza(zzby zzbyVar) {
    }

    public /* synthetic */ zzgh(Parcel parcel, zzgg zzggVar) {
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }
}
