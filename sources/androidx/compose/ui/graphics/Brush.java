package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import java.util.List;

@Immutable
/* loaded from: classes3.dex */
public abstract class Brush {

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static LinearGradient a(List list, long j2, long j3, int i2) {
            if ((i2 & 2) != 0) {
                j2 = 0;
            }
            long j4 = j2;
            if ((i2 & 4) != 0) {
                j3 = 9187343241974906880L;
            }
            return new LinearGradient(list, null, j4, j3, 0);
        }
    }

    public abstract void a(float f2, long j2, Paint paint);
}
