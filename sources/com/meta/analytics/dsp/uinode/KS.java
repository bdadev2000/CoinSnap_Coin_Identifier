package com.meta.analytics.dsp.uinode;

import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KS extends RelativeLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<KJ> A01 = new AtomicReference<>();

    public static void A00(boolean z8, KJ kj) {
        A00.set(z8);
        A01.set(kj);
    }
}
