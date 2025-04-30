package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends c {
    public l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a6 = super.a(i9, aVar);
        if (i9 == 0) {
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
        }
        return a6;
    }

    @Override // com.apm.insight.runtime.a.c
    public int b() {
        return com.apm.insight.nativecrash.b.a();
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean d() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public void h(com.apm.insight.entity.a aVar) {
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean a() {
        return false;
    }
}
