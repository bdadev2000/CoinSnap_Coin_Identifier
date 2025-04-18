package de;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ConsentInformation.OnConsentInfoUpdateFailureListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f17002b;

    public /* synthetic */ b(ag.b bVar) {
        this.f17002b = bVar;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(FormError formError) {
        a callback = this.f17002b;
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(formError, "formError");
        ((ag.b) callback).c(formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public final void onConsentInfoUpdateFailure(FormError formError) {
        a callback = this.f17002b;
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(formError, "formError");
        ((ag.b) callback).c(formError);
    }
}
