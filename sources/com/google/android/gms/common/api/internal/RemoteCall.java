package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@NonNull T t9, @NonNull U u8) throws RemoteException;
}
