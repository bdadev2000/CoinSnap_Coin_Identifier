package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    public zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Object obj;
        int i9;
        int i10;
        boolean z8;
        boolean z9;
        Status status2;
        PendingResult[] pendingResultArr;
        obj = this.zaa.zai;
        synchronized (obj) {
            try {
                if (this.zaa.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.zaa.zag = true;
                } else if (!status.isSuccess()) {
                    this.zaa.zaf = true;
                }
                Batch batch = this.zaa;
                i9 = batch.zae;
                batch.zae = i9 - 1;
                Batch batch2 = this.zaa;
                i10 = batch2.zae;
                if (i10 == 0) {
                    z8 = batch2.zag;
                    if (z8) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        z9 = batch2.zaf;
                        if (z9) {
                            status2 = new Status(13);
                        } else {
                            status2 = Status.RESULT_SUCCESS;
                        }
                        Batch batch3 = this.zaa;
                        pendingResultArr = batch3.zah;
                        batch3.setResult(new BatchResult(status2, pendingResultArr));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
