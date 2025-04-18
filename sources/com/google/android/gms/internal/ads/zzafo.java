package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzafo implements zzbc {
    public static final Parcelable.Creator<zzafo> CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzZ(MimeTypes.APPLICATION_ID3);
        zzabVar.zzaf();
        zzab zzabVar2 = new zzab();
        zzabVar2.zzZ(MimeTypes.APPLICATION_SCTE35);
        zzabVar2.zzaf();
        CREATOR = new zzafn();
    }

    public zzafo(String str, String str2, long j3, long j10, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j3;
        this.zzd = j10;
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
        if (obj != null && zzafo.class == obj.getClass()) {
            zzafo zzafoVar = (zzafo) obj;
            if (this.zzc == zzafoVar.zzc && this.zzd == zzafoVar.zzd && Objects.equals(this.zza, zzafoVar.zza) && Objects.equals(this.zzb, zzafoVar.zzb) && Arrays.equals(this.zze, zzafoVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.zzf;
        if (i11 == 0) {
            String str = this.zza;
            int i12 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            String str2 = this.zzb;
            if (str2 != null) {
                i12 = str2.hashCode();
            }
            long j3 = this.zzc;
            long j10 = this.zzd;
            int hashCode = ((((((((i10 + 527) * 31) + i12) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
            this.zzf = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }

    public zzafo(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }
}
