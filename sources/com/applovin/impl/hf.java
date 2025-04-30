package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes.dex */
final class hf {

    /* renamed from: a, reason: collision with root package name */
    public final long f8137a;
    public final List b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f8138a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8139c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8140d;

        public a(String str, String str2, long j7, long j9) {
            this.f8138a = str;
            this.b = str2;
            this.f8139c = j7;
            this.f8140d = j9;
        }
    }

    public hf(long j7, List list) {
        this.f8137a = j7;
        this.b = list;
    }

    public Cif a(long j7) {
        long j9;
        if (this.b.size() < 2) {
            return null;
        }
        long j10 = j7;
        long j11 = -1;
        long j12 = -1;
        long j13 = -1;
        long j14 = -1;
        boolean z8 = false;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.b.get(size);
            boolean equals = MimeTypes.VIDEO_MP4.equals(aVar.f8138a) | z8;
            if (size == 0) {
                j10 -= aVar.f8140d;
                j9 = 0;
            } else {
                j9 = j10 - aVar.f8139c;
            }
            long j15 = j10;
            j10 = j9;
            if (equals && j10 != j15) {
                j14 = j15 - j10;
                j13 = j10;
                z8 = false;
            } else {
                z8 = equals;
            }
            if (size == 0) {
                j11 = j10;
                j12 = j15;
            }
        }
        if (j13 == -1 || j14 == -1 || j11 == -1 || j12 == -1) {
            return null;
        }
        return new Cif(j11, j12, this.f8137a, j13, j14);
    }
}
