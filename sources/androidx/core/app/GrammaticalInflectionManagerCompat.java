package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class GrammaticalInflectionManagerCompat {

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api34Impl {
        @DoNotInline
        public static int a(Context context) {
            return ((GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class)).getApplicationGrammaticalGender();
        }

        @DoNotInline
        public static void b(Context context, int i2) {
            ((GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class)).setRequestedApplicationGrammaticalGender(i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface GrammaticalGender {
    }
}
