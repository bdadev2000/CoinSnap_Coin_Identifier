package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* loaded from: classes4.dex */
public final class e extends MBTempContainer.a.C0205a {
    private h a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f15700b;

    public e(com.mbridge.msdk.foundation.same.report.d.b bVar, h hVar) {
        this.a = hVar;
        this.f15700b = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a.C0205a, com.mbridge.msdk.video.bt.module.MBTempContainer.a
    public final void a(String str) {
        super.a(str);
        h hVar = this.a;
        if (hVar != null) {
            hVar.a(this.f15700b, str);
        }
    }
}
