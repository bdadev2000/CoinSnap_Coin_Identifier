package androidx.compose.ui.text.platform.style;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class ShaderBrushSpan$shaderState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShaderBrushSpan f17446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShaderBrushSpan$shaderState$1(ShaderBrushSpan shaderBrushSpan) {
        super(0);
        this.f17446a = shaderBrushSpan;
    }

    @Override // q0.a
    public final Object invoke() {
        ShaderBrushSpan shaderBrushSpan = this.f17446a;
        if (((Size) shaderBrushSpan.f17445c.getValue()).f14923a != 9205357640488583168L) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = shaderBrushSpan.f17445c;
            if (!Size.e(((Size) parcelableSnapshotMutableState.getValue()).f14923a)) {
                return shaderBrushSpan.f17443a.b(((Size) parcelableSnapshotMutableState.getValue()).f14923a);
            }
        }
        return null;
    }
}
