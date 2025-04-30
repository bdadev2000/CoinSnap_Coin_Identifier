package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzagt implements zzcc {
    public static final Parcelable.Creator<zzagt> CREATOR;
    private static final zzan zzf;
    private static final zzan zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzal zzalVar = new zzal();
        zzalVar.zzX(MimeTypes.APPLICATION_ID3);
        zzf = zzalVar.zzad();
        zzal zzalVar2 = new zzal();
        zzalVar2.zzX(MimeTypes.APPLICATION_SCTE35);
        zzg = zzalVar2.zzad();
        CREATOR = new zzags();
    }

    public zzagt(String str, String str2, long j7, long j9, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j7;
        this.zzd = j9;
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
        if (obj != null && zzagt.class == obj.getClass()) {
            zzagt zzagtVar = (zzagt) obj;
            if (this.zzc == zzagtVar.zzc && this.zzd == zzagtVar.zzd && zzgd.zzG(this.zza, zzagtVar.zza) && zzgd.zzG(this.zzb, zzagtVar.zzb) && Arrays.equals(this.zze, zzagtVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = this.zzh;
        if (i10 == 0) {
            String str = this.zza;
            int i11 = 0;
            if (str != null) {
                i9 = str.hashCode();
            } else {
                i9 = 0;
            }
            String str2 = this.zzb;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j7 = this.zzc;
            long j9 = this.zzd;
            int hashCode = ((((((((i9 + 527) * 31) + i11) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final /* synthetic */ void zza(zzby zzbyVar) {
    }

    public zzagt(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }
}
