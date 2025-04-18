package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class zzy implements Comparator<zzx>, Parcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new zzv();

    @Nullable
    public final String zza;
    public final int zzb;
    private final zzx[] zzc;
    private int zzd;

    public zzy(Parcel parcel) {
        this.zza = parcel.readString();
        zzx[] zzxVarArr = (zzx[]) parcel.createTypedArray(zzx.CREATOR);
        int i2 = zzeu.zza;
        this.zzc = zzxVarArr;
        this.zzb = zzxVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzx zzxVar, zzx zzxVar2) {
        zzx zzxVar3 = zzxVar;
        zzx zzxVar4 = zzxVar2;
        UUID uuid = zzk.zza;
        return uuid.equals(zzxVar3.zza) ? !uuid.equals(zzxVar4.zza) ? 1 : 0 : zzxVar3.zza.compareTo(zzxVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzy.class == obj.getClass()) {
            zzy zzyVar = (zzy) obj;
            if (Objects.equals(this.zza, zzyVar.zza) && Arrays.equals(this.zzc, zzyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 != 0) {
            return i2;
        }
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzx zza(int i2) {
        return this.zzc[i2];
    }

    @CheckResult
    public final zzy zzb(@Nullable String str) {
        return Objects.equals(this.zza, str) ? this : new zzy(str, false, this.zzc);
    }

    private zzy(@Nullable String str, boolean z2, zzx... zzxVarArr) {
        this.zza = str;
        zzxVarArr = z2 ? (zzx[]) zzxVarArr.clone() : zzxVarArr;
        this.zzc = zzxVarArr;
        this.zzb = zzxVarArr.length;
        Arrays.sort(zzxVarArr, this);
    }

    public zzy(@Nullable String str, zzx... zzxVarArr) {
        this(null, true, zzxVarArr);
    }

    public zzy(List list) {
        this(null, false, (zzx[]) list.toArray(new zzx[0]));
    }
}
