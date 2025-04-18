package androidx.compose.ui.text.font;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$resolve$result$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f17237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypefaceRequest f17238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        super(1);
        this.f17237a = fontFamilyResolverImpl;
        this.f17238b = typefaceRequest;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        l lVar = (l) obj;
        FontFamilyResolverImpl fontFamilyResolverImpl = this.f17237a;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = fontFamilyResolverImpl.d;
        l lVar2 = fontFamilyResolverImpl.f17229f;
        TypefaceRequest typefaceRequest = this.f17238b;
        PlatformFontLoader platformFontLoader = fontFamilyResolverImpl.f17226a;
        TypefaceResult a2 = fontListFontFamilyTypefaceAdapter.a(typefaceRequest, platformFontLoader, lVar, lVar2);
        if (a2 == null && (a2 = fontFamilyResolverImpl.e.a(typefaceRequest, platformFontLoader, lVar, lVar2)) == null) {
            throw new IllegalStateException("Could not load font");
        }
        return a2;
    }
}
