package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.Api;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DeadKeyCombiner {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5961a;

    public final Integer a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.f5961a = Integer.valueOf(unicodeChar & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return null;
        }
        Integer num = this.f5961a;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.f5961a = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        return num2 == null ? Integer.valueOf(unicodeChar) : num2;
    }
}
