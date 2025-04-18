package androidx.work;

import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class OneTimeWorkRequest extends WorkRequest {

    /* loaded from: classes3.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        public Builder(Class cls) {
            this.f21909c = new HashSet();
            this.f21907a = UUID.randomUUID();
            this.f21908b = new WorkSpec(this.f21907a.toString(), cls.getName());
            this.f21909c.add(cls.getName());
            this.f21908b.d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.WorkRequest.Builder
        public final WorkRequest b() {
            return new WorkRequest(this.f21907a, this.f21908b, this.f21909c);
        }
    }
}
