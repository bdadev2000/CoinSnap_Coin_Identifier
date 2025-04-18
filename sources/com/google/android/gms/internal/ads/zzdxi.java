package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes3.dex */
public final class zzdxi implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzdxi(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager((Context) this.zza.zzb()).getPackageInfo(((zzdxg) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
