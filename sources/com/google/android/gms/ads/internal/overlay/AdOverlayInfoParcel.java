package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcwz;
import com.google.android.gms.internal.ads.zzdel;
import com.vungle.ads.internal.protos.n;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();

    @SafeParcelable.Field(id = 2)
    public final zzc zza;

    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza zzb;

    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzr zzc;

    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcfk zzd;

    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbij zze;

    @NonNull
    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @NonNull
    @SafeParcelable.Field(id = 9)
    public final String zzh;

    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzac zzi;

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
    public final com.google.android.gms.ads.internal.zzl zzo;

    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbih zzp;

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
    public final zzcwz zzt;

    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzdel zzu;

    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final zzbsz zzv;

    @SafeParcelable.Field(id = n.NOTIFICATION_REDIRECT_VALUE)
    public final boolean zzw;

    @SafeParcelable.Field(id = 30)
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbih zzbihVar, zzbij zzbijVar, zzac zzacVar, zzcfk zzcfkVar, boolean z10, int i10, String str, VersionInfoParcel versionInfoParcel, zzdel zzdelVar, zzbsz zzbszVar, boolean z11) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcfkVar;
        this.zzp = zzbihVar;
        this.zze = zzbijVar;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdelVar;
        this.zzv = zzbszVar;
        this.zzw = z11;
        this.zzx = zzy.getAndIncrement();
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e2) {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzmC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdOverlayInfoParcel.getFromIntent");
                return null;
            }
            return null;
        }
    }

    @Nullable
    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzmC)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.wrap(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i10, false);
        SafeParcelWriter.writeIBinder(parcel, 3, zzc(this.zzb), false);
        SafeParcelWriter.writeIBinder(parcel, 4, zzc(this.zzc), false);
        SafeParcelWriter.writeIBinder(parcel, 5, zzc(this.zzd), false);
        SafeParcelWriter.writeIBinder(parcel, 6, zzc(this.zze), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, zzc(this.zzi), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i10, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i10, false);
        SafeParcelWriter.writeIBinder(parcel, 18, zzc(this.zzp), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, zzc(this.zzt), false);
        SafeParcelWriter.writeIBinder(parcel, 27, zzc(this.zzu), false);
        SafeParcelWriter.writeIBinder(parcel, 28, zzc(this.zzv), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.writeLong(parcel, 30, this.zzx);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzmC)).booleanValue()) {
            zzz.put(Long.valueOf(this.zzx), new zzp(this.zzb, this.zzc, this.zzd, this.zzp, this.zze, this.zzi, this.zzt, this.zzu, this.zzv, zzcaj.zzd.schedule(new zzq(this.zzx), ((Integer) zzbe.zzc().zza(zzbcn.zzmE)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbih zzbihVar, zzbij zzbijVar, zzac zzacVar, zzcfk zzcfkVar, boolean z10, int i10, String str, String str2, VersionInfoParcel versionInfoParcel, zzdel zzdelVar, zzbsz zzbszVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcfkVar;
        this.zzp = zzbihVar;
        this.zze = zzbijVar;
        this.zzf = str2;
        this.zzg = z10;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdelVar;
        this.zzv = zzbszVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, zzcfk zzcfkVar, int i10, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzcwz zzcwzVar, zzbsz zzbszVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = zzcfkVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzaQ)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i10;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcwzVar;
        this.zzu = null;
        this.zzv = zzbszVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, zzcfk zzcfkVar, boolean z10, int i10, VersionInfoParcel versionInfoParcel, zzdel zzdelVar, zzbsz zzbszVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcfkVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i10;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdelVar;
        this.zzv = zzbszVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzcVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z10, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i10, @SafeParcelable.Param(id = 12) int i11, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzl zzlVar, @SafeParcelable.Param(id = 18) IBinder iBinder6, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) IBinder iBinder7, @SafeParcelable.Param(id = 27) IBinder iBinder8, @SafeParcelable.Param(id = 28) IBinder iBinder9, @SafeParcelable.Param(id = 29) boolean z11, @SafeParcelable.Param(id = 30) long j3) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z10;
        this.zzh = str2;
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z11;
        this.zzx = j3;
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzmC)).booleanValue()) {
            zzp zzpVar = (zzp) zzz.remove(Long.valueOf(j3));
            if (zzpVar != null) {
                this.zzb = zzp.zza(zzpVar);
                this.zzc = zzp.zze(zzpVar);
                this.zzd = zzp.zzg(zzpVar);
                this.zzp = zzp.zzb(zzpVar);
                this.zze = zzp.zzc(zzpVar);
                this.zzt = zzp.zzh(zzpVar);
                this.zzu = zzp.zzi(zzpVar);
                this.zzv = zzp.zzd(zzpVar);
                this.zzi = zzp.zzf(zzpVar);
                zzp.zzj(zzpVar).cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzr) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcfk) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbih) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbij) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzi = (zzac) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzt = (zzcwz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzdel) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbsz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, VersionInfoParcel versionInfoParcel, zzcfk zzcfkVar, zzdel zzdelVar) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcfkVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
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
        this.zzu = zzdelVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, zzcfk zzcfkVar, int i10, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = zzcfkVar;
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
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcfk zzcfkVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i10, zzbsz zzbszVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcfkVar;
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
        this.zzv = zzbszVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
