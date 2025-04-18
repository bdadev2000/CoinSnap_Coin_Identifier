package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class o extends com.facebook.appevents.i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.facebook.appevents.i f1517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1518d;

    public o(com.facebook.appevents.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1517c = iVar;
        this.f1518d = threadPoolExecutor;
    }

    @Override // com.facebook.appevents.i
    public final void c(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f1518d;
        try {
            this.f1517c.c(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.facebook.appevents.i
    public final void d(s2.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1518d;
        try {
            this.f1517c.d(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
