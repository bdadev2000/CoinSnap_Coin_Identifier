package com.facebook.internal;

import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import com.facebook.CallbackManager;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import kotlin.jvm.internal.f0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ActivityResultCallback, SynchronizationGuard.CriticalSection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28584c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(CallbackManager callbackManager, int i2, f0 f0Var) {
        this.f28584c = callbackManager;
        this.f28583b = i2;
        this.d = f0Var;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        return Uploader.h((Uploader) this.f28584c, (TransportContext) this.d, this.f28583b);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        DialogPresenter.a((CallbackManager) this.f28584c, this.f28583b, (f0) this.d, (Pair) obj);
    }

    public /* synthetic */ a(Uploader uploader, TransportContext transportContext, int i2) {
        this.f28584c = uploader;
        this.d = transportContext;
        this.f28583b = i2;
    }
}
