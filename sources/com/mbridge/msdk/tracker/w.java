package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class w {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15550c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15551d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15552e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15553f;

    /* renamed from: g, reason: collision with root package name */
    public final o f15554g;

    /* renamed from: h, reason: collision with root package name */
    public final d f15555h;

    /* renamed from: i, reason: collision with root package name */
    public final v f15556i;

    /* renamed from: j, reason: collision with root package name */
    public final f f15557j;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private o f15560d;

        /* renamed from: h, reason: collision with root package name */
        private d f15564h;

        /* renamed from: i, reason: collision with root package name */
        private v f15565i;

        /* renamed from: j, reason: collision with root package name */
        private f f15566j;
        private int a = 50;

        /* renamed from: b, reason: collision with root package name */
        private int f15558b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;

        /* renamed from: c, reason: collision with root package name */
        private int f15559c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f15561e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f15562f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f15563g = 604800000;

        public final a a(int i10) {
            if (i10 <= 0) {
                this.a = 50;
            } else {
                this.a = i10;
            }
            return this;
        }

        public final a b(int i10) {
            if (i10 < 0) {
                this.f15558b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            } else {
                this.f15558b = i10;
            }
            return this;
        }

        public final a c(int i10) {
            if (i10 <= 0) {
                this.f15561e = 2;
            } else {
                this.f15561e = i10;
            }
            return this;
        }

        public final a d(int i10) {
            if (i10 < 0) {
                this.f15562f = 50;
            } else {
                this.f15562f = i10;
            }
            return this;
        }

        public final a e(int i10) {
            if (i10 < 0) {
                this.f15563g = 604800000;
            } else {
                this.f15563g = i10;
            }
            return this;
        }

        public final a a(int i10, o oVar) {
            this.f15559c = i10;
            this.f15560d = oVar;
            return this;
        }

        public final a a(d dVar) {
            this.f15564h = dVar;
            return this;
        }

        public final a a(v vVar) {
            this.f15565i = vVar;
            return this;
        }

        public final a a(f fVar) {
            this.f15566j = fVar;
            return this;
        }

        public final w a() {
            if (y.a(this.f15564h) && com.mbridge.msdk.tracker.a.a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.a(this.f15565i) && com.mbridge.msdk.tracker.a.a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.a(this.f15560d) || y.a(this.f15560d.c())) && com.mbridge.msdk.tracker.a.a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new w(this);
        }
    }

    private w(a aVar) {
        this.a = aVar.a;
        this.f15549b = aVar.f15558b;
        this.f15550c = aVar.f15559c;
        this.f15551d = aVar.f15561e;
        this.f15552e = aVar.f15562f;
        this.f15553f = aVar.f15563g;
        this.f15554g = aVar.f15560d;
        this.f15555h = aVar.f15564h;
        this.f15556i = aVar.f15565i;
        this.f15557j = aVar.f15566j;
    }
}
