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

/* loaded from: classes3.dex */
public final class zzbqm implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbfn zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbqm(@Nullable Date date, int i10, @Nullable Set set, @Nullable Location location, boolean z10, int i11, zzbfn zzbfnVar, List list, boolean z11, int i12, String str) {
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z10;
        this.zzf = i11;
        this.zzg = zzbfnVar;
        this.zzi = z11;
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
        return com.google.android.gms.ads.internal.client.zzex.zzf().zza();
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
        zzbfn zzbfnVar = this.zzg;
        if (zzbfnVar == null) {
            return builder.build();
        }
        int i10 = zzbfnVar.zza;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbfnVar.zzg);
                    builder.setMediaAspectRatio(zzbfnVar.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbfnVar.zzb);
                builder.setImageOrientation(zzbfnVar.zzc);
                builder.setRequestMultipleImages(zzbfnVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbfnVar.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
        }
        builder.setAdChoicesPlacement(zzbfnVar.zze);
        builder.setReturnUrlsForImageAssets(zzbfnVar.zzb);
        builder.setImageOrientation(zzbfnVar.zzc);
        builder.setRequestMultipleImages(zzbfnVar.zzd);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    @NonNull
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbfn.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzex.zzf().zzy();
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
        return this.zzh.contains("6");
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
        return this.zzh.contains("3");
    }
}
