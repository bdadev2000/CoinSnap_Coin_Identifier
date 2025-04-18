package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* loaded from: classes3.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@NonNull Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(@NonNull R r6) {
        Status status = r6.getStatus();
        if (status.isSuccess()) {
            onSuccess(r6);
            return;
        }
        onFailure(status);
        if (r6 instanceof Releasable) {
            try {
                ((Releasable) r6).release();
            } catch (RuntimeException e2) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r6)), e2);
            }
        }
    }

    public abstract void onSuccess(@NonNull R r6);
}
