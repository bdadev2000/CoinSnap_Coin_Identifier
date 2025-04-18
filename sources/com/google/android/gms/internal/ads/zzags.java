package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzags extends zzagl {
    public static final Parcelable.Creator<zzags> CREATOR = new zzagr();
    public final String zza;
    public final byte[] zzb;

    public zzags(Parcel parcel) {
        super(PrivFrame.ID);
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzags.class == obj.getClass()) {
            zzags zzagsVar = (zzags) obj;
            if (Objects.equals(this.zza, zzagsVar.zza) && Arrays.equals(this.zzb, zzagsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.zza;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.zzb) + ((i10 + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzags(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.zza = str;
        this.zzb = bArr;
    }
}
