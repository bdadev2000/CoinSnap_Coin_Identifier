package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
public final class Api34Impl {

    /* renamed from: a, reason: collision with root package name */
    public static final Api34Impl f132a = new Object();

    @DoNotInline
    @NotNull
    public final BackEvent a(float f2, float f3, float f4, int i2) {
        return new BackEvent(f2, f3, f4, i2);
    }

    @DoNotInline
    public final float b(@NotNull BackEvent backEvent) {
        p0.a.s(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @DoNotInline
    public final int c(@NotNull BackEvent backEvent) {
        p0.a.s(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @DoNotInline
    public final float d(@NotNull BackEvent backEvent) {
        p0.a.s(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @DoNotInline
    public final float e(@NotNull BackEvent backEvent) {
        p0.a.s(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
