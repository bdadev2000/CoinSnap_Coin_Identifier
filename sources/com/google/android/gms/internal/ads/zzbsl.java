package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbsl implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbhk zzg;
    private final boolean zzi;
    private final String zzk;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbsl(@Nullable Date date, int i9, @Nullable Set set, @Nullable Location location, boolean z8, int i10, zzbhk zzbhkVar, List list, boolean z9, int i11, String str) {
        this.zza = date;
        this.zzb = i9;
        this.zzc = set;
        this.zze = location;
        this.zzd = z8;
        this.zzf = i10;
        this.zzg = zzbhkVar;
        this.zzi = z9;
        this.zzk = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzej.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbhk zzbhkVar = this.zzg;
        if (zzbhkVar == null) {
            return builder.build();
        }
        int i9 = zzbhkVar.zza;
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbhkVar.zzg);
                    builder.setMediaAspectRatio(zzbhkVar.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbhkVar.zzb);
                builder.setImageOrientation(zzbhkVar.zzc);
                builder.setRequestMultipleImages(zzbhkVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzfk zzfkVar = zzbhkVar.zzf;
            if (zzfkVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfkVar));
            }
        }
        builder.setAdChoicesPlacement(zzbhkVar.zze);
        builder.setReturnUrlsForImageAssets(zzbhkVar.zzb);
        builder.setImageOrientation(zzbhkVar.zzc);
        builder.setRequestMultipleImages(zzbhkVar.zzd);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    @NonNull
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbhk.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzej.zzf().zzw();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        if (this.zzh.contains("6")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        if (this.zzh.contains("3")) {
            return true;
        }
        return false;
    }
}
