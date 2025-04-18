package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.unit.IntRect;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.function.Consumer;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f16742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposeScrollCaptureCallback f16743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f16744c;
    public final /* synthetic */ Rect d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Consumer f16745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, g gVar) {
        super(2, gVar);
        this.f16743b = composeScrollCaptureCallback;
        this.f16744c = scrollCaptureSession;
        this.d = rect;
        this.f16745f = consumer;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.f16743b, this.f16744c, this.d, this.f16745f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16742a;
        if (i2 == 0) {
            q.m(obj);
            Rect rect = this.d;
            IntRect intRect = new IntRect(rect.left, rect.top, rect.right, rect.bottom);
            this.f16742a = 1;
            obj = ComposeScrollCaptureCallback.a(this.f16743b, this.f16744c, intRect, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.f16745f.accept(RectHelper_androidKt.b((IntRect) obj));
        return b0.f30125a;
    }
}
