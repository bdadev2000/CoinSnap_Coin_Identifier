package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzago extends zzagl {
    public static final Parcelable.Creator<zzago> CREATOR = new zzagn();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzago(Parcel parcel) {
        super(InternalFrame.ID);
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzago.class == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (Objects.equals(this.zzb, zzagoVar.zzb) && Objects.equals(this.zza, zzagoVar.zza) && Objects.equals(this.zzc, zzagoVar.zzc)) {
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
        return (((i13 * 31) + i11) * 31) + i12;
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzago(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
