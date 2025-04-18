package a2;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import v1.b0;

/* loaded from: classes.dex */
public final class b extends Lambda implements Function4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.i f48b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z1.i iVar) {
        super(4);
        this.f48b = iVar;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        Intrinsics.checkNotNull(sQLiteQuery);
        this.f48b.g(new b0(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
