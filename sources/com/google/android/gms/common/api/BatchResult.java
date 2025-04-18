package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class BatchResult implements Result {
    private final Status zaa;
    private final PendingResult[] zab;

    public BatchResult(Status status, PendingResult[] pendingResultArr) {
        this.zaa = status;
        this.zab = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.zaa;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <R extends Result> R take(@NonNull BatchResultToken<R> batchResultToken) {
        boolean z10;
        if (batchResultToken.mId < this.zab.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "The result token does not belong to this batch");
        return (R) this.zab[batchResultToken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
