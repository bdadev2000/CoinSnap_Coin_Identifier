package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.EditCommand;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class RecordingInputConnection$performHandwritingGesture$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecordingInputConnection f6479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingInputConnection$performHandwritingGesture$1(RecordingInputConnection recordingInputConnection) {
        super(1);
        this.f6479a = recordingInputConnection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f6479a.b((EditCommand) obj);
        return b0.f30125a;
    }
}
