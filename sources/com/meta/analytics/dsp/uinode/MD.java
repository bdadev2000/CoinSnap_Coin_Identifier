package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network.dex */
public interface MD {
    void A9Q(Intent intent, Bundle bundle, C5V c5v);

    void ACW(boolean z8);

    void ACu(boolean z8);

    void AFT(Bundle bundle);

    String getCurrentClientToken();

    boolean onActivityResult(int i9, int i10, Intent intent);

    void onDestroy();
}
