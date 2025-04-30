package com.facebook;

/* renamed from: com.facebook.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853m extends C1849l {
    public final F b;

    public C1853m(F f9, String str) {
        super(str);
        this.b = f9;
    }

    @Override // com.facebook.C1849l, java.lang.Throwable
    public final String toString() {
        p pVar;
        F f9 = this.b;
        if (f9 == null) {
            pVar = null;
        } else {
            pVar = f9.f13407c;
        }
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (pVar != null) {
            sb.append("httpResponseCode: ");
            sb.append(pVar.b);
            sb.append(", facebookErrorCode: ");
            sb.append(pVar.f13792c);
            sb.append(", facebookErrorType: ");
            sb.append(pVar.f13794f);
            sb.append(", message: ");
            sb.append(pVar.c());
            sb.append("}");
        }
        String sb2 = sb.toString();
        G7.j.d(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
