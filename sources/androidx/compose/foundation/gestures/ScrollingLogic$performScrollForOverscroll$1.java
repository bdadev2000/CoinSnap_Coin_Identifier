package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLogic$performScrollForOverscroll$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3506a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$performScrollForOverscroll$1(ScrollingLogic scrollingLogic) {
        super(1);
        this.f3506a = scrollingLogic;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        ScrollingLogic scrollingLogic = this.f3506a;
        return new Offset(ScrollingLogic.a(scrollingLogic, scrollingLogic.f3487h, j2, scrollingLogic.f3486g));
    }
}
