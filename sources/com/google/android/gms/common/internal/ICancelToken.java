package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface ICancelToken extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @NonNull
        public static ICancelToken asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof ICancelToken) {
                return (ICancelToken) queryLocalInterface;
            }
            return new zzx(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}
