package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* loaded from: classes.dex */
public class f {
    private static final f b = new f() { // from class: com.apm.insight.runtime.f.1

        /* renamed from: a, reason: collision with root package name */
        Header f6034a = null;

        @Override // com.apm.insight.runtime.f
        @Nullable
        public Object b(String str) {
            if (this.f6034a == null) {
                this.f6034a = Header.b(com.apm.insight.i.g());
            }
            return this.f6034a.f().opt(str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private f f6033a;

    public f() {
        this(b);
    }

    @Nullable
    public Object a(String str) {
        f fVar = this.f6033a;
        if (fVar != null) {
            return fVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        f fVar = this.f6033a;
        if (fVar != null) {
            return fVar.b(str);
        }
        return null;
    }

    public f(f fVar) {
        this.f6033a = fVar;
    }
}
