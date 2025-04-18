package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzagb implements zzbj {
    public static final Parcelable.Creator<zzagb> CREATOR = new zzaga();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagb(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = bArr;
    }

    public static zzagb zzb(zzek zzekVar) {
        int zzg = zzekVar.zzg();
        String zze = zzbn.zze(zzekVar.zzB(zzekVar.zzg(), zzfxo.zza));
        String zzB = zzekVar.zzB(zzekVar.zzg(), StandardCharsets.UTF_8);
        int zzg2 = zzekVar.zzg();
        int zzg3 = zzekVar.zzg();
        int zzg4 = zzekVar.zzg();
        int zzg5 = zzekVar.zzg();
        int zzg6 = zzekVar.zzg();
        byte[] bArr = new byte[zzg6];
        zzekVar.zzH(bArr, 0, zzg6);
        return new zzagb(zzg, zze, zzB, zzg2, zzg3, zzg4, zzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagb.class == obj.getClass()) {
            zzagb zzagbVar = (zzagb) obj;
            if (this.zza == zzagbVar.zza && this.zzb.equals(zzagbVar.zzb) && this.zzc.equals(zzagbVar.zzc) && this.zzd == zzagbVar.zzd && this.zze == zzagbVar.zze && this.zzf == zzagbVar.zzf && this.zzg == zzagbVar.zzg && Arrays.equals(this.zzh, zzagbVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza + 527;
        int hashCode = this.zzb.hashCode() + (i2 * 31);
        int hashCode2 = this.zzc.hashCode() + (hashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((hashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final void zza(zzbf zzbfVar) {
        zzbfVar.zza(this.zzh, this.zza);
    }

    public zzagb(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i2 = zzeu.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
