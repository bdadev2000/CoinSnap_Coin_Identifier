package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: g, reason: collision with root package name */
    Map<String, a> f9988g;

    /* loaded from: classes.dex */
    public static final class a {
        List<h> a = new ArrayList();

        public final a a(h hVar) {
            this.a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.a.addAll(list);
            return this;
        }
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).a == f.class;
    }

    /* loaded from: classes.dex */
    public static final class b {
        private Map<String, a> a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.b.b.a f9989b;

        public final a a(String str) {
            if (!this.a.containsKey(str)) {
                a aVar = new a();
                this.a.put(str, aVar);
                return aVar;
            }
            throw new IllegalArgumentException("duplicated branch name");
        }

        public final h a(Class<? extends l> cls) {
            h.a a = new h.a().a(cls);
            a.f9982c = new Object[]{this.a};
            a.f9981b = this.f9989b;
            return a.a();
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f9988g = (Map) obj;
                return;
            } catch (ClassCastException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        throw new IllegalStateException("args error");
    }
}
