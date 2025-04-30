package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

/* loaded from: classes.dex */
public class e extends c {
    public e(Context context, b bVar, d dVar) {
        super(CrashType.BLOCK, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a6 = super.a(aVar);
        g(a6);
        s.a(a6, (Header) null, this.f6009a);
        return a6;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean c() {
        return true;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean d() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean a() {
        return false;
    }
}
