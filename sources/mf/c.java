package mf;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public abstract class c extends Dialog {

    /* renamed from: b, reason: collision with root package name */
    public androidx.databinding.e f22235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, R.style.ThemeDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        androidx.databinding.e c10 = androidx.databinding.b.c(LayoutInflater.from(getContext()), a(), null);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        this.f22235b = c10;
        setContentView(b().f1322i);
    }

    public abstract int a();

    public final androidx.databinding.e b() {
        androidx.databinding.e eVar = this.f22235b;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public void c() {
    }

    public void d() {
    }

    public final void e(Activity activity, float f10) {
        WindowManager.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            activity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            layoutParams.width = (int) (r1.widthPixels * f10);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean equals;
        super.onCreate(bundle);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "<set-?>");
        if (defaultSharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            defaultSharedPreferences = null;
        }
        String string = defaultSharedPreferences.getString("KEY_LANGUAGE", "");
        if (Intrinsics.areEqual(string, "")) {
            Configuration configuration = new Configuration();
            Locale locale = Locale.getDefault();
            Locale.setDefault(locale);
            configuration.locale = locale;
            getContext().getResources().updateConfiguration(configuration, getContext().getResources().getDisplayMetrics());
        } else {
            equals = StringsKt__StringsJVMKt.equals(string, "", true);
            if (!equals) {
                Locale locale2 = new Locale(string);
                Locale.setDefault(locale2);
                Configuration configuration2 = new Configuration();
                configuration2.locale = locale2;
                getContext().getResources().updateConfiguration(configuration2, getContext().getResources().getDisplayMetrics());
            }
        }
        c();
        d();
    }
}
