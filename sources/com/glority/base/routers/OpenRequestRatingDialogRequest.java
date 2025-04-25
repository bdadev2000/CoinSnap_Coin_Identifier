package com.glority.base.routers;

import androidx.fragment.app.FragmentManager;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.base.storage.PersistKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenRequestRatingDialogRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/glority/base/routers/OpenRequestRatingDialogRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "callback", "Lcom/glority/base/routers/OpenRequestRatingDialogRequest$OnRatingDialogDismissCallback;", "useNewDialog", "<init>", "(Landroidx/fragment/app/FragmentManager;Lcom/glority/base/routers/OpenRequestRatingDialogRequest$OnRatingDialogDismissCallback;Z)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getCallback", "()Lcom/glority/base/routers/OpenRequestRatingDialogRequest$OnRatingDialogDismissCallback;", "getUseNewDialog", "()Z", "OnRatingDialogDismissCallback", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OpenRequestRatingDialogRequest extends RouteRequest<Boolean> {
    private static final long TIME_THRESHOLD = 2592000000L;
    private final OnRatingDialogDismissCallback callback;
    private final FragmentManager fragmentManager;
    private final boolean useNewDialog;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OpenRequestRatingDialogRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/glority/base/routers/OpenRequestRatingDialogRequest$OnRatingDialogDismissCallback;", "", "onDismiss", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface OnRatingDialogDismissCallback {
        void onDismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenRequestRatingDialogRequest(FragmentManager fragmentManager, OnRatingDialogDismissCallback onRatingDialogDismissCallback, boolean z) {
        super(UrlRouter.INSTANCE.getURL_OPEN_REQUEST_RATING_DIALOG(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.callback = onRatingDialogDismissCallback;
        this.useNewDialog = z;
    }

    public /* synthetic */ OpenRequestRatingDialogRequest(FragmentManager fragmentManager, OnRatingDialogDismissCallback onRatingDialogDismissCallback, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, (i & 2) != 0 ? null : onRatingDialogDismissCallback, (i & 4) != 0 ? false : z);
    }

    public final OnRatingDialogDismissCallback getCallback() {
        return this.callback;
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public final boolean getUseNewDialog() {
        return this.useNewDialog;
    }

    /* compiled from: OpenRequestRatingDialogRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/glority/base/routers/OpenRequestRatingDialogRequest$Companion;", "", "<init>", "()V", "TIME_THRESHOLD", "", "checkAndShow", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean checkAndShow() {
            return System.currentTimeMillis() - ((Number) PersistData.INSTANCE.get(PersistKey.KEY_LAST_RATE_TIMESTAMP, 0L)).longValue() >= OpenRequestRatingDialogRequest.TIME_THRESHOLD;
        }
    }
}
