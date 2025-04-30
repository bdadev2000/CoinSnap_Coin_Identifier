package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends c {
    public h(Context context, b bVar, d dVar) {
        super(CrashType.DART, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a6 = super.a(aVar);
        Header a9 = Header.a(this.b);
        Header.a(a9);
        Header.b(a9);
        a9.c();
        a9.d();
        a9.e();
        a6.a(a9);
        s.a(a6, a9, this.f6009a);
        return a6;
    }
}
