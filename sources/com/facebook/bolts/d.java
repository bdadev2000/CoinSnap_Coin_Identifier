package com.facebook.bolts;

import com.facebook.bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f28559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28560c;

    public /* synthetic */ d(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, int i2) {
        this.f28558a = i2;
        this.f28559b = atomicBoolean;
        this.f28560c = taskCompletionSource;
    }

    @Override // com.facebook.bolts.Continuation
    public final Object then(Task task) {
        Void m504whenAnyResult$lambda3;
        Void m503whenAny$lambda4;
        int i2 = this.f28558a;
        TaskCompletionSource taskCompletionSource = this.f28560c;
        AtomicBoolean atomicBoolean = this.f28559b;
        switch (i2) {
            case 0:
                m504whenAnyResult$lambda3 = Task.Companion.m504whenAnyResult$lambda3(atomicBoolean, taskCompletionSource, task);
                return m504whenAnyResult$lambda3;
            default:
                m503whenAny$lambda4 = Task.Companion.m503whenAny$lambda4(atomicBoolean, taskCompletionSource, task);
                return m503whenAny$lambda4;
        }
    }
}
