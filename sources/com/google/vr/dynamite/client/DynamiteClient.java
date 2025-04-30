package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;
import z5.C2975c;
import z5.C2976d;
import z5.C2977e;

@UsedByNative
/* loaded from: classes3.dex */
public final class DynamiteClient {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayMap f14386a = new ArrayMap();

    private DynamiteClient() {
    }

    @UsedByNative
    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            C2977e c2977e = new C2977e(str, str2);
            C2976d remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(c2977e);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.b(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String c2977e2 = c2977e.toString();
                    StringBuilder sb = new StringBuilder(c2977e2.length() + 72);
                    sb.append("Failed to load native library ");
                    sb.append(c2977e2);
                    sb.append(" from remote package: no loader available.");
                    Log.e("DynamiteClient", sb.toString());
                    return -1;
                }
                return newNativeLibraryLoader.checkVersion(str3);
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | C2975c e4) {
                String c2977e3 = c2977e.toString();
                StringBuilder sb2 = new StringBuilder(c2977e3.length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(c2977e3);
                sb2.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb2.toString(), e4);
                return -1;
            }
        }
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            return remoteContext.getClassLoader();
        }
    }

    @UsedByNative
    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context b;
        synchronized (DynamiteClient.class) {
            C2977e c2977e = new C2977e(str, str2);
            try {
                b = getRemoteLibraryLoaderFromInfo(c2977e).b(context);
            } catch (C2975c e4) {
                String c2977e2 = c2977e.toString();
                StringBuilder sb = new StringBuilder(c2977e2.length() + 52);
                sb.append("Failed to get remote Context");
                sb.append(c2977e2);
                sb.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb.toString(), e4);
                return null;
            }
        }
        return b;
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                return null;
            }
            try {
                return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
            } catch (RuntimeException e4) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e4);
                return null;
            }
        }
    }

    @UsedByNative
    private static synchronized C2976d getRemoteLibraryLoaderFromInfo(C2977e c2977e) {
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = f14386a;
            C2976d c2976d = (C2976d) arrayMap.get(c2977e);
            if (c2976d == null) {
                C2976d c2976d2 = new C2976d(c2977e);
                arrayMap.put(c2977e, c2976d2);
                return c2976d2;
            }
            return c2976d;
        }
    }

    @UsedByNative
    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            C2977e c2977e = new C2977e(str, str2);
            C2976d remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(c2977e);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.b(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String c2977e2 = c2977e.toString();
                    StringBuilder sb = new StringBuilder(c2977e2.length() + 72);
                    sb.append("Failed to load native library ");
                    sb.append(c2977e2);
                    sb.append(" from remote package: no loader available.");
                    Log.e("DynamiteClient", sb.toString());
                    return 0L;
                }
                return newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | C2975c e4) {
                String c2977e3 = c2977e.toString();
                StringBuilder sb2 = new StringBuilder(c2977e3.length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(c2977e3);
                sb2.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb2.toString(), e4);
                return 0L;
            }
        }
    }
}
