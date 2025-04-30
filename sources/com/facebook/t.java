package com.facebook;

/* loaded from: classes.dex */
public final class t extends C1849l {
    private static final long serialVersionUID = 1;
    public final p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, String str) {
        super(str);
        G7.j.e(pVar, "requestError");
        this.b = pVar;
    }

    @Override // com.facebook.C1849l, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        p pVar = this.b;
        sb.append(pVar.b);
        sb.append(", facebookErrorCode: ");
        sb.append(pVar.f13792c);
        sb.append(", facebookErrorType: ");
        sb.append(pVar.f13794f);
        sb.append(", message: ");
        sb.append(pVar.c());
        sb.append("}");
        String sb2 = sb.toString();
        G7.j.d(sb2, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }
}
