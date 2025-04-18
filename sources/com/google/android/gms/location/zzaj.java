package com.google.android.gms.location;

import a4.j;
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
/* loaded from: classes3.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (i10 >= 0 && i10 <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, "Start hour must be in range [0, 23].");
        if (i11 >= 0 && i11 <= 59) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "Start minute must be in range [0, 59].");
        if (i12 >= 0 && i12 <= 23) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.checkState(z12, "End hour must be in range [0, 23].");
        if (i13 >= 0 && i13 <= 59) {
            z13 = true;
        } else {
            z13 = false;
        }
        Preconditions.checkState(z13, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        if (this.zza == zzajVar.zza && this.zzb == zzajVar.zzb && this.zzc == zzajVar.zzc && this.zzd == zzajVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = this.zzd;
        StringBuilder n10 = j.n("UserPreferredSleepWindow [startHour=", i10, ", startMinute=", i11, ", endHour=");
        n10.append(i12);
        n10.append(", endMinute=");
        n10.append(i13);
        n10.append("]");
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
