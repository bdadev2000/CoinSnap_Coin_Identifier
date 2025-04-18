package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends c {
    public k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(i10, aVar);
        if (i10 == 0) {
            Header a10 = Header.a(this.f3305b);
            a10.c();
            a.a(a10);
            r.a(a, a10, this.a);
        } else if (i10 == 1) {
            Header i11 = a.i();
            i11.d();
            i11.e();
        } else if (i10 == 2) {
            Header.a(a.i());
            try {
                a.i().f().put("launch_did", com.apm.insight.i.a.a(this.f3305b));
            } catch (Throwable unused) {
            }
        } else if (i10 == 5) {
            Header.b(a.i());
        }
        return a;
    }
}
