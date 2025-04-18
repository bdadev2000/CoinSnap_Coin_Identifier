package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28827c;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.f28825a = i2;
        this.f28827c = obj;
        this.f28826b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28825a;
        Object obj = this.f28826b;
        Object obj2 = this.f28827c;
        switch (i2) {
            case 0:
                ((OptionalProvider) obj2).set((Provider) obj);
                return;
            case 1:
                ((LazySet) obj2).add((Provider) obj);
                return;
            default:
                EventBus.lambda$publish$0((Map.Entry) obj2, (Event) obj);
                return;
        }
    }
}
