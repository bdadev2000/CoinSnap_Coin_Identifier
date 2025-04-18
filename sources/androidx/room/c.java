package androidx.room;

import androidx.sqlite.db.SupportSQLiteQuery;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f21401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SupportSQLiteQuery f21402c;
    public final /* synthetic */ QueryInterceptorProgram d;

    public /* synthetic */ c(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, int i2) {
        this.f21400a = i2;
        this.f21401b = queryInterceptorDatabase;
        this.f21402c = supportSQLiteQuery;
        this.d = queryInterceptorProgram;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f21400a;
        QueryInterceptorProgram queryInterceptorProgram = this.d;
        SupportSQLiteQuery supportSQLiteQuery = this.f21402c;
        QueryInterceptorDatabase queryInterceptorDatabase = this.f21401b;
        switch (i2) {
            case 0:
                p0.a.s(queryInterceptorDatabase, "this$0");
                p0.a.s(supportSQLiteQuery, "$query");
                p0.a.s(queryInterceptorProgram, "$queryInterceptorProgram");
                supportSQLiteQuery.a();
                queryInterceptorDatabase.f21317c.a();
                return;
            default:
                p0.a.s(queryInterceptorDatabase, "this$0");
                p0.a.s(supportSQLiteQuery, "$query");
                p0.a.s(queryInterceptorProgram, "$queryInterceptorProgram");
                supportSQLiteQuery.a();
                queryInterceptorDatabase.f21317c.a();
                return;
        }
    }
}
