package com.safedk.android.utils;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f30022a = "GzipUtil";

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: IOException -> 0x0092, TryCatch #6 {IOException -> 0x0092, blocks: (B:42:0x007f, B:30:0x0084, B:32:0x0089, B:34:0x008e), top: B:41:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: IOException -> 0x0092, TryCatch #6 {IOException -> 0x0092, blocks: (B:42:0x007f, B:30:0x0084, B:32:0x0089, B:34:0x008e), top: B:41:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #6 {IOException -> 0x0092, blocks: (B:42:0x007f, B:30:0x0084, B:32:0x0089, B:34:0x008e), top: B:41:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(byte[] r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.c.a(byte[]):java.lang.String");
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        int[] c2 = c(bArr2);
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 < bArr.length) {
                i2 = i4;
                while (i2 > 0 && bArr2[i2] != bArr[i3]) {
                    i2 = c2[i2 - 1];
                }
                if (bArr2[i2] == bArr[i3]) {
                    i2++;
                }
                if (i2 != bArr2.length) {
                    i3++;
                } else {
                    return (i3 - bArr2.length) + 1;
                }
            } else {
                return -1;
            }
        }
    }

    private static int[] c(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i2 = 0;
        for (int i3 = 1; i3 < bArr.length; i3++) {
            while (i2 > 0 && bArr[i2] != bArr[i3]) {
                i2 = iArr[i2 - 1];
            }
            if (bArr[i2] == bArr[i3]) {
                i2++;
            }
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static boolean b(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }
}
