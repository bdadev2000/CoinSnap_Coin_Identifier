package com.vungle.ads.internal.protos;

import com.google.protobuf.D2;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends D2 implements i {
    public /* synthetic */ h(a aVar) {
        this();
    }

    public h addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$400((Sdk$SDKErrorBatch) this.instance, iterable);
        return this;
    }

    public h addErrors(Sdk$SDKError sdk$SDKError) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$200((Sdk$SDKErrorBatch) this.instance, sdk$SDKError);
        return this;
    }

    public h clearErrors() {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$500((Sdk$SDKErrorBatch) this.instance);
        return this;
    }

    @Override // com.vungle.ads.internal.protos.i
    public Sdk$SDKError getErrors(int i9) {
        return ((Sdk$SDKErrorBatch) this.instance).getErrors(i9);
    }

    @Override // com.vungle.ads.internal.protos.i
    public int getErrorsCount() {
        return ((Sdk$SDKErrorBatch) this.instance).getErrorsCount();
    }

    @Override // com.vungle.ads.internal.protos.i
    public List<Sdk$SDKError> getErrorsList() {
        return Collections.unmodifiableList(((Sdk$SDKErrorBatch) this.instance).getErrorsList());
    }

    public h removeErrors(int i9) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$600((Sdk$SDKErrorBatch) this.instance, i9);
        return this;
    }

    public h setErrors(int i9, Sdk$SDKError sdk$SDKError) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$100((Sdk$SDKErrorBatch) this.instance, i9, sdk$SDKError);
        return this;
    }

    private h() {
        super(Sdk$SDKErrorBatch.access$000());
    }

    public h addErrors(int i9, Sdk$SDKError sdk$SDKError) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$300((Sdk$SDKErrorBatch) this.instance, i9, sdk$SDKError);
        return this;
    }

    public h setErrors(int i9, d dVar) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$100((Sdk$SDKErrorBatch) this.instance, i9, (Sdk$SDKError) dVar.build());
        return this;
    }

    public h addErrors(d dVar) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$200((Sdk$SDKErrorBatch) this.instance, (Sdk$SDKError) dVar.build());
        return this;
    }

    public h addErrors(int i9, d dVar) {
        copyOnWrite();
        Sdk$SDKErrorBatch.access$300((Sdk$SDKErrorBatch) this.instance, i9, (Sdk$SDKError) dVar.build());
        return this;
    }
}
