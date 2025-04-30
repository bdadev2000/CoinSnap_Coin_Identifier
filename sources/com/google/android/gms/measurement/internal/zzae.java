package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes2.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzad();

    @Nullable
    @SafeParcelable.Field(id = 2)
    public String zza;

    @SafeParcelable.Field(id = 3)
    public String zzb;

    @SafeParcelable.Field(id = 4)
    public zzno zzc;

    @SafeParcelable.Field(id = 5)
    public long zzd;

    @SafeParcelable.Field(id = 6)
    public boolean zze;

    @Nullable
    @SafeParcelable.Field(id = 7)
    public String zzf;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public zzbd zzg;

    @SafeParcelable.Field(id = 9)
    public long zzh;

    @Nullable
    @SafeParcelable.Field(id = 10)
    public zzbd zzi;

    @SafeParcelable.Field(id = 11)
    public long zzj;

    @Nullable
    @SafeParcelable.Field(id = 12)
    public zzbd zzk;

    public zzae(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        this.zza = zzaeVar.zza;
        this.zzb = zzaeVar.zzb;
        this.zzc = zzaeVar.zzc;
        this.zzd = zzaeVar.zzd;
        this.zze = zzaeVar.zze;
        this.zzf = zzaeVar.zzf;
        this.zzg = zzaeVar.zzg;
        this.zzh = zzaeVar.zzh;
        this.zzi = zzaeVar.zzi;
        this.zzj = zzaeVar.zzj;
        this.zzk = zzaeVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i9, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i9, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i9, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i9, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzae(@Nullable @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzno zznoVar, @SafeParcelable.Param(id = 5) long j7, @SafeParcelable.Param(id = 6) boolean z8, @Nullable @SafeParcelable.Param(id = 7) String str3, @Nullable @SafeParcelable.Param(id = 8) zzbd zzbdVar, @SafeParcelable.Param(id = 9) long j9, @Nullable @SafeParcelable.Param(id = 10) zzbd zzbdVar2, @SafeParcelable.Param(id = 11) long j10, @Nullable @SafeParcelable.Param(id = 12) zzbd zzbdVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zznoVar;
        this.zzd = j7;
        this.zze = z8;
        this.zzf = str3;
        this.zzg = zzbdVar;
        this.zzh = j9;
        this.zzi = zzbdVar2;
        this.zzj = j10;
        this.zzk = zzbdVar3;
    }
}
