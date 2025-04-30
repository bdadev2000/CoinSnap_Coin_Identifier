package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
/* loaded from: classes2.dex */
public final class zzcbk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbk> CREATOR = new zzcbl();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzq zzc;

    @SafeParcelable.Field(id = 4)
    public final com.google.android.gms.ads.internal.client.zzl zzd;

    @SafeParcelable.Constructor
    public zzcbk(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) com.google.android.gms.ads.internal.client.zzq zzqVar, @SafeParcelable.Param(id = 4) com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i9, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i9, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
