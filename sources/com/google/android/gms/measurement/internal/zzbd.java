package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.mbridge.msdk.foundation.entity.o;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbg();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final zzbc zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final long zzd;

    public zzbd(zzbd zzbdVar, long j7) {
        Preconditions.checkNotNull(zzbdVar);
        this.zza = zzbdVar.zza;
        this.zzb = zzbdVar.zzb;
        this.zzc = zzbdVar.zzc;
        this.zzd = j7;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder o3 = o.o("origin=", str, ",name=", str2, ",params=");
        o3.append(valueOf);
        return o3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i9, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbd(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzbc zzbcVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j7) {
        this.zza = str;
        this.zzb = zzbcVar;
        this.zzc = str2;
        this.zzd = j7;
    }
}
