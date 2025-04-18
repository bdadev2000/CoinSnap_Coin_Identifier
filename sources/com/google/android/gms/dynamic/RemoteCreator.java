package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@NonNull String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @KeepForSdk
    public RemoteCreator(@NonNull String str) {
        this.zza = str;
    }

    @NonNull
    @KeepForSdk
    public abstract T getRemoteCreator(@NonNull IBinder iBinder);

    @NonNull
    @KeepForSdk
    public final T getRemoteCreatorInstance(@NonNull Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new RemoteCreatorException("Could not load creator class.", e2);
                } catch (IllegalAccessException e10) {
                    throw new RemoteCreatorException("Could not access creator.", e10);
                } catch (InstantiationException e11) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e11);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return (T) this.zzb;
    }
}
