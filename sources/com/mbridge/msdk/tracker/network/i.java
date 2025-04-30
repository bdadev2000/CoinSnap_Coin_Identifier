package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class i<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f18178a = "i";
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f18179c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f18180d;

    /* renamed from: e, reason: collision with root package name */
    private z f18181e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18182f;

    public i(int i9, String str, int i10, String str2, long j7) {
        super(i9, str, i10, str2);
        this.f18182f = false;
        if (j7 > 0) {
            this.b = j7;
        } else {
            this.b = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public final void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f18179c == null) {
            this.f18179c = new HashMap();
        }
        try {
            this.f18179c.putAll(map);
        } catch (Exception e4) {
            L.s(e4, new StringBuilder("addParams error: "), f18178a);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final z b() {
        if (this.f18181e == null) {
            this.f18181e = new e(30000, this.b, 3);
        }
        return this.f18181e;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> c() {
        if (this.f18180d == null) {
            this.f18180d = new HashMap();
        }
        this.f18180d.put("Charset", "UTF-8");
        return this.f18180d;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final boolean d() {
        if (this.f18182f && com.mbridge.msdk.foundation.same.d.a(f(), k())) {
            return true;
        }
        return false;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f18180d == null) {
            this.f18180d = new HashMap();
        }
        try {
            this.f18180d.put(str, str2);
        } catch (Exception e4) {
            L.s(e4, new StringBuilder("addHeader error: "), f18178a);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        if (this.f18179c == null) {
            this.f18179c = new HashMap();
        }
        return this.f18179c;
    }

    public final void a(boolean z8) {
        this.f18182f = z8;
    }
}
