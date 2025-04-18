package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface SessionLifecycleServiceBinder {
    void bindToService(@NotNull Messenger messenger, @NotNull ServiceConnection serviceConnection);
}
