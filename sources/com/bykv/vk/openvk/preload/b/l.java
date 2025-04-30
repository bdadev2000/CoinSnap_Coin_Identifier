package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: g, reason: collision with root package name */
    Map<String, a> f13158g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        List<h> f13159a = new ArrayList();

        public final a a(h hVar) {
            this.f13159a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f13159a.addAll(list);
            return this;
        }
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f13149a == f.class;
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, a> f13160a = new HashMap();
        private com.bykv.vk.openvk.preload.b.b.a b;

        public final a a(String str) {
            if (!this.f13160a.containsKey(str)) {
                a aVar = new a();
                this.f13160a.put(str, aVar);
                return aVar;
            }
            throw new IllegalArgumentException("duplicated branch name");
        }

        public final h a(Class<? extends l> cls) {
            h.a a6 = new h.a().a(cls);
            a6.f13152c = new Object[]{this.f13160a};
            a6.b = this.b;
            return a6.a();
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f13158g = (Map) obj;
                return;
            } catch (ClassCastException e4) {
                throw new IllegalArgumentException(e4);
            }
        }
        throw new IllegalStateException("args error");
    }
}
