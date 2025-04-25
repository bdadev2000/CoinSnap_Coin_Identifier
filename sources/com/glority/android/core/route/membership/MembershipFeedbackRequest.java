package com.glority.android.core.route.membership;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MembershipFeedbackRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/membership/MembershipFeedbackRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class MembershipFeedbackRequest extends RouteRequest<Boolean> {
    private final String email;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembershipFeedbackRequest(String email) {
        super(UrlMembership.INSTANCE.getURL_MEMBERSHIP_FEEDBACK(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
    }

    public final String getEmail() {
        return this.email;
    }
}
