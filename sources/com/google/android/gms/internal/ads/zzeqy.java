package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzeqy implements zzexv {
    public final com.google.android.gms.ads.internal.client.zzq zza;

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

    public zzeqy(com.google.android.gms.ads.internal.client.zzq zzqVar, @Nullable String str, boolean z8, String str2, float f9, int i9, int i10, @Nullable String str3, boolean z9) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.zza = zzqVar;
        this.zzb = str;
        this.zzc = z8;
        this.zzd = str2;
        this.zze = f9;
        this.zzf = i9;
        this.zzg = i10;
        this.zzh = str3;
        this.zzi = z9;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z8;
        boolean z9;
        Bundle bundle = (Bundle) obj;
        if (this.zza.zze == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfic.zzf(bundle, "smart_w", "full", z8);
        if (this.zza.zzb == -2) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzfic.zzf(bundle, "smart_h", "auto", z9);
        zzfic.zzg(bundle, "ene", true, this.zza.zzj);
        zzfic.zzf(bundle, "rafmt", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, this.zza.zzm);
        zzfic.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfic.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfic.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfic.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfic.zzc(bundle, "format", this.zzb);
        zzfic.zzf(bundle, "fluid", "height", this.zzc);
        zzfic.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.zzg);
        zzfic.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
