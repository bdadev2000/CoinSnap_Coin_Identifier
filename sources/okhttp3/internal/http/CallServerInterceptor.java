package okhttp3.internal.http;

import okhttp3.Interceptor;

/* loaded from: classes4.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z2) {
        this.forWebSocket = z2;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i2) {
        if (i2 == 100) {
            return true;
        }
        return 102 <= i2 && i2 < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:64:0x00ac, B:66:0x00b5, B:22:0x00bd, B:24:0x00e7, B:26:0x00f0, B:27:0x00f3, B:28:0x0117, B:32:0x0122, B:33:0x0141, B:35:0x014f, B:43:0x0165, B:45:0x016b, B:48:0x0178, B:50:0x018d, B:51:0x0195, B:52:0x019f, B:61:0x015a, B:62:0x0131), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:64:0x00ac, B:66:0x00b5, B:22:0x00bd, B:24:0x00e7, B:26:0x00f0, B:27:0x00f3, B:28:0x0117, B:32:0x0122, B:33:0x0141, B:35:0x014f, B:43:0x0165, B:45:0x016b, B:48:0x0178, B:50:0x018d, B:51:0x0195, B:52:0x019f, B:61:0x015a, B:62:0x0131), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:64:0x00ac, B:66:0x00b5, B:22:0x00bd, B:24:0x00e7, B:26:0x00f0, B:27:0x00f3, B:28:0x0117, B:32:0x0122, B:33:0x0141, B:35:0x014f, B:43:0x0165, B:45:0x016b, B:48:0x0178, B:50:0x018d, B:51:0x0195, B:52:0x019f, B:61:0x015a, B:62:0x0131), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
