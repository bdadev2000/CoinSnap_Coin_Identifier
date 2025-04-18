package androidx.compose.ui.platform;

import android.os.Parcel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

@StabilityInferred
/* loaded from: classes3.dex */
public final class EncodeHelper {

    /* renamed from: a, reason: collision with root package name */
    public Parcel f16487a;

    public final void a(byte b2) {
        this.f16487a.writeByte(b2);
    }

    public final void b(float f2) {
        this.f16487a.writeFloat(f2);
    }

    public final void c(long j2) {
        long b2 = TextUnit.b(j2);
        byte b3 = 0;
        if (!TextUnitType.a(b2, 0L)) {
            if (TextUnitType.a(b2, 4294967296L)) {
                b3 = 1;
            } else if (TextUnitType.a(b2, 8589934592L)) {
                b3 = 2;
            }
        }
        a(b3);
        if (TextUnitType.a(TextUnit.b(j2), 0L)) {
            return;
        }
        b(TextUnit.c(j2));
    }
}
