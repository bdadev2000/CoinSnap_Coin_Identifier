package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhfx;
import com.google.android.gms.internal.ads.zzhgp;

/* loaded from: classes3.dex */
public final class CsiParamDefaults_Factory implements zzhfx<CsiParamDefaults> {
    private final zzhgp zza;
    private final zzhgp zzb;

    public CsiParamDefaults_Factory(zzhgp<Context> zzhgpVar, zzhgp<VersionInfoParcel> zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    public static CsiParamDefaults_Factory create(zzhgp<Context> zzhgpVar, zzhgp<VersionInfoParcel> zzhgpVar2) {
        return new CsiParamDefaults_Factory(zzhgpVar, zzhgpVar2);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    @NonNull
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
