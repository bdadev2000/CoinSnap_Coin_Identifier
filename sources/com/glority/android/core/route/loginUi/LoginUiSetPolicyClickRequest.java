package com.glority.android.core.route.loginUi;

import android.app.Activity;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginUiSetPolicyClickRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/core/route/loginUi/LoginUiSetPolicyClickRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "activity", "Landroid/app/Activity;", "tv", "Landroid/widget/TextView;", "(Landroid/app/Activity;Landroid/widget/TextView;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "getTv", "()Landroid/widget/TextView;", "setTv", "(Landroid/widget/TextView;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LoginUiSetPolicyClickRequest extends RouteRequest<Boolean> {
    private Activity activity;
    private TextView tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginUiSetPolicyClickRequest(Activity activity, TextView tv) {
        super(UrlLoginUi.INSTANCE.getURL_LOGIN_UI_SET_POLICY_CLICK(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tv, "tv");
        this.activity = activity;
        this.tv = tv;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final TextView getTv() {
        return this.tv;
    }

    public final void setActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<set-?>");
        this.activity = activity;
    }

    public final void setTv(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv = textView;
    }
}
