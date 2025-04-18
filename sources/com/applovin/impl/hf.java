package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes.dex */
final class hf {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5160b;

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5161b;

        /* renamed from: c, reason: collision with root package name */
        public final long f5162c;

        /* renamed from: d, reason: collision with root package name */
        public final long f5163d;

        public a(String str, String str2, long j3, long j10) {
            this.a = str;
            this.f5161b = str2;
            this.f5162c = j3;
            this.f5163d = j10;
        }
    }

    public hf(long j3, List list) {
        this.a = j3;
        this.f5160b = list;
    }

    public Cif a(long j3) {
        long j10;
        if (this.f5160b.size() < 2) {
            return null;
        }
        long j11 = j3;
        long j12 = -1;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        boolean z10 = false;
        for (int size = this.f5160b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f5160b.get(size);
            boolean equals = MimeTypes.VIDEO_MP4.equals(aVar.a) | z10;
            if (size == 0) {
                j11 -= aVar.f5163d;
                j10 = 0;
            } else {
                j10 = j11 - aVar.f5162c;
            }
            long j16 = j11;
            j11 = j10;
            if (equals && j11 != j16) {
                j15 = j16 - j11;
                j14 = j11;
                z10 = false;
            } else {
                z10 = equals;
            }
            if (size == 0) {
                j12 = j11;
                j13 = j16;
            }
        }
        if (j14 == -1 || j15 == -1 || j12 == -1 || j13 == -1) {
            return null;
        }
        return new Cif(j12, j13, this.a, j14, j15);
    }
}
