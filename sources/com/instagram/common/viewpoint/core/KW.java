package com.instagram.common.viewpoint.core;

import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KW extends LinearLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<KO> A01 = new AtomicReference<>();

    public static void A00(boolean z2, KO ko) {
        A00.set(z2);
        A01.set(ko);
    }
}
