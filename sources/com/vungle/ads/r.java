package com.vungle.ads;

/* loaded from: classes4.dex */
public final class r extends com.vungle.ads.internal.util.d {
    @Override // com.vungle.ads.internal.util.d
    public void onPause() {
        super.onPause();
        s.INSTANCE.pause();
    }

    @Override // com.vungle.ads.internal.util.d
    public void onResume() {
        super.onResume();
        s.INSTANCE.resume();
    }
}
