package com.glority.utils.device;

import java.util.List;

/* loaded from: classes9.dex */
public final class ShellUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");

    public static CommandResult execCmd(String str, boolean z) {
        return execCmd(new String[]{str}, z, true);
    }

    public static CommandResult execCmd(String str, boolean z, boolean z2) {
        return execCmd(new String[]{str}, z, z2);
    }

    public static CommandResult execCmd(List<String> list, boolean z) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z, true);
    }

    public static CommandResult execCmd(List<String> list, boolean z, boolean z2) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z, z2);
    }

    public static CommandResult execCmd(String[] strArr, boolean z) {
        return execCmd(strArr, z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e A[Catch: IOException -> 0x011a, TryCatch #1 {IOException -> 0x011a, blocks: (B:89:0x0116, B:78:0x011e, B:80:0x0123), top: B:88:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123 A[Catch: IOException -> 0x011a, TRY_LEAVE, TryCatch #1 {IOException -> 0x011a, blocks: (B:89:0x0116, B:78:0x011e, B:80:0x0123), top: B:88:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0151 A[Catch: IOException -> 0x014d, TryCatch #6 {IOException -> 0x014d, blocks: (B:106:0x0149, B:94:0x0151, B:96:0x0156), top: B:105:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0156 A[Catch: IOException -> 0x014d, TRY_LEAVE, TryCatch #6 {IOException -> 0x014d, blocks: (B:106:0x0149, B:94:0x0151, B:96:0x0156), top: B:105:0x0149 }] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.glority.utils.device.ShellUtils.CommandResult execCmd(java.lang.String[] r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.device.ShellUtils.execCmd(java.lang.String[], boolean, boolean):com.glority.utils.device.ShellUtils$CommandResult");
    }

    /* loaded from: classes9.dex */
    public static class CommandResult {
        public String errorMsg;
        public int result;
        public String successMsg;

        public CommandResult(int i, String str, String str2) {
            this.result = i;
            this.successMsg = str;
            this.errorMsg = str2;
        }

        public String toString() {
            return "result: " + this.result + "\nsuccessMsg: " + this.successMsg + "\nerrorMsg: " + this.errorMsg;
        }
    }

    private ShellUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
