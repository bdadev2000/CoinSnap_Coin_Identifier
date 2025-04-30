package androidx.core.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* renamed from: androidx.core.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414o {

    /* renamed from: e, reason: collision with root package name */
    public static HandlerThread f4418e;

    /* renamed from: f, reason: collision with root package name */
    public static Handler f4419f;
    public SparseIntArray[] b = new SparseIntArray[9];

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4421c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final WindowOnFrameMetricsAvailableListenerC0413n f4422d = new WindowOnFrameMetricsAvailableListenerC0413n(this);

    /* renamed from: a, reason: collision with root package name */
    public final int f4420a = 1;

    public static void a(SparseIntArray sparseIntArray, long j7) {
        if (sparseIntArray != null) {
            int i9 = (int) ((500000 + j7) / 1000000);
            if (j7 >= 0) {
                sparseIntArray.put(i9, sparseIntArray.get(i9) + 1);
            }
        }
    }
}
