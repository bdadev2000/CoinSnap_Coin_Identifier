package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.unit.IntRect;
import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {Opcodes.LOR, Opcodes.IINC}, m = "onScrollCaptureImageRequest")
/* loaded from: classes3.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends c {

    /* renamed from: a, reason: collision with root package name */
    public ComposeScrollCaptureCallback f16746a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16747b;

    /* renamed from: c, reason: collision with root package name */
    public IntRect f16748c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f16749f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComposeScrollCaptureCallback f16751h;

    /* renamed from: i, reason: collision with root package name */
    public int f16752i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(ComposeScrollCaptureCallback composeScrollCaptureCallback, g gVar) {
        super(gVar);
        this.f16751h = composeScrollCaptureCallback;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16750g = obj;
        this.f16752i |= Integer.MIN_VALUE;
        return ComposeScrollCaptureCallback.a(this.f16751h, null, null, this);
    }
}
