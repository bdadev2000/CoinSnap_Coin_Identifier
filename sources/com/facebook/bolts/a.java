package com.facebook.bolts;

import com.facebook.bolts.Task;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationToken f28553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28554c;

    public /* synthetic */ a(CancellationToken cancellationToken, Object obj, int i2) {
        this.f28552a = i2;
        this.f28553b = cancellationToken;
        this.f28554c = obj;
    }

    @Override // com.facebook.bolts.Continuation
    public final Object then(Task task) {
        Task m495onSuccess$lambda13;
        Task m496onSuccessTask$lambda14;
        Void m499completeAfterTask$lambda7$lambda6;
        int i2 = this.f28552a;
        CancellationToken cancellationToken = this.f28553b;
        Object obj = this.f28554c;
        switch (i2) {
            case 0:
                m495onSuccess$lambda13 = Task.m495onSuccess$lambda13(cancellationToken, (Continuation) obj, task);
                return m495onSuccess$lambda13;
            case 1:
                m496onSuccessTask$lambda14 = Task.m496onSuccessTask$lambda14(cancellationToken, (Continuation) obj, task);
                return m496onSuccessTask$lambda14;
            default:
                m499completeAfterTask$lambda7$lambda6 = Task.Companion.m499completeAfterTask$lambda7$lambda6(cancellationToken, (TaskCompletionSource) obj, task);
                return m499completeAfterTask$lambda7$lambda6;
        }
    }
}
