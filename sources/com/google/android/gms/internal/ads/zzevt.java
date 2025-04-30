package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzevt implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;

    @Nullable
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzevt(zzgge zzggeVar, zzfho zzfhoVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzevu zzc(final zzevt zzevtVar) {
        final ArrayList arrayList = zzevtVar.zzb.zzg;
        if (arrayList == null) {
            return new zzevu() { // from class: com.google.android.gms.internal.ads.zzevq
                @Override // com.google.android.gms.internal.ads.zzexv
                public final void zzj(Object obj) {
                }
            };
        }
        if (arrayList.isEmpty()) {
            return new zzevu() { // from class: com.google.android.gms.internal.ads.zzevr
                @Override // com.google.android.gms.internal.ads.zzexv
                public final void zzj(Object obj) {
                    ((Bundle) obj).putInt("native_version", 0);
                }
            };
        }
        return new zzevu() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                zzevt.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevt.zzc(zzevt.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        if (r9 == 3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevt.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
