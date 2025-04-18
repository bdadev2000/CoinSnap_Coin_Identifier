package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzepx implements zzexg {
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

    public zzepx(com.google.android.gms.ads.internal.client.zzs zzsVar, @Nullable String str, boolean z2, String str2, float f2, int i2, int i3, @Nullable String str3, boolean z3) {
        Preconditions.checkNotNull(zzsVar, "the adSize must not be null");
        this.zza = zzsVar;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = str2;
        this.zze = f2;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str3;
        this.zzi = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfhq.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfhq.zzf(bundle, "smart_h", "auto", this.zza.zzb == -2);
        zzfhq.zzg(bundle, "ene", true, this.zza.zzj);
        zzfhq.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzfhq.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfhq.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfhq.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfhq.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfhq.zzc(bundle, "format", this.zzb);
        zzfhq.zzf(bundle, "fluid", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zzc);
        zzfhq.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfhq.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = this.zza.zzg;
        if (zzsVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zza.zzb);
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzs zzsVar : zzsVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzsVar.zzi);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzsVar.zzb);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzsVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
