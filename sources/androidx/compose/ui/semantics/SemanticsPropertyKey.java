package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.r;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SemanticsPropertyKey<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f16868a;

    /* renamed from: b, reason: collision with root package name */
    public final p f16869b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16870c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f16871a = new r(2);

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public /* synthetic */ SemanticsPropertyKey(String str) {
        this(str, AnonymousClass1.f16871a);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f16868a;
    }

    public SemanticsPropertyKey(String str, p pVar) {
        this.f16868a = str;
        this.f16869b = pVar;
    }

    public SemanticsPropertyKey(String str, boolean z2, p pVar) {
        this(str, pVar);
        this.f16870c = z2;
    }
}
