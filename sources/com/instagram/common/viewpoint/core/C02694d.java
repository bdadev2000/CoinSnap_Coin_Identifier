package com.instagram.common.viewpoint.core;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02694d extends Observable<AbstractC02704e> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC02704e) this.mObservers.get(size)).A00();
        }
    }
}
