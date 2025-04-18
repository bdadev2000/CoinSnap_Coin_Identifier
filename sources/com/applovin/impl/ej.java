package com.applovin.impl;

/* loaded from: classes.dex */
public interface ej {

    /* loaded from: classes.dex */
    public static final class a {
        public final gj a;

        /* renamed from: b, reason: collision with root package name */
        public final gj f4473b;

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
            if (this.a.equals(aVar.a) && this.f4473b.equals(aVar.f4473b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f4473b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.a);
            if (this.a.equals(this.f4473b)) {
                str = "";
            } else {
                str = ", " + this.f4473b;
            }
            return vd.e.h(sb2, str, "]");
        }

        public a(gj gjVar, gj gjVar2) {
            this.a = (gj) a1.a(gjVar);
            this.f4473b = (gj) a1.a(gjVar2);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ej {
        private final long a;

        /* renamed from: b, reason: collision with root package name */
        private final a f4474b;

        public b(long j3) {
            this(j3, 0L);
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return false;
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.a;
        }

        public b(long j3, long j10) {
            this.a = j3;
            this.f4474b = new a(j10 == 0 ? gj.f4942c : new gj(0L, j10));
        }

        @Override // com.applovin.impl.ej
        public a b(long j3) {
            return this.f4474b;
        }
    }

    a b(long j3);

    boolean b();

    long d();
}
