package com.tools.arruler.ui.component.setting;

import D6.c;
import F7.l;
import G7.j;
import a7.b;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.d;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.language.LanguageActivity;
import com.tools.arruler.ui.component.setting.SettingActivity;
import g4.AbstractC2292b;
import t7.C2720i;
import t7.y;
import u6.AbstractC2804u;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class SettingActivity extends AbstractActivityC2926b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19700f = 0;

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_setting;
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        LinearLayout linearLayout = ((AbstractC2804u) k()).f23421r;
        j.d(linearLayout, "linearLanguage");
        final int i9 = 0;
        d.I(linearLayout, new l(this) { // from class: V6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SettingActivity f3503c;

            {
                this.f3503c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                y yVar = y.f23029a;
                SettingActivity settingActivity = this.f3503c;
                int i10 = i9;
                int i11 = SettingActivity.f19700f;
                switch (i10) {
                    case 0:
                        j.e(settingActivity, "this$0");
                        Intent intent = new Intent(settingActivity, (Class<?>) LanguageActivity.class);
                        intent.putExtras(AbstractC2292b.b(new C2720i("KEY_SETTING", Boolean.TRUE)));
                        settingActivity.startActivity(intent);
                        return yVar;
                    case 1:
                        j.e(settingActivity, "this$0");
                        b bVar = b.f4076f;
                        if (bVar != null) {
                            if (((SharedPreferences) bVar.f4078d).getBoolean("IS_RATE", false)) {
                                Toast.makeText(settingActivity, settingActivity.getString(R.string.txt_thanks_you_for_rating), 0).show();
                            } else {
                                try {
                                    new c(settingActivity, new C6.a(settingActivity, 8)).show();
                                } catch (WindowManager.BadTokenException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return yVar;
                        }
                        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                    case 2:
                        j.e(settingActivity, "this$0");
                        settingActivity.finish();
                        return yVar;
                    case 3:
                        j.e(settingActivity, "this$0");
                        try {
                            Intent intent2 = new Intent("android.intent.action.SEND");
                            intent2.setType("text/plain");
                            intent2.putExtra("android.intent.extra.SUBJECT", settingActivity.getString(R.string.app_name));
                            intent2.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=com.tools.arruler.photomeasure.camera.ruler");
                            settingActivity.startActivity(Intent.createChooser(intent2, "Choose one"));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                        return yVar;
                    default:
                        j.e(settingActivity, "this$0");
                        Uri parse = Uri.parse("https://sites.google.com/view/tdapplication");
                        j.d(parse, "parse(...)");
                        Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                        if (intent3.resolveActivity(settingActivity.getPackageManager()) != null) {
                            settingActivity.startActivity(intent3);
                        }
                        return yVar;
                }
            }
        });
        LinearLayout linearLayout2 = ((AbstractC2804u) k()).f23423t;
        j.d(linearLayout2, "linearRate");
        final int i10 = 1;
        d.I(linearLayout2, new l(this) { // from class: V6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SettingActivity f3503c;

            {
                this.f3503c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                y yVar = y.f23029a;
                SettingActivity settingActivity = this.f3503c;
                int i102 = i10;
                int i11 = SettingActivity.f19700f;
                switch (i102) {
                    case 0:
                        j.e(settingActivity, "this$0");
                        Intent intent = new Intent(settingActivity, (Class<?>) LanguageActivity.class);
                        intent.putExtras(AbstractC2292b.b(new C2720i("KEY_SETTING", Boolean.TRUE)));
                        settingActivity.startActivity(intent);
                        return yVar;
                    case 1:
                        j.e(settingActivity, "this$0");
                        b bVar = b.f4076f;
                        if (bVar != null) {
                            if (((SharedPreferences) bVar.f4078d).getBoolean("IS_RATE", false)) {
                                Toast.makeText(settingActivity, settingActivity.getString(R.string.txt_thanks_you_for_rating), 0).show();
                            } else {
                                try {
                                    new c(settingActivity, new C6.a(settingActivity, 8)).show();
                                } catch (WindowManager.BadTokenException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return yVar;
                        }
                        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                    case 2:
                        j.e(settingActivity, "this$0");
                        settingActivity.finish();
                        return yVar;
                    case 3:
                        j.e(settingActivity, "this$0");
                        try {
                            Intent intent2 = new Intent("android.intent.action.SEND");
                            intent2.setType("text/plain");
                            intent2.putExtra("android.intent.extra.SUBJECT", settingActivity.getString(R.string.app_name));
                            intent2.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=com.tools.arruler.photomeasure.camera.ruler");
                            settingActivity.startActivity(Intent.createChooser(intent2, "Choose one"));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                        return yVar;
                    default:
                        j.e(settingActivity, "this$0");
                        Uri parse = Uri.parse("https://sites.google.com/view/tdapplication");
                        j.d(parse, "parse(...)");
                        Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                        if (intent3.resolveActivity(settingActivity.getPackageManager()) != null) {
                            settingActivity.startActivity(intent3);
                        }
                        return yVar;
                }
            }
        });
        AppCompatImageView appCompatImageView = ((AbstractC2804u) k()).f23420q;
        j.d(appCompatImageView, "imvBack");
        final int i11 = 2;
        d.I(appCompatImageView, new l(this) { // from class: V6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SettingActivity f3503c;

            {
                this.f3503c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                y yVar = y.f23029a;
                SettingActivity settingActivity = this.f3503c;
                int i102 = i11;
                int i112 = SettingActivity.f19700f;
                switch (i102) {
                    case 0:
                        j.e(settingActivity, "this$0");
                        Intent intent = new Intent(settingActivity, (Class<?>) LanguageActivity.class);
                        intent.putExtras(AbstractC2292b.b(new C2720i("KEY_SETTING", Boolean.TRUE)));
                        settingActivity.startActivity(intent);
                        return yVar;
                    case 1:
                        j.e(settingActivity, "this$0");
                        b bVar = b.f4076f;
                        if (bVar != null) {
                            if (((SharedPreferences) bVar.f4078d).getBoolean("IS_RATE", false)) {
                                Toast.makeText(settingActivity, settingActivity.getString(R.string.txt_thanks_you_for_rating), 0).show();
                            } else {
                                try {
                                    new c(settingActivity, new C6.a(settingActivity, 8)).show();
                                } catch (WindowManager.BadTokenException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return yVar;
                        }
                        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                    case 2:
                        j.e(settingActivity, "this$0");
                        settingActivity.finish();
                        return yVar;
                    case 3:
                        j.e(settingActivity, "this$0");
                        try {
                            Intent intent2 = new Intent("android.intent.action.SEND");
                            intent2.setType("text/plain");
                            intent2.putExtra("android.intent.extra.SUBJECT", settingActivity.getString(R.string.app_name));
                            intent2.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=com.tools.arruler.photomeasure.camera.ruler");
                            settingActivity.startActivity(Intent.createChooser(intent2, "Choose one"));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                        return yVar;
                    default:
                        j.e(settingActivity, "this$0");
                        Uri parse = Uri.parse("https://sites.google.com/view/tdapplication");
                        j.d(parse, "parse(...)");
                        Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                        if (intent3.resolveActivity(settingActivity.getPackageManager()) != null) {
                            settingActivity.startActivity(intent3);
                        }
                        return yVar;
                }
            }
        });
        LinearLayout linearLayout3 = ((AbstractC2804u) k()).f23424u;
        j.d(linearLayout3, "linearShare");
        final int i12 = 3;
        d.I(linearLayout3, new l(this) { // from class: V6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SettingActivity f3503c;

            {
                this.f3503c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                y yVar = y.f23029a;
                SettingActivity settingActivity = this.f3503c;
                int i102 = i12;
                int i112 = SettingActivity.f19700f;
                switch (i102) {
                    case 0:
                        j.e(settingActivity, "this$0");
                        Intent intent = new Intent(settingActivity, (Class<?>) LanguageActivity.class);
                        intent.putExtras(AbstractC2292b.b(new C2720i("KEY_SETTING", Boolean.TRUE)));
                        settingActivity.startActivity(intent);
                        return yVar;
                    case 1:
                        j.e(settingActivity, "this$0");
                        b bVar = b.f4076f;
                        if (bVar != null) {
                            if (((SharedPreferences) bVar.f4078d).getBoolean("IS_RATE", false)) {
                                Toast.makeText(settingActivity, settingActivity.getString(R.string.txt_thanks_you_for_rating), 0).show();
                            } else {
                                try {
                                    new c(settingActivity, new C6.a(settingActivity, 8)).show();
                                } catch (WindowManager.BadTokenException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return yVar;
                        }
                        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                    case 2:
                        j.e(settingActivity, "this$0");
                        settingActivity.finish();
                        return yVar;
                    case 3:
                        j.e(settingActivity, "this$0");
                        try {
                            Intent intent2 = new Intent("android.intent.action.SEND");
                            intent2.setType("text/plain");
                            intent2.putExtra("android.intent.extra.SUBJECT", settingActivity.getString(R.string.app_name));
                            intent2.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=com.tools.arruler.photomeasure.camera.ruler");
                            settingActivity.startActivity(Intent.createChooser(intent2, "Choose one"));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                        return yVar;
                    default:
                        j.e(settingActivity, "this$0");
                        Uri parse = Uri.parse("https://sites.google.com/view/tdapplication");
                        j.d(parse, "parse(...)");
                        Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                        if (intent3.resolveActivity(settingActivity.getPackageManager()) != null) {
                            settingActivity.startActivity(intent3);
                        }
                        return yVar;
                }
            }
        });
        LinearLayout linearLayout4 = ((AbstractC2804u) k()).f23422s;
        j.d(linearLayout4, "linearPolicy");
        final int i13 = 4;
        d.I(linearLayout4, new l(this) { // from class: V6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SettingActivity f3503c;

            {
                this.f3503c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                y yVar = y.f23029a;
                SettingActivity settingActivity = this.f3503c;
                int i102 = i13;
                int i112 = SettingActivity.f19700f;
                switch (i102) {
                    case 0:
                        j.e(settingActivity, "this$0");
                        Intent intent = new Intent(settingActivity, (Class<?>) LanguageActivity.class);
                        intent.putExtras(AbstractC2292b.b(new C2720i("KEY_SETTING", Boolean.TRUE)));
                        settingActivity.startActivity(intent);
                        return yVar;
                    case 1:
                        j.e(settingActivity, "this$0");
                        b bVar = b.f4076f;
                        if (bVar != null) {
                            if (((SharedPreferences) bVar.f4078d).getBoolean("IS_RATE", false)) {
                                Toast.makeText(settingActivity, settingActivity.getString(R.string.txt_thanks_you_for_rating), 0).show();
                            } else {
                                try {
                                    new c(settingActivity, new C6.a(settingActivity, 8)).show();
                                } catch (WindowManager.BadTokenException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return yVar;
                        }
                        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                    case 2:
                        j.e(settingActivity, "this$0");
                        settingActivity.finish();
                        return yVar;
                    case 3:
                        j.e(settingActivity, "this$0");
                        try {
                            Intent intent2 = new Intent("android.intent.action.SEND");
                            intent2.setType("text/plain");
                            intent2.putExtra("android.intent.extra.SUBJECT", settingActivity.getString(R.string.app_name));
                            intent2.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=com.tools.arruler.photomeasure.camera.ruler");
                            settingActivity.startActivity(Intent.createChooser(intent2, "Choose one"));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                        return yVar;
                    default:
                        j.e(settingActivity, "this$0");
                        Uri parse = Uri.parse("https://sites.google.com/view/tdapplication");
                        j.d(parse, "parse(...)");
                        Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                        if (intent3.resolveActivity(settingActivity.getPackageManager()) != null) {
                            settingActivity.startActivity(intent3);
                        }
                        return yVar;
                }
            }
        });
    }
}
