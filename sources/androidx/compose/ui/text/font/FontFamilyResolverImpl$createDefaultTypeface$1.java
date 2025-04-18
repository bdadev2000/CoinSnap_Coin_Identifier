package androidx.compose.ui.text.font;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f17230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.f17230a = fontFamilyResolverImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return this.f17230a.b(new TypefaceRequest(null, typefaceRequest.f17287b, typefaceRequest.f17288c, typefaceRequest.d, typefaceRequest.e)).getValue();
    }
}
