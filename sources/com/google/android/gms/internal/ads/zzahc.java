package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahc extends zzahr {
    public static final Parcelable.Creator<zzahc> CREATOR = new zzahb();
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzahc(Parcel parcel) {
        super(ApicFrame.ID);
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahc.class == obj.getClass()) {
            zzahc zzahcVar = (zzahc) obj;
            if (this.zzc == zzahcVar.zzc && zzgd.zzG(this.zza, zzahcVar.zza) && zzgd.zzG(this.zzb, zzahcVar.zzb) && Arrays.equals(this.zzd, zzahcVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        String str = this.zza;
        int i10 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = this.zzc;
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return Arrays.hashCode(this.zzd) + ((((((i11 + 527) * 31) + i9) * 31) + i10) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahr, com.google.android.gms.internal.ads.zzcc
    public final void zza(zzby zzbyVar) {
        zzbyVar.zza(this.zzd, this.zzc);
    }

    public zzahc(String str, @Nullable String str2, int i9, byte[] bArr) {
        super(ApicFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = i9;
        this.zzd = bArr;
    }
}
