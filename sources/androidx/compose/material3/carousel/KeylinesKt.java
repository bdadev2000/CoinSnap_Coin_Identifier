package androidx.compose.material3.carousel;

/* loaded from: classes4.dex */
public final class KeylinesKt {
    public static final KeylineList a(float f2, float f3, float f4, float f5, Arrangement arrangement) {
        KeylinesKt$createLeftAlignedKeylineList$1 keylinesKt$createLeftAlignedKeylineList$1 = new KeylinesKt$createLeftAlignedKeylineList$1(f4, arrangement, f5);
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        keylinesKt$createLeftAlignedKeylineList$1.invoke(keylineListScopeImpl);
        int c2 = keylineListScopeImpl.c();
        int i2 = keylineListScopeImpl.f12732a;
        float f6 = keylineListScopeImpl.f12733b;
        return new KeylineList(KeylineListScopeImpl.b(i2, f6 / 2, i2, c2, f6, f2, f3, keylineListScopeImpl.f12734c));
    }
}
