package a2;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import v1.b0;
import z1.j;

/* loaded from: classes.dex */
public final class i extends b0 implements j {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteStatement f75d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f75d = delegate;
    }

    @Override // z1.j
    public final int D() {
        return this.f75d.executeUpdateDelete();
    }

    @Override // z1.j
    public final long M() {
        return this.f75d.executeInsert();
    }
}
