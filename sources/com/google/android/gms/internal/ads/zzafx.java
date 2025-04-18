package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzafx extends zzagl {
    public static final Parcelable.Creator<zzafx> CREATOR = new zzafw();
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzafx(Parcel parcel) {
        super(ApicFrame.ID);
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafxVar = (zzafx) obj;
            if (this.zzc == zzafxVar.zzc && Objects.equals(this.zza, zzafxVar.zza) && Objects.equals(this.zzb, zzafxVar.zzb) && Arrays.equals(this.zzd, zzafxVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.zza;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = this.zzc;
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.zzd) + ((((((i12 + 527) * 31) + i10) * 31) + i11) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagl, com.google.android.gms.internal.ads.zzbc
    public final void zza(zzay zzayVar) {
        zzayVar.zza(this.zzd, this.zzc);
    }

    public zzafx(String str, @Nullable String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }
}
