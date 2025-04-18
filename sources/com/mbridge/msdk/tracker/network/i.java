package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class i<T> extends u<T> {
    protected static final String a = "i";

    /* renamed from: b, reason: collision with root package name */
    private final long f15434b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f15435c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f15436d;

    /* renamed from: e, reason: collision with root package name */
    private z f15437e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15438f;

    public i(int i10, String str, int i11, String str2, long j3) {
        super(i10, str, i11, str2);
        this.f15438f = false;
        if (j3 > 0) {
            this.f15434b = j3;
        } else {
            this.f15434b = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public final void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f15435c == null) {
            this.f15435c = new HashMap();
        }
        try {
            this.f15435c.putAll(map);
        } catch (Exception e2) {
            com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("addParams error: "), a);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final z b() {
        if (this.f15437e == null) {
            this.f15437e = new e(30000, this.f15434b, 3);
        }
        return this.f15437e;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> c() {
        if (this.f15436d == null) {
            this.f15436d = new HashMap();
        }
        this.f15436d.put("Charset", "UTF-8");
        return this.f15436d;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final boolean d() {
        return this.f15438f && com.mbridge.msdk.foundation.same.d.a(f(), k());
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f15436d == null) {
            this.f15436d = new HashMap();
        }
        try {
            this.f15436d.put(str, str2);
        } catch (Exception e2) {
            com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("addHeader error: "), a);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        if (this.f15435c == null) {
            this.f15435c = new HashMap();
        }
        return this.f15435c;
    }

    public final void a(boolean z10) {
        this.f15438f = z10;
    }
}
