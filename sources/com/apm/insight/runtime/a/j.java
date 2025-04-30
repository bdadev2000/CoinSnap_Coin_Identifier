package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends c {
    public j(Context context, b bVar, d dVar) {
        super(CrashType.JAVA, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a6 = super.a(i9, aVar);
        if (i9 == 0) {
            a6.a("app_count", (Object) 1);
            a6.a("magic_tag", "ss_app_log");
            g(a6);
            Header a9 = Header.a(this.b);
            a9.c();
            a6.a(a9);
            s.a(a6, a9, this.f6009a);
        } else if (i9 == 1) {
            Header i10 = a6.i();
            i10.d();
            i10.e();
        } else if (i9 == 2) {
            Header.a(a6.i());
        } else if (i9 == 5) {
            Header.b(a6.i());
        }
        return a6;
    }
}
