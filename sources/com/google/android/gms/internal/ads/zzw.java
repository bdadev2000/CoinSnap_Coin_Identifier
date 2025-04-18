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

/* loaded from: classes3.dex */
public final class zzw implements Comparator<zzv>, Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzt();

    @Nullable
    public final String zza;
    public final int zzb;
    private final zzv[] zzc;
    private int zzd;

    public zzw(Parcel parcel) {
        this.zza = parcel.readString();
        zzv[] zzvVarArr = (zzv[]) parcel.createTypedArray(zzv.CREATOR);
        int i10 = zzen.zza;
        this.zzc = zzvVarArr;
        this.zzb = zzvVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3 = zzvVar;
        zzv zzvVar4 = zzvVar2;
        UUID uuid = zzj.zza;
        if (uuid.equals(zzvVar3.zza)) {
            if (!uuid.equals(zzvVar4.zza)) {
                return 1;
            }
            return 0;
        }
        return zzvVar3.zza.compareTo(zzvVar4.zza);
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
        if (obj != null && zzw.class == obj.getClass()) {
            zzw zzwVar = (zzw) obj;
            if (Objects.equals(this.zza, zzwVar.zza) && Arrays.equals(this.zzc, zzwVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.zzd;
        if (i10 == 0) {
            String str = this.zza;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode2;
            return hashCode2;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzv zza(int i10) {
        return this.zzc[i10];
    }

    @CheckResult
    public final zzw zzb(@Nullable String str) {
        if (Objects.equals(this.zza, str)) {
            return this;
        }
        return new zzw(str, false, this.zzc);
    }

    private zzw(@Nullable String str, boolean z10, zzv... zzvVarArr) {
        this.zza = str;
        zzvVarArr = z10 ? (zzv[]) zzvVarArr.clone() : zzvVarArr;
        this.zzc = zzvVarArr;
        this.zzb = zzvVarArr.length;
        Arrays.sort(zzvVarArr, this);
    }

    public zzw(@Nullable String str, zzv... zzvVarArr) {
        this(null, true, zzvVarArr);
    }

    public zzw(List list) {
        this(null, false, (zzv[]) list.toArray(new zzv[0]));
    }
}
