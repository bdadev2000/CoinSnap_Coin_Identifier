package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* loaded from: classes3.dex */
public final class e extends MBTempContainer.a.C0193a {

    /* renamed from: a, reason: collision with root package name */
    private h f18560a;
    private com.mbridge.msdk.foundation.same.report.d.b b;

    public e(com.mbridge.msdk.foundation.same.report.d.b bVar, h hVar) {
        this.f18560a = hVar;
        this.b = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a.C0193a, com.mbridge.msdk.video.bt.module.MBTempContainer.a
    public final void a(String str) {
        super.a(str);
        h hVar = this.f18560a;
        if (hVar != null) {
            hVar.a(this.b, str);
        }
    }
}
