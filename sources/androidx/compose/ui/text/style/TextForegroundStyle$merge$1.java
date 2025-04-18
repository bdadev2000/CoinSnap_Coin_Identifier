package androidx.compose.ui.text.style;

import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextForegroundStyle$merge$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextForegroundStyle f17469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextForegroundStyle$merge$1(TextForegroundStyle textForegroundStyle) {
        super(0);
        this.f17469a = textForegroundStyle;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(this.f17469a.a());
    }
}
