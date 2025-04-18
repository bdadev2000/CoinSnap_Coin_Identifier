package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class p implements l {
    private final g a;

    public p(g gVar) {
        this.a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void a(e eVar) {
        if (y.a(this.a)) {
            return;
        }
        this.a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void b(e eVar) {
        if (y.a(this.a)) {
            return;
        }
        try {
            h i10 = eVar.i();
            if (y.b(i10)) {
                eVar.a(i10.a(eVar));
            }
            this.a.b(eVar);
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "process event error", e2);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public final long[] a() {
        return y.a(this.a) ? new long[]{0, 0} : this.a.a();
    }
}
