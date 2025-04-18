package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes3.dex */
public final class zae extends zai {
    protected final BaseImplementation.ApiMethodImpl zaa;

    public zae(int i10, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i10);
        this.zaa = (BaseImplementation.ApiMethodImpl) Preconditions.checkNotNull(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        try {
            this.zaa.setFailedResult(new Status(10, a.m(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage())));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (RuntimeException e2) {
            zae(e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@NonNull zaad zaadVar, boolean z10) {
        zaadVar.zac(this.zaa, z10);
    }
}
