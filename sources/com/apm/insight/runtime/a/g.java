package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

@Deprecated
/* loaded from: classes.dex */
class g extends c {
    public g(Context context, b bVar, d dVar) {
        super(CrashType.CUSTOM_JAVA, context, bVar, dVar);
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
        return a;
    }
}
