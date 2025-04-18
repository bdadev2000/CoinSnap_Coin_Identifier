package com.applovin.impl;

/* loaded from: classes.dex */
public interface ij {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final kj f24497a;

        /* renamed from: b, reason: collision with root package name */
        public final kj f24498b;

        public a(kj kjVar) {
            this(kjVar, kjVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f24497a.equals(aVar.f24497a) && this.f24498b.equals(aVar.f24498b);
        }

        public int hashCode() {
            return this.f24498b.hashCode() + (this.f24497a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f24497a);
            if (this.f24497a.equals(this.f24498b)) {
                str = "";
            } else {
                str = ", " + this.f24498b;
            }
            return android.support.v4.media.d.r(sb, str, "]");
        }

        public a(kj kjVar, kj kjVar2) {
            this.f24497a = (kj) b1.a(kjVar);
            this.f24498b = (kj) b1.a(kjVar2);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ij {

        /* renamed from: a, reason: collision with root package name */
        private final long f24499a;

        /* renamed from: b, reason: collision with root package name */
        private final a f24500b;

        public b(long j2) {
            this(j2, 0L);
        }

        @Override // com.applovin.impl.ij
        public a b(long j2) {
            return this.f24500b;
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.f24499a;
        }

        public b(long j2, long j3) {
            this.f24499a = j2;
            this.f24500b = new a(j3 == 0 ? kj.f24922c : new kj(0L, j3));
        }

        @Override // com.applovin.impl.ij
        public boolean b() {
            return false;
        }
    }

    a b(long j2);

    boolean b();

    long d();
}
