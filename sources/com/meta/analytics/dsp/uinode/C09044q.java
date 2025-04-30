package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.4q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09044q extends C5 implements Comparable<C09044q> {
    public static String[] A01 = {"vLCiYmslEIO8pJY4aanHdZ7QImU9IQkS", "qKFqw4ir5U7ZeqBFISN4Zo", "jSoy0i9dh5CIlqD3dL3njwneSWVMxCrT", "BKJrnveI01f5DMln9XIqip", "hfsDVMr2hJ3AGnbNzVU4gQALPe", "leKVUsav6grkPqjsrOtcGAgCR95imu9O", "O7i9KhUKrr", "K8BeTV5Og7G1zujvrlQB8lJ7v8"};
    public long A00;

    public C09044q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C09044q c09044q) {
        if (A04() != c09044q.A04()) {
            return A04() ? 1 : -1;
        }
        long j7 = ((C1614Xr) this).A00 - ((C1614Xr) c09044q).A00;
        if (j7 == 0) {
            long j9 = this.A00;
            long j10 = c09044q.A00;
            if (A01[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "YA5mbgM7zSdIgspcc6jY8TfuEeXD2Ehe";
            strArr[2] = "tQeim9pVy3EkTEWbzOifosISYdgikQjr";
            j7 = j9 - j10;
            if (j7 == 0) {
                return 0;
            }
        }
        return j7 > 0 ? 1 : -1;
    }
}
