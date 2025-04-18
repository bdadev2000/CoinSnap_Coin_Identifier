package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class HtmlCompat {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        @DoNotInline
        public static Spanned a(String str, int i2) {
            return Html.fromHtml(str, i2);
        }

        @DoNotInline
        public static Spanned b(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i2, imageGetter, tagHandler);
        }

        @DoNotInline
        public static String c(Spanned spanned, int i2) {
            return Html.toHtml(spanned, i2);
        }
    }
}
