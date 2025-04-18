package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzafy implements zzbj {
    public static final Parcelable.Creator<zzafy> CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzZ("application/id3");
        zzadVar.zzaf();
        zzad zzadVar2 = new zzad();
        zzadVar2.zzZ("application/x-scte35");
        zzadVar2.zzaf();
        CREATOR = new zzafx();
    }

    public zzafy(String str, String str2, long j2, long j3, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafy.class == obj.getClass()) {
            zzafy zzafyVar = (zzafy) obj;
            if (this.zzc == zzafyVar.zzc && this.zzd == zzafyVar.zzd && Objects.equals(this.zza, zzafyVar.zza) && Objects.equals(this.zzb, zzafyVar.zzb) && Arrays.equals(this.zze, zzafyVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzf;
        if (i2 != 0) {
            return i2;
        }
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j2 = this.zzc;
        long j3 = this.zzd;
        int hashCode3 = ((((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.zzf = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }

    public zzafy(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = zzeu.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }
}
