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

/* loaded from: classes3.dex */
public final class zzbhw extends UnifiedNativeAd {
    private final zzbhv zza;
    private final zzbfz zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbhw(com.google.android.gms.internal.ads.zzbhv r6) {
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
            r5.zze = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L5b
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5b
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5b
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r3 == 0) goto L4d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5b
            if (r2 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5b
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbfy     // Catch: android.os.RemoteException -> L5b
            if (r4 == 0) goto L47
            com.google.android.gms.internal.ads.zzbfy r3 = (com.google.android.gms.internal.ads.zzbfy) r3     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L47:
            com.google.android.gms.internal.ads.zzbfw r3 = new com.google.android.gms.internal.ads.zzbfw     // Catch: android.os.RemoteException -> L5b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L27
            java.util.List r2 = r5.zzb     // Catch: android.os.RemoteException -> L5b
            com.google.android.gms.internal.ads.zzbfz r4 = new com.google.android.gms.internal.ads.zzbfz     // Catch: android.os.RemoteException -> L5b
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5b
            r2.add(r4)     // Catch: android.os.RemoteException -> L5b
            goto L27
        L5b:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L5f:
            com.google.android.gms.internal.ads.zzbhv r6 = r5.zza     // Catch: android.os.RemoteException -> L8e
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L8e
            if (r6 == 0) goto L92
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8e
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8e
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8e
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L80
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzdh r2 = com.google.android.gms.ads.internal.client.zzdg.zzb(r2)     // Catch: android.os.RemoteException -> L8e
            goto L81
        L80:
            r2 = r1
        L81:
            if (r2 == 0) goto L6b
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzdi r4 = new com.google.android.gms.ads.internal.client.zzdi     // Catch: android.os.RemoteException -> L8e
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8e
            r3.add(r4)     // Catch: android.os.RemoteException -> L8e
            goto L6b
        L8e:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L92:
            com.google.android.gms.internal.ads.zzbhv r6 = r5.zza     // Catch: android.os.RemoteException -> La1
            com.google.android.gms.internal.ads.zzbfy r6 = r6.zzk()     // Catch: android.os.RemoteException -> La1
            if (r6 == 0) goto La5
            com.google.android.gms.internal.ads.zzbfz r2 = new com.google.android.gms.internal.ads.zzbfz     // Catch: android.os.RemoteException -> La1
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La1
            r1 = r2
            goto La5
        La1:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        La5:
            r5.zzc = r1
            com.google.android.gms.internal.ads.zzbhv r6 = r5.zza     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbfr r6 = r6.zzi()     // Catch: android.os.RemoteException -> Lbb
            if (r6 == 0) goto Lba
            com.google.android.gms.internal.ads.zzbfs r6 = new com.google.android.gms.internal.ads.zzbfs     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhv r1 = r5.zza     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbfr r1 = r1.zzi()     // Catch: android.os.RemoteException -> Lbb
            r6.<init>(r1)     // Catch: android.os.RemoteException -> Lbb
        Lba:
            return
        Lbb:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhw.<init>(com.google.android.gms.internal.ads.zzbhv):void");
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.zzb(this.zza.zzh());
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception occurred while getting video controller", e2);
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
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
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
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.zzb;
    }
}
