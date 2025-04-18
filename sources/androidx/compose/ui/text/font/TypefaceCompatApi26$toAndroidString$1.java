package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TypefaceCompatApi26$toAndroidString$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f17284a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceCompatApi26$toAndroidString$1(Density density) {
        super(1);
        this.f17284a = density;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        FontVariation.Setting setting = (FontVariation.Setting) obj;
        StringBuilder sb = new StringBuilder("'null' ");
        setting.c();
        sb.append(setting.b(this.f17284a));
        return sb.toString();
    }
}
