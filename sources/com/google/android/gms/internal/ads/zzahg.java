package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahg extends zzahr {
    public static final Parcelable.Creator<zzahg> CREATOR = new zzahf();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzahr[] zzg;

    public zzahg(Parcel parcel) {
        super(ChapterFrame.ID);
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzahr[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.zzg[i10] = (zzahr) parcel.readParcelable(zzahr.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahr, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahg.class == obj.getClass()) {
            zzahg zzahgVar = (zzahg) obj;
            if (this.zzb == zzahgVar.zzb && this.zzc == zzahgVar.zzc && this.zzd == zzahgVar.zzd && this.zze == zzahgVar.zze && zzgd.zzG(this.zza, zzahgVar.zza) && Arrays.equals(this.zzg, zzahgVar.zzg)) {
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
        int i10 = this.zzb;
        return ((((((((i10 + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzahr zzahrVar : this.zzg) {
            parcel.writeParcelable(zzahrVar, 0);
        }
    }

    public zzahg(String str, int i9, int i10, long j7, long j9, zzahr[] zzahrVarArr) {
        super(ChapterFrame.ID);
        this.zza = str;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = j7;
        this.zze = j9;
        this.zzg = zzahrVarArr;
    }
}
