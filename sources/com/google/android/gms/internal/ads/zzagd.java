package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzagd extends zzagl {
    public static final Parcelable.Creator<zzagd> CREATOR = new zzagc();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagl[] zze;

    public zzagd(Parcel parcel) {
        super(ChapterTocFrame.ID);
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzagl[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zze[i11] = (zzagl) parcel.readParcelable(zzagl.class.getClassLoader());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagd.class == obj.getClass()) {
            zzagd zzagdVar = (zzagd) obj;
            if (this.zzb == zzagdVar.zzb && this.zzc == zzagdVar.zzc && Objects.equals(this.zza, zzagdVar.zza) && Arrays.equals(this.zzd, zzagdVar.zzd) && Arrays.equals(this.zze, zzagdVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagl zzaglVar : this.zze) {
            parcel.writeParcelable(zzaglVar, 0);
        }
    }

    public zzagd(String str, boolean z10, boolean z11, String[] strArr, zzagl[] zzaglVarArr) {
        super(ChapterTocFrame.ID);
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzaglVarArr;
    }
}
