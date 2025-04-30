package com.google.android.gms.cloudmessaging;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z8) throws ClassNotFoundException {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return zzd.class;
            }
            return zzd.class;
        }
        return super.loadClass(str, z8);
    }
}
