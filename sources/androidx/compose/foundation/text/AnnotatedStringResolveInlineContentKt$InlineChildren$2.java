package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.AnnotatedString;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringResolveInlineContentKt$InlineChildren$2(AnnotatedString annotatedString, List list, int i2) {
        super(2);
        this.f5413a = annotatedString;
        this.f5414b = list;
        this.f5415c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f5415c | 1);
        AnnotatedStringResolveInlineContentKt.a(this.f5413a, this.f5414b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
