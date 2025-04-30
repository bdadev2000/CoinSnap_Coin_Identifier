package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfsv implements zzfrh {
    private final Object zza;
    private final zzfsw zzb;
    private final zzfth zzc;
    private final zzfre zzd;

    public zzfsv(@NonNull Object obj, @NonNull zzfsw zzfswVar, @NonNull zzfth zzfthVar, @NonNull zzfre zzfreVar) {
        this.zza = obj;
        this.zzb = zzfswVar;
        this.zzc = zzfthVar;
        this.zzd = zzfreVar;
    }

    @Nullable
    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzavk zza = zzavl.zza();
        zza.zzb(zzauz.DG);
        zza.zza(zzhac.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzavl) zza.zzbr()).zzaV(), 11);
    }

    @Nullable
    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e4) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e4);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    @Nullable
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", com.mbridge.msdk.foundation.controller.a.f15376a);
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    @Nullable
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    @Nullable
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", CampaignEx.JSON_KEY_AD_Q);
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzftf {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e4) {
            throw new zzftf(2005, e4);
        }
    }

    public final synchronized int zze() throws zzftf {
        try {
        } catch (Exception e4) {
            throw new zzftf(2006, e4);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", null).invoke(this.zza, null)).intValue();
    }

    public final zzfsw zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzftf {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", null).invoke(this.zza, null);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e4) {
            throw new zzftf(2003, e4);
        }
    }

    public final synchronized boolean zzh() throws zzftf {
        try {
        } catch (Exception e4) {
            throw new zzftf(2001, e4);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", null).invoke(this.zza, null)).booleanValue();
    }
}
