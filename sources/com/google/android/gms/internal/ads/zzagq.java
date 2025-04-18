package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzagq extends zzagl {
    public static final Parcelable.Creator<zzagq> CREATOR = new zzagp();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzagq(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagl, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagq.class == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.zza == zzagqVar.zza && this.zzb == zzagqVar.zzb && this.zzc == zzagqVar.zzc && Arrays.equals(this.zzd, zzagqVar.zzd) && Arrays.equals(this.zze, zzagqVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza + 527;
        int[] iArr = this.zzd;
        int hashCode = Arrays.hashCode(iArr) + (((((i10 * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (hashCode * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    public zzagq(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = zzen.zza;
        this.zzd = createIntArray;
        this.zze = parcel.createIntArray();
    }
}
