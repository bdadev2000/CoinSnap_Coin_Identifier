package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f18315a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18316c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18317d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18318e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18319f;

    /* renamed from: g, reason: collision with root package name */
    public final o f18320g;

    /* renamed from: h, reason: collision with root package name */
    public final d f18321h;

    /* renamed from: i, reason: collision with root package name */
    public final v f18322i;

    /* renamed from: j, reason: collision with root package name */
    public final f f18323j;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private o f18326d;

        /* renamed from: h, reason: collision with root package name */
        private d f18330h;

        /* renamed from: i, reason: collision with root package name */
        private v f18331i;

        /* renamed from: j, reason: collision with root package name */
        private f f18332j;

        /* renamed from: a, reason: collision with root package name */
        private int f18324a = 50;
        private int b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;

        /* renamed from: c, reason: collision with root package name */
        private int f18325c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f18327e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f18328f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f18329g = 604800000;

        public final a a(int i9) {
            if (i9 <= 0) {
                this.f18324a = 50;
            } else {
                this.f18324a = i9;
            }
            return this;
        }

        public final a b(int i9) {
            if (i9 < 0) {
                this.b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            } else {
                this.b = i9;
            }
            return this;
        }

        public final a c(int i9) {
            if (i9 <= 0) {
                this.f18327e = 2;
            } else {
                this.f18327e = i9;
            }
            return this;
        }

        public final a d(int i9) {
            if (i9 < 0) {
                this.f18328f = 50;
            } else {
                this.f18328f = i9;
            }
            return this;
        }

        public final a e(int i9) {
            if (i9 < 0) {
                this.f18329g = 604800000;
            } else {
                this.f18329g = i9;
            }
            return this;
        }

        public final a a(int i9, o oVar) {
            this.f18325c = i9;
            this.f18326d = oVar;
            return this;
        }

        public final a a(d dVar) {
            this.f18330h = dVar;
            return this;
        }

        public final a a(v vVar) {
            this.f18331i = vVar;
            return this;
        }

        public final a a(f fVar) {
            this.f18332j = fVar;
            return this;
        }

        public final w a() {
            if (y.a(this.f18330h) && com.mbridge.msdk.tracker.a.f18098a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.a(this.f18331i) && com.mbridge.msdk.tracker.a.f18098a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.a(this.f18326d) || y.a(this.f18326d.c())) && com.mbridge.msdk.tracker.a.f18098a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new w(this);
        }
    }

    private w(a aVar) {
        this.f18315a = aVar.f18324a;
        this.b = aVar.b;
        this.f18316c = aVar.f18325c;
        this.f18317d = aVar.f18327e;
        this.f18318e = aVar.f18328f;
        this.f18319f = aVar.f18329g;
        this.f18320g = aVar.f18326d;
        this.f18321h = aVar.f18330h;
        this.f18322i = aVar.f18331i;
        this.f18323j = aVar.f18332j;
    }
}
