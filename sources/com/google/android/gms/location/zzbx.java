package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (i9 >= 0 && i9 <= 23) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkState(z8, "Start hour must be in range [0, 23].");
        if (i10 >= 0 && i10 <= 59) {
            z9 = true;
        } else {
            z9 = false;
        }
        Preconditions.checkState(z9, "Start minute must be in range [0, 59].");
        if (i11 >= 0 && i11 <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, "End hour must be in range [0, 23].");
        if (i12 >= 0 && i12 <= 59) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i9 + i10) + i11) + i12 > 0, "Parameters can't be all 0.");
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        if (this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i9 = this.zza;
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i9);
        sb.append(", startMinute=");
        sb.append(i10);
        sb.append(", endHour=");
        sb.append(i11);
        sb.append(", endMinute=");
        sb.append(i12);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
