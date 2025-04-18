package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network.dex */
public interface MS {
    void A9q(Intent intent, Bundle bundle, C5Q c5q);

    void ACz(boolean z2);

    void ADN(boolean z2);

    void AFx(Bundle bundle);

    String getCurrentClientToken();

    boolean onActivityResult(int i2, int i3, Intent intent);

    void onDestroy();
}
