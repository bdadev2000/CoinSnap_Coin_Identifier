package kotlin.reflect.jvm.internal.impl.platform;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: platformUtil.kt */
/* loaded from: classes9.dex */
public final class PlatformUtilKt {
    public static final String getPresentableDescription(TargetPlatform targetPlatform) {
        Intrinsics.checkNotNullParameter(targetPlatform, "<this>");
        return CollectionsKt.joinToString$default(targetPlatform.getComponentPlatforms(), RemoteSettings.FORWARD_SLASH_STRING, null, null, 0, null, null, 62, null);
    }
}
