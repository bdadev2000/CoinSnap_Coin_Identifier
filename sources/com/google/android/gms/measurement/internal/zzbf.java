package com.google.android.gms.measurement.internal;

import a4.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbi();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final zzbe zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final long zzd;

    public zzbf(zzbf zzbfVar, long j3) {
        Preconditions.checkNotNull(zzbfVar);
        this.zza = zzbfVar.zza;
        this.zzb = zzbfVar.zzb;
        this.zzc = zzbfVar.zzc;
        this.zzd = j3;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder p10 = j.p("origin=", str, ",name=", str2, ",params=");
        p10.append(valueOf);
        return p10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i10, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbf(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzbe zzbeVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j3) {
        this.zza = str;
        this.zzb = zzbeVar;
        this.zzc = str2;
        this.zzd = j3;
    }
}
