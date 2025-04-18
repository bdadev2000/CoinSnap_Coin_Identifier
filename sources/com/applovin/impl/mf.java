package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
final class mf {

    /* renamed from: a, reason: collision with root package name */
    public final long f25571a;

    /* renamed from: b, reason: collision with root package name */
    public final List f25572b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f25573a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25574b;

        /* renamed from: c, reason: collision with root package name */
        public final long f25575c;
        public final long d;

        public a(String str, String str2, long j2, long j3) {
            this.f25573a = str;
            this.f25574b = str2;
            this.f25575c = j2;
            this.d = j3;
        }
    }

    public mf(long j2, List list) {
        this.f25571a = j2;
        this.f25572b = list;
    }

    public nf a(long j2) {
        long j3;
        if (this.f25572b.size() < 2) {
            return null;
        }
        long j4 = j2;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        long j8 = -1;
        boolean z2 = false;
        for (int size = this.f25572b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f25572b.get(size);
            boolean equals = "video/mp4".equals(aVar.f25573a) | z2;
            if (size == 0) {
                j4 -= aVar.d;
                j3 = 0;
            } else {
                j3 = j4 - aVar.f25575c;
            }
            long j9 = j4;
            j4 = j3;
            if (!equals || j4 == j9) {
                z2 = equals;
            } else {
                j8 = j9 - j4;
                j7 = j4;
                z2 = false;
            }
            if (size == 0) {
                j5 = j4;
                j6 = j9;
            }
        }
        if (j7 == -1 || j8 == -1 || j5 == -1 || j6 == -1) {
            return null;
        }
        return new nf(j5, j6, this.f25571a, j7, j8);
    }
}
