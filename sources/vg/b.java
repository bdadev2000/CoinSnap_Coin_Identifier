package vg;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import com.ads.control.admob.AppOpenManager;
import com.bumptech.glide.d;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.ui.component.history.list.HistoryActivity;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.language.LanguageActivity;
import com.plantcare.ai.identifier.plantid.ui.component.setting.SettingActivity;
import jb.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import x5.i;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f26532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SettingActivity settingActivity, int i10) {
        super(1);
        this.f26531b = i10;
        this.f26532c = settingActivity;
    }

    public final void a(View view) {
        int i10 = this.f26531b;
        SettingActivity activity = this.f26532c;
        switch (i10) {
            case 0:
                activity.onBackPressed();
                return;
            case 1:
                int i11 = SettingActivity.f16736h;
                activity.getClass();
                Intent intent = new Intent(activity, (Class<?>) LanguageActivity.class);
                intent.putExtra("KEY_SETTING", true);
                activity.startActivity(intent);
                return;
            case 2:
                int i12 = SettingActivity.f16736h;
                activity.getClass();
                activity.startActivity(new Intent(activity, (Class<?>) HistoryActivity.class));
                return;
            case 3:
                activity.f16737f = false;
                AppOpenManager.f().f2914k = false;
                try {
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("text/plain");
                    intent2.putExtra("android.intent.extra.SUBJECT", activity.getString(R.string.app_name));
                    intent2.putExtra("android.intent.extra.TEXT", (activity.getString(R.string.app_name) + '\n' + activity.getString(R.string.let_me_recommend)) + "\nhttps://play.google.com/store/apps/details?id=com.plantcare.ai.identifier.plantid");
                    new Handler().postDelayed(new j(6, activity, intent2), 250L);
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 4:
                activity.f16737f = false;
                AppOpenManager.f().f2914k = false;
                try {
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/view/anhtuannt0308mypolicy")));
                    return;
                } catch (Exception unused) {
                    Toast.makeText(activity, "Something went wrong", 0).show();
                    return;
                }
            case 5:
                int i13 = SettingActivity.f16736h;
                if (activity.o().getBoolean("key_set_show_dialod_rate", false)) {
                    d.E(activity, R.string.txt_thanks_you_for_rating);
                    return;
                } else {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    GlobalApp.f16593g = true;
                    return;
                }
            default:
                int i14 = SettingActivity.f16736h;
                activity.getClass();
                if (i.l()) {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                    activity.startActivity(intent3);
                    return;
                }
                activity.startActivity(new Intent(activity, (Class<?>) IapActivity.class));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f26531b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            case 1:
                a((View) obj);
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            case 3:
                a((View) obj);
                return Unit.INSTANCE;
            case 4:
                a((View) obj);
                return Unit.INSTANCE;
            case 5:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
