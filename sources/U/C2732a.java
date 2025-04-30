package u;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2732a {
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    @Nullable
    public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
        return null;
    }

    public void onMessageChannelReady(@Nullable Bundle bundle) {
    }

    public void extraCallback(@NonNull String str, @Nullable Bundle bundle) {
    }

    public void onNavigationEvent(int i9, Bundle bundle) {
    }

    public void onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
    }

    public void onActivityResized(int i9, int i10, @NonNull Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i9, @NonNull Uri uri, boolean z8, @Nullable Bundle bundle) {
    }
}
