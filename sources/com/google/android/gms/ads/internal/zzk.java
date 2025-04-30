package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InterstitialAdParameterParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    @SafeParcelable.Field(id = 2)
    public final boolean zza;

    @SafeParcelable.Field(id = 3)
    public final boolean zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @SafeParcelable.Field(id = 6)
    public final float zze;

    @SafeParcelable.Field(id = 7)
    public final int zzf;

    @SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @SafeParcelable.Field(id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 2) boolean z8, @SafeParcelable.Param(id = 3) boolean z9, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) float f9, @SafeParcelable.Param(id = 7) int i9, @SafeParcelable.Param(id = 8) boolean z11, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) boolean z13) {
        this.zza = z8;
        this.zzb = z9;
        this.zzc = str;
        this.zzd = z10;
        this.zze = f9;
        this.zzf = i9;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        boolean z8 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z8);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeFloat(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(boolean z8, boolean z9, boolean z10, float f9, int i9, boolean z11, boolean z12, boolean z13) {
        this(z8, z9, null, z10, f9, -1, z11, z12, z13);
    }
}
