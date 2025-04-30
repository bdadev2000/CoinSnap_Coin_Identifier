package com.vungle.ads;

import com.vungle.ads.internal.util.C2111d;

/* loaded from: classes3.dex */
public final class r extends C2111d {
    @Override // com.vungle.ads.internal.util.C2111d
    public void onPause() {
        super.onPause();
        C2137s.INSTANCE.pause();
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onResume() {
        super.onResume();
        C2137s.INSTANCE.resume();
    }
}
