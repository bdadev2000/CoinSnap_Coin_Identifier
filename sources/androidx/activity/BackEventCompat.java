package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
public final class BackEventCompat {

    /* renamed from: a, reason: collision with root package name */
    public final float f133a;

    /* renamed from: b, reason: collision with root package name */
    public final float f134b;

    /* renamed from: c, reason: collision with root package name */
    public final float f135c;
    public final int d;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface SwipeEdge {
    }

    public BackEventCompat(BackEvent backEvent) {
        p0.a.s(backEvent, "backEvent");
        Api34Impl api34Impl = Api34Impl.f132a;
        float d = api34Impl.d(backEvent);
        float e = api34Impl.e(backEvent);
        float b2 = api34Impl.b(backEvent);
        int c2 = api34Impl.c(backEvent);
        this.f133a = d;
        this.f134b = e;
        this.f135c = b2;
        this.d = c2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f133a);
        sb.append(", touchY=");
        sb.append(this.f134b);
        sb.append(", progress=");
        sb.append(this.f135c);
        sb.append(", swipeEdge=");
        return android.support.v4.media.d.o(sb, this.d, '}');
    }
}
