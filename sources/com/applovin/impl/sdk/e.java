package com.applovin.impl.sdk;

import com.applovin.impl.ge;
import com.applovin.impl.q6;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final j f26595a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f26596b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f26597c = new Object();
    private final Map d = new HashMap();
    private final Object e = new Object();

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f26598a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26599b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26600c;
        private final String d;
        private final String e;

        /* renamed from: f, reason: collision with root package name */
        private final String f26601f;

        /* renamed from: g, reason: collision with root package name */
        private final String f26602g;

        /* renamed from: h, reason: collision with root package name */
        private final int f26603h;

        /* renamed from: i, reason: collision with root package name */
        private long f26604i;

        /* renamed from: j, reason: collision with root package name */
        private final ArrayDeque f26605j;

        private b(ge geVar, c cVar) {
            this.f26605j = new ArrayDeque();
            this.f26598a = geVar.getAdUnitId();
            this.f26599b = geVar.getFormat().getLabel();
            this.f26600c = geVar.c();
            this.d = geVar.b();
            this.e = geVar.z();
            this.f26601f = geVar.B();
            this.f26602g = geVar.getCreativeId();
            this.f26603h = geVar.hashCode();
            a(cVar);
        }

        public String a() {
            return this.f26598a;
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.f26600c;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.f26601f;
        }

        public String f() {
            return this.f26602g;
        }

        public String g() {
            return this.f26599b;
        }

        public int h() {
            return this.f26603h;
        }

        public c i() {
            return (c) this.f26605j.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f26598a + "', format='" + this.f26599b + "', adapterName='" + this.f26600c + "', adapterClass='" + this.d + "', adapterVersion='" + this.e + "', bCode='" + this.f26601f + "', creativeId='" + this.f26602g + "', updated=" + this.f26604i + '}';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f26604i = System.currentTimeMillis();
            this.f26605j.add(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: i, reason: collision with root package name */
        public static final Set f26611i = new HashSet(Arrays.asList(values()));

        /* renamed from: a, reason: collision with root package name */
        private final String f26613a;

        c(String str) {
            this.f26613a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f26613a;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(b bVar);
    }

    public e(j jVar) {
        this.f26595a = jVar;
        a();
    }

    public void a(ge geVar, c cVar) {
        synchronized (this.e) {
            try {
                int hashCode = geVar.hashCode();
                b bVar = (b) this.d.get(Integer.valueOf(hashCode));
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(geVar, cVar);
                    this.d.put(Integer.valueOf(hashCode), bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.d.remove(Integer.valueOf(hashCode));
                }
                a(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f26597c) {
            try {
                for (c cVar : c.values()) {
                    this.f26596b.put(cVar, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f26597c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f26597c) {
            try {
                Iterator it = this.f26596b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f26597c) {
            try {
                Set set = (Set) this.f26596b.get(cVar);
                if (q6.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f26597c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
