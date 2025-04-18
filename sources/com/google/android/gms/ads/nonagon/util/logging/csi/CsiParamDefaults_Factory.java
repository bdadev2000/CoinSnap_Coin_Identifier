package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhii;
import com.google.android.gms.internal.ads.zzhja;

/* loaded from: classes2.dex */
public final class CsiParamDefaults_Factory implements zzhii<CsiParamDefaults> {
    private final zzhja zza;
    private final zzhja zzb;

    public CsiParamDefaults_Factory(zzhja<Context> zzhjaVar, zzhja<VersionInfoParcel> zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    public static CsiParamDefaults_Factory create(zzhja<Context> zzhjaVar, zzhja<VersionInfoParcel> zzhjaVar2) {
        return new CsiParamDefaults_Factory(zzhjaVar, zzhjaVar2);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    @NonNull
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
