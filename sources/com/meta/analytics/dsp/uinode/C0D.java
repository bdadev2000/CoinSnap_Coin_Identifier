package com.meta.analytics.dsp.uinode;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.0D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0D implements Comparator<File> {
    public C0D() {
    }

    private int A00(long j7, long j9) {
        if (j7 < j9) {
            return -1;
        }
        return j7 == j9 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
