package yc;

import com.google.gson.c0;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes3.dex */
public final class f extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f28163b = new e();
    public final c0 a;

    public f(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        Date date = (Date) this.a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        this.a.c(bVar, (Timestamp) obj);
    }
}
