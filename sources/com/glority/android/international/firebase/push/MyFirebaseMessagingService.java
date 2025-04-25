package com.glority.android.international.firebase.push;

import android.util.Log;
import com.glority.android.core.modules.PushMessageBean;
import com.glority.android.core.route.analysis.FirebasePushMessageRequest;
import com.glority.android.core.route.analysis.FirebaseSendTokenToServerRequest;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/* loaded from: classes3.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final String TAG = "MyMessagingService";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        Log.i(TAG, "onNewToken: " + str);
        new FirebaseSendTokenToServerRequest(str).post();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.i(TAG, "From:" + remoteMessage.getFrom());
        if (remoteMessage.getData().size() > 0) {
            dealDataMessage(remoteMessage);
        }
        if (remoteMessage.getNotification() != null) {
            Log.i(TAG, "Message Notification Title:" + remoteMessage.getNotification().getTitle());
            Log.i(TAG, "Message Notification Body:" + remoteMessage.getNotification().getBody());
        }
    }

    private void dealDataMessage(RemoteMessage remoteMessage) {
        Log.i(TAG, "Message data payload:" + remoteMessage.getData());
        remoteMessage.getData();
        PushMessageBean pushMessageBean = new PushMessageBean();
        pushMessageBean.setExtra(remoteMessage.getData());
        new FirebasePushMessageRequest(pushMessageBean).post();
    }
}
