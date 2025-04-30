package com.applovin.impl;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public interface ej {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final gj f7443a;
        public final gj b;

        public a(gj gjVar) {
            this(gjVar, gjVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7443a.equals(aVar.f7443a) && this.b.equals(aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.f7443a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f7443a);
            if (this.f7443a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            return AbstractC2914a.h(sb, str, "]");
        }

        public a(gj gjVar, gj gjVar2) {
            this.f7443a = (gj) AbstractC0669a1.a(gjVar);
            this.b = (gj) AbstractC0669a1.a(gjVar2);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ej {

        /* renamed from: a, reason: collision with root package name */
        private final long f7444a;
        private final a b;

        public b(long j7) {
            this(j7, 0L);
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return false;
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.f7444a;
        }

        public b(long j7, long j9) {
            this.f7444a = j7;
            this.b = new a(j9 == 0 ? gj.f7917c : new gj(0L, j9));
        }

        @Override // com.applovin.impl.ej
        public a b(long j7) {
            return this.b;
        }
    }

    a b(long j7);

    boolean b();

    long d();
}
