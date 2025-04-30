package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.v;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class m extends v {
    @Override // com.mbridge.msdk.tracker.v
    public final w<String> a(r rVar) {
        String str;
        try {
            str = new String(rVar.b, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar.f18232c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(rVar.b);
        }
        return w.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
    }
}
