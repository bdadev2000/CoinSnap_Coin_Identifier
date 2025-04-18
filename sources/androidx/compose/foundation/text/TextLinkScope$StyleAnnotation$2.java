package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import java.util.Arrays;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextLinkScope$StyleAnnotation$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f6230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f6231c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$StyleAnnotation$2(TextLinkScope textLinkScope, Object[] objArr, l lVar, int i2) {
        super(2);
        this.f6229a = textLinkScope;
        this.f6230b = objArr;
        this.f6231c = lVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Object[] objArr = this.f6230b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        this.f6229a.b(copyOf, this.f6231c, (Composer) obj, a2);
        return b0.f30125a;
    }
}
