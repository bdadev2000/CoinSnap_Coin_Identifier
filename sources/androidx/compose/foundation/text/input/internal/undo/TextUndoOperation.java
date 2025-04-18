package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextUndoOperation {

    /* renamed from: i, reason: collision with root package name */
    public static final TextUndoOperation$Companion$Saver$1 f6876i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f6877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6878b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6879c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6880f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6881g;

    /* renamed from: h, reason: collision with root package name */
    public final TextEditType f6882h;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2, int i3) {
        j4 = (i3 & 32) != 0 ? System.currentTimeMillis() : j4;
        z2 = (i3 & 64) != 0 ? true : z2;
        this.f6877a = i2;
        this.f6878b = str;
        this.f6879c = str2;
        this.d = j2;
        this.e = j3;
        this.f6880f = j4;
        this.f6881g = z2;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f6882h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.f6872c : TextEditType.f6871b : TextEditType.f6870a;
    }

    public final TextDeleteType a() {
        TextEditType textEditType = TextEditType.f6871b;
        TextDeleteType textDeleteType = TextDeleteType.d;
        if (this.f6882h != textEditType) {
            return textDeleteType;
        }
        long j2 = this.e;
        if (!TextRange.c(j2)) {
            return textDeleteType;
        }
        long j3 = this.d;
        return TextRange.c(j3) ? ((int) (j3 >> 32)) > ((int) (j2 >> 32)) ? TextDeleteType.f6866a : TextDeleteType.f6867b : (((int) (j3 >> 32)) == ((int) (j2 >> 32)) && ((int) (j3 >> 32)) == this.f6877a) ? TextDeleteType.f6868c : textDeleteType;
    }
}
