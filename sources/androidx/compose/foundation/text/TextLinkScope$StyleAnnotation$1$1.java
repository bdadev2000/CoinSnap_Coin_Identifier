package androidx.compose.foundation.text;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TextLinkScope$StyleAnnotation$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f6228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$StyleAnnotation$1$1(TextLinkScope textLinkScope, l lVar) {
        super(1);
        this.f6227a = textLinkScope;
        this.f6228b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final TextLinkScope textLinkScope = this.f6227a;
        SnapshotStateList snapshotStateList = textLinkScope.d;
        final l lVar = this.f6228b;
        snapshotStateList.add(lVar);
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                TextLinkScope.this.d.remove(lVar);
            }
        };
    }
}
