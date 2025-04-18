package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import org.objectweb.asm.signature.SignatureVisitor;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SelectableInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f7079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7081c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final TextLayoutResult f7082f;

    public SelectableInfo(long j2, int i2, int i3, int i4, int i5, TextLayoutResult textLayoutResult) {
        this.f7079a = j2;
        this.f7080b = i2;
        this.f7081c = i3;
        this.d = i4;
        this.e = i5;
        this.f7082f = textLayoutResult;
    }

    public final Selection.AnchorInfo a(int i2) {
        return new Selection.AnchorInfo(SelectionLayoutKt.a(this.f7082f, i2), i2, this.f7079a);
    }

    public final CrossStatus b() {
        int i2 = this.f7081c;
        int i3 = this.d;
        return i2 < i3 ? CrossStatus.f7054b : i2 > i3 ? CrossStatus.f7053a : CrossStatus.f7055c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.f7079a);
        sb.append(", range=(");
        int i2 = this.f7081c;
        sb.append(i2);
        sb.append(SignatureVisitor.SUPER);
        TextLayoutResult textLayoutResult = this.f7082f;
        sb.append(SelectionLayoutKt.a(textLayoutResult, i2));
        sb.append(',');
        int i3 = this.d;
        sb.append(i3);
        sb.append(SignatureVisitor.SUPER);
        sb.append(SelectionLayoutKt.a(textLayoutResult, i3));
        sb.append("), prevOffset=");
        return d.o(sb, this.e, ')');
    }
}
