package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbjt extends UnifiedNativeAd {
    private final zzbjs zza;
    private final zzbhw zzc;
    private final NativeAd.AdChoicesInfo zze;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zzf = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28))|(2:41|42)|(7:44|45|46|47|(2:49|50)|52|53)|58|45|46|47|(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[Catch: RemoteException -> 0x00c0, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00c0, blocks: (B:47:0x00ab, B:49:0x00b3), top: B:46:0x00ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbjt(com.google.android.gms.internal.ads.zzbjs r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzd = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzf = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L48
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L48
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L48
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L48
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L48
            if (r3 == 0) goto L39
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L48
            if (r2 != 0) goto L3b
        L39:
            r3 = r1
            goto L4f
        L3b:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L48
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbhv     // Catch: android.os.RemoteException -> L48
            if (r4 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbhv r3 = (com.google.android.gms.internal.ads.zzbhv) r3     // Catch: android.os.RemoteException -> L48
            goto L4f
        L48:
            r6 = move-exception
            goto L5c
        L4a:
            com.google.android.gms.internal.ads.zzbht r3 = new com.google.android.gms.internal.ads.zzbht     // Catch: android.os.RemoteException -> L48
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L48
        L4f:
            if (r3 == 0) goto L27
            java.util.List r2 = r5.zzb     // Catch: android.os.RemoteException -> L48
            com.google.android.gms.internal.ads.zzbhw r4 = new com.google.android.gms.internal.ads.zzbhw     // Catch: android.os.RemoteException -> L48
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L48
            r2.add(r4)     // Catch: android.os.RemoteException -> L48
            goto L27
        L5c:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L5f:
            com.google.android.gms.internal.ads.zzbjs r6 = r5.zza     // Catch: android.os.RemoteException -> L80
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L93
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L80
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L80
            if (r2 == 0) goto L93
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L80
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L80
            if (r3 == 0) goto L82
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L80
            com.google.android.gms.ads.internal.client.zzcw r2 = com.google.android.gms.ads.internal.client.zzcv.zzb(r2)     // Catch: android.os.RemoteException -> L80
            goto L83
        L80:
            r6 = move-exception
            goto L90
        L82:
            r2 = r1
        L83:
            if (r2 == 0) goto L6b
            java.util.List r3 = r5.zzf     // Catch: android.os.RemoteException -> L80
            com.google.android.gms.ads.internal.client.zzcx r4 = new com.google.android.gms.ads.internal.client.zzcx     // Catch: android.os.RemoteException -> L80
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L80
            r3.add(r4)     // Catch: android.os.RemoteException -> L80
            goto L6b
        L90:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L93:
            com.google.android.gms.internal.ads.zzbjs r6 = r5.zza     // Catch: android.os.RemoteException -> La1
            com.google.android.gms.internal.ads.zzbhv r6 = r6.zzk()     // Catch: android.os.RemoteException -> La1
            if (r6 == 0) goto La3
            com.google.android.gms.internal.ads.zzbhw r2 = new com.google.android.gms.internal.ads.zzbhw     // Catch: android.os.RemoteException -> La1
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La1
            goto La9
        La1:
            r6 = move-exception
            goto La5
        La3:
            r2 = r1
            goto La9
        La5:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            goto La3
        La9:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbjs r6 = r5.zza     // Catch: android.os.RemoteException -> Lc0
            com.google.android.gms.internal.ads.zzbho r6 = r6.zzi()     // Catch: android.os.RemoteException -> Lc0
            if (r6 == 0) goto Lc4
            com.google.android.gms.internal.ads.zzbhp r6 = new com.google.android.gms.internal.ads.zzbhp     // Catch: android.os.RemoteException -> Lc0
            com.google.android.gms.internal.ads.zzbjs r2 = r5.zza     // Catch: android.os.RemoteException -> Lc0
            com.google.android.gms.internal.ads.zzbho r2 = r2.zzi()     // Catch: android.os.RemoteException -> Lc0
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lc0
            r1 = r6
            goto Lc4
        Lc0:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        Lc4:
            r5.zze = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjt.<init>(com.google.android.gms.internal.ads.zzbjs):void");
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.zzb(this.zza.zzh());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception occurred while getting video controller", e4);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final Double zzc() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final Object zzd() {
        try {
            IObjectWrapper zzl = this.zza.zzl();
            if (zzl != null) {
                return ObjectWrapper.unwrap(zzl);
            }
            return null;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.zzb;
    }
}
