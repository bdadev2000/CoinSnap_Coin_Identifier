package com.mbridge.msdk.video.module.a.a;

/* loaded from: classes3.dex */
public class i extends f {
    protected com.mbridge.msdk.video.module.a.a b;

    public i(com.mbridge.msdk.video.module.a.a aVar) {
        this.b = aVar;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i9, Object obj) {
        super.a(i9, obj);
        com.mbridge.msdk.video.module.a.a aVar = this.b;
        if (aVar != null) {
            aVar.a(i9, obj);
        }
    }
}
