package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements l {
    public final cc.c a;

    public k(cc.c transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.a = transportFactoryProvider;
    }

    public final void a(i0 sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((i7.o) ((f7.f) this.a.get())).a("FIREBASE_APPQUALITY_SESSION", new f7.c("json"), new gb.d(this, 7)).a(new f7.a(sessionEvent, f7.d.DEFAULT, null), new com.facebook.appevents.m(8));
    }
}
