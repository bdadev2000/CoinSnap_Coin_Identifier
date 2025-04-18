package androidx.compose.ui.text;

import android.util.Log;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import java.util.Locale;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$LocaleSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$LocaleSaver$2 f16990a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        PlatformLocaleKt.f17404a.getClass();
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (a.g(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return new androidx.compose.ui.text.intl.Locale(forLanguageTag);
    }
}
