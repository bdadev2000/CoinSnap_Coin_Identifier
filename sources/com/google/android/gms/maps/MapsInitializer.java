package com.google.android.gms.maps;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    /* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
    /* loaded from: classes12.dex */
    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, null, null);
        }
        return initialize;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:11|12|14|15|16|17|(8:19|(1:(1:22))|23|24|(1:26)|27|28|(1:30))|34|23|24|(0)|27|28|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        android.util.Log.e(com.google.android.gms.maps.MapsInitializer.zza, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[Catch: RemoteException -> 0x005e, all -> 0x0090, TryCatch #1 {RemoteException -> 0x005e, blocks: (B:24:0x004c, B:26:0x0052, B:27:0x0056), top: B:23:0x004c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0022, B:12:0x0028, B:15:0x002c, B:17:0x003b, B:19:0x0040, B:24:0x004c, B:26:0x0052, B:27:0x0056, B:28:0x0066, B:30:0x007d, B:33:0x005f, B:37:0x0085, B:38:0x008a, B:40:0x008c), top: B:3:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int initialize(android.content.Context r5, com.google.android.gms.maps.MapsInitializer.Renderer r6, com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = com.google.android.gms.maps.MapsInitializer.zza     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L90
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L90
            boolean r1 = com.google.android.gms.maps.MapsInitializer.zzb     // Catch: java.lang.Throwable -> L90
            r2 = 0
            if (r1 == 0) goto L28
            if (r7 == 0) goto L82
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L90
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L90
            goto L82
        L28:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzcc.zza(r5, r6)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L8b java.lang.Throwable -> L90
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.zze()     // Catch: android.os.RemoteException -> L84 java.lang.Throwable -> L90
            com.google.android.gms.maps.CameraUpdateFactory.zza(r3)     // Catch: android.os.RemoteException -> L84 java.lang.Throwable -> L90
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch: android.os.RemoteException -> L84 java.lang.Throwable -> L90
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r3)     // Catch: android.os.RemoteException -> L84 java.lang.Throwable -> L90
            r3 = 1
            com.google.android.gms.maps.MapsInitializer.zzb = r3     // Catch: java.lang.Throwable -> L90
            r4 = 2
            if (r6 == 0) goto L4b
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L4c
            if (r6 == r3) goto L49
            goto L4b
        L49:
            r3 = r4
            goto L4c
        L4b:
            r3 = r2
        L4c:
            int r6 = r1.zzd()     // Catch: android.os.RemoteException -> L5e java.lang.Throwable -> L90
            if (r6 != r4) goto L56
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch: android.os.RemoteException -> L5e java.lang.Throwable -> L90
            com.google.android.gms.maps.MapsInitializer.zzc = r6     // Catch: android.os.RemoteException -> L5e java.lang.Throwable -> L90
        L56:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L5e java.lang.Throwable -> L90
            r1.zzl(r5, r3)     // Catch: android.os.RemoteException -> L5e java.lang.Throwable -> L90
            goto L66
        L5e:
            r5 = move-exception
            java.lang.String r6 = com.google.android.gms.maps.MapsInitializer.zza     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L90
        L66:
            java.lang.String r5 = com.google.android.gms.maps.MapsInitializer.zza     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L90
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L90
            if (r7 == 0) goto L82
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L90
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L90
        L82:
            monitor-exit(r0)
            return r2
        L84:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L90
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L90
            throw r6     // Catch: java.lang.Throwable -> L90
        L8b:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)
            return r5
        L90:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
