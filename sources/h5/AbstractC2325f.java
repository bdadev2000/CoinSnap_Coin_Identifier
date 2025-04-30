package h5;

import java.util.concurrent.TimeUnit;

/* renamed from: h5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2325f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20606a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f20606a = iArr;
        try {
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20606a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20606a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
