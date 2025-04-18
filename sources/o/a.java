package o;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class a {
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public void extraCallback(@NonNull String str, @Nullable Bundle bundle) {
    }

    @Nullable
    public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
        return null;
    }

    public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, @NonNull Bundle bundle) {
    }

    public void onActivityResized(int i10, int i11, @NonNull Bundle bundle) {
    }

    public void onMessageChannelReady(@Nullable Bundle bundle) {
    }

    public void onMinimized(@NonNull Bundle bundle) {
    }

    public void onNavigationEvent(int i10, Bundle bundle) {
    }

    public void onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i10, @NonNull Uri uri, boolean z10, @Nullable Bundle bundle) {
    }

    public void onUnminimized(@NonNull Bundle bundle) {
    }

    public void onWarmupCompleted(@NonNull Bundle bundle) {
    }
}
