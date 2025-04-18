package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DecodeHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Parcel f16472a;

    public DecodeHelper(String str) {
        Parcel obtain = Parcel.obtain();
        this.f16472a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final long a() {
        Parcel parcel = this.f16472a;
        byte readByte = parcel.readByte();
        long j2 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        if (!TextUnitType.a(j2, 0L)) {
            return TextUnitKt.d(j2, parcel.readFloat());
        }
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        return TextUnit.f17499c;
    }
}
