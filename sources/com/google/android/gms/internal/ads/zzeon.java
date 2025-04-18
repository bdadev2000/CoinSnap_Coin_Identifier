package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class zzeon implements zzevy {
    public final com.google.android.gms.ads.internal.client.zzs zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;
    public final boolean zzi;

    public zzeon(com.google.android.gms.ads.internal.client.zzs zzsVar, @Nullable String str, boolean z10, String str2, float f10, int i10, int i11, @Nullable String str3, boolean z11) {
        Preconditions.checkNotNull(zzsVar, "the adSize must not be null");
        this.zza = zzsVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z10;
        boolean z11;
        Bundle bundle = (Bundle) obj;
        if (this.zza.zze == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfgc.zzf(bundle, "smart_w", "full", z10);
        if (this.zza.zzb == -2) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzfgc.zzf(bundle, "smart_h", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, z11);
        zzfgc.zzg(bundle, "ene", true, this.zza.zzj);
        zzfgc.zzf(bundle, "rafmt", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, this.zza.zzm);
        zzfgc.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfgc.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfgc.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfgc.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfgc.zzc(bundle, "format", this.zzb);
        zzfgc.zzf(bundle, "fluid", "height", this.zzc);
        zzfgc.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.zzg);
        zzfgc.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = this.zza.zzg;
        if (zzsVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzs zzsVar : zzsVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzsVar.zzi);
                bundle3.putInt("height", zzsVar.zzb);
                bundle3.putInt("width", zzsVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
