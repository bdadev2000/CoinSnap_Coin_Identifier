package com.mbridge.msdk.video.module.a.a;

/* loaded from: classes4.dex */
public class i extends f {

    /* renamed from: b, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.a.a f16033b;

    public i(com.mbridge.msdk.video.module.a.a aVar) {
        this.f16033b = aVar;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        com.mbridge.msdk.video.module.a.a aVar = this.f16033b;
        if (aVar != null) {
            aVar.a(i10, obj);
        }
    }
}
