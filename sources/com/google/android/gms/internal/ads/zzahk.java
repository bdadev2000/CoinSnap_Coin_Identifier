package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;

/* loaded from: classes2.dex */
public final class zzahk extends zzahr {
    public static final Parcelable.Creator<zzahk> CREATOR = new zzahj();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzahk(Parcel parcel) {
        super(CommentFrame.ID);
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahk.class == obj.getClass()) {
            zzahk zzahkVar = (zzahk) obj;
            if (zzgd.zzG(this.zzb, zzahkVar.zzb) && zzgd.zzG(this.zza, zzahkVar.zza) && zzgd.zzG(this.zzc, zzahkVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        String str = this.zza;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i9 + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return (((i12 * 31) + i10) * 31) + i11;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        return this.zzf + ": language=" + this.zza + ", description=" + this.zzb + ", text=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzahk(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
