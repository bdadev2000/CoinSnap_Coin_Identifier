package A6;

import B3.g;
import G7.j;
import U3.k;
import U3.w;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.facebook.internal.O;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.iap.IAPActivity;
import com.tools.arruler.ui.component.language.LanguageActivity;
import com.tools.arruler.ui.component.onboarding.OnBoardingActivity;
import com.tools.arruler.ui.component.tutorial.ArTutorialActivity;
import i1.AbstractC2337c;
import java.util.Locale;
import k.C2413b;
import k.DialogInterfaceC2416e;
import u6.AbstractC2799o;
import z2.i;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80c;

    public /* synthetic */ c(Object obj, int i9) {
        this.b = i9;
        this.f80c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = null;
        Object obj = this.f80c;
        switch (this.b) {
            case 0:
                e eVar = (e) obj;
                j.e(eVar, "this$0");
                eVar.b.f23348q.setChecked(true);
                return;
            case 1:
                int i9 = LanguageActivity.m;
                LanguageActivity languageActivity = (LanguageActivity) obj;
                j.e(languageActivity, "this$0");
                if (languageActivity.f19669k != null) {
                    SharedPreferences n2 = languageActivity.n();
                    M6.a aVar = languageActivity.f19669k;
                    if (aVar != null) {
                        str = aVar.f2007c;
                    }
                    i.p("KEY_LANGUAGE", str, n2);
                    String string = languageActivity.n().getString("KEY_LANGUAGE", "en");
                    if (string != null) {
                        if (string.equals("")) {
                            Configuration configuration = new Configuration();
                            Locale locale = Locale.getDefault();
                            Locale.setDefault(locale);
                            configuration.locale = locale;
                            languageActivity.getResources().updateConfiguration(configuration, languageActivity.getResources().getDisplayMetrics());
                        } else if (!string.equalsIgnoreCase("")) {
                            Locale locale2 = new Locale(string);
                            Locale.setDefault(locale2);
                            Configuration configuration2 = new Configuration();
                            configuration2.locale = locale2;
                            languageActivity.getResources().updateConfiguration(configuration2, languageActivity.getResources().getDisplayMetrics());
                        }
                    }
                    if (languageActivity.getIntent().getBooleanExtra("KEY_SETTING", false)) {
                        Intent intent = new Intent(languageActivity, (Class<?>) HomeActivity.class);
                        intent.putExtra("key_tracking_screen_from", "LanguageActivity");
                        languageActivity.startActivity(intent);
                        languageActivity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    } else {
                        Intent intent2 = new Intent(languageActivity, (Class<?>) OnBoardingActivity.class);
                        intent2.putExtra("key_tracking_screen_from", "LanguageActivity");
                        languageActivity.startActivity(intent2);
                        languageActivity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    }
                    languageActivity.finishAffinity();
                    return;
                }
                Toast.makeText(languageActivity, languageActivity.getResources().getString(R.string.please_select_language), 0).show();
                return;
            case 2:
                int i10 = OnBoardingActivity.f19676j;
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj;
                j.e(onBoardingActivity, "this$0");
                if (((AbstractC2799o) onBoardingActivity.k()).f23365A.getCurrentItem() < onBoardingActivity.f19680i.size() - 1) {
                    ViewPager2 viewPager2 = ((AbstractC2799o) onBoardingActivity.k()).f23365A;
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                    return;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("IAP_FROM_MAIN", false);
                    onBoardingActivity.s(IAPActivity.class, bundle);
                    onBoardingActivity.finish();
                    return;
                }
            case 3:
                U3.d dVar = (U3.d) obj;
                EditText editText = dVar.f3145i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.q();
                    return;
                }
                return;
            case 4:
                ((k) obj).u();
                return;
            case 5:
                w wVar = (w) obj;
                EditText editText2 = wVar.f3231f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = wVar.f3231f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        wVar.f3231f.setTransformationMethod(null);
                    } else {
                        wVar.f3231f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        wVar.f3231f.setSelection(selectionEnd);
                    }
                    wVar.q();
                    return;
                }
                return;
            case 6:
                int i11 = ArTutorialActivity.f19737g;
                ArTutorialActivity arTutorialActivity = (ArTutorialActivity) obj;
                j.e(arTutorialActivity, "this$0");
                arTutorialActivity.finish();
                return;
            case 7:
                ((MaxNativeAd) obj).performClick();
                return;
            case 8:
                O o3 = (O) obj;
                j.e(o3, "this$0");
                o3.cancel();
                return;
            case 9:
                com.facebook.login.j jVar = (com.facebook.login.j) obj;
                j.e(jVar, "this$0");
                jVar.e();
                return;
            case 10:
                ((com.google.android.material.datepicker.k) obj).c();
                throw null;
            default:
                int i12 = DefaultErrorActivity.f5457c;
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) obj;
                defaultErrorActivity.getClass();
                g gVar = new g(defaultErrorActivity);
                C2413b c2413b = (C2413b) gVar.f286d;
                c2413b.f21264d = c2413b.f21262a.getText(R.string.customactivityoncrash_error_activity_error_details_title);
                c2413b.f21266f = AbstractC2337c.b(defaultErrorActivity, defaultErrorActivity.getIntent());
                Context context = c2413b.f21262a;
                c2413b.f21267g = context.getText(R.string.customactivityoncrash_error_activity_error_details_close);
                c2413b.f21268h = null;
                com.facebook.login.g gVar2 = new com.facebook.login.g(defaultErrorActivity, 2);
                c2413b.f21269i = context.getText(R.string.customactivityoncrash_error_activity_error_details_copy);
                c2413b.f21270j = gVar2;
                DialogInterfaceC2416e b = gVar.b();
                b.show();
                TextView textView = (TextView) b.findViewById(android.R.id.message);
                if (textView != null) {
                    textView.setTextSize(0, defaultErrorActivity.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
                    return;
                }
                return;
        }
    }
}
