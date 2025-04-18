package com.facebook.bolts;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Continuation f28557c;
    public final /* synthetic */ Executor d;
    public final /* synthetic */ CancellationToken e;

    public /* synthetic */ b(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i2) {
        this.f28555a = i2;
        this.f28556b = taskCompletionSource;
        this.f28557c = continuation;
        this.d = executor;
        this.e = cancellationToken;
    }

    @Override // com.facebook.bolts.Continuation
    public final Object then(Task task) {
        Void m492continueWith$lambda10$lambda9;
        Void m493continueWithTask$lambda12$lambda11;
        int i2 = this.f28555a;
        Continuation continuation = this.f28557c;
        TaskCompletionSource taskCompletionSource = this.f28556b;
        CancellationToken cancellationToken = this.e;
        Executor executor = this.d;
        switch (i2) {
            case 0:
                m492continueWith$lambda10$lambda9 = Task.m492continueWith$lambda10$lambda9(taskCompletionSource, continuation, executor, cancellationToken, task);
                return m492continueWith$lambda10$lambda9;
            default:
                m493continueWithTask$lambda12$lambda11 = Task.m493continueWithTask$lambda12$lambda11(taskCompletionSource, continuation, executor, cancellationToken, task);
                return m493continueWithTask$lambda12$lambda11;
        }
    }
}
