package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 f16313a = new r(2);

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f16314a = new r(0);

        @Override // q0.a
        public final Object invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass2 f16315a = new r(0);

        @Override // q0.a
        public final Object invoke() {
            return Float.valueOf(0.0f);
        }
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SemanticsConfiguration semanticsConfiguration = ((SemanticsNode) obj).d;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16844o;
        return Integer.valueOf(Float.compare(((Number) semanticsConfiguration.d(semanticsPropertyKey, AnonymousClass1.f16314a)).floatValue(), ((Number) ((SemanticsNode) obj2).d.d(semanticsPropertyKey, AnonymousClass2.f16315a)).floatValue()));
    }
}
