package com.glority.android.core.route.snaptips;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapTipsCloseRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/core/route/snaptips/SnapTipsCloseRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "memo", "time", "", "(Ljava/lang/String;I)V", "getMemo", "()Ljava/lang/String;", "setMemo", "(Ljava/lang/String;)V", "getTime", "()I", "setTime", "(I)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SnapTipsCloseRequest extends RouteRequest<String> {
    private String memo;
    private int time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapTipsCloseRequest(String memo, int i) {
        super(UrlSnapTips.INSTANCE.getURL_SNAP_TIPS_CLOSE_TRACK(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.memo = memo;
        this.time = i;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final int getTime() {
        return this.time;
    }

    public final void setMemo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.memo = str;
    }

    public final void setTime(int i) {
        this.time = i;
    }
}
