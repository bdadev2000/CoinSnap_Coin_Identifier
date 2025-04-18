package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzagb extends zzagl {
    public static final Parcelable.Creator<zzagb> CREATOR = new zzaga();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagl[] zzg;

    public zzagb(Parcel parcel) {
        super(ChapterFrame.ID);
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzagl[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zzg[i11] = (zzagl) parcel.readParcelable(zzagl.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagl, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagb.class == obj.getClass()) {
            zzagb zzagbVar = (zzagb) obj;
            if (this.zzb == zzagbVar.zzb && this.zzc == zzagbVar.zzc && this.zzd == zzagbVar.zzd && this.zze == zzagbVar.zze && Objects.equals(this.zza, zzagbVar.zza) && Arrays.equals(this.zzg, zzagbVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzagl zzaglVar : this.zzg) {
            parcel.writeParcelable(zzaglVar, 0);
        }
    }

    public zzagb(String str, int i10, int i11, long j3, long j10, zzagl[] zzaglVarArr) {
        super(ChapterFrame.ID);
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j3;
        this.zze = j10;
        this.zzg = zzaglVarArr;
    }
}
