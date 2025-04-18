package androidx.core.content;

import android.content.ClipData;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;

/* loaded from: classes3.dex */
public class IntentSanitizer {

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api29Impl {
        @DoNotInline
        public static String a(Intent intent) {
            return intent.getIdentifier();
        }

        @DoNotInline
        public static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api31Impl {
        @DoNotInline
        public static void a(int i2, ClipData.Item item, Consumer<String> consumer) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            consumer.accept("ClipData item at position " + i2 + " contains htmlText, textLinks or intent: " + item);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
    }
}
