package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahi extends zzahr {
    public static final Parcelable.Creator<zzahi> CREATOR = new zzahh();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzahr[] zze;

    public zzahi(Parcel parcel) {
        super(ChapterTocFrame.ID);
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzahr[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.zze[i10] = (zzahr) parcel.readParcelable(zzahr.class.getClassLoader());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahi.class == obj.getClass()) {
            zzahi zzahiVar = (zzahi) obj;
            if (this.zzb == zzahiVar.zzb && this.zzc == zzahiVar.zzc && zzgd.zzG(this.zza, zzahiVar.zza) && Arrays.equals(this.zzd, zzahiVar.zzd) && Arrays.equals(this.zze, zzahiVar.zze)) {
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
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzahr zzahrVar : this.zze) {
            parcel.writeParcelable(zzahrVar, 0);
        }
    }

    public zzahi(String str, boolean z8, boolean z9, String[] strArr, zzahr[] zzahrVarArr) {
        super(ChapterTocFrame.ID);
        this.zza = str;
        this.zzb = z8;
        this.zzc = z9;
        this.zzd = strArr;
        this.zze = zzahrVarArr;
    }
}
