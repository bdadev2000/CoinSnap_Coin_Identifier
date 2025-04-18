package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzagh extends zzagl {
    public static final Parcelable.Creator<zzagh> CREATOR = new zzagg();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzagh(Parcel parcel) {
        super(GeobFrame.ID);
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagh.class == obj.getClass()) {
            zzagh zzaghVar = (zzagh) obj;
            if (Objects.equals(this.zza, zzaghVar.zza) && Objects.equals(this.zzb, zzaghVar.zzb) && Objects.equals(this.zzc, zzaghVar.zzc) && Arrays.equals(this.zzd, zzaghVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.zza;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = i10 + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.zzd) + (((((i13 * 31) + i11) * 31) + i12) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzagh(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
