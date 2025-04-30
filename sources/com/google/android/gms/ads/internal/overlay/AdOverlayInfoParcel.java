package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdhi;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();

    @SafeParcelable.Field(id = 2)
    public final zzc zza;

    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza zzb;

    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzp zzc;

    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzchd zzd;

    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbkh zze;

    @NonNull
    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @NonNull
    @SafeParcelable.Field(id = 9)
    public final String zzh;

    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzaa zzi;

    @SafeParcelable.Field(id = 11)
    public final int zzj;

    @SafeParcelable.Field(id = 12)
    public final int zzk;

    @NonNull
    @SafeParcelable.Field(id = 13)
    public final String zzl;

    @NonNull
    @SafeParcelable.Field(id = 14)
    public final VersionInfoParcel zzm;

    @NonNull
    @SafeParcelable.Field(id = 16)
    public final String zzn;

    @SafeParcelable.Field(id = 17)
    public final com.google.android.gms.ads.internal.zzk zzo;

    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbkf zzp;

    @NonNull
    @SafeParcelable.Field(id = 19)
    public final String zzq;

    @NonNull
    @SafeParcelable.Field(id = 24)
    public final String zzr;

    @NonNull
    @SafeParcelable.Field(id = 25)
    public final String zzs;

    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzczy zzt;

    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzdhi zzu;

    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final zzbuz zzv;

    @SafeParcelable.Field(id = 29)
    public final boolean zzw;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzbkf zzbkfVar, zzbkh zzbkhVar, zzaa zzaaVar, zzchd zzchdVar, boolean z8, int i9, String str, VersionInfoParcel versionInfoParcel, zzdhi zzdhiVar, zzbuz zzbuzVar, boolean z9) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = zzchdVar;
        this.zzp = zzbkfVar;
        this.zze = zzbkhVar;
        this.zzf = null;
        this.zzg = z8;
        this.zzh = null;
        this.zzi = zzaaVar;
        this.zzj = i9;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhiVar;
        this.zzv = zzbuzVar;
        this.zzw = z9;
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i9) {
        zzc zzcVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzcVar, i9, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i9, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i9, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 28, ObjectWrapper.wrap(this.zzv).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzbkf zzbkfVar, zzbkh zzbkhVar, zzaa zzaaVar, zzchd zzchdVar, boolean z8, int i9, String str, String str2, VersionInfoParcel versionInfoParcel, zzdhi zzdhiVar, zzbuz zzbuzVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = zzchdVar;
        this.zzp = zzbkfVar;
        this.zze = zzbkhVar;
        this.zzf = str2;
        this.zzg = z8;
        this.zzh = str;
        this.zzi = zzaaVar;
        this.zzj = i9;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhiVar;
        this.zzv = zzbuzVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, zzchd zzchdVar, int i9, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzk zzkVar, String str2, String str3, String str4, zzczy zzczyVar, zzbuz zzbuzVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzpVar;
        this.zzd = zzchdVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().zza(zzbep.zzaJ)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i9;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzkVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzczyVar;
        this.zzu = null;
        this.zzv = zzbuzVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, zzchd zzchdVar, boolean z8, int i9, VersionInfoParcel versionInfoParcel, zzdhi zzdhiVar, zzbuz zzbuzVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = zzchdVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z8;
        this.zzh = null;
        this.zzi = zzaaVar;
        this.zzj = i9;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhiVar;
        this.zzv = zzbuzVar;
        this.zzw = false;
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzcVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z8, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i9, @SafeParcelable.Param(id = 12) int i10, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzk zzkVar, @SafeParcelable.Param(id = 18) IBinder iBinder6, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) IBinder iBinder7, @SafeParcelable.Param(id = 27) IBinder iBinder8, @SafeParcelable.Param(id = 28) IBinder iBinder9, @SafeParcelable.Param(id = 29) boolean z9) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzchd) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbkf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbkh) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z8;
        this.zzh = str2;
        this.zzi = (zzaa) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzj = i9;
        this.zzk = i10;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzkVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (zzczy) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzdhi) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbuz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzw = z9;
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzp zzpVar, zzaa zzaaVar, VersionInfoParcel versionInfoParcel, zzchd zzchdVar, zzdhi zzdhiVar) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzpVar;
        this.zzd = zzchdVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzaaVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdhiVar;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzp zzpVar, zzchd zzchdVar, int i9, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzpVar;
        this.zzd = zzchdVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzchd zzchdVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i9, zzbuz zzbuzVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzchdVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbuzVar;
        this.zzw = false;
    }
}
