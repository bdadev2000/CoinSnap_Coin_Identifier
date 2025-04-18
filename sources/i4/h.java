package i4;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class h {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19149b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f19150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19151d;

    public h(g gVar) {
        int i10;
        float f10;
        boolean z10;
        Context context = gVar.a;
        this.f19150c = context;
        ActivityManager activityManager = gVar.f19146b;
        if (activityManager.isLowRamDevice()) {
            i10 = 2097152;
        } else {
            i10 = 4194304;
        }
        this.f19151d = i10;
        float memoryClass = activityManager.getMemoryClass() * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (activityManager.isLowRamDevice()) {
            f10 = 0.33f;
        } else {
            f10 = 0.4f;
        }
        int round = Math.round(memoryClass * f10);
        DisplayMetrics displayMetrics = (DisplayMetrics) gVar.f19147c.f26021c;
        float f11 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f12 = gVar.f19148d;
        int round2 = Math.round(f11 * f12);
        int round3 = Math.round(f11 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f19149b = round3;
            this.a = round2;
        } else {
            float f13 = i11 / (f12 + 2.0f);
            this.f19149b = Math.round(2.0f * f13);
            this.a = Math.round(f13 * f12);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, this.f19149b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, this.a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, i10));
            sb2.append(", memory class limited? ");
            if (i12 > round) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, round));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }
}
