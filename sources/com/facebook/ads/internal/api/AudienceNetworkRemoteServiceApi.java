package com.facebook.ads.internal.api;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
@UiThread
/* loaded from: classes3.dex */
public interface AudienceNetworkRemoteServiceApi {

    /* loaded from: classes3.dex */
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    @Nullable
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(MessageHandler messageHandler);
}
