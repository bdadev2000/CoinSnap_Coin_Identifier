package androidx.compose.foundation.content;

import android.content.ClipData;
import androidx.compose.ui.platform.ClipEntry;
import p0.a;

/* loaded from: classes3.dex */
public final class TransferableContent_androidKt {
    public static final String a(ClipEntry clipEntry) {
        ClipData clipData;
        int itemCount = clipEntry.f16424a.getItemCount();
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            clipData = clipEntry.f16424a;
            if (i2 >= itemCount) {
                break;
            }
            z2 = z2 || clipData.getItemAt(i2).getText() != null;
            i2++;
        }
        if (!z2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipData.getItemCount();
        boolean z3 = false;
        for (int i3 = 0; i3 < itemCount2; i3++) {
            CharSequence text = clipData.getItemAt(i3).getText();
            if (text != null) {
                if (z3) {
                    sb.append("\n");
                }
                sb.append(text);
                z3 = true;
            }
        }
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
