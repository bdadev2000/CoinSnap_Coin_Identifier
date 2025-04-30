package z5;

import Q7.n0;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2975c extends Exception {
    public final int b = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        if (this.b != 1) {
            str = "Unknown error";
        } else {
            str = "Package not available";
        }
        return n0.l(new StringBuilder(str.length() + 17), "LoaderException{", str, "}");
    }
}
