package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzcc {
    private static final String zza = "zzcc";
    private static Context zzb;
    private static zzf zzc;

    public static zzf zza(Context context, MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        Preconditions.checkNotNull(context);
        Log.d(zza, "preferredRenderer: ".concat(String.valueOf(String.valueOf(renderer))));
        zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable == 0) {
            zzf zzd = zzd(context, renderer);
            zzc = zzd;
            try {
                if (zzd.zzd() == 2) {
                    try {
                        zzc.zzm(ObjectWrapper.wrap(zzc(context, renderer)));
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w(zza, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        zzb = null;
                        zzc = zzd(context, MapsInitializer.Renderer.LEGACY);
                    }
                }
                try {
                    zzc.zzk(ObjectWrapper.wrap(((Context) Objects.requireNonNull(zzc(context, renderer))).getResources()), 19000000);
                    return zzc;
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            } catch (RemoteException e3) {
                throw new RuntimeRemoteException(e3);
            }
        }
        throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
    }

    private static Context zzb(Exception exc, Context context) {
        Log.e(zza, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|6|(6:8|(1:10)|13|14|15|16)|27|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 != 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r0 = "com.google.android.gms.maps_core_dynamite";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r0.equals("com.google.android.gms.maps_dynamite") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r4 = zzb(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        android.util.Log.d(com.google.android.gms.maps.internal.zzcc.zza, "Attempting to load maps_dynamite again.");
        r4 = com.google.android.gms.dynamite.DynamiteModule.load(r4, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r4 = zzb(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001e, code lost:
    
        if (r5 != com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Context zzc(android.content.Context r4, com.google.android.gms.maps.MapsInitializer.Renderer r5) {
        /*
            java.lang.String r0 = "com.google.android.gms.maps_legacy_dynamite"
            java.lang.String r1 = "com.google.android.gms.maps_core_dynamite"
            java.lang.String r2 = "com.google.android.gms.maps_dynamite"
            android.content.Context r3 = com.google.android.gms.maps.internal.zzcc.zzb
            if (r3 != 0) goto L53
            java.lang.String r3 = "com.google.android.gms.maps.internal.UseLegacyRendererAsDefault"
            java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L1c
            if (r5 == 0) goto L1a
            int r5 = r5.ordinal()
            if (r5 == 0) goto L22
            r0 = 1
            if (r5 == r0) goto L21
        L1a:
            r0 = r2
            goto L22
        L1c:
            com.google.android.gms.maps.MapsInitializer$Renderer r3 = com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY
            if (r5 != r3) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L2d
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.load(r4, r5, r0)     // Catch: java.lang.Exception -> L2d
            android.content.Context r4 = r5.getModuleContext()     // Catch: java.lang.Exception -> L2d
            goto L50
        L2d:
            r5 = move-exception
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            java.lang.String r5 = com.google.android.gms.maps.internal.zzcc.zza     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "Attempting to load maps_dynamite again."
            android.util.Log.d(r5, r0)     // Catch: java.lang.Exception -> L46
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L46
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.load(r4, r5, r2)     // Catch: java.lang.Exception -> L46
            android.content.Context r4 = r5.getModuleContext()     // Catch: java.lang.Exception -> L46
            goto L50
        L46:
            r5 = move-exception
            android.content.Context r4 = zzb(r5, r4)
            goto L50
        L4c:
            android.content.Context r4 = zzb(r5, r4)
        L50:
            com.google.android.gms.maps.internal.zzcc.zzb = r4
            return r4
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzcc.zzc(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer):android.content.Context");
    }

    private static zzf zzd(Context context, MapsInitializer.Renderer renderer) {
        Log.i(zza, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) zze(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (!(queryLocalInterface instanceof zzf)) {
                return new zze(iBinder);
            }
            return (zzf) queryLocalInterface;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    private static Object zze(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e2);
        }
    }
}
