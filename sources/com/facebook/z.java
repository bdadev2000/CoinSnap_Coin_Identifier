package com.facebook;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends q {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final u f11440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f11440c = requestError;
    }

    @Override // com.facebook.q, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        u uVar = this.f11440c;
        sb2.append(uVar.f11404b);
        sb2.append(", facebookErrorCode: ");
        sb2.append(uVar.f11405c);
        sb2.append(", facebookErrorType: ");
        sb2.append(uVar.f11407f);
        sb2.append(", message: ");
        sb2.append(uVar.c());
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }
}
