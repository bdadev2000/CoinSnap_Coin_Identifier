package androidx.compose.ui.semantics;

/* loaded from: classes2.dex */
public final class SemanticsConfigurationKt {
    public static final Object a(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey semanticsPropertyKey) {
        Object obj = semanticsConfiguration.f16815a.get(semanticsPropertyKey);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
