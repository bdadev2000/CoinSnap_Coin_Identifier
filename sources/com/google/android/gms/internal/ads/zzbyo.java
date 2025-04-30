package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbyo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyo> CREATOR = new zzbyp();

    @SafeParcelable.Field(id = 2)
    public final com.google.android.gms.ads.internal.client.zzl zza;

    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @SafeParcelable.Constructor
    public zzbyo(@SafeParcelable.Param(id = 2) com.google.android.gms.ads.internal.client.zzl zzlVar, @SafeParcelable.Param(id = 3) String str) {
        this.zza = zzlVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzlVar, i9, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
