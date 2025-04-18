package androidx.room;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f21399b;

    public /* synthetic */ b(QueryInterceptorDatabase queryInterceptorDatabase, int i2) {
        this.f21398a = i2;
        this.f21399b = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f21398a;
        QueryInterceptorDatabase queryInterceptorDatabase = this.f21399b;
        switch (i2) {
            case 0:
                p0.a.s(queryInterceptorDatabase, "this$0");
                queryInterceptorDatabase.f21317c.a();
                return;
            case 1:
                p0.a.s(queryInterceptorDatabase, "this$0");
                queryInterceptorDatabase.f21317c.a();
                return;
            case 2:
                p0.a.s(queryInterceptorDatabase, "this$0");
                queryInterceptorDatabase.f21317c.a();
                return;
            default:
                p0.a.s(queryInterceptorDatabase, "this$0");
                queryInterceptorDatabase.f21317c.a();
                return;
        }
    }
}
