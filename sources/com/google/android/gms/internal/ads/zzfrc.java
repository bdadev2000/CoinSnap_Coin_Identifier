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
/* loaded from: classes3.dex */
public final class zzfrc implements zzfps {
    private final Object zza;
    private final zzfrd zzb;
    private final zzfro zzc;
    private final zzfpp zzd;

    public zzfrc(@NonNull Object obj, @NonNull zzfrd zzfrdVar, @NonNull zzfro zzfroVar, @NonNull zzfpp zzfppVar) {
        this.zza = obj;
        this.zzb = zzfrdVar;
        this.zzc = zzfroVar;
        this.zzd = zzfppVar;
    }

    @Nullable
    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzato zza = zzatp.zza();
        zza.zzc(5);
        zza.zza(zzgxp.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzatp) zza.zzbr()).zzaV(), 11);
    }

    @Nullable
    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e2);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    @Nullable
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", com.mbridge.msdk.foundation.controller.a.a);
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfps
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

    @Override // com.google.android.gms.internal.ads.zzfps
    @Nullable
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", CampaignEx.JSON_KEY_AD_Q);
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfrm {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzfrm(2005, e2);
        }
    }

    public final synchronized int zze() throws zzfrm {
        try {
        } catch (Exception e2) {
            throw new zzfrm(2006, e2);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfrd zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfrm {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzfrm(2003, e2);
        }
    }

    public final synchronized boolean zzh() throws zzfrm {
        try {
        } catch (Exception e2) {
            throw new zzfrm(2001, e2);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
