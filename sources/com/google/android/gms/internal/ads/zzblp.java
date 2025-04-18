package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
/* loaded from: classes3.dex */
public final class zzblp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblp> CREATOR = new zzblq();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final boolean zzb;

    @SafeParcelable.Field(id = 3)
    public final int zzc;

    @SafeParcelable.Field(id = 4)
    public final String zzd;

    @SafeParcelable.Constructor
    public zzblp(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
