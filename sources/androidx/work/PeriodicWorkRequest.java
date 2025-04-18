package androidx.work;

import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class PeriodicWorkRequest extends WorkRequest {

    /* loaded from: classes.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        @Override // androidx.work.WorkRequest.Builder
        public final WorkRequest b() {
            return new WorkRequest(this.f21907a, this.f21908b, this.f21909c);
        }
    }
}
