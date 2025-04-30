package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private final g f18290a;

    public p(g gVar) {
        this.f18290a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void a(e eVar) {
        if (y.a(this.f18290a)) {
            return;
        }
        this.f18290a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void b(e eVar) {
        if (y.a(this.f18290a)) {
            return;
        }
        try {
            h i9 = eVar.i();
            if (y.b(i9)) {
                eVar.a(i9.a(eVar));
            }
            this.f18290a.b(eVar);
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "process event error", e4);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public final long[] a() {
        if (y.a(this.f18290a)) {
            return new long[]{0, 0};
        }
        return this.f18290a.a();
    }
}
