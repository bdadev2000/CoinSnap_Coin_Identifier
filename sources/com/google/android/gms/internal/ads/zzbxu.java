package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
/* loaded from: classes2.dex */
public final class zzbxu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxu> CREATOR = new zzbxv();

    @SafeParcelable.Field(id = 1)
    public final Bundle zza;

    @SafeParcelable.Field(id = 2)
    public final VersionInfoParcel zzb;

    @SafeParcelable.Field(id = 3)
    public final ApplicationInfo zzc;

    @SafeParcelable.Field(id = 4)
    public final String zzd;

    @SafeParcelable.Field(id = 5)
    public final List zze;

    @Nullable
    @SafeParcelable.Field(id = 6)
    public final PackageInfo zzf;

    @SafeParcelable.Field(id = 7)
    public final String zzg;

    @SafeParcelable.Field(id = 9)
    public final String zzh;

    @Nullable
    @SafeParcelable.Field(id = 10)
    public zzfjj zzi;

    @Nullable
    @SafeParcelable.Field(id = 11)
    public String zzj;

    @SafeParcelable.Field(id = 12)
    public final boolean zzk;

    @SafeParcelable.Field(id = 13)
    public final boolean zzl;

    @SafeParcelable.Field(id = 14)
    public final Bundle zzm;

    @SafeParcelable.Constructor
    public zzbxu(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List list, @Nullable @SafeParcelable.Param(id = 6) PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) zzfjj zzfjjVar, @SafeParcelable.Param(id = 11) String str4, @SafeParcelable.Param(id = 12) boolean z8, @SafeParcelable.Param(id = 13) boolean z9, @SafeParcelable.Param(id = 14) Bundle bundle2) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfjjVar;
        this.zzj = str4;
        this.zzk = z8;
        this.zzl = z9;
        this.zzm = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        Bundle bundle = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i9, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i9, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i9, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i9, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzm, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
