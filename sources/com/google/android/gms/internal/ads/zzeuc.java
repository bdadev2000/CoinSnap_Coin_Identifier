package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeuc implements zzevz {
    private final zzges zza;
    private final zzffo zzb;

    @Nullable
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeuc(zzges zzgesVar, zzffo zzffoVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgesVar;
        this.zzb = zzffoVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzeud zzc(final zzeuc zzeucVar) {
        final ArrayList arrayList = zzeucVar.zzb.zzg;
        return arrayList == null ? new zzeud() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzeud() { // from class: com.google.android.gms.internal.ads.zzeua
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzeud() { // from class: com.google.android.gms.internal.ads.zzeub
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                zzeuc.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuc.zzc(zzeuc.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r9 == 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuc.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
