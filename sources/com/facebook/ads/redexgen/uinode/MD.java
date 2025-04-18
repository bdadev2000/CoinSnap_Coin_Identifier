package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network.dex */
public interface MD {
    void A9Q(Intent intent, Bundle bundle, C5V c5v);

    void ACW(boolean z10);

    void ACu(boolean z10);

    void AFT(Bundle bundle);

    String getCurrentClientToken();

    boolean onActivityResult(int i10, int i11, Intent intent);

    void onDestroy();
}
