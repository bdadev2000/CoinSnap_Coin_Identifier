package com.glority.android.core.route.agreement;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OpenAgreementPageRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/glority/android/core/route/agreement/OpenAgreementPageRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "disableBack", "", "requestCode", "", "(ZLjava/lang/Integer;)V", "getDisableBack", "()Z", "getRequestCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class OpenAgreementPageRequest extends RouteRequest<String> {
    private final boolean disableBack;
    private final Integer requestCode;

    public OpenAgreementPageRequest() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ OpenAgreementPageRequest(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : num);
    }

    public final boolean getDisableBack() {
        return this.disableBack;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    public OpenAgreementPageRequest(boolean z, Integer num) {
        super(UrlAgreement.INSTANCE.getURL_OPEN_AGREEMENT_PAGE(), null, null, 6, null);
        this.disableBack = z;
        this.requestCode = num;
    }
}
