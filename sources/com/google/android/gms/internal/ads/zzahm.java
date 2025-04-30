package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahm extends zzahr {
    public static final Parcelable.Creator<zzahm> CREATOR = new zzahl();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzahm(Parcel parcel) {
        super(GeobFrame.ID);
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahm.class == obj.getClass()) {
            zzahm zzahmVar = (zzahm) obj;
            if (zzgd.zzG(this.zza, zzahmVar.zza) && zzgd.zzG(this.zzb, zzahmVar.zzb) && zzgd.zzG(this.zzc, zzahmVar.zzc) && Arrays.equals(this.zzd, zzahmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        String str = this.zza;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i9 + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.zzd) + (((((i12 * 31) + i10) * 31) + i11) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzahm(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
