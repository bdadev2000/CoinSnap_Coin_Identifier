package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzagw implements zzcc {
    public static final Parcelable.Creator<zzagw> CREATOR = new zzagv();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagw(int i9, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.zza = i9;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = bArr;
    }

    public static zzagw zzb(zzfu zzfuVar) {
        int zzg = zzfuVar.zzg();
        String zze = zzcg.zze(zzfuVar.zzA(zzfuVar.zzg(), zzfxs.zza));
        String zzA = zzfuVar.zzA(zzfuVar.zzg(), zzfxs.zzc);
        int zzg2 = zzfuVar.zzg();
        int zzg3 = zzfuVar.zzg();
        int zzg4 = zzfuVar.zzg();
        int zzg5 = zzfuVar.zzg();
        int zzg6 = zzfuVar.zzg();
        byte[] bArr = new byte[zzg6];
        zzfuVar.zzG(bArr, 0, zzg6);
        return new zzagw(zzg, zze, zzA, zzg2, zzg3, zzg4, zzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagw.class == obj.getClass()) {
            zzagw zzagwVar = (zzagw) obj;
            if (this.zza == zzagwVar.zza && this.zzb.equals(zzagwVar.zzb) && this.zzc.equals(zzagwVar.zzc) && this.zzd == zzagwVar.zzd && this.zze == zzagwVar.zze && this.zzf == zzagwVar.zzf && this.zzg == zzagwVar.zzg && Arrays.equals(this.zzh, zzagwVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zza + 527;
        int hashCode = this.zzb.hashCode() + (i9 * 31);
        int hashCode2 = this.zzc.hashCode() + (hashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((hashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(zzby zzbyVar) {
        zzbyVar.zza(this.zzh, this.zza);
    }

    public zzagw(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
