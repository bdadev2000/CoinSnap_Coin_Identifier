package androidx.compose.foundation.text;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1(TextLinkScope textLinkScope, AnnotatedString annotatedString) {
        super(0);
        this.f5722a = textLinkScope;
        this.f5723b = annotatedString;
    }

    @Override // q0.a
    public final Object invoke() {
        AnnotatedString f2;
        TextLinkScope textLinkScope = this.f5722a;
        if (textLinkScope != null) {
            SnapshotStateList snapshotStateList = textLinkScope.d;
            if (snapshotStateList.isEmpty()) {
                f2 = textLinkScope.f6215c;
            } else {
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                builder.b(textLinkScope.f6213a);
                TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(builder);
                int size = snapshotStateList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l) snapshotStateList.get(i2)).invoke(textAnnotatorScope);
                }
                f2 = builder.f();
            }
            textLinkScope.f6215c = f2;
            if (f2 != null) {
                return f2;
            }
        }
        return this.f5723b;
    }
}
