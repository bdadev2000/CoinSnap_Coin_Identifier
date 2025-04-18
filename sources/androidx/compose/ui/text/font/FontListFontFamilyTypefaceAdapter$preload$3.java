package androidx.compose.ui.text.font;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", l = {Opcodes.LNEG}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FontListFontFamilyTypefaceAdapter$preload$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f17245a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f17247c;
    public final /* synthetic */ FontListFontFamilyTypefaceAdapter d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PlatformFontLoader f17248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3(List list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, g gVar) {
        super(2, gVar);
        this.f17247c = list;
        this.d = fontListFontFamilyTypefaceAdapter;
        this.f17248f = platformFontLoader;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.f17247c, this.d, this.f17248f, gVar);
        fontListFontFamilyTypefaceAdapter$preload$3.f17246b = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f17245a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f17246b;
            List list = this.f17247c;
            HashSet hashSet = new HashSet(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj2 = list.get(i3);
                if (hashSet.add((Font) obj2)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(kotlin.jvm.internal.e.f(d0Var, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.d, (Font) arrayList.get(i4), this.f17248f, null), 3));
            }
            this.f17245a = 1;
            if (p0.a.p0(arrayList2, this) == aVar) {
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
