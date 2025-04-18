package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends c {
    public a(Context context, b bVar, d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(aVar);
        Header a10 = Header.a(this.f3305b);
        Header.a(a10);
        Header.b(a10);
        a10.c();
        a10.d();
        a10.e();
        a.a(a10);
        a.a("process_name", (Object) com.apm.insight.l.a.c(this.f3305b));
        r.a(a, a10, this.a);
        return a;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean a() {
        return true;
    }
}
