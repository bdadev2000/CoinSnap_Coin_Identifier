package com.applovin.impl.sdk.ad;

import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import com.applovin.impl.tl;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function, SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26577c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(b bVar, MotionEvent motionEvent, boolean z2) {
        this.f26577c = bVar;
        this.d = motionEvent;
        this.f26576b = z2;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        List a2;
        a2 = ((b) this.f26577c).a((MotionEvent) this.d, this.f26576b, (tl) obj);
        return a2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task lambda$put$1;
        lambda$put$1 = ((ConfigCacheClient) this.f26577c).lambda$put$1(this.f26576b, (ConfigContainer) this.d, (Void) obj);
        return lambda$put$1;
    }

    public /* synthetic */ f(ConfigCacheClient configCacheClient, boolean z2, ConfigContainer configContainer) {
        this.f26577c = configCacheClient;
        this.f26576b = z2;
        this.d = configContainer;
    }
}
