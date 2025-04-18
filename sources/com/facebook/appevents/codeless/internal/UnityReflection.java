package com.facebook.appevents.codeless.internal;

import android.util.Log;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class UnityReflection {

    @NotNull
    private static final String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";

    @NotNull
    private static final String EVENT_MAPPING_METHOD = "OnReceiveMapping";

    @NotNull
    private static final String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";

    @NotNull
    public static final UnityReflection INSTANCE = new UnityReflection();
    private static final String TAG = UnityReflection.class.getCanonicalName();

    @NotNull
    private static final String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";

    @NotNull
    private static final String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";
    private static Class<?> unityPlayer;

    private UnityReflection() {
    }

    public static final void captureViewHierarchy() {
        sendMessage(FB_UNITY_GAME_OBJECT, CAPTURE_VIEW_HIERARCHY_METHOD, "");
    }

    private final Class<?> getUnityPlayerClass() {
        return Class.forName(UNITY_PLAYER_CLASS);
    }

    public static final void sendEventMapping(@Nullable String str) {
        sendMessage(FB_UNITY_GAME_OBJECT, EVENT_MAPPING_METHOD, str);
    }

    public static final void sendMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.getUnityPlayerClass();
            }
            Class<?> cls = unityPlayer;
            if (cls == null) {
                a.B0("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod(UNITY_SEND_MESSAGE_METHOD, String.class, String.class, String.class);
            Class<?> cls2 = unityPlayer;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                a.B0("unityPlayer");
                throw null;
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to send message to Unity", e);
        }
    }
}
