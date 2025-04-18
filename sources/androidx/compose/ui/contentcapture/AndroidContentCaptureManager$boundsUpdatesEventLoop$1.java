package androidx.compose.ui.contentcapture;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {Opcodes.INVOKEDYNAMIC, 196}, m = "boundsUpdatesEventLoop$ui_release")
/* loaded from: classes4.dex */
public final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AndroidContentCaptureManager f14762a;

    /* renamed from: b, reason: collision with root package name */
    public d1.a f14763b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14764c;
    public final /* synthetic */ AndroidContentCaptureManager d;

    /* renamed from: f, reason: collision with root package name */
    public int f14765f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, g gVar) {
        super(gVar);
        this.d = androidContentCaptureManager;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f14764c = obj;
        this.f14765f |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
