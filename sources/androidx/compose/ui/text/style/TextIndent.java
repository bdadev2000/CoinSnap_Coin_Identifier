package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

@Immutable
/* loaded from: classes3.dex */
public final class TextIndent {

    /* renamed from: c, reason: collision with root package name */
    public static final TextIndent f17474c = new TextIndent(TextUnitKt.b(0), TextUnitKt.b(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f17475a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17476b;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public TextIndent(long j2, long j3) {
        this.f17475a = j2;
        this.f17476b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.a(this.f17475a, textIndent.f17475a) && TextUnit.a(this.f17476b, textIndent.f17476b);
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        return Long.hashCode(this.f17476b) + (Long.hashCode(this.f17475a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.d(this.f17475a)) + ", restLine=" + ((Object) TextUnit.d(this.f17476b)) + ')';
    }
}
