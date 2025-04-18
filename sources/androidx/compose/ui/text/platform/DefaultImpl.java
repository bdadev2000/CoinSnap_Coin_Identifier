package androidx.compose.ui.text.platform;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.emoji2.text.EmojiCompat;

/* loaded from: classes4.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {

    /* renamed from: a, reason: collision with root package name */
    public State f17426a;

    public final State a() {
        final ParcelableSnapshotMutableState f2;
        EmojiCompat a2 = EmojiCompat.a();
        if (a2.d() == 1) {
            return new ImmutableBool(true);
        }
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        a2.l(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public final void a() {
                this.f17426a = EmojiCompatStatus_androidKt.f17431a;
            }

            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public final void b() {
                f2.setValue(Boolean.TRUE);
                this.f17426a = new ImmutableBool(true);
            }
        });
        return f2;
    }
}
