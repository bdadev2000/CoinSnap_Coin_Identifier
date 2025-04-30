package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zae extends zai {
    protected final BaseImplementation.ApiMethodImpl zaa;

    public zae(int i9, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i9);
        this.zaa = (BaseImplementation.ApiMethodImpl) Preconditions.checkNotNull(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        try {
            this.zaa.setFailedResult(new Status(10, o.k(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage())));
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (RuntimeException e4) {
            zae(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@NonNull zaad zaadVar, boolean z8) {
        zaadVar.zac(this.zaa, z8);
    }
}
