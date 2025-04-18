package com.facebook;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends q {

    /* renamed from: c, reason: collision with root package name */
    public final k0 f11361c;

    public r(k0 k0Var, String str) {
        super(str);
        this.f11361c = k0Var;
    }

    @Override // com.facebook.q, java.lang.Throwable
    public final String toString() {
        u uVar;
        k0 k0Var = this.f11361c;
        if (k0Var == null) {
            uVar = null;
        } else {
            uVar = k0Var.f11168c;
        }
        StringBuilder sb2 = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (uVar != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(uVar.f11404b);
            sb2.append(", facebookErrorCode: ");
            sb2.append(uVar.f11405c);
            sb2.append(", facebookErrorType: ");
            sb2.append(uVar.f11407f);
            sb2.append(", message: ");
            sb2.append(uVar.c());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
