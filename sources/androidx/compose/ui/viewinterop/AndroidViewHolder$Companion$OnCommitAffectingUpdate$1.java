package androidx.compose.ui.viewinterop;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 f17528a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        AndroidViewHolder androidViewHolder = (AndroidViewHolder) obj;
        androidViewHolder.getHandler().post(new a(androidViewHolder.f17520o, 0));
        return b0.f30125a;
    }
}
