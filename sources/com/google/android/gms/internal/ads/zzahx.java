package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahx extends zzahr {
    public static final Parcelable.Creator<zzahx> CREATOR = new zzahw();
    public final String zza;
    public final byte[] zzb;

    public zzahx(Parcel parcel) {
        super(PrivFrame.ID);
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahx.class == obj.getClass()) {
            zzahx zzahxVar = (zzahx) obj;
            if (zzgd.zzG(this.zza, zzahxVar.zza) && Arrays.equals(this.zzb, zzahxVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        String str = this.zza;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return Arrays.hashCode(this.zzb) + ((i9 + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzahx(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.zza = str;
        this.zzb = bArr;
    }
}
