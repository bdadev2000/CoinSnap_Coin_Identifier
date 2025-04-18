package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements SuccessContinuation, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f28910b;

    public /* synthetic */ c(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.f28910b = firebaseRemoteConfig;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task lambda$fetchAndActivate$1;
        lambda$fetchAndActivate$1 = this.f28910b.lambda$fetchAndActivate$1((Void) obj);
        return lambda$fetchAndActivate$1;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean processActivatePutTask;
        processActivatePutTask = this.f28910b.processActivatePutTask(task);
        return Boolean.valueOf(processActivatePutTask);
    }
}
