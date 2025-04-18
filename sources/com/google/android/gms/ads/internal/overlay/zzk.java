package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzk extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzm zza;

    public /* synthetic */ zzk(zzm zzmVar, zzl zzlVar) {
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        Bitmap zza = com.google.android.gms.ads.internal.zzv.zzv().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (zza != null) {
            com.google.android.gms.ads.internal.zzv.zzq();
            zzm zzmVar = this.zza;
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.zzc.zzo;
            boolean z10 = zzlVar.zzd;
            float f10 = zzlVar.zze;
            Activity activity = zzmVar.zzb;
            if (z10 && f10 > 0.0f && f10 <= 25.0f) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zza, zza.getWidth(), zza.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f10);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
                }
            } else {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final void run() {
                    zzk.this.zza.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
