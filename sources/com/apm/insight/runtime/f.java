package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final f f3325b = new f() { // from class: com.apm.insight.runtime.f.1
        Header a = null;

        @Override // com.apm.insight.runtime.f
        @Nullable
        public Object b(String str) {
            if (this.a == null) {
                this.a = Header.b(com.apm.insight.i.g());
            }
            return this.a.f().opt(str);
        }
    };
    private f a;

    public f() {
        this(f3325b);
    }

    @Nullable
    public Object a(String str) {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.b(str);
        }
        return null;
    }

    public f(f fVar) {
        this.a = fVar;
    }
}
