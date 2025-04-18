package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformFontLoader f17226a;

    /* renamed from: b, reason: collision with root package name */
    public final PlatformResolveInterceptor f17227b;

    /* renamed from: c, reason: collision with root package name */
    public final TypefaceRequestCache f17228c;
    public final FontListFontFamilyTypefaceAdapter d;
    public final PlatformFontFamilyTypefaceAdapter e;

    /* renamed from: f, reason: collision with root package name */
    public final l f17229f;

    public FontFamilyResolverImpl(AndroidFontLoader androidFontLoader, AndroidFontResolveInterceptor androidFontResolveInterceptor) {
        TypefaceRequestCache typefaceRequestCache = FontFamilyResolverKt.f17239a;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.f17240b);
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter = new PlatformFontFamilyTypefaceAdapter();
        this.f17226a = androidFontLoader;
        this.f17227b = androidFontResolveInterceptor;
        this.f17228c = typefaceRequestCache;
        this.d = fontListFontFamilyTypefaceAdapter;
        this.e = platformFontFamilyTypefaceAdapter;
        this.f17229f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    public final TypefaceResult a(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
        PlatformResolveInterceptor platformResolveInterceptor = this.f17227b;
        platformResolveInterceptor.getClass();
        int i4 = PlatformResolveInterceptor.f17278a;
        FontWeight a2 = platformResolveInterceptor.a(fontWeight);
        this.f17226a.b();
        return b(new TypefaceRequest(fontFamily, a2, i2, i3, null));
    }

    public final TypefaceResult b(TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        TypefaceRequestCache typefaceRequestCache = this.f17228c;
        FontFamilyResolverImpl$resolve$result$1 fontFamilyResolverImpl$resolve$result$1 = new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest);
        synchronized (typefaceRequestCache.f17289a) {
            typefaceResult = (TypefaceResult) typefaceRequestCache.f17290b.a(typefaceRequest);
            if (typefaceResult != null) {
                if (!typefaceResult.h()) {
                }
            }
            try {
                typefaceResult = (TypefaceResult) fontFamilyResolverImpl$resolve$result$1.invoke(new TypefaceRequestCache$runCached$currentTypefaceResult$1(typefaceRequestCache, typefaceRequest));
                synchronized (typefaceRequestCache.f17289a) {
                    if (typefaceRequestCache.f17290b.a(typefaceRequest) == null && typefaceResult.h()) {
                        typefaceRequestCache.f17290b.b(typefaceRequest, typefaceResult);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return typefaceResult;
    }
}
