package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callable f28882c;

    public /* synthetic */ a(Callable callable, int i2) {
        this.f28881b = i2;
        this.f28882c = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i2 = this.f28881b;
        Callable callable = this.f28882c;
        switch (i2) {
            case 0:
                return CrashlyticsWorker.b(callable, task);
            case 1:
                return CrashlyticsWorker.e(callable, task);
            case 2:
                return CrashlyticsWorker.f(callable, task);
            default:
                return CrashlyticsWorker.h(callable, task);
        }
    }
}
