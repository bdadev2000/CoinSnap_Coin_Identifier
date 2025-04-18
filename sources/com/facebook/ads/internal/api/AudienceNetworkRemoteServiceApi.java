package com.facebook.ads.internal.api;

import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
/* loaded from: classes.dex */
public interface AudienceNetworkRemoteServiceApi {
    @Nullable
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();
}
