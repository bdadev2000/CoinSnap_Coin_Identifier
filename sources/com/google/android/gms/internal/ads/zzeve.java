package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeve implements zzexh {
    private final zzgfz zza;
    private final zzfhc zzb;

    @Nullable
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeve(zzgfz zzgfzVar, zzfhc zzfhcVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgfzVar;
        this.zzb = zzfhcVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzevf zzc(final zzeve zzeveVar) {
        final ArrayList arrayList = zzeveVar.zzb.zzg;
        return arrayList == null ? new zzevf() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // com.google.android.gms.internal.ads.zzexg
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzevf() { // from class: com.google.android.gms.internal.ads.zzevc
            @Override // com.google.android.gms.internal.ads.zzexg
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzevf() { // from class: com.google.android.gms.internal.ads.zzevd
            @Override // com.google.android.gms.internal.ads.zzexg
            public final void zzj(Object obj) {
                zzeve.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeve.zzc(zzeve.this);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeve.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
