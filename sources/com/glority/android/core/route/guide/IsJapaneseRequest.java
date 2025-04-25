package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IsJapaneseRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/guide/IsJapaneseRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class IsJapaneseRequest extends RouteRequest<Boolean> {
    private final Context context;

    public IsJapaneseRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public IsJapaneseRequest(Context context) {
        super(UrlGuide.INSTANCE.getURL_IS_JAPANESE(), context, null, 4, null);
        this.context = context;
    }

    public /* synthetic */ IsJapaneseRequest(Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context);
    }

    public final Context getContext() {
        return this.context;
    }
}
