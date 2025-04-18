package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;

/* loaded from: classes2.dex */
public final class TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 implements ColorProducer, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f12055a;

    public TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(w wVar) {
        this.f12055a = wVar;
    }

    @Override // androidx.compose.ui.graphics.ColorProducer
    public final /* synthetic */ long a() {
        return ((Color) this.f12055a.invoke()).f14964a;
    }

    @Override // kotlin.jvm.internal.l
    public final d0.c c() {
        return this.f12055a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ColorProducer) || !(obj instanceof l)) {
            return false;
        }
        return p0.a.g(this.f12055a, ((l) obj).c());
    }

    public final int hashCode() {
        return this.f12055a.hashCode();
    }
}
