package com.facebook.bolts;

import com.facebook.bolts.Task;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationToken f28562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28563c;
    public final /* synthetic */ Continuation d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Task f28564f;

    public /* synthetic */ e(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task, int i2) {
        this.f28561a = i2;
        this.f28562b = cancellationToken;
        this.f28563c = taskCompletionSource;
        this.d = continuation;
        this.f28564f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28561a;
        TaskCompletionSource taskCompletionSource = this.f28563c;
        CancellationToken cancellationToken = this.f28562b;
        Task task = this.f28564f;
        Continuation continuation = this.d;
        switch (i2) {
            case 0:
                Task.Companion.m500completeImmediately$lambda5(cancellationToken, taskCompletionSource, continuation, task);
                return;
            default:
                Task.Companion.m498completeAfterTask$lambda7(cancellationToken, taskCompletionSource, continuation, task);
                return;
        }
    }
}
