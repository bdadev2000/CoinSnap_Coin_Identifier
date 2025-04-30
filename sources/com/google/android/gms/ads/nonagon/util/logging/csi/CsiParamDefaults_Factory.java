package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

/* loaded from: classes2.dex */
public final class CsiParamDefaults_Factory implements zzhkp<CsiParamDefaults> {
    private final zzhlg zza;
    private final zzhlg zzb;

    public CsiParamDefaults_Factory(zzhlg<Context> zzhlgVar, zzhlg<VersionInfoParcel> zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    public static CsiParamDefaults_Factory create(zzhlg<Context> zzhlgVar, zzhlg<VersionInfoParcel> zzhlgVar2) {
        return new CsiParamDefaults_Factory(zzhlgVar, zzhlgVar2);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    @NonNull
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
