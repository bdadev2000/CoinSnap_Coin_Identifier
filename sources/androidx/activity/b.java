package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class b {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f564b;

    /* renamed from: c, reason: collision with root package name */
    public final float f565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f566d;

    public b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        a aVar = a.a;
        float d10 = aVar.d(backEvent);
        float e2 = aVar.e(backEvent);
        float b3 = aVar.b(backEvent);
        int c10 = aVar.c(backEvent);
        this.a = d10;
        this.f564b = e2;
        this.f565c = b3;
        this.f566d = c10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.a);
        sb2.append(", touchY=");
        sb2.append(this.f564b);
        sb2.append(", progress=");
        sb2.append(this.f565c);
        sb2.append(", swipeEdge=");
        return a4.j.i(sb2, this.f566d, AbstractJsonLexerKt.END_OBJ);
    }
}
