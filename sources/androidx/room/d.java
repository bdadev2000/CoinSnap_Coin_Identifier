package androidx.room;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f21404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21405c;

    public /* synthetic */ d(QueryInterceptorDatabase queryInterceptorDatabase, String str, int i2) {
        this.f21403a = i2;
        this.f21404b = queryInterceptorDatabase;
        this.f21405c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f21403a;
        String str = this.f21405c;
        QueryInterceptorDatabase queryInterceptorDatabase = this.f21404b;
        switch (i2) {
            case 0:
                p0.a.s(queryInterceptorDatabase, "this$0");
                p0.a.s(str, "$query");
                queryInterceptorDatabase.f21317c.a();
                return;
            default:
                p0.a.s(queryInterceptorDatabase, "this$0");
                p0.a.s(str, "$sql");
                queryInterceptorDatabase.f21317c.a();
                return;
        }
    }
}
