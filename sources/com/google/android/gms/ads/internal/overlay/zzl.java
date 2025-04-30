package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzl extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzm zza;

    public /* synthetic */ zzl(zzm zzmVar, zzk zzkVar) {
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        Bitmap zza = com.google.android.gms.ads.internal.zzu.zzu().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (zza != null) {
            com.google.android.gms.ads.internal.zzu.zzp();
            zzm zzmVar = this.zza;
            com.google.android.gms.ads.internal.zzk zzkVar = zzmVar.zzc.zzo;
            boolean z8 = zzkVar.zzd;
            float f9 = zzkVar.zze;
            Activity activity = zzmVar.zzb;
            if (z8 && f9 > 0.0f && f9 <= 25.0f) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zza, zza.getWidth(), zza.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f9);
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
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final void run() {
                    zzl.this.zza.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
