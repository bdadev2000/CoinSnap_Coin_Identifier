package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbhp extends NativeAd.AdChoicesInfo {
    private final zzbho zza;
    private final List zzb = new ArrayList();
    private String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r4.zzb.add(new com.google.android.gms.internal.ads.zzbhw(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbhp(com.google.android.gms.internal.ads.zzbho r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.zzb = r1
            r4.zza = r5
            java.lang.String r1 = r5.zzg()     // Catch: android.os.RemoteException -> L15
            r4.zzc = r1     // Catch: android.os.RemoteException -> L15
            goto L1b
        L15:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
            r4.zzc = r0
        L1b:
            java.util.List r5 = r5.zzh()     // Catch: android.os.RemoteException -> L45
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L45
        L23:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L45
            if (r1 == 0) goto L59
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L45
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L45
            r3 = 0
            if (r2 == 0) goto L4c
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L45
            if (r1 != 0) goto L37
            goto L4c
        L37:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L45
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbhv     // Catch: android.os.RemoteException -> L45
            if (r3 == 0) goto L47
            r3 = r2
            com.google.android.gms.internal.ads.zzbhv r3 = (com.google.android.gms.internal.ads.zzbhv) r3     // Catch: android.os.RemoteException -> L45
            goto L4c
        L45:
            r5 = move-exception
            goto L5a
        L47:
            com.google.android.gms.internal.ads.zzbht r3 = new com.google.android.gms.internal.ads.zzbht     // Catch: android.os.RemoteException -> L45
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L45
        L4c:
            if (r3 == 0) goto L23
            java.util.List r1 = r4.zzb     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.internal.ads.zzbhw r2 = new com.google.android.gms.internal.ads.zzbhw     // Catch: android.os.RemoteException -> L45
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L45
            r1.add(r2)     // Catch: android.os.RemoteException -> L45
            goto L23
        L59:
            return
        L5a:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhp.<init>(com.google.android.gms.internal.ads.zzbho):void");
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
