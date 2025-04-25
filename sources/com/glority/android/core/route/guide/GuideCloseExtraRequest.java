package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GuideCloseExtraRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/core/route/guide/GuideCloseExtraRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "context", "Landroid/content/Context;", "extraParam", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getExtraParam", "()Ljava/lang/String;", "setExtraParam", "(Ljava/lang/String;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GuideCloseExtraRequest extends RouteRequest<Boolean> {
    private final Context context;
    private String extraParam;

    public GuideCloseExtraRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public GuideCloseExtraRequest(Context context, String str) {
        super(UrlGuide.INSTANCE.getURL_EXTRA_CLOSE(), context, null, 4, null);
        this.context = context;
        this.extraParam = str;
    }

    public /* synthetic */ GuideCloseExtraRequest(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : str);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getExtraParam() {
        return this.extraParam;
    }

    public final void setExtraParam(String str) {
        this.extraParam = str;
    }
}
