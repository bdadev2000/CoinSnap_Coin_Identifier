package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final ShaderBrush f17443a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17444b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17445c;
    public final State d;

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f2) {
        ParcelableSnapshotMutableState f3;
        this.f17443a = shaderBrush;
        this.f17444b = f2;
        f3 = SnapshotStateKt.f(new Size(9205357640488583168L), StructuralEqualityPolicy.f14078a);
        this.f17445c = f3;
        this.d = SnapshotStateKt.e(new ShaderBrushSpan$shaderState$1(this));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.a(textPaint, this.f17444b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
