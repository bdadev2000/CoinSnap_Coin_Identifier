package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahv extends zzahr {
    public static final Parcelable.Creator<zzahv> CREATOR = new zzahu();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzahv(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzahr, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahv.class == obj.getClass()) {
            zzahv zzahvVar = (zzahv) obj;
            if (this.zza == zzahvVar.zza && this.zzb == zzahvVar.zzb && this.zzc == zzahvVar.zzc && Arrays.equals(this.zzd, zzahvVar.zzd) && Arrays.equals(this.zze, zzahvVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zza + 527;
        int[] iArr = this.zzd;
        int hashCode = Arrays.hashCode(iArr) + (((((i9 * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (hashCode * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    public zzahv(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i9 = zzgd.zza;
        this.zzd = createIntArray;
        this.zze = parcel.createIntArray();
    }
}
