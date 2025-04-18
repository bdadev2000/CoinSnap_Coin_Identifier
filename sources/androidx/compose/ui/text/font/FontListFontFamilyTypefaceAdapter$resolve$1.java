package androidx.compose.ui.text.font;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FontListFontFamilyTypefaceAdapter$resolve$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f17258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f17259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$resolve$1(AsyncFontListLoader asyncFontListLoader, g gVar) {
        super(2, gVar);
        this.f17259b = asyncFontListLoader;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new FontListFontFamilyTypefaceAdapter$resolve$1(this.f17259b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f17258a;
        if (i2 == 0) {
            q.m(obj);
            this.f17258a = 1;
            if (this.f17259b.a(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
