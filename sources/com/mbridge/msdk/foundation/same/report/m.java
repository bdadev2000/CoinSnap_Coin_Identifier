package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.v;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class m extends v {
    @Override // com.mbridge.msdk.tracker.v
    public final w<String> a(r rVar) {
        String str;
        try {
            str = new String(rVar.f15471b, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar.f15472c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(rVar.f15471b);
        }
        return w.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
    }
}
