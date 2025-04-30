package f;

import android.window.BackEvent;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2251a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2251a f20209a = new Object();

    public final BackEvent a(float f9, float f10, float f11, int i9) {
        return new BackEvent(f9, f10, f11, i9);
    }

    public final float b(BackEvent backEvent) {
        G7.j.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        G7.j.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        G7.j.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        G7.j.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
