package androidx.room;

import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class SharedSQLiteStatement$stmt$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedSQLiteStatement f21389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSQLiteStatement$stmt$2(SharedSQLiteStatement sharedSQLiteStatement) {
        super(0);
        this.f21389a = sharedSQLiteStatement;
    }

    @Override // q0.a
    public final Object invoke() {
        SharedSQLiteStatement sharedSQLiteStatement = this.f21389a;
        return sharedSQLiteStatement.f21386a.compileStatement(sharedSQLiteStatement.b());
    }
}
