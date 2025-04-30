package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class zzcsm {
    private final zzcun zza;
    private final View zzb;
    private final zzfgu zzc;

    @Nullable
    private final zzchd zzd;

    public zzcsm(View view, @Nullable zzchd zzchdVar, zzcun zzcunVar, zzfgu zzfguVar) {
        this.zzb = view;
        this.zzd = zzchdVar;
        this.zza = zzcunVar;
        this.zzc = zzfguVar;
    }

    public static final zzdha zzf(final Context context, final VersionInfoParcel versionInfoParcel, final zzfgt zzfgtVar, final zzfho zzfhoVar) {
        return new zzdha(new zzdaz() { // from class: com.google.android.gms.internal.ads.zzcsk
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zzs() {
                com.google.android.gms.ads.internal.zzu.zzs().zzn(context, versionInfoParcel.afmaVersion, zzfgtVar.zzD.toString(), zzfhoVar.zzf);
            }
        }, zzcci.zzf);
    }

    public static final Set zzg(zzcue zzcueVar) {
        return Collections.singleton(new zzdha(zzcueVar, zzcci.zzf));
    }

    public static final zzdha zzh(zzcuc zzcucVar) {
        return new zzdha(zzcucVar, zzcci.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    @Nullable
    public final zzchd zzb() {
        return this.zzd;
    }

    public final zzcun zzc() {
        return this.zza;
    }

    public zzdax zzd(Set set) {
        return new zzdax(set);
    }

    public final zzfgu zze() {
        return this.zzc;
    }
}
